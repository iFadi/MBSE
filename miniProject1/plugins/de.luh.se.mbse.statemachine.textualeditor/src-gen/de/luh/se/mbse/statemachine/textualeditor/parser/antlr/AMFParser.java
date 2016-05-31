/*
 * generated by Xtext 2.9.2
 */
package de.luh.se.mbse.statemachine.textualeditor.parser.antlr;

import com.google.inject.Inject;
import de.luh.se.mbse.statemachine.textualeditor.parser.antlr.internal.InternalAMFParser;
import de.luh.se.mbse.statemachine.textualeditor.services.AMFGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AMFParser extends AbstractAntlrParser {

	@Inject
	private AMFGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAMFParser createParser(XtextTokenStream stream) {
		return new InternalAMFParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Network";
	}

	public AMFGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AMFGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}