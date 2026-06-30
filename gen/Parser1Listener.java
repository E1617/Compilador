// Generated from C:/Users/LENOVO/IdeaProjects/AnalizadorLexico/Parser1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser1}.
 */
public interface Parser1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser1#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser1.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser1.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(Parser1.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(Parser1.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipoFuncion(Parser1.TipoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipoFuncion(Parser1.TipoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#listaId}.
	 * @param ctx the parse tree
	 */
	void enterListaId(Parser1.ListaIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#listaId}.
	 * @param ctx the parse tree
	 */
	void exitListaId(Parser1.ListaIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(Parser1.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(Parser1.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Parser1.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Parser1.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Parser1.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Parser1.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(Parser1.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(Parser1.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(Parser1.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(Parser1.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(Parser1.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(Parser1.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Parser1.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Parser1.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(Parser1.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(Parser1.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Parser1.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Parser1.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Parser1.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Parser1.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Parser1.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Parser1.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser1#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Parser1.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser1#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Parser1.FactorContext ctx);
}