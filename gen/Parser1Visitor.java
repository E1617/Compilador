// Generated from C:/Users/LENOVO/IdeaProjects/AnalizadorLexico/Parser1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser1}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser1#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser1.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(Parser1.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#tipoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFuncion(Parser1.TipoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#listaId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaId(Parser1.ListaIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(Parser1.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Parser1.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Parser1.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(Parser1.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(Parser1.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(Parser1.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Parser1.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(Parser1.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Parser1.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Parser1.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Parser1.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser1#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Parser1.FactorContext ctx);
}