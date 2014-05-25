// Generated from E:/akt\mrm.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mrmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mrmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mrmParser#NimiLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNimiLit(@NotNull mrmParser.NimiLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#Vordlemine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVordlemine(@NotNull mrmParser.VordlemineContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#LiitmineLahutamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiitmineLahutamine(@NotNull mrmParser.LiitmineLahutamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#ifLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLause(@NotNull mrmParser.IfLauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#avaldis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaldis(@NotNull mrmParser.AvaldisContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#Parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull mrmParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#returnLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLause(@NotNull mrmParser.ReturnLauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#lause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLause(@NotNull mrmParser.LauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(@NotNull mrmParser.ProgrammContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#FunktsiooniValjakutse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsiooniValjakutse(@NotNull mrmParser.FunktsiooniValjakutseContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#UnaarneMiinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaarneMiinus(@NotNull mrmParser.UnaarneMiinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#KorrutamineJagamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKorrutamineJagamine(@NotNull mrmParser.KorrutamineJagamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#SoneLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoneLit(@NotNull mrmParser.SoneLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#ArvLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArvLit(@NotNull mrmParser.ArvLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#funktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsioon(@NotNull mrmParser.FunktsioonContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#muutujaDeklaratsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuutujaDeklaratsioon(@NotNull mrmParser.MuutujaDeklaratsioonContext ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#TriviaalneAvaldis5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis5(@NotNull mrmParser.TriviaalneAvaldis5Context ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#TriviaalneAvaldis4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis4(@NotNull mrmParser.TriviaalneAvaldis4Context ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#TriviaalneAvaldis3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis3(@NotNull mrmParser.TriviaalneAvaldis3Context ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#TriviaalneAvaldis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis2(@NotNull mrmParser.TriviaalneAvaldis2Context ctx);

	/**
	 * Visit a parse tree produced by {@link mrmParser#TriviaalneAvaldis1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis1(@NotNull mrmParser.TriviaalneAvaldis1Context ctx);
}