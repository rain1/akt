// Generated from D:/akt\MRM.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MRMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MRMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MRMParser#NimiLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNimiLit(@NotNull MRMParser.NimiLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#Vordlemine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVordlemine(@NotNull MRMParser.VordlemineContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#LiitmineLahutamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiitmineLahutamine(@NotNull MRMParser.LiitmineLahutamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#ifLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLause(@NotNull MRMParser.IfLauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#avaldis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaldis(@NotNull MRMParser.AvaldisContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#Parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull MRMParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#returnLause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLause(@NotNull MRMParser.ReturnLauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#lause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLause(@NotNull MRMParser.LauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(@NotNull MRMParser.ProgrammContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#FunktsiooniValjakutse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsiooniValjakutse(@NotNull MRMParser.FunktsiooniValjakutseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#UnaarneMiinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaarneMiinus(@NotNull MRMParser.UnaarneMiinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#KorrutamineJagamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKorrutamineJagamine(@NotNull MRMParser.KorrutamineJagamineContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#SoneLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoneLit(@NotNull MRMParser.SoneLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#ArvLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArvLit(@NotNull MRMParser.ArvLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#funktsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsioon(@NotNull MRMParser.FunktsioonContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#muutujaDeklaratsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuutujaDeklaratsioon(@NotNull MRMParser.MuutujaDeklaratsioonContext ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#TriviaalneAvaldis5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis5(@NotNull MRMParser.TriviaalneAvaldis5Context ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#TriviaalneAvaldis4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis4(@NotNull MRMParser.TriviaalneAvaldis4Context ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#TriviaalneAvaldis3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis3(@NotNull MRMParser.TriviaalneAvaldis3Context ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#TriviaalneAvaldis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis2(@NotNull MRMParser.TriviaalneAvaldis2Context ctx);

	/**
	 * Visit a parse tree produced by {@link MRMParser#TriviaalneAvaldis1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis1(@NotNull MRMParser.TriviaalneAvaldis1Context ctx);
}