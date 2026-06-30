import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Lectura del txt
        CharStream input = CharStreams.fromFileName("prueba.txt");

        CharStream cs = CharStreams.fromString(String.valueOf(input));
        Lexer1 lexer2 = new Lexer1(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer2);
        Parser1 parser2 = new Parser1(tokens);
        ParseTree tree1 = parser2.program();
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree1);

        Lexer1 lexer = new Lexer1(input);
        //instancia de manejador de errores
        ManejoErrores manejador = new ManejoErrores();
        //lexer.addErrorListener(new ManejoErrores());
        lexer.removeErrorListeners();
        lexer.addErrorListener(manejador);
        Token token;
        //String para inciar la tabla de símbolos
        String tablaSimbolos = "";
        List<Token> listaTokens = new ArrayList<>();
        int iterador = 0;

        //Recorrer el documento hasta encontrar el final
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            //Traer nombre real de token
            String nombreToken = lexer.getVocabulary().getSymbolicName(token.getType());

            //manejador de errores
            if (manejador.huboError == true || nombreToken.equals("ID_ERR_NUM")) {
                System.out.println("Deteniendo el análisis debido a un error crítico.");
                return;
            }else{
                System.out.println(
                        lexer.getVocabulary().getSymbolicName(token.getType())
                                + " -> "  + token.getText()
                );

                listaTokens.add(token);
                iterador += 1;
                //parte de la tabla de símbolos
                if (nombreToken.equals("ID")) {
                    // Solo lo agregamos si no estaba ya (para que no se repita)
                    if (!tablaSimbolos.contains(" " + token.getText() + " ")) {
                        tablaSimbolos += " " + token.getText() + " \n";
                    }
                }
            }
        }
        listaTokens.add(token);
        System.out.println("====================================");
        ListTokenSource fuenteTokens = new ListTokenSource(listaTokens); //lista de tokens en objeto Source
        CommonTokenStream flujoTokens = new CommonTokenStream(fuenteTokens); // flujo de tokens para enviar
        Parser1 parser = new Parser1(flujoTokens);

        parser.removeErrorListeners();
        parser.addErrorListener(manejador);
        try {
            // 5. Ejecutar la regla inicial de tu gramática (program)
            Parser1.ProgramContext tree = parser.program();

            // 6. Imprimir el árbol si NO hubo errores en ninguna etapa
            if (!manejador.huboError) {
                System.out.println("\n=== ANÁLISIS EXITOSO ===");
                System.out.println(tree.toStringTree(parser));
            } else {
                System.err.println("El árbol no se generó debido a errores en el código.");
            }
        } catch (Exception e) {
            System.err.println("El análisis falló: " + e.getMessage());
        }
    }
}