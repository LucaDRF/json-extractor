// Generated from JSONExtractor.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONExtractorParser}.
 */
public interface JSONExtractorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONExtractorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JSONExtractorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONExtractorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JSONExtractorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONExtractorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JSONExtractorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONExtractorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JSONExtractorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONExtractorParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(JSONExtractorParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONExtractorParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(JSONExtractorParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONExtractorParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(JSONExtractorParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONExtractorParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(JSONExtractorParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONExtractorParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JSONExtractorParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONExtractorParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JSONExtractorParser.FieldContext ctx);
}