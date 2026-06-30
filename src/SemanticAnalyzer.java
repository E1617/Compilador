import java.util.*;
public class SemanticAnalyzer extends Parser1BaseVisitor<Void> {
  private String tipoRetornoEsperado = null;
  // Pila de scopes
  Stack<HashMap<String,String>> scopes = new Stack<>();
  // Tabla de funciones
  HashMap<String, ArrayList<ArrayList<String>>> funciones = new HashMap<>();
  public SemanticAnalyzer() {
    // Scope global
    scopes.push(new HashMap<>());
  }
  // =====================================
  // Buscar variable en todos los scopes
  // =====================================
  private String buscarVariable(String nombre){
    for(int i = scopes.size()-1; i >= 0; i--){
      if(scopes.get(i).containsKey(nombre)){
        return scopes.get(i).get(nombre);
      }
    }
    return null;
  }
  // =====================================
  // Manejo de bloques (scopes)
  // =====================================
  @Override
  public Void visitBloque(Parser1.BloqueContext ctx){
    scopes.push(new HashMap<>());
    visitChildren(ctx);
    scopes.pop();
    return null;
  }
  // =====================================
  // Declaración de variables
  // =====================================
  @Override
  public Void visitDeclaracion(Parser1.DeclaracionContext ctx){
    String tipo = ctx.TIPO().getText();
    HashMap<String,String> actual = scopes.peek();

   if (ctx.asignacion() != null){
     String variable = ctx.asignacion().ID().getText();
     if(actual.containsKey(variable)){
       System.out.println("ERROR SEMÁNTICO: Variable duplicada -> " + variable);
     }
     else{
       actual.put(variable,tipo);
       System.out.println("Variable declarada correctamente: " + variable);
     }
   }else if(ctx.listaId() != null){
     for (var tokenID : ctx.listaId().ID()){
       String variable = tokenID.getText();

       if(actual.containsKey(variable)){
         System.out.println("ERROR SEMÁNTICO: Variable duplicada -> " + variable);
       }
       else{
         actual.put(variable,tipo);
         System.out.println("Variable declarada correctamente: " + variable);
       }
     }
   }
   /*else if(ctx.funcion() != null){
     this.tipoRetornoEsperado = tipo;
     visit(ctx.funcion());
     this.tipoRetornoEsperado = null;
   }*/
    return null;
  }
  // =====================================
  // Asignaciones
  // =====================================
  @Override
  public Void visitAsignacion(Parser1.AsignacionContext ctx){
    String variable = ctx.ID().getText();
    String tipoVariable = buscarVariable(variable);
    if(tipoVariable == null){
      System.out.println("ERROR SEMÁNTICO: Variable no declarada -> " + variable);
      return null;
    }
    // Validación simple FLOAT -> INT
    if(tipoVariable.equals("int")){
      String expresion = ctx.expr().getText();
      if(expresion.matches(".*\\d+\\.\\d+.*")){
        System.out.println("ERROR SEMÁNTICO: No se puede asignar FLOAT a INT");
      }
    }
    return visitChildren(ctx);
  }
  // =====================================
  // Uso de variables
  // =====================================
  @Override
  public Void visitFactor(Parser1.FactorContext ctx){
    if(ctx.ID() != null){
      String variable = ctx.ID().getText();
      if(buscarVariable(variable)==null){
        System.out.println("ERROR SEMÁNTICO: Variable usada sin declarar -> " + variable);
      }
    }
    return visitChildren(ctx);
  }
  // =====================================
  // Registro de funciones
  // =====================================
  @Override
  public Void visitFuncion(Parser1.FuncionContext ctx){
    String nombre = ctx.ID().getText();

    ArrayList<String> paramsActuales = new ArrayList<>();
    HashMap<String, String> scopeFuncion = new HashMap<>();

    scopes.push(scopeFuncion);

    if(ctx.parametros() != null){
      visit(ctx.parametros());

      for(int i = 0; i < ctx.parametros().TIPO().size(); i++){
        paramsActuales.add(ctx.parametros().TIPO(i).getText());
      }
    }

    if(funciones.containsKey(nombre)){
      ArrayList<ArrayList<String>> sobrecargasExistentes = funciones.get(nombre);

      for(ArrayList<String> firmaExistente : sobrecargasExistentes){
        if(firmaExistente.size() == paramsActuales.size()){
          System.out.println("ERROR SEMÁNTICO: Función duplicada -> " + nombre);
          return null;
        }
      }

      sobrecargasExistentes.add(paramsActuales);
      System.out.println("Función sobrecargada correctamente");
    }else{
      ArrayList<ArrayList<String>> nuevasSobrecargas = new ArrayList<>();
      nuevasSobrecargas.add(paramsActuales);
      funciones.put(nombre, nuevasSobrecargas);
      System.out.println("Función declarada correctamente");
    }

    visit(ctx.bloque());

    if (this.tipoRetornoEsperado != null && ctx.expr() != null){
      String tipoRetornado= obtenerTipoExpresion(ctx.expr());

      if (!this.tipoRetornoEsperado.equals(tipoRetornado)) {
        System.out.println("ERROR SEMÁNTICO en línea " + ctx.RETURN().getSymbol().getLine() + ": El tipo de retorno no coincide. La función '" + nombre +  "' espera [" + this.tipoRetornoEsperado + "] pero retorna [" + tipoRetornado + "].");
      }
    }
    scopes.pop();

    return null;
  }
  // =====================================
  // Llamadas a funciones
  // =====================================
  @Override
  public Void visitLlamadaFuncion(Parser1.LlamadaFuncionContext ctx){
    String nombre = ctx.ID().getText();
    if(!funciones.containsKey(nombre)){
      System.out.println("ERROR SEMÁNTICO: Función inexistente -> " + nombre);
      return null;
    }

    //int esperados = funciones.get(nombre).size();
    int recibidos = 0;
    if(ctx.argumentos()!=null){
      recibidos = ctx.argumentos().expr().size();
    }

    ArrayList<ArrayList<String>> sobrecargas = funciones.get(nombre);
    boolean banderaEncontrada = false;

    for (ArrayList<String> bandera : sobrecargas){
      if(bandera.size() == recibidos){
        banderaEncontrada = true;
        break;
      }
    }

    return null;
  }

  private String obtenerTipoExpresion(Parser1.ExprContext ctx) {
    if (ctx == null) return "int";

    String texto = ctx.getText();

    if (texto.matches(".*\\d+\\.\\d+.*")) {
      return "float";
    }

    for (int i = scopes.size() - 1; i >= 0; i--) {
      HashMap<String, String> scopeActual = scopes.get(i);

      for (String nombreVar : scopeActual.keySet()) {
        if (texto.contains(nombreVar)) {
          String tipoVar = scopeActual.get(nombreVar);
          if ("float".equals(tipoVar)) {
            return "float";
          }
        }
      }
    }
    return "int";
  }

  public Void visitTipoFuncion(Parser1.TipoFuncionContext ctx){
  this.tipoRetornoEsperado = ctx.TIPO().getText();
  visit(ctx.funcion());
  this.tipoRetornoEsperado = null;
  return null;
  }

  @Override
  public Void visitParametros(Parser1.ParametrosContext ctx) {
    HashMap<String,String> actual = scopes.peek();
    for (int i = 0; i < ctx.ID().size(); i++) {
      String tipo = ctx.TIPO(i).getText();
      String id = ctx.ID(i).getText();

      actual.put(id,tipo);
    }

    return visitChildren(ctx);
  }

  /* public Void visitReturn(Parser1.ReturnContext ctx){
    if(this.tipoRetornoEsperado == null){
      return visitChildren(ctx);
    }

    String tipoRetornado = "int";

    if(ctx.factor().FLOATNUM() != null){
      tipoRetornado = "float";
    }else if (ctx.factor().ID() != null){
      tipoRetornado = "String";
    }

    if(!this.tipoRetornoEsperado.equals(tipoRetornado)){
      System.out.println("ERROR SEMÁNTICO en línea " + ctx.getStart().getLine() + ": El tipo de retorno no coincide.");
    }
    return null;
  } */
}
