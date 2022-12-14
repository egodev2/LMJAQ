/*
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.lmjaq.parser.antlr.internal.InternalLMJAQParser;
import org.xtext.lmjaq.services.LMJAQGrammarAccess;

public class LMJAQParser extends AbstractAntlrParser {

	@Inject
	private LMJAQGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLMJAQParser createParser(XtextTokenStream stream) {
		return new InternalLMJAQParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LMJAQGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LMJAQGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
