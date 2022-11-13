package org.xtext.lmjaq.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.lmjaq.services.LMJAQGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLMJAQParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EVENT_CODE", "RULE_UNITYINTDECIMAL", "RULE_INTEGER", "RULE_PATH", "RULE_UI_TYPE", "RULE_SIMPLE_EVENT_TYPE", "RULE_EFEITO_ACTION", "RULE_TEXT_CONTENT", "RULE_FALSE", "RULE_TRUE", "RULE_STRING", "RULE_SLASH", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tela'", "'Objeto'", "'Ativo'", "'IU'", "'Posicao'", "'EventoComplexo'", "'EventoSimples'", "'AoClicar'", "'Comportamento'", "'Imagem'", "'Animacao'", "'Texto'", "'Conteudo'", "'Tamanho'", "'TamanhoDaFonte'", "'Caminho'", "'ConfigGeral'", "'ComprimentoDaTela'", "'AlturaDaTela'", "'Questao'", "'Alternativa'", "'Enunciado'", "'Resposta'", "'FormatoQuiz'", "'Estado'", "'EstadoFinal'", "'EstadoInicial'", "'ProximoEstados'", "'Item'", "'Efeito'", "'EstadosAfetados'", "'package'", "'.'", "'{'", "'}'", "':'"
    };
    public static final int T__50=50;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_SLASH=16;
    public static final int RULE_PATH=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SIMPLE_EVENT_TYPE=10;
    public static final int RULE_FALSE=13;
    public static final int RULE_TEXT_CONTENT=12;
    public static final int RULE_UI_TYPE=9;
    public static final int RULE_STRING=15;
    public static final int RULE_UNITYINTDECIMAL=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EVENT_CODE=5;
    public static final int T__33=33;
    public static final int RULE_TRUE=14;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_EFEITO_ACTION=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=7;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLMJAQParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLMJAQParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLMJAQParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLMJAQ.g"; }


    	private LMJAQGrammarAccess grammarAccess;

    	public void setGrammarAccess(LMJAQGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalLMJAQ.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalLMJAQ.g:54:1: ( ruleModel EOF )
            // InternalLMJAQ.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLMJAQ.g:62:1: ruleModel : ( ( rule__Model__AbstractElmentsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:66:2: ( ( ( rule__Model__AbstractElmentsAssignment )* ) )
            // InternalLMJAQ.g:67:2: ( ( rule__Model__AbstractElmentsAssignment )* )
            {
            // InternalLMJAQ.g:67:2: ( ( rule__Model__AbstractElmentsAssignment )* )
            // InternalLMJAQ.g:68:3: ( rule__Model__AbstractElmentsAssignment )*
            {
             before(grammarAccess.getModelAccess().getAbstractElmentsAssignment()); 
            // InternalLMJAQ.g:69:3: ( rule__Model__AbstractElmentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=23)||LA1_0==27||(LA1_0>=29 && LA1_0<=33)||LA1_0==38||(LA1_0>=41 && LA1_0<=42)||LA1_0==46||LA1_0==50||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLMJAQ.g:69:4: rule__Model__AbstractElmentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AbstractElmentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAbstractElmentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalLMJAQ.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalLMJAQ.g:79:1: ( ruleAbstractElement EOF )
            // InternalLMJAQ.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalLMJAQ.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__ElementTypeAssignment ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:91:2: ( ( ( rule__AbstractElement__ElementTypeAssignment ) ) )
            // InternalLMJAQ.g:92:2: ( ( rule__AbstractElement__ElementTypeAssignment ) )
            {
            // InternalLMJAQ.g:92:2: ( ( rule__AbstractElement__ElementTypeAssignment ) )
            // InternalLMJAQ.g:93:3: ( rule__AbstractElement__ElementTypeAssignment )
            {
             before(grammarAccess.getAbstractElementAccess().getElementTypeAssignment()); 
            // InternalLMJAQ.g:94:3: ( rule__AbstractElement__ElementTypeAssignment )
            // InternalLMJAQ.g:94:4: rule__AbstractElement__ElementTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__ElementTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getElementTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalLMJAQ.g:103:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalLMJAQ.g:104:1: ( rulePackageDeclaration EOF )
            // InternalLMJAQ.g:105:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalLMJAQ.g:112:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:116:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalLMJAQ.g:117:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalLMJAQ.g:117:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalLMJAQ.g:118:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalLMJAQ.g:119:3: ( rule__PackageDeclaration__Group__0 )
            // InternalLMJAQ.g:119:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLMJAQ.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLMJAQ.g:129:1: ( ruleQualifiedName EOF )
            // InternalLMJAQ.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLMJAQ.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLMJAQ.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLMJAQ.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLMJAQ.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLMJAQ.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalLMJAQ.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAbstractClass"
    // InternalLMJAQ.g:153:1: entryRuleAbstractClass : ruleAbstractClass EOF ;
    public final void entryRuleAbstractClass() throws RecognitionException {
        try {
            // InternalLMJAQ.g:154:1: ( ruleAbstractClass EOF )
            // InternalLMJAQ.g:155:1: ruleAbstractClass EOF
            {
             before(grammarAccess.getAbstractClassRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractClass();

            state._fsp--;

             after(grammarAccess.getAbstractClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractClass"


    // $ANTLR start "ruleAbstractClass"
    // InternalLMJAQ.g:162:1: ruleAbstractClass : ( ( rule__AbstractClass__Group__0 ) ) ;
    public final void ruleAbstractClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:166:2: ( ( ( rule__AbstractClass__Group__0 ) ) )
            // InternalLMJAQ.g:167:2: ( ( rule__AbstractClass__Group__0 ) )
            {
            // InternalLMJAQ.g:167:2: ( ( rule__AbstractClass__Group__0 ) )
            // InternalLMJAQ.g:168:3: ( rule__AbstractClass__Group__0 )
            {
             before(grammarAccess.getAbstractClassAccess().getGroup()); 
            // InternalLMJAQ.g:169:3: ( rule__AbstractClass__Group__0 )
            // InternalLMJAQ.g:169:4: rule__AbstractClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractClass"


    // $ANTLR start "entryRuleAbstractClassType"
    // InternalLMJAQ.g:178:1: entryRuleAbstractClassType : ruleAbstractClassType EOF ;
    public final void entryRuleAbstractClassType() throws RecognitionException {
        try {
            // InternalLMJAQ.g:179:1: ( ruleAbstractClassType EOF )
            // InternalLMJAQ.g:180:1: ruleAbstractClassType EOF
            {
             before(grammarAccess.getAbstractClassTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractClassType();

            state._fsp--;

             after(grammarAccess.getAbstractClassTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractClassType"


    // $ANTLR start "ruleAbstractClassType"
    // InternalLMJAQ.g:187:1: ruleAbstractClassType : ( ( rule__AbstractClassType__TypeAssignment ) ) ;
    public final void ruleAbstractClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:191:2: ( ( ( rule__AbstractClassType__TypeAssignment ) ) )
            // InternalLMJAQ.g:192:2: ( ( rule__AbstractClassType__TypeAssignment ) )
            {
            // InternalLMJAQ.g:192:2: ( ( rule__AbstractClassType__TypeAssignment ) )
            // InternalLMJAQ.g:193:3: ( rule__AbstractClassType__TypeAssignment )
            {
             before(grammarAccess.getAbstractClassTypeAccess().getTypeAssignment()); 
            // InternalLMJAQ.g:194:3: ( rule__AbstractClassType__TypeAssignment )
            // InternalLMJAQ.g:194:4: rule__AbstractClassType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClassType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractClassType"


    // $ANTLR start "entryRuleTela"
    // InternalLMJAQ.g:203:1: entryRuleTela : ruleTela EOF ;
    public final void entryRuleTela() throws RecognitionException {
        try {
            // InternalLMJAQ.g:204:1: ( ruleTela EOF )
            // InternalLMJAQ.g:205:1: ruleTela EOF
            {
             before(grammarAccess.getTelaRule()); 
            pushFollow(FOLLOW_1);
            ruleTela();

            state._fsp--;

             after(grammarAccess.getTelaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTela"


    // $ANTLR start "ruleTela"
    // InternalLMJAQ.g:212:1: ruleTela : ( 'Tela' ) ;
    public final void ruleTela() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:216:2: ( ( 'Tela' ) )
            // InternalLMJAQ.g:217:2: ( 'Tela' )
            {
            // InternalLMJAQ.g:217:2: ( 'Tela' )
            // InternalLMJAQ.g:218:3: 'Tela'
            {
             before(grammarAccess.getTelaAccess().getTelaKeyword()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTelaAccess().getTelaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTela"


    // $ANTLR start "entryRuleObjeto"
    // InternalLMJAQ.g:228:1: entryRuleObjeto : ruleObjeto EOF ;
    public final void entryRuleObjeto() throws RecognitionException {
        try {
            // InternalLMJAQ.g:229:1: ( ruleObjeto EOF )
            // InternalLMJAQ.g:230:1: ruleObjeto EOF
            {
             before(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_1);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // InternalLMJAQ.g:237:1: ruleObjeto : ( 'Objeto' ) ;
    public final void ruleObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:241:2: ( ( 'Objeto' ) )
            // InternalLMJAQ.g:242:2: ( 'Objeto' )
            {
            // InternalLMJAQ.g:242:2: ( 'Objeto' )
            // InternalLMJAQ.g:243:3: 'Objeto'
            {
             before(grammarAccess.getObjetoAccess().getObjetoKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjetoAccess().getObjetoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalLMJAQ.g:253:1: entryRuleAbstractProperty : ruleAbstractProperty EOF ;
    public final void entryRuleAbstractProperty() throws RecognitionException {
        try {
            // InternalLMJAQ.g:254:1: ( ruleAbstractProperty EOF )
            // InternalLMJAQ.g:255:1: ruleAbstractProperty EOF
            {
             before(grammarAccess.getAbstractPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractProperty();

            state._fsp--;

             after(grammarAccess.getAbstractPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractProperty"


    // $ANTLR start "ruleAbstractProperty"
    // InternalLMJAQ.g:262:1: ruleAbstractProperty : ( ( rule__AbstractProperty__Group__0 ) ) ;
    public final void ruleAbstractProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:266:2: ( ( ( rule__AbstractProperty__Group__0 ) ) )
            // InternalLMJAQ.g:267:2: ( ( rule__AbstractProperty__Group__0 ) )
            {
            // InternalLMJAQ.g:267:2: ( ( rule__AbstractProperty__Group__0 ) )
            // InternalLMJAQ.g:268:3: ( rule__AbstractProperty__Group__0 )
            {
             before(grammarAccess.getAbstractPropertyAccess().getGroup()); 
            // InternalLMJAQ.g:269:3: ( rule__AbstractProperty__Group__0 )
            // InternalLMJAQ.g:269:4: rule__AbstractProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractProperty"


    // $ANTLR start "entryRuleClassReference"
    // InternalLMJAQ.g:278:1: entryRuleClassReference : ruleClassReference EOF ;
    public final void entryRuleClassReference() throws RecognitionException {
        try {
            // InternalLMJAQ.g:279:1: ( ruleClassReference EOF )
            // InternalLMJAQ.g:280:1: ruleClassReference EOF
            {
             before(grammarAccess.getClassReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleClassReference();

            state._fsp--;

             after(grammarAccess.getClassReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassReference"


    // $ANTLR start "ruleClassReference"
    // InternalLMJAQ.g:287:1: ruleClassReference : ( ( rule__ClassReference__TypeAssignment ) ) ;
    public final void ruleClassReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:291:2: ( ( ( rule__ClassReference__TypeAssignment ) ) )
            // InternalLMJAQ.g:292:2: ( ( rule__ClassReference__TypeAssignment ) )
            {
            // InternalLMJAQ.g:292:2: ( ( rule__ClassReference__TypeAssignment ) )
            // InternalLMJAQ.g:293:3: ( rule__ClassReference__TypeAssignment )
            {
             before(grammarAccess.getClassReferenceAccess().getTypeAssignment()); 
            // InternalLMJAQ.g:294:3: ( rule__ClassReference__TypeAssignment )
            // InternalLMJAQ.g:294:4: rule__ClassReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassReferenceAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassReference"


    // $ANTLR start "entryRuleProperty"
    // InternalLMJAQ.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalLMJAQ.g:304:1: ( ruleProperty EOF )
            // InternalLMJAQ.g:305:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalLMJAQ.g:312:1: ruleProperty : ( ( rule__Property__PropertyTypeAssignment ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:316:2: ( ( ( rule__Property__PropertyTypeAssignment ) ) )
            // InternalLMJAQ.g:317:2: ( ( rule__Property__PropertyTypeAssignment ) )
            {
            // InternalLMJAQ.g:317:2: ( ( rule__Property__PropertyTypeAssignment ) )
            // InternalLMJAQ.g:318:3: ( rule__Property__PropertyTypeAssignment )
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeAssignment()); 
            // InternalLMJAQ.g:319:3: ( rule__Property__PropertyTypeAssignment )
            // InternalLMJAQ.g:319:4: rule__Property__PropertyTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Property__PropertyTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertyTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleestaAtivo"
    // InternalLMJAQ.g:328:1: entryRuleestaAtivo : ruleestaAtivo EOF ;
    public final void entryRuleestaAtivo() throws RecognitionException {
        try {
            // InternalLMJAQ.g:329:1: ( ruleestaAtivo EOF )
            // InternalLMJAQ.g:330:1: ruleestaAtivo EOF
            {
             before(grammarAccess.getEstaAtivoRule()); 
            pushFollow(FOLLOW_1);
            ruleestaAtivo();

            state._fsp--;

             after(grammarAccess.getEstaAtivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleestaAtivo"


    // $ANTLR start "ruleestaAtivo"
    // InternalLMJAQ.g:337:1: ruleestaAtivo : ( 'Ativo' ) ;
    public final void ruleestaAtivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:341:2: ( ( 'Ativo' ) )
            // InternalLMJAQ.g:342:2: ( 'Ativo' )
            {
            // InternalLMJAQ.g:342:2: ( 'Ativo' )
            // InternalLMJAQ.g:343:3: 'Ativo'
            {
             before(grammarAccess.getEstaAtivoAccess().getAtivoKeyword()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEstaAtivoAccess().getAtivoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleestaAtivo"


    // $ANTLR start "entryRuleIU"
    // InternalLMJAQ.g:353:1: entryRuleIU : ruleIU EOF ;
    public final void entryRuleIU() throws RecognitionException {
        try {
            // InternalLMJAQ.g:354:1: ( ruleIU EOF )
            // InternalLMJAQ.g:355:1: ruleIU EOF
            {
             before(grammarAccess.getIURule()); 
            pushFollow(FOLLOW_1);
            ruleIU();

            state._fsp--;

             after(grammarAccess.getIURule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIU"


    // $ANTLR start "ruleIU"
    // InternalLMJAQ.g:362:1: ruleIU : ( 'IU' ) ;
    public final void ruleIU() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:366:2: ( ( 'IU' ) )
            // InternalLMJAQ.g:367:2: ( 'IU' )
            {
            // InternalLMJAQ.g:367:2: ( 'IU' )
            // InternalLMJAQ.g:368:3: 'IU'
            {
             before(grammarAccess.getIUAccess().getIUKeyword()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIUAccess().getIUKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIU"


    // $ANTLR start "entryRulePosicao"
    // InternalLMJAQ.g:378:1: entryRulePosicao : rulePosicao EOF ;
    public final void entryRulePosicao() throws RecognitionException {
        try {
            // InternalLMJAQ.g:379:1: ( rulePosicao EOF )
            // InternalLMJAQ.g:380:1: rulePosicao EOF
            {
             before(grammarAccess.getPosicaoRule()); 
            pushFollow(FOLLOW_1);
            rulePosicao();

            state._fsp--;

             after(grammarAccess.getPosicaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosicao"


    // $ANTLR start "rulePosicao"
    // InternalLMJAQ.g:387:1: rulePosicao : ( 'Posicao' ) ;
    public final void rulePosicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:391:2: ( ( 'Posicao' ) )
            // InternalLMJAQ.g:392:2: ( 'Posicao' )
            {
            // InternalLMJAQ.g:392:2: ( 'Posicao' )
            // InternalLMJAQ.g:393:3: 'Posicao'
            {
             before(grammarAccess.getPosicaoAccess().getPosicaoKeyword()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPosicaoAccess().getPosicaoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosicao"


    // $ANTLR start "entryRuleValue"
    // InternalLMJAQ.g:403:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalLMJAQ.g:404:1: ( ruleValue EOF )
            // InternalLMJAQ.g:405:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalLMJAQ.g:412:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:416:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalLMJAQ.g:417:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalLMJAQ.g:417:2: ( ( rule__Value__Alternatives ) )
            // InternalLMJAQ.g:418:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalLMJAQ.g:419:3: ( rule__Value__Alternatives )
            // InternalLMJAQ.g:419:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleComponente"
    // InternalLMJAQ.g:428:1: entryRuleComponente : ruleComponente EOF ;
    public final void entryRuleComponente() throws RecognitionException {
        try {
            // InternalLMJAQ.g:429:1: ( ruleComponente EOF )
            // InternalLMJAQ.g:430:1: ruleComponente EOF
            {
             before(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getComponenteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalLMJAQ.g:437:1: ruleComponente : ( ( rule__Componente__Alternatives ) ) ;
    public final void ruleComponente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:441:2: ( ( ( rule__Componente__Alternatives ) ) )
            // InternalLMJAQ.g:442:2: ( ( rule__Componente__Alternatives ) )
            {
            // InternalLMJAQ.g:442:2: ( ( rule__Componente__Alternatives ) )
            // InternalLMJAQ.g:443:3: ( rule__Componente__Alternatives )
            {
             before(grammarAccess.getComponenteAccess().getAlternatives()); 
            // InternalLMJAQ.g:444:3: ( rule__Componente__Alternatives )
            // InternalLMJAQ.g:444:4: rule__Componente__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleEventoComplexo"
    // InternalLMJAQ.g:453:1: entryRuleEventoComplexo : ruleEventoComplexo EOF ;
    public final void entryRuleEventoComplexo() throws RecognitionException {
        try {
            // InternalLMJAQ.g:454:1: ( ruleEventoComplexo EOF )
            // InternalLMJAQ.g:455:1: ruleEventoComplexo EOF
            {
             before(grammarAccess.getEventoComplexoRule()); 
            pushFollow(FOLLOW_1);
            ruleEventoComplexo();

            state._fsp--;

             after(grammarAccess.getEventoComplexoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventoComplexo"


    // $ANTLR start "ruleEventoComplexo"
    // InternalLMJAQ.g:462:1: ruleEventoComplexo : ( 'EventoComplexo' ) ;
    public final void ruleEventoComplexo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:466:2: ( ( 'EventoComplexo' ) )
            // InternalLMJAQ.g:467:2: ( 'EventoComplexo' )
            {
            // InternalLMJAQ.g:467:2: ( 'EventoComplexo' )
            // InternalLMJAQ.g:468:3: 'EventoComplexo'
            {
             before(grammarAccess.getEventoComplexoAccess().getEventoComplexoKeyword()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEventoComplexoAccess().getEventoComplexoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventoComplexo"


    // $ANTLR start "entryRuleEventoSimples"
    // InternalLMJAQ.g:478:1: entryRuleEventoSimples : ruleEventoSimples EOF ;
    public final void entryRuleEventoSimples() throws RecognitionException {
        try {
            // InternalLMJAQ.g:479:1: ( ruleEventoSimples EOF )
            // InternalLMJAQ.g:480:1: ruleEventoSimples EOF
            {
             before(grammarAccess.getEventoSimplesRule()); 
            pushFollow(FOLLOW_1);
            ruleEventoSimples();

            state._fsp--;

             after(grammarAccess.getEventoSimplesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventoSimples"


    // $ANTLR start "ruleEventoSimples"
    // InternalLMJAQ.g:487:1: ruleEventoSimples : ( 'EventoSimples' ) ;
    public final void ruleEventoSimples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:491:2: ( ( 'EventoSimples' ) )
            // InternalLMJAQ.g:492:2: ( 'EventoSimples' )
            {
            // InternalLMJAQ.g:492:2: ( 'EventoSimples' )
            // InternalLMJAQ.g:493:3: 'EventoSimples'
            {
             before(grammarAccess.getEventoSimplesAccess().getEventoSimplesKeyword()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventoSimplesAccess().getEventoSimplesKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventoSimples"


    // $ANTLR start "entryRuleGatilho"
    // InternalLMJAQ.g:503:1: entryRuleGatilho : ruleGatilho EOF ;
    public final void entryRuleGatilho() throws RecognitionException {
        try {
            // InternalLMJAQ.g:504:1: ( ruleGatilho EOF )
            // InternalLMJAQ.g:505:1: ruleGatilho EOF
            {
             before(grammarAccess.getGatilhoRule()); 
            pushFollow(FOLLOW_1);
            ruleGatilho();

            state._fsp--;

             after(grammarAccess.getGatilhoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGatilho"


    // $ANTLR start "ruleGatilho"
    // InternalLMJAQ.g:512:1: ruleGatilho : ( ruleAoClicar ) ;
    public final void ruleGatilho() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:516:2: ( ( ruleAoClicar ) )
            // InternalLMJAQ.g:517:2: ( ruleAoClicar )
            {
            // InternalLMJAQ.g:517:2: ( ruleAoClicar )
            // InternalLMJAQ.g:518:3: ruleAoClicar
            {
             before(grammarAccess.getGatilhoAccess().getAoClicarParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAoClicar();

            state._fsp--;

             after(grammarAccess.getGatilhoAccess().getAoClicarParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGatilho"


    // $ANTLR start "entryRuleAoClicar"
    // InternalLMJAQ.g:528:1: entryRuleAoClicar : ruleAoClicar EOF ;
    public final void entryRuleAoClicar() throws RecognitionException {
        try {
            // InternalLMJAQ.g:529:1: ( ruleAoClicar EOF )
            // InternalLMJAQ.g:530:1: ruleAoClicar EOF
            {
             before(grammarAccess.getAoClicarRule()); 
            pushFollow(FOLLOW_1);
            ruleAoClicar();

            state._fsp--;

             after(grammarAccess.getAoClicarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAoClicar"


    // $ANTLR start "ruleAoClicar"
    // InternalLMJAQ.g:537:1: ruleAoClicar : ( 'AoClicar' ) ;
    public final void ruleAoClicar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:541:2: ( ( 'AoClicar' ) )
            // InternalLMJAQ.g:542:2: ( 'AoClicar' )
            {
            // InternalLMJAQ.g:542:2: ( 'AoClicar' )
            // InternalLMJAQ.g:543:3: 'AoClicar'
            {
             before(grammarAccess.getAoClicarAccess().getAoClicarKeyword()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAoClicarAccess().getAoClicarKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAoClicar"


    // $ANTLR start "entryRuleComportamento"
    // InternalLMJAQ.g:553:1: entryRuleComportamento : ruleComportamento EOF ;
    public final void entryRuleComportamento() throws RecognitionException {
        try {
            // InternalLMJAQ.g:554:1: ( ruleComportamento EOF )
            // InternalLMJAQ.g:555:1: ruleComportamento EOF
            {
             before(grammarAccess.getComportamentoRule()); 
            pushFollow(FOLLOW_1);
            ruleComportamento();

            state._fsp--;

             after(grammarAccess.getComportamentoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComportamento"


    // $ANTLR start "ruleComportamento"
    // InternalLMJAQ.g:562:1: ruleComportamento : ( 'Comportamento' ) ;
    public final void ruleComportamento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:566:2: ( ( 'Comportamento' ) )
            // InternalLMJAQ.g:567:2: ( 'Comportamento' )
            {
            // InternalLMJAQ.g:567:2: ( 'Comportamento' )
            // InternalLMJAQ.g:568:3: 'Comportamento'
            {
             before(grammarAccess.getComportamentoAccess().getComportamentoKeyword()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComportamentoAccess().getComportamentoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComportamento"


    // $ANTLR start "entryRuleRecurso"
    // InternalLMJAQ.g:578:1: entryRuleRecurso : ruleRecurso EOF ;
    public final void entryRuleRecurso() throws RecognitionException {
        try {
            // InternalLMJAQ.g:579:1: ( ruleRecurso EOF )
            // InternalLMJAQ.g:580:1: ruleRecurso EOF
            {
             before(grammarAccess.getRecursoRule()); 
            pushFollow(FOLLOW_1);
            ruleRecurso();

            state._fsp--;

             after(grammarAccess.getRecursoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecurso"


    // $ANTLR start "ruleRecurso"
    // InternalLMJAQ.g:587:1: ruleRecurso : ( ( rule__Recurso__Alternatives ) ) ;
    public final void ruleRecurso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:591:2: ( ( ( rule__Recurso__Alternatives ) ) )
            // InternalLMJAQ.g:592:2: ( ( rule__Recurso__Alternatives ) )
            {
            // InternalLMJAQ.g:592:2: ( ( rule__Recurso__Alternatives ) )
            // InternalLMJAQ.g:593:3: ( rule__Recurso__Alternatives )
            {
             before(grammarAccess.getRecursoAccess().getAlternatives()); 
            // InternalLMJAQ.g:594:3: ( rule__Recurso__Alternatives )
            // InternalLMJAQ.g:594:4: rule__Recurso__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Recurso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecursoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecurso"


    // $ANTLR start "entryRuleImagem"
    // InternalLMJAQ.g:603:1: entryRuleImagem : ruleImagem EOF ;
    public final void entryRuleImagem() throws RecognitionException {
        try {
            // InternalLMJAQ.g:604:1: ( ruleImagem EOF )
            // InternalLMJAQ.g:605:1: ruleImagem EOF
            {
             before(grammarAccess.getImagemRule()); 
            pushFollow(FOLLOW_1);
            ruleImagem();

            state._fsp--;

             after(grammarAccess.getImagemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImagem"


    // $ANTLR start "ruleImagem"
    // InternalLMJAQ.g:612:1: ruleImagem : ( 'Imagem' ) ;
    public final void ruleImagem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:616:2: ( ( 'Imagem' ) )
            // InternalLMJAQ.g:617:2: ( 'Imagem' )
            {
            // InternalLMJAQ.g:617:2: ( 'Imagem' )
            // InternalLMJAQ.g:618:3: 'Imagem'
            {
             before(grammarAccess.getImagemAccess().getImagemKeyword()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImagemAccess().getImagemKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImagem"


    // $ANTLR start "entryRuleAnimacao"
    // InternalLMJAQ.g:628:1: entryRuleAnimacao : ruleAnimacao EOF ;
    public final void entryRuleAnimacao() throws RecognitionException {
        try {
            // InternalLMJAQ.g:629:1: ( ruleAnimacao EOF )
            // InternalLMJAQ.g:630:1: ruleAnimacao EOF
            {
             before(grammarAccess.getAnimacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleAnimacao();

            state._fsp--;

             after(grammarAccess.getAnimacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimacao"


    // $ANTLR start "ruleAnimacao"
    // InternalLMJAQ.g:637:1: ruleAnimacao : ( 'Animacao' ) ;
    public final void ruleAnimacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:641:2: ( ( 'Animacao' ) )
            // InternalLMJAQ.g:642:2: ( 'Animacao' )
            {
            // InternalLMJAQ.g:642:2: ( 'Animacao' )
            // InternalLMJAQ.g:643:3: 'Animacao'
            {
             before(grammarAccess.getAnimacaoAccess().getAnimacaoKeyword()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAnimacaoAccess().getAnimacaoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimacao"


    // $ANTLR start "entryRuleTexto"
    // InternalLMJAQ.g:653:1: entryRuleTexto : ruleTexto EOF ;
    public final void entryRuleTexto() throws RecognitionException {
        try {
            // InternalLMJAQ.g:654:1: ( ruleTexto EOF )
            // InternalLMJAQ.g:655:1: ruleTexto EOF
            {
             before(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleTexto();

            state._fsp--;

             after(grammarAccess.getTextoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalLMJAQ.g:662:1: ruleTexto : ( 'Texto' ) ;
    public final void ruleTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:666:2: ( ( 'Texto' ) )
            // InternalLMJAQ.g:667:2: ( 'Texto' )
            {
            // InternalLMJAQ.g:667:2: ( 'Texto' )
            // InternalLMJAQ.g:668:3: 'Texto'
            {
             before(grammarAccess.getTextoAccess().getTextoKeyword()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getTextoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRuleConteudo"
    // InternalLMJAQ.g:678:1: entryRuleConteudo : ruleConteudo EOF ;
    public final void entryRuleConteudo() throws RecognitionException {
        try {
            // InternalLMJAQ.g:679:1: ( ruleConteudo EOF )
            // InternalLMJAQ.g:680:1: ruleConteudo EOF
            {
             before(grammarAccess.getConteudoRule()); 
            pushFollow(FOLLOW_1);
            ruleConteudo();

            state._fsp--;

             after(grammarAccess.getConteudoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConteudo"


    // $ANTLR start "ruleConteudo"
    // InternalLMJAQ.g:687:1: ruleConteudo : ( 'Conteudo' ) ;
    public final void ruleConteudo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:691:2: ( ( 'Conteudo' ) )
            // InternalLMJAQ.g:692:2: ( 'Conteudo' )
            {
            // InternalLMJAQ.g:692:2: ( 'Conteudo' )
            // InternalLMJAQ.g:693:3: 'Conteudo'
            {
             before(grammarAccess.getConteudoAccess().getConteudoKeyword()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConteudoAccess().getConteudoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConteudo"


    // $ANTLR start "entryRuleTamanho"
    // InternalLMJAQ.g:703:1: entryRuleTamanho : ruleTamanho EOF ;
    public final void entryRuleTamanho() throws RecognitionException {
        try {
            // InternalLMJAQ.g:704:1: ( ruleTamanho EOF )
            // InternalLMJAQ.g:705:1: ruleTamanho EOF
            {
             before(grammarAccess.getTamanhoRule()); 
            pushFollow(FOLLOW_1);
            ruleTamanho();

            state._fsp--;

             after(grammarAccess.getTamanhoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTamanho"


    // $ANTLR start "ruleTamanho"
    // InternalLMJAQ.g:712:1: ruleTamanho : ( 'Tamanho' ) ;
    public final void ruleTamanho() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:716:2: ( ( 'Tamanho' ) )
            // InternalLMJAQ.g:717:2: ( 'Tamanho' )
            {
            // InternalLMJAQ.g:717:2: ( 'Tamanho' )
            // InternalLMJAQ.g:718:3: 'Tamanho'
            {
             before(grammarAccess.getTamanhoAccess().getTamanhoKeyword()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTamanhoAccess().getTamanhoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanho"


    // $ANTLR start "entryRuleTamanhoDaFonte"
    // InternalLMJAQ.g:728:1: entryRuleTamanhoDaFonte : ruleTamanhoDaFonte EOF ;
    public final void entryRuleTamanhoDaFonte() throws RecognitionException {
        try {
            // InternalLMJAQ.g:729:1: ( ruleTamanhoDaFonte EOF )
            // InternalLMJAQ.g:730:1: ruleTamanhoDaFonte EOF
            {
             before(grammarAccess.getTamanhoDaFonteRule()); 
            pushFollow(FOLLOW_1);
            ruleTamanhoDaFonte();

            state._fsp--;

             after(grammarAccess.getTamanhoDaFonteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTamanhoDaFonte"


    // $ANTLR start "ruleTamanhoDaFonte"
    // InternalLMJAQ.g:737:1: ruleTamanhoDaFonte : ( 'TamanhoDaFonte' ) ;
    public final void ruleTamanhoDaFonte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:741:2: ( ( 'TamanhoDaFonte' ) )
            // InternalLMJAQ.g:742:2: ( 'TamanhoDaFonte' )
            {
            // InternalLMJAQ.g:742:2: ( 'TamanhoDaFonte' )
            // InternalLMJAQ.g:743:3: 'TamanhoDaFonte'
            {
             before(grammarAccess.getTamanhoDaFonteAccess().getTamanhoDaFonteKeyword()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTamanhoDaFonteAccess().getTamanhoDaFonteKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanhoDaFonte"


    // $ANTLR start "entryRuleCaminho"
    // InternalLMJAQ.g:753:1: entryRuleCaminho : ruleCaminho EOF ;
    public final void entryRuleCaminho() throws RecognitionException {
        try {
            // InternalLMJAQ.g:754:1: ( ruleCaminho EOF )
            // InternalLMJAQ.g:755:1: ruleCaminho EOF
            {
             before(grammarAccess.getCaminhoRule()); 
            pushFollow(FOLLOW_1);
            ruleCaminho();

            state._fsp--;

             after(grammarAccess.getCaminhoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaminho"


    // $ANTLR start "ruleCaminho"
    // InternalLMJAQ.g:762:1: ruleCaminho : ( 'Caminho' ) ;
    public final void ruleCaminho() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:766:2: ( ( 'Caminho' ) )
            // InternalLMJAQ.g:767:2: ( 'Caminho' )
            {
            // InternalLMJAQ.g:767:2: ( 'Caminho' )
            // InternalLMJAQ.g:768:3: 'Caminho'
            {
             before(grammarAccess.getCaminhoAccess().getCaminhoKeyword()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCaminhoAccess().getCaminhoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaminho"


    // $ANTLR start "entryRuleConfigGeral"
    // InternalLMJAQ.g:778:1: entryRuleConfigGeral : ruleConfigGeral EOF ;
    public final void entryRuleConfigGeral() throws RecognitionException {
        try {
            // InternalLMJAQ.g:779:1: ( ruleConfigGeral EOF )
            // InternalLMJAQ.g:780:1: ruleConfigGeral EOF
            {
             before(grammarAccess.getConfigGeralRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigGeral();

            state._fsp--;

             after(grammarAccess.getConfigGeralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigGeral"


    // $ANTLR start "ruleConfigGeral"
    // InternalLMJAQ.g:787:1: ruleConfigGeral : ( 'ConfigGeral' ) ;
    public final void ruleConfigGeral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:791:2: ( ( 'ConfigGeral' ) )
            // InternalLMJAQ.g:792:2: ( 'ConfigGeral' )
            {
            // InternalLMJAQ.g:792:2: ( 'ConfigGeral' )
            // InternalLMJAQ.g:793:3: 'ConfigGeral'
            {
             before(grammarAccess.getConfigGeralAccess().getConfigGeralKeyword()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConfigGeralAccess().getConfigGeralKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigGeral"


    // $ANTLR start "entryRuleComprimentoDaTela"
    // InternalLMJAQ.g:803:1: entryRuleComprimentoDaTela : ruleComprimentoDaTela EOF ;
    public final void entryRuleComprimentoDaTela() throws RecognitionException {
        try {
            // InternalLMJAQ.g:804:1: ( ruleComprimentoDaTela EOF )
            // InternalLMJAQ.g:805:1: ruleComprimentoDaTela EOF
            {
             before(grammarAccess.getComprimentoDaTelaRule()); 
            pushFollow(FOLLOW_1);
            ruleComprimentoDaTela();

            state._fsp--;

             after(grammarAccess.getComprimentoDaTelaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComprimentoDaTela"


    // $ANTLR start "ruleComprimentoDaTela"
    // InternalLMJAQ.g:812:1: ruleComprimentoDaTela : ( 'ComprimentoDaTela' ) ;
    public final void ruleComprimentoDaTela() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:816:2: ( ( 'ComprimentoDaTela' ) )
            // InternalLMJAQ.g:817:2: ( 'ComprimentoDaTela' )
            {
            // InternalLMJAQ.g:817:2: ( 'ComprimentoDaTela' )
            // InternalLMJAQ.g:818:3: 'ComprimentoDaTela'
            {
             before(grammarAccess.getComprimentoDaTelaAccess().getComprimentoDaTelaKeyword()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComprimentoDaTelaAccess().getComprimentoDaTelaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComprimentoDaTela"


    // $ANTLR start "entryRuleAlturaDaTela"
    // InternalLMJAQ.g:828:1: entryRuleAlturaDaTela : ruleAlturaDaTela EOF ;
    public final void entryRuleAlturaDaTela() throws RecognitionException {
        try {
            // InternalLMJAQ.g:829:1: ( ruleAlturaDaTela EOF )
            // InternalLMJAQ.g:830:1: ruleAlturaDaTela EOF
            {
             before(grammarAccess.getAlturaDaTelaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlturaDaTela();

            state._fsp--;

             after(grammarAccess.getAlturaDaTelaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlturaDaTela"


    // $ANTLR start "ruleAlturaDaTela"
    // InternalLMJAQ.g:837:1: ruleAlturaDaTela : ( 'AlturaDaTela' ) ;
    public final void ruleAlturaDaTela() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:841:2: ( ( 'AlturaDaTela' ) )
            // InternalLMJAQ.g:842:2: ( 'AlturaDaTela' )
            {
            // InternalLMJAQ.g:842:2: ( 'AlturaDaTela' )
            // InternalLMJAQ.g:843:3: 'AlturaDaTela'
            {
             before(grammarAccess.getAlturaDaTelaAccess().getAlturaDaTelaKeyword()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAlturaDaTelaAccess().getAlturaDaTelaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlturaDaTela"


    // $ANTLR start "entryRuleQuestao"
    // InternalLMJAQ.g:853:1: entryRuleQuestao : ruleQuestao EOF ;
    public final void entryRuleQuestao() throws RecognitionException {
        try {
            // InternalLMJAQ.g:854:1: ( ruleQuestao EOF )
            // InternalLMJAQ.g:855:1: ruleQuestao EOF
            {
             before(grammarAccess.getQuestaoRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestao();

            state._fsp--;

             after(grammarAccess.getQuestaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestao"


    // $ANTLR start "ruleQuestao"
    // InternalLMJAQ.g:862:1: ruleQuestao : ( 'Questao' ) ;
    public final void ruleQuestao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:866:2: ( ( 'Questao' ) )
            // InternalLMJAQ.g:867:2: ( 'Questao' )
            {
            // InternalLMJAQ.g:867:2: ( 'Questao' )
            // InternalLMJAQ.g:868:3: 'Questao'
            {
             before(grammarAccess.getQuestaoAccess().getQuestaoKeyword()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuestaoAccess().getQuestaoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestao"


    // $ANTLR start "entryRuleAlternativa"
    // InternalLMJAQ.g:878:1: entryRuleAlternativa : ruleAlternativa EOF ;
    public final void entryRuleAlternativa() throws RecognitionException {
        try {
            // InternalLMJAQ.g:879:1: ( ruleAlternativa EOF )
            // InternalLMJAQ.g:880:1: ruleAlternativa EOF
            {
             before(grammarAccess.getAlternativaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternativa();

            state._fsp--;

             after(grammarAccess.getAlternativaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativa"


    // $ANTLR start "ruleAlternativa"
    // InternalLMJAQ.g:887:1: ruleAlternativa : ( 'Alternativa' ) ;
    public final void ruleAlternativa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:891:2: ( ( 'Alternativa' ) )
            // InternalLMJAQ.g:892:2: ( 'Alternativa' )
            {
            // InternalLMJAQ.g:892:2: ( 'Alternativa' )
            // InternalLMJAQ.g:893:3: 'Alternativa'
            {
             before(grammarAccess.getAlternativaAccess().getAlternativaKeyword()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAlternativaAccess().getAlternativaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativa"


    // $ANTLR start "entryRuleEnunciado"
    // InternalLMJAQ.g:903:1: entryRuleEnunciado : ruleEnunciado EOF ;
    public final void entryRuleEnunciado() throws RecognitionException {
        try {
            // InternalLMJAQ.g:904:1: ( ruleEnunciado EOF )
            // InternalLMJAQ.g:905:1: ruleEnunciado EOF
            {
             before(grammarAccess.getEnunciadoRule()); 
            pushFollow(FOLLOW_1);
            ruleEnunciado();

            state._fsp--;

             after(grammarAccess.getEnunciadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnunciado"


    // $ANTLR start "ruleEnunciado"
    // InternalLMJAQ.g:912:1: ruleEnunciado : ( 'Enunciado' ) ;
    public final void ruleEnunciado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:916:2: ( ( 'Enunciado' ) )
            // InternalLMJAQ.g:917:2: ( 'Enunciado' )
            {
            // InternalLMJAQ.g:917:2: ( 'Enunciado' )
            // InternalLMJAQ.g:918:3: 'Enunciado'
            {
             before(grammarAccess.getEnunciadoAccess().getEnunciadoKeyword()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEnunciadoAccess().getEnunciadoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnunciado"


    // $ANTLR start "entryRuleResposta"
    // InternalLMJAQ.g:928:1: entryRuleResposta : ruleResposta EOF ;
    public final void entryRuleResposta() throws RecognitionException {
        try {
            // InternalLMJAQ.g:929:1: ( ruleResposta EOF )
            // InternalLMJAQ.g:930:1: ruleResposta EOF
            {
             before(grammarAccess.getRespostaRule()); 
            pushFollow(FOLLOW_1);
            ruleResposta();

            state._fsp--;

             after(grammarAccess.getRespostaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResposta"


    // $ANTLR start "ruleResposta"
    // InternalLMJAQ.g:937:1: ruleResposta : ( 'Resposta' ) ;
    public final void ruleResposta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:941:2: ( ( 'Resposta' ) )
            // InternalLMJAQ.g:942:2: ( 'Resposta' )
            {
            // InternalLMJAQ.g:942:2: ( 'Resposta' )
            // InternalLMJAQ.g:943:3: 'Resposta'
            {
             before(grammarAccess.getRespostaAccess().getRespostaKeyword()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRespostaAccess().getRespostaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResposta"


    // $ANTLR start "entryRuleFormatoQuiz"
    // InternalLMJAQ.g:953:1: entryRuleFormatoQuiz : ruleFormatoQuiz EOF ;
    public final void entryRuleFormatoQuiz() throws RecognitionException {
        try {
            // InternalLMJAQ.g:954:1: ( ruleFormatoQuiz EOF )
            // InternalLMJAQ.g:955:1: ruleFormatoQuiz EOF
            {
             before(grammarAccess.getFormatoQuizRule()); 
            pushFollow(FOLLOW_1);
            ruleFormatoQuiz();

            state._fsp--;

             after(grammarAccess.getFormatoQuizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormatoQuiz"


    // $ANTLR start "ruleFormatoQuiz"
    // InternalLMJAQ.g:962:1: ruleFormatoQuiz : ( 'FormatoQuiz' ) ;
    public final void ruleFormatoQuiz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:966:2: ( ( 'FormatoQuiz' ) )
            // InternalLMJAQ.g:967:2: ( 'FormatoQuiz' )
            {
            // InternalLMJAQ.g:967:2: ( 'FormatoQuiz' )
            // InternalLMJAQ.g:968:3: 'FormatoQuiz'
            {
             before(grammarAccess.getFormatoQuizAccess().getFormatoQuizKeyword()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFormatoQuizAccess().getFormatoQuizKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatoQuiz"


    // $ANTLR start "entryRuleEstado"
    // InternalLMJAQ.g:978:1: entryRuleEstado : ruleEstado EOF ;
    public final void entryRuleEstado() throws RecognitionException {
        try {
            // InternalLMJAQ.g:979:1: ( ruleEstado EOF )
            // InternalLMJAQ.g:980:1: ruleEstado EOF
            {
             before(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getEstadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalLMJAQ.g:987:1: ruleEstado : ( 'Estado' ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:991:2: ( ( 'Estado' ) )
            // InternalLMJAQ.g:992:2: ( 'Estado' )
            {
            // InternalLMJAQ.g:992:2: ( 'Estado' )
            // InternalLMJAQ.g:993:3: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEstadoAccess().getEstadoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleEstadoFinal"
    // InternalLMJAQ.g:1003:1: entryRuleEstadoFinal : ruleEstadoFinal EOF ;
    public final void entryRuleEstadoFinal() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1004:1: ( ruleEstadoFinal EOF )
            // InternalLMJAQ.g:1005:1: ruleEstadoFinal EOF
            {
             before(grammarAccess.getEstadoFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleEstadoFinal();

            state._fsp--;

             after(grammarAccess.getEstadoFinalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstadoFinal"


    // $ANTLR start "ruleEstadoFinal"
    // InternalLMJAQ.g:1012:1: ruleEstadoFinal : ( 'EstadoFinal' ) ;
    public final void ruleEstadoFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1016:2: ( ( 'EstadoFinal' ) )
            // InternalLMJAQ.g:1017:2: ( 'EstadoFinal' )
            {
            // InternalLMJAQ.g:1017:2: ( 'EstadoFinal' )
            // InternalLMJAQ.g:1018:3: 'EstadoFinal'
            {
             before(grammarAccess.getEstadoFinalAccess().getEstadoFinalKeyword()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEstadoFinalAccess().getEstadoFinalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstadoFinal"


    // $ANTLR start "entryRuleEstadoInicial"
    // InternalLMJAQ.g:1028:1: entryRuleEstadoInicial : ruleEstadoInicial EOF ;
    public final void entryRuleEstadoInicial() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1029:1: ( ruleEstadoInicial EOF )
            // InternalLMJAQ.g:1030:1: ruleEstadoInicial EOF
            {
             before(grammarAccess.getEstadoInicialRule()); 
            pushFollow(FOLLOW_1);
            ruleEstadoInicial();

            state._fsp--;

             after(grammarAccess.getEstadoInicialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstadoInicial"


    // $ANTLR start "ruleEstadoInicial"
    // InternalLMJAQ.g:1037:1: ruleEstadoInicial : ( 'EstadoInicial' ) ;
    public final void ruleEstadoInicial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1041:2: ( ( 'EstadoInicial' ) )
            // InternalLMJAQ.g:1042:2: ( 'EstadoInicial' )
            {
            // InternalLMJAQ.g:1042:2: ( 'EstadoInicial' )
            // InternalLMJAQ.g:1043:3: 'EstadoInicial'
            {
             before(grammarAccess.getEstadoInicialAccess().getEstadoInicialKeyword()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEstadoInicialAccess().getEstadoInicialKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstadoInicial"


    // $ANTLR start "entryRuleProximoEstados"
    // InternalLMJAQ.g:1053:1: entryRuleProximoEstados : ruleProximoEstados EOF ;
    public final void entryRuleProximoEstados() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1054:1: ( ruleProximoEstados EOF )
            // InternalLMJAQ.g:1055:1: ruleProximoEstados EOF
            {
             before(grammarAccess.getProximoEstadosRule()); 
            pushFollow(FOLLOW_1);
            ruleProximoEstados();

            state._fsp--;

             after(grammarAccess.getProximoEstadosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProximoEstados"


    // $ANTLR start "ruleProximoEstados"
    // InternalLMJAQ.g:1062:1: ruleProximoEstados : ( 'ProximoEstados' ) ;
    public final void ruleProximoEstados() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1066:2: ( ( 'ProximoEstados' ) )
            // InternalLMJAQ.g:1067:2: ( 'ProximoEstados' )
            {
            // InternalLMJAQ.g:1067:2: ( 'ProximoEstados' )
            // InternalLMJAQ.g:1068:3: 'ProximoEstados'
            {
             before(grammarAccess.getProximoEstadosAccess().getProximoEstadosKeyword()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getProximoEstadosAccess().getProximoEstadosKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProximoEstados"


    // $ANTLR start "entryRuleItem"
    // InternalLMJAQ.g:1078:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1079:1: ( ruleItem EOF )
            // InternalLMJAQ.g:1080:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalLMJAQ.g:1087:1: ruleItem : ( 'Item' ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1091:2: ( ( 'Item' ) )
            // InternalLMJAQ.g:1092:2: ( 'Item' )
            {
            // InternalLMJAQ.g:1092:2: ( 'Item' )
            // InternalLMJAQ.g:1093:3: 'Item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleEfeito"
    // InternalLMJAQ.g:1103:1: entryRuleEfeito : ruleEfeito EOF ;
    public final void entryRuleEfeito() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1104:1: ( ruleEfeito EOF )
            // InternalLMJAQ.g:1105:1: ruleEfeito EOF
            {
             before(grammarAccess.getEfeitoRule()); 
            pushFollow(FOLLOW_1);
            ruleEfeito();

            state._fsp--;

             after(grammarAccess.getEfeitoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEfeito"


    // $ANTLR start "ruleEfeito"
    // InternalLMJAQ.g:1112:1: ruleEfeito : ( 'Efeito' ) ;
    public final void ruleEfeito() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1116:2: ( ( 'Efeito' ) )
            // InternalLMJAQ.g:1117:2: ( 'Efeito' )
            {
            // InternalLMJAQ.g:1117:2: ( 'Efeito' )
            // InternalLMJAQ.g:1118:3: 'Efeito'
            {
             before(grammarAccess.getEfeitoAccess().getEfeitoKeyword()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEfeitoAccess().getEfeitoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEfeito"


    // $ANTLR start "entryRuleEstadosAfetados"
    // InternalLMJAQ.g:1128:1: entryRuleEstadosAfetados : ruleEstadosAfetados EOF ;
    public final void entryRuleEstadosAfetados() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1129:1: ( ruleEstadosAfetados EOF )
            // InternalLMJAQ.g:1130:1: ruleEstadosAfetados EOF
            {
             before(grammarAccess.getEstadosAfetadosRule()); 
            pushFollow(FOLLOW_1);
            ruleEstadosAfetados();

            state._fsp--;

             after(grammarAccess.getEstadosAfetadosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstadosAfetados"


    // $ANTLR start "ruleEstadosAfetados"
    // InternalLMJAQ.g:1137:1: ruleEstadosAfetados : ( 'EstadosAfetados' ) ;
    public final void ruleEstadosAfetados() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1141:2: ( ( 'EstadosAfetados' ) )
            // InternalLMJAQ.g:1142:2: ( 'EstadosAfetados' )
            {
            // InternalLMJAQ.g:1142:2: ( 'EstadosAfetados' )
            // InternalLMJAQ.g:1143:3: 'EstadosAfetados'
            {
             before(grammarAccess.getEstadosAfetadosAccess().getEstadosAfetadosKeyword()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEstadosAfetadosAccess().getEstadosAfetadosKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstadosAfetados"


    // $ANTLR start "entryRuleBoolean"
    // InternalLMJAQ.g:1153:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalLMJAQ.g:1154:1: ( ruleBoolean EOF )
            // InternalLMJAQ.g:1155:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalLMJAQ.g:1162:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1166:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalLMJAQ.g:1167:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalLMJAQ.g:1167:2: ( ( rule__Boolean__Alternatives ) )
            // InternalLMJAQ.g:1168:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalLMJAQ.g:1169:3: ( rule__Boolean__Alternatives )
            // InternalLMJAQ.g:1169:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__AbstractElement__ElementTypeAlternatives_0"
    // InternalLMJAQ.g:1177:1: rule__AbstractElement__ElementTypeAlternatives_0 : ( ( rulePackageDeclaration ) | ( ruleAbstractClass ) );
    public final void rule__AbstractElement__ElementTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1181:1: ( ( rulePackageDeclaration ) | ( ruleAbstractClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==53) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=22 && LA2_0<=23)||LA2_0==27||(LA2_0>=29 && LA2_0<=33)||LA2_0==38||(LA2_0>=41 && LA2_0<=42)||LA2_0==46||LA2_0==50) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLMJAQ.g:1182:2: ( rulePackageDeclaration )
                    {
                    // InternalLMJAQ.g:1182:2: ( rulePackageDeclaration )
                    // InternalLMJAQ.g:1183:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementTypePackageDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementTypePackageDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1188:2: ( ruleAbstractClass )
                    {
                    // InternalLMJAQ.g:1188:2: ( ruleAbstractClass )
                    // InternalLMJAQ.g:1189:3: ruleAbstractClass
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementTypeAbstractClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementTypeAbstractClassParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__ElementTypeAlternatives_0"


    // $ANTLR start "rule__AbstractClass__NameAlternatives_1_0"
    // InternalLMJAQ.g:1198:1: rule__AbstractClass__NameAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_EVENT_CODE ) );
    public final void rule__AbstractClass__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1202:1: ( ( RULE_ID ) | ( RULE_EVENT_CODE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_EVENT_CODE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLMJAQ.g:1203:2: ( RULE_ID )
                    {
                    // InternalLMJAQ.g:1203:2: ( RULE_ID )
                    // InternalLMJAQ.g:1204:3: RULE_ID
                    {
                     before(grammarAccess.getAbstractClassAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAbstractClassAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1209:2: ( RULE_EVENT_CODE )
                    {
                    // InternalLMJAQ.g:1209:2: ( RULE_EVENT_CODE )
                    // InternalLMJAQ.g:1210:3: RULE_EVENT_CODE
                    {
                     before(grammarAccess.getAbstractClassAccess().getNameEVENT_CODETerminalRuleCall_1_0_1()); 
                    match(input,RULE_EVENT_CODE,FOLLOW_2); 
                     after(grammarAccess.getAbstractClassAccess().getNameEVENT_CODETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__NameAlternatives_1_0"


    // $ANTLR start "rule__AbstractClassType__TypeAlternatives_0"
    // InternalLMJAQ.g:1219:1: rule__AbstractClassType__TypeAlternatives_0 : ( ( ruleTela ) | ( ruleObjeto ) | ( ruleRecurso ) | ( ruleComponente ) | ( ruleEventoComplexo ) | ( ruleConfigGeral ) | ( ruleEstado ) | ( ruleItem ) | ( ruleAlternativa ) | ( ruleQuestao ) );
    public final void rule__AbstractClassType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1223:1: ( ( ruleTela ) | ( ruleObjeto ) | ( ruleRecurso ) | ( ruleComponente ) | ( ruleEventoComplexo ) | ( ruleConfigGeral ) | ( ruleEstado ) | ( ruleItem ) | ( ruleAlternativa ) | ( ruleQuestao ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt4=3;
                }
                break;
            case 29:
            case 30:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 38:
                {
                alt4=6;
                }
                break;
            case 46:
                {
                alt4=7;
                }
                break;
            case 50:
                {
                alt4=8;
                }
                break;
            case 42:
                {
                alt4=9;
                }
                break;
            case 41:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLMJAQ.g:1224:2: ( ruleTela )
                    {
                    // InternalLMJAQ.g:1224:2: ( ruleTela )
                    // InternalLMJAQ.g:1225:3: ruleTela
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeTelaParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTela();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeTelaParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1230:2: ( ruleObjeto )
                    {
                    // InternalLMJAQ.g:1230:2: ( ruleObjeto )
                    // InternalLMJAQ.g:1231:3: ruleObjeto
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeObjetoParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjeto();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeObjetoParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1236:2: ( ruleRecurso )
                    {
                    // InternalLMJAQ.g:1236:2: ( ruleRecurso )
                    // InternalLMJAQ.g:1237:3: ruleRecurso
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeRecursoParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecurso();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeRecursoParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:1242:2: ( ruleComponente )
                    {
                    // InternalLMJAQ.g:1242:2: ( ruleComponente )
                    // InternalLMJAQ.g:1243:3: ruleComponente
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeComponenteParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComponente();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeComponenteParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:1248:2: ( ruleEventoComplexo )
                    {
                    // InternalLMJAQ.g:1248:2: ( ruleEventoComplexo )
                    // InternalLMJAQ.g:1249:3: ruleEventoComplexo
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeEventoComplexoParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEventoComplexo();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeEventoComplexoParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:1254:2: ( ruleConfigGeral )
                    {
                    // InternalLMJAQ.g:1254:2: ( ruleConfigGeral )
                    // InternalLMJAQ.g:1255:3: ruleConfigGeral
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeConfigGeralParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigGeral();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeConfigGeralParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:1260:2: ( ruleEstado )
                    {
                    // InternalLMJAQ.g:1260:2: ( ruleEstado )
                    // InternalLMJAQ.g:1261:3: ruleEstado
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeEstadoParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEstado();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeEstadoParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:1266:2: ( ruleItem )
                    {
                    // InternalLMJAQ.g:1266:2: ( ruleItem )
                    // InternalLMJAQ.g:1267:3: ruleItem
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeItemParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleItem();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeItemParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:1272:2: ( ruleAlternativa )
                    {
                    // InternalLMJAQ.g:1272:2: ( ruleAlternativa )
                    // InternalLMJAQ.g:1273:3: ruleAlternativa
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeAlternativaParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternativa();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeAlternativaParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:1278:2: ( ruleQuestao )
                    {
                    // InternalLMJAQ.g:1278:2: ( ruleQuestao )
                    // InternalLMJAQ.g:1279:3: ruleQuestao
                    {
                     before(grammarAccess.getAbstractClassTypeAccess().getTypeQuestaoParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestao();

                    state._fsp--;

                     after(grammarAccess.getAbstractClassTypeAccess().getTypeQuestaoParserRuleCall_0_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClassType__TypeAlternatives_0"


    // $ANTLR start "rule__AbstractProperty__FormatAlternatives_0_0"
    // InternalLMJAQ.g:1288:1: rule__AbstractProperty__FormatAlternatives_0_0 : ( ( ruleClassReference ) | ( ruleProperty ) );
    public final void rule__AbstractProperty__FormatAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1292:1: ( ( ruleClassReference ) | ( ruleProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=23)||LA5_0==27||(LA5_0>=29 && LA5_0<=33)||LA5_0==38||(LA5_0>=41 && LA5_0<=42)||LA5_0==46||LA5_0==50) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=24 && LA5_0<=26)||LA5_0==28||(LA5_0>=34 && LA5_0<=37)||(LA5_0>=39 && LA5_0<=40)||(LA5_0>=43 && LA5_0<=45)||(LA5_0>=47 && LA5_0<=49)||(LA5_0>=51 && LA5_0<=52)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLMJAQ.g:1293:2: ( ruleClassReference )
                    {
                    // InternalLMJAQ.g:1293:2: ( ruleClassReference )
                    // InternalLMJAQ.g:1294:3: ruleClassReference
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getFormatClassReferenceParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassReference();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getFormatClassReferenceParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1299:2: ( ruleProperty )
                    {
                    // InternalLMJAQ.g:1299:2: ( ruleProperty )
                    // InternalLMJAQ.g:1300:3: ruleProperty
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getFormatPropertyParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getFormatPropertyParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__FormatAlternatives_0_0"


    // $ANTLR start "rule__Property__PropertyTypeAlternatives_0"
    // InternalLMJAQ.g:1309:1: rule__Property__PropertyTypeAlternatives_0 : ( ( rulePosicao ) | ( ruleestaAtivo ) | ( ruleCaminho ) | ( ruleTamanhoDaFonte ) | ( ruleConteudo ) | ( ruleTamanho ) | ( ruleIU ) | ( ruleEventoSimples ) | ( ruleComprimentoDaTela ) | ( ruleAlturaDaTela ) | ( ruleEfeito ) | ( ruleEstadosAfetados ) | ( ruleEstadoInicial ) | ( ruleEstadoFinal ) | ( ruleProximoEstados ) | ( ruleFormatoQuiz ) | ( ruleEnunciado ) | ( ruleResposta ) );
    public final void rule__Property__PropertyTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1313:1: ( ( rulePosicao ) | ( ruleestaAtivo ) | ( ruleCaminho ) | ( ruleTamanhoDaFonte ) | ( ruleConteudo ) | ( ruleTamanho ) | ( ruleIU ) | ( ruleEventoSimples ) | ( ruleComprimentoDaTela ) | ( ruleAlturaDaTela ) | ( ruleEfeito ) | ( ruleEstadosAfetados ) | ( ruleEstadoInicial ) | ( ruleEstadoFinal ) | ( ruleProximoEstados ) | ( ruleFormatoQuiz ) | ( ruleEnunciado ) | ( ruleResposta ) )
            int alt6=18;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 36:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 28:
                {
                alt6=8;
                }
                break;
            case 39:
                {
                alt6=9;
                }
                break;
            case 40:
                {
                alt6=10;
                }
                break;
            case 51:
                {
                alt6=11;
                }
                break;
            case 52:
                {
                alt6=12;
                }
                break;
            case 48:
                {
                alt6=13;
                }
                break;
            case 47:
                {
                alt6=14;
                }
                break;
            case 49:
                {
                alt6=15;
                }
                break;
            case 45:
                {
                alt6=16;
                }
                break;
            case 43:
                {
                alt6=17;
                }
                break;
            case 44:
                {
                alt6=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLMJAQ.g:1314:2: ( rulePosicao )
                    {
                    // InternalLMJAQ.g:1314:2: ( rulePosicao )
                    // InternalLMJAQ.g:1315:3: rulePosicao
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypePosicaoParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePosicao();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypePosicaoParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1320:2: ( ruleestaAtivo )
                    {
                    // InternalLMJAQ.g:1320:2: ( ruleestaAtivo )
                    // InternalLMJAQ.g:1321:3: ruleestaAtivo
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEstaAtivoParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleestaAtivo();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEstaAtivoParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1326:2: ( ruleCaminho )
                    {
                    // InternalLMJAQ.g:1326:2: ( ruleCaminho )
                    // InternalLMJAQ.g:1327:3: ruleCaminho
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeCaminhoParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCaminho();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeCaminhoParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:1332:2: ( ruleTamanhoDaFonte )
                    {
                    // InternalLMJAQ.g:1332:2: ( ruleTamanhoDaFonte )
                    // InternalLMJAQ.g:1333:3: ruleTamanhoDaFonte
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoDaFonteParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTamanhoDaFonte();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoDaFonteParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:1338:2: ( ruleConteudo )
                    {
                    // InternalLMJAQ.g:1338:2: ( ruleConteudo )
                    // InternalLMJAQ.g:1339:3: ruleConteudo
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeConteudoParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConteudo();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeConteudoParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:1344:2: ( ruleTamanho )
                    {
                    // InternalLMJAQ.g:1344:2: ( ruleTamanho )
                    // InternalLMJAQ.g:1345:3: ruleTamanho
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTamanho();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:1350:2: ( ruleIU )
                    {
                    // InternalLMJAQ.g:1350:2: ( ruleIU )
                    // InternalLMJAQ.g:1351:3: ruleIU
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeIUParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleIU();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeIUParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:1356:2: ( ruleEventoSimples )
                    {
                    // InternalLMJAQ.g:1356:2: ( ruleEventoSimples )
                    // InternalLMJAQ.g:1357:3: ruleEventoSimples
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEventoSimplesParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEventoSimples();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEventoSimplesParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:1362:2: ( ruleComprimentoDaTela )
                    {
                    // InternalLMJAQ.g:1362:2: ( ruleComprimentoDaTela )
                    // InternalLMJAQ.g:1363:3: ruleComprimentoDaTela
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeComprimentoDaTelaParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleComprimentoDaTela();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeComprimentoDaTelaParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:1368:2: ( ruleAlturaDaTela )
                    {
                    // InternalLMJAQ.g:1368:2: ( ruleAlturaDaTela )
                    // InternalLMJAQ.g:1369:3: ruleAlturaDaTela
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeAlturaDaTelaParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleAlturaDaTela();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeAlturaDaTelaParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalLMJAQ.g:1374:2: ( ruleEfeito )
                    {
                    // InternalLMJAQ.g:1374:2: ( ruleEfeito )
                    // InternalLMJAQ.g:1375:3: ruleEfeito
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEfeitoParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleEfeito();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEfeitoParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalLMJAQ.g:1380:2: ( ruleEstadosAfetados )
                    {
                    // InternalLMJAQ.g:1380:2: ( ruleEstadosAfetados )
                    // InternalLMJAQ.g:1381:3: ruleEstadosAfetados
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEstadosAfetadosParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleEstadosAfetados();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEstadosAfetadosParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalLMJAQ.g:1386:2: ( ruleEstadoInicial )
                    {
                    // InternalLMJAQ.g:1386:2: ( ruleEstadoInicial )
                    // InternalLMJAQ.g:1387:3: ruleEstadoInicial
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEstadoInicialParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleEstadoInicial();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEstadoInicialParserRuleCall_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalLMJAQ.g:1392:2: ( ruleEstadoFinal )
                    {
                    // InternalLMJAQ.g:1392:2: ( ruleEstadoFinal )
                    // InternalLMJAQ.g:1393:3: ruleEstadoFinal
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEstadoFinalParserRuleCall_0_13()); 
                    pushFollow(FOLLOW_2);
                    ruleEstadoFinal();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEstadoFinalParserRuleCall_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalLMJAQ.g:1398:2: ( ruleProximoEstados )
                    {
                    // InternalLMJAQ.g:1398:2: ( ruleProximoEstados )
                    // InternalLMJAQ.g:1399:3: ruleProximoEstados
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeProximoEstadosParserRuleCall_0_14()); 
                    pushFollow(FOLLOW_2);
                    ruleProximoEstados();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeProximoEstadosParserRuleCall_0_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalLMJAQ.g:1404:2: ( ruleFormatoQuiz )
                    {
                    // InternalLMJAQ.g:1404:2: ( ruleFormatoQuiz )
                    // InternalLMJAQ.g:1405:3: ruleFormatoQuiz
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeFormatoQuizParserRuleCall_0_15()); 
                    pushFollow(FOLLOW_2);
                    ruleFormatoQuiz();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeFormatoQuizParserRuleCall_0_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalLMJAQ.g:1410:2: ( ruleEnunciado )
                    {
                    // InternalLMJAQ.g:1410:2: ( ruleEnunciado )
                    // InternalLMJAQ.g:1411:3: ruleEnunciado
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeEnunciadoParserRuleCall_0_16()); 
                    pushFollow(FOLLOW_2);
                    ruleEnunciado();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeEnunciadoParserRuleCall_0_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalLMJAQ.g:1416:2: ( ruleResposta )
                    {
                    // InternalLMJAQ.g:1416:2: ( ruleResposta )
                    // InternalLMJAQ.g:1417:3: ruleResposta
                    {
                     before(grammarAccess.getPropertyAccess().getPropertyTypeRespostaParserRuleCall_0_17()); 
                    pushFollow(FOLLOW_2);
                    ruleResposta();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPropertyTypeRespostaParserRuleCall_0_17()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertyTypeAlternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalLMJAQ.g:1426:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( ruleBoolean ) | ( RULE_UNITYINTDECIMAL ) | ( RULE_INTEGER ) | ( RULE_PATH ) | ( RULE_UI_TYPE ) | ( RULE_SIMPLE_EVENT_TYPE ) | ( RULE_EVENT_CODE ) | ( RULE_EFEITO_ACTION ) | ( RULE_TEXT_CONTENT ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1430:1: ( ( RULE_ID ) | ( ruleBoolean ) | ( RULE_UNITYINTDECIMAL ) | ( RULE_INTEGER ) | ( RULE_PATH ) | ( RULE_UI_TYPE ) | ( RULE_SIMPLE_EVENT_TYPE ) | ( RULE_EVENT_CODE ) | ( RULE_EFEITO_ACTION ) | ( RULE_TEXT_CONTENT ) )
            int alt7=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_FALSE:
            case RULE_TRUE:
                {
                alt7=2;
                }
                break;
            case RULE_UNITYINTDECIMAL:
                {
                alt7=3;
                }
                break;
            case RULE_INTEGER:
                {
                alt7=4;
                }
                break;
            case RULE_PATH:
                {
                alt7=5;
                }
                break;
            case RULE_UI_TYPE:
                {
                alt7=6;
                }
                break;
            case RULE_SIMPLE_EVENT_TYPE:
                {
                alt7=7;
                }
                break;
            case RULE_EVENT_CODE:
                {
                alt7=8;
                }
                break;
            case RULE_EFEITO_ACTION:
                {
                alt7=9;
                }
                break;
            case RULE_TEXT_CONTENT:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLMJAQ.g:1431:2: ( RULE_ID )
                    {
                    // InternalLMJAQ.g:1431:2: ( RULE_ID )
                    // InternalLMJAQ.g:1432:3: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1437:2: ( ruleBoolean )
                    {
                    // InternalLMJAQ.g:1437:2: ( ruleBoolean )
                    // InternalLMJAQ.g:1438:3: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1443:2: ( RULE_UNITYINTDECIMAL )
                    {
                    // InternalLMJAQ.g:1443:2: ( RULE_UNITYINTDECIMAL )
                    // InternalLMJAQ.g:1444:3: RULE_UNITYINTDECIMAL
                    {
                     before(grammarAccess.getValueAccess().getUNITYINTDECIMALTerminalRuleCall_2()); 
                    match(input,RULE_UNITYINTDECIMAL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getUNITYINTDECIMALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:1449:2: ( RULE_INTEGER )
                    {
                    // InternalLMJAQ.g:1449:2: ( RULE_INTEGER )
                    // InternalLMJAQ.g:1450:3: RULE_INTEGER
                    {
                     before(grammarAccess.getValueAccess().getINTEGERTerminalRuleCall_3()); 
                    match(input,RULE_INTEGER,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTEGERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:1455:2: ( RULE_PATH )
                    {
                    // InternalLMJAQ.g:1455:2: ( RULE_PATH )
                    // InternalLMJAQ.g:1456:3: RULE_PATH
                    {
                     before(grammarAccess.getValueAccess().getPATHTerminalRuleCall_4()); 
                    match(input,RULE_PATH,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getPATHTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:1461:2: ( RULE_UI_TYPE )
                    {
                    // InternalLMJAQ.g:1461:2: ( RULE_UI_TYPE )
                    // InternalLMJAQ.g:1462:3: RULE_UI_TYPE
                    {
                     before(grammarAccess.getValueAccess().getUI_TYPETerminalRuleCall_5()); 
                    match(input,RULE_UI_TYPE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getUI_TYPETerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:1467:2: ( RULE_SIMPLE_EVENT_TYPE )
                    {
                    // InternalLMJAQ.g:1467:2: ( RULE_SIMPLE_EVENT_TYPE )
                    // InternalLMJAQ.g:1468:3: RULE_SIMPLE_EVENT_TYPE
                    {
                     before(grammarAccess.getValueAccess().getSIMPLE_EVENT_TYPETerminalRuleCall_6()); 
                    match(input,RULE_SIMPLE_EVENT_TYPE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSIMPLE_EVENT_TYPETerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:1473:2: ( RULE_EVENT_CODE )
                    {
                    // InternalLMJAQ.g:1473:2: ( RULE_EVENT_CODE )
                    // InternalLMJAQ.g:1474:3: RULE_EVENT_CODE
                    {
                     before(grammarAccess.getValueAccess().getEVENT_CODETerminalRuleCall_7()); 
                    match(input,RULE_EVENT_CODE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getEVENT_CODETerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:1479:2: ( RULE_EFEITO_ACTION )
                    {
                    // InternalLMJAQ.g:1479:2: ( RULE_EFEITO_ACTION )
                    // InternalLMJAQ.g:1480:3: RULE_EFEITO_ACTION
                    {
                     before(grammarAccess.getValueAccess().getEFEITO_ACTIONTerminalRuleCall_8()); 
                    match(input,RULE_EFEITO_ACTION,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getEFEITO_ACTIONTerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:1485:2: ( RULE_TEXT_CONTENT )
                    {
                    // InternalLMJAQ.g:1485:2: ( RULE_TEXT_CONTENT )
                    // InternalLMJAQ.g:1486:3: RULE_TEXT_CONTENT
                    {
                     before(grammarAccess.getValueAccess().getTEXT_CONTENTTerminalRuleCall_9()); 
                    match(input,RULE_TEXT_CONTENT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getTEXT_CONTENTTerminalRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Componente__Alternatives"
    // InternalLMJAQ.g:1495:1: rule__Componente__Alternatives : ( ( ruleGatilho ) | ( ruleComportamento ) );
    public final void rule__Componente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1499:1: ( ( ruleGatilho ) | ( ruleComportamento ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLMJAQ.g:1500:2: ( ruleGatilho )
                    {
                    // InternalLMJAQ.g:1500:2: ( ruleGatilho )
                    // InternalLMJAQ.g:1501:3: ruleGatilho
                    {
                     before(grammarAccess.getComponenteAccess().getGatilhoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGatilho();

                    state._fsp--;

                     after(grammarAccess.getComponenteAccess().getGatilhoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1506:2: ( ruleComportamento )
                    {
                    // InternalLMJAQ.g:1506:2: ( ruleComportamento )
                    // InternalLMJAQ.g:1507:3: ruleComportamento
                    {
                     before(grammarAccess.getComponenteAccess().getComportamentoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComportamento();

                    state._fsp--;

                     after(grammarAccess.getComponenteAccess().getComportamentoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Alternatives"


    // $ANTLR start "rule__Recurso__Alternatives"
    // InternalLMJAQ.g:1516:1: rule__Recurso__Alternatives : ( ( ruleImagem ) | ( ruleAnimacao ) | ( ruleTexto ) );
    public final void rule__Recurso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1520:1: ( ( ruleImagem ) | ( ruleAnimacao ) | ( ruleTexto ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLMJAQ.g:1521:2: ( ruleImagem )
                    {
                    // InternalLMJAQ.g:1521:2: ( ruleImagem )
                    // InternalLMJAQ.g:1522:3: ruleImagem
                    {
                     before(grammarAccess.getRecursoAccess().getImagemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImagem();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getImagemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1527:2: ( ruleAnimacao )
                    {
                    // InternalLMJAQ.g:1527:2: ( ruleAnimacao )
                    // InternalLMJAQ.g:1528:3: ruleAnimacao
                    {
                     before(grammarAccess.getRecursoAccess().getAnimacaoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnimacao();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getAnimacaoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1533:2: ( ruleTexto )
                    {
                    // InternalLMJAQ.g:1533:2: ( ruleTexto )
                    // InternalLMJAQ.g:1534:3: ruleTexto
                    {
                     before(grammarAccess.getRecursoAccess().getTextoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTexto();

                    state._fsp--;

                     after(grammarAccess.getRecursoAccess().getTextoParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurso__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalLMJAQ.g:1543:1: rule__Boolean__Alternatives : ( ( RULE_FALSE ) | ( RULE_TRUE ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1547:1: ( ( RULE_FALSE ) | ( RULE_TRUE ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_FALSE) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_TRUE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLMJAQ.g:1548:2: ( RULE_FALSE )
                    {
                    // InternalLMJAQ.g:1548:2: ( RULE_FALSE )
                    // InternalLMJAQ.g:1549:3: RULE_FALSE
                    {
                     before(grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_0()); 
                    match(input,RULE_FALSE,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1554:2: ( RULE_TRUE )
                    {
                    // InternalLMJAQ.g:1554:2: ( RULE_TRUE )
                    // InternalLMJAQ.g:1555:3: RULE_TRUE
                    {
                     before(grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_1()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalLMJAQ.g:1564:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1568:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalLMJAQ.g:1569:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalLMJAQ.g:1576:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1580:1: ( ( 'package' ) )
            // InternalLMJAQ.g:1581:1: ( 'package' )
            {
            // InternalLMJAQ.g:1581:1: ( 'package' )
            // InternalLMJAQ.g:1582:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalLMJAQ.g:1591:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1595:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalLMJAQ.g:1596:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalLMJAQ.g:1602:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1606:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalLMJAQ.g:1607:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalLMJAQ.g:1607:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalLMJAQ.g:1608:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalLMJAQ.g:1609:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalLMJAQ.g:1609:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLMJAQ.g:1618:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1622:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLMJAQ.g:1623:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalLMJAQ.g:1630:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1634:1: ( ( RULE_ID ) )
            // InternalLMJAQ.g:1635:1: ( RULE_ID )
            {
            // InternalLMJAQ.g:1635:1: ( RULE_ID )
            // InternalLMJAQ.g:1636:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalLMJAQ.g:1645:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1649:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLMJAQ.g:1650:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalLMJAQ.g:1656:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1660:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLMJAQ.g:1661:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLMJAQ.g:1661:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLMJAQ.g:1662:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLMJAQ.g:1663:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLMJAQ.g:1663:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalLMJAQ.g:1672:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1676:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLMJAQ.g:1677:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalLMJAQ.g:1684:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1688:1: ( ( '.' ) )
            // InternalLMJAQ.g:1689:1: ( '.' )
            {
            // InternalLMJAQ.g:1689:1: ( '.' )
            // InternalLMJAQ.g:1690:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalLMJAQ.g:1699:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1703:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLMJAQ.g:1704:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalLMJAQ.g:1710:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1714:1: ( ( RULE_ID ) )
            // InternalLMJAQ.g:1715:1: ( RULE_ID )
            {
            // InternalLMJAQ.g:1715:1: ( RULE_ID )
            // InternalLMJAQ.g:1716:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractClass__Group__0"
    // InternalLMJAQ.g:1726:1: rule__AbstractClass__Group__0 : rule__AbstractClass__Group__0__Impl rule__AbstractClass__Group__1 ;
    public final void rule__AbstractClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1730:1: ( rule__AbstractClass__Group__0__Impl rule__AbstractClass__Group__1 )
            // InternalLMJAQ.g:1731:2: rule__AbstractClass__Group__0__Impl rule__AbstractClass__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AbstractClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__0"


    // $ANTLR start "rule__AbstractClass__Group__0__Impl"
    // InternalLMJAQ.g:1738:1: rule__AbstractClass__Group__0__Impl : ( ( rule__AbstractClass__TypeAssignment_0 ) ) ;
    public final void rule__AbstractClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1742:1: ( ( ( rule__AbstractClass__TypeAssignment_0 ) ) )
            // InternalLMJAQ.g:1743:1: ( ( rule__AbstractClass__TypeAssignment_0 ) )
            {
            // InternalLMJAQ.g:1743:1: ( ( rule__AbstractClass__TypeAssignment_0 ) )
            // InternalLMJAQ.g:1744:2: ( rule__AbstractClass__TypeAssignment_0 )
            {
             before(grammarAccess.getAbstractClassAccess().getTypeAssignment_0()); 
            // InternalLMJAQ.g:1745:2: ( rule__AbstractClass__TypeAssignment_0 )
            // InternalLMJAQ.g:1745:3: rule__AbstractClass__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClass__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__0__Impl"


    // $ANTLR start "rule__AbstractClass__Group__1"
    // InternalLMJAQ.g:1753:1: rule__AbstractClass__Group__1 : rule__AbstractClass__Group__1__Impl rule__AbstractClass__Group__2 ;
    public final void rule__AbstractClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1757:1: ( rule__AbstractClass__Group__1__Impl rule__AbstractClass__Group__2 )
            // InternalLMJAQ.g:1758:2: rule__AbstractClass__Group__1__Impl rule__AbstractClass__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AbstractClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__1"


    // $ANTLR start "rule__AbstractClass__Group__1__Impl"
    // InternalLMJAQ.g:1765:1: rule__AbstractClass__Group__1__Impl : ( ( rule__AbstractClass__NameAssignment_1 ) ) ;
    public final void rule__AbstractClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1769:1: ( ( ( rule__AbstractClass__NameAssignment_1 ) ) )
            // InternalLMJAQ.g:1770:1: ( ( rule__AbstractClass__NameAssignment_1 ) )
            {
            // InternalLMJAQ.g:1770:1: ( ( rule__AbstractClass__NameAssignment_1 ) )
            // InternalLMJAQ.g:1771:2: ( rule__AbstractClass__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractClassAccess().getNameAssignment_1()); 
            // InternalLMJAQ.g:1772:2: ( rule__AbstractClass__NameAssignment_1 )
            // InternalLMJAQ.g:1772:3: rule__AbstractClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__1__Impl"


    // $ANTLR start "rule__AbstractClass__Group__2"
    // InternalLMJAQ.g:1780:1: rule__AbstractClass__Group__2 : rule__AbstractClass__Group__2__Impl rule__AbstractClass__Group__3 ;
    public final void rule__AbstractClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1784:1: ( rule__AbstractClass__Group__2__Impl rule__AbstractClass__Group__3 )
            // InternalLMJAQ.g:1785:2: rule__AbstractClass__Group__2__Impl rule__AbstractClass__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AbstractClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__2"


    // $ANTLR start "rule__AbstractClass__Group__2__Impl"
    // InternalLMJAQ.g:1792:1: rule__AbstractClass__Group__2__Impl : ( '{' ) ;
    public final void rule__AbstractClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1796:1: ( ( '{' ) )
            // InternalLMJAQ.g:1797:1: ( '{' )
            {
            // InternalLMJAQ.g:1797:1: ( '{' )
            // InternalLMJAQ.g:1798:2: '{'
            {
             before(grammarAccess.getAbstractClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAbstractClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__2__Impl"


    // $ANTLR start "rule__AbstractClass__Group__3"
    // InternalLMJAQ.g:1807:1: rule__AbstractClass__Group__3 : rule__AbstractClass__Group__3__Impl rule__AbstractClass__Group__4 ;
    public final void rule__AbstractClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1811:1: ( rule__AbstractClass__Group__3__Impl rule__AbstractClass__Group__4 )
            // InternalLMJAQ.g:1812:2: rule__AbstractClass__Group__3__Impl rule__AbstractClass__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__AbstractClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__3"


    // $ANTLR start "rule__AbstractClass__Group__3__Impl"
    // InternalLMJAQ.g:1819:1: rule__AbstractClass__Group__3__Impl : ( ( rule__AbstractClass__AbstractPropertiesAssignment_3 )* ) ;
    public final void rule__AbstractClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1823:1: ( ( ( rule__AbstractClass__AbstractPropertiesAssignment_3 )* ) )
            // InternalLMJAQ.g:1824:1: ( ( rule__AbstractClass__AbstractPropertiesAssignment_3 )* )
            {
            // InternalLMJAQ.g:1824:1: ( ( rule__AbstractClass__AbstractPropertiesAssignment_3 )* )
            // InternalLMJAQ.g:1825:2: ( rule__AbstractClass__AbstractPropertiesAssignment_3 )*
            {
             before(grammarAccess.getAbstractClassAccess().getAbstractPropertiesAssignment_3()); 
            // InternalLMJAQ.g:1826:2: ( rule__AbstractClass__AbstractPropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=52)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLMJAQ.g:1826:3: rule__AbstractClass__AbstractPropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AbstractClass__AbstractPropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAbstractClassAccess().getAbstractPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__3__Impl"


    // $ANTLR start "rule__AbstractClass__Group__4"
    // InternalLMJAQ.g:1834:1: rule__AbstractClass__Group__4 : rule__AbstractClass__Group__4__Impl ;
    public final void rule__AbstractClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1838:1: ( rule__AbstractClass__Group__4__Impl )
            // InternalLMJAQ.g:1839:2: rule__AbstractClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClass__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__4"


    // $ANTLR start "rule__AbstractClass__Group__4__Impl"
    // InternalLMJAQ.g:1845:1: rule__AbstractClass__Group__4__Impl : ( '}' ) ;
    public final void rule__AbstractClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1849:1: ( ( '}' ) )
            // InternalLMJAQ.g:1850:1: ( '}' )
            {
            // InternalLMJAQ.g:1850:1: ( '}' )
            // InternalLMJAQ.g:1851:2: '}'
            {
             before(grammarAccess.getAbstractClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAbstractClassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__Group__4__Impl"


    // $ANTLR start "rule__AbstractProperty__Group__0"
    // InternalLMJAQ.g:1861:1: rule__AbstractProperty__Group__0 : rule__AbstractProperty__Group__0__Impl rule__AbstractProperty__Group__1 ;
    public final void rule__AbstractProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1865:1: ( rule__AbstractProperty__Group__0__Impl rule__AbstractProperty__Group__1 )
            // InternalLMJAQ.g:1866:2: rule__AbstractProperty__Group__0__Impl rule__AbstractProperty__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AbstractProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__0"


    // $ANTLR start "rule__AbstractProperty__Group__0__Impl"
    // InternalLMJAQ.g:1873:1: rule__AbstractProperty__Group__0__Impl : ( ( rule__AbstractProperty__FormatAssignment_0 ) ) ;
    public final void rule__AbstractProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1877:1: ( ( ( rule__AbstractProperty__FormatAssignment_0 ) ) )
            // InternalLMJAQ.g:1878:1: ( ( rule__AbstractProperty__FormatAssignment_0 ) )
            {
            // InternalLMJAQ.g:1878:1: ( ( rule__AbstractProperty__FormatAssignment_0 ) )
            // InternalLMJAQ.g:1879:2: ( rule__AbstractProperty__FormatAssignment_0 )
            {
             before(grammarAccess.getAbstractPropertyAccess().getFormatAssignment_0()); 
            // InternalLMJAQ.g:1880:2: ( rule__AbstractProperty__FormatAssignment_0 )
            // InternalLMJAQ.g:1880:3: rule__AbstractProperty__FormatAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractProperty__FormatAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPropertyAccess().getFormatAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__0__Impl"


    // $ANTLR start "rule__AbstractProperty__Group__1"
    // InternalLMJAQ.g:1888:1: rule__AbstractProperty__Group__1 : rule__AbstractProperty__Group__1__Impl rule__AbstractProperty__Group__2 ;
    public final void rule__AbstractProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1892:1: ( rule__AbstractProperty__Group__1__Impl rule__AbstractProperty__Group__2 )
            // InternalLMJAQ.g:1893:2: rule__AbstractProperty__Group__1__Impl rule__AbstractProperty__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AbstractProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__1"


    // $ANTLR start "rule__AbstractProperty__Group__1__Impl"
    // InternalLMJAQ.g:1900:1: rule__AbstractProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__AbstractProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1904:1: ( ( ':' ) )
            // InternalLMJAQ.g:1905:1: ( ':' )
            {
            // InternalLMJAQ.g:1905:1: ( ':' )
            // InternalLMJAQ.g:1906:2: ':'
            {
             before(grammarAccess.getAbstractPropertyAccess().getColonKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAbstractPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__1__Impl"


    // $ANTLR start "rule__AbstractProperty__Group__2"
    // InternalLMJAQ.g:1915:1: rule__AbstractProperty__Group__2 : rule__AbstractProperty__Group__2__Impl ;
    public final void rule__AbstractProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1919:1: ( rule__AbstractProperty__Group__2__Impl )
            // InternalLMJAQ.g:1920:2: rule__AbstractProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__2"


    // $ANTLR start "rule__AbstractProperty__Group__2__Impl"
    // InternalLMJAQ.g:1926:1: rule__AbstractProperty__Group__2__Impl : ( ( rule__AbstractProperty__ValuesAssignment_2 )* ) ;
    public final void rule__AbstractProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1930:1: ( ( ( rule__AbstractProperty__ValuesAssignment_2 )* ) )
            // InternalLMJAQ.g:1931:1: ( ( rule__AbstractProperty__ValuesAssignment_2 )* )
            {
            // InternalLMJAQ.g:1931:1: ( ( rule__AbstractProperty__ValuesAssignment_2 )* )
            // InternalLMJAQ.g:1932:2: ( rule__AbstractProperty__ValuesAssignment_2 )*
            {
             before(grammarAccess.getAbstractPropertyAccess().getValuesAssignment_2()); 
            // InternalLMJAQ.g:1933:2: ( rule__AbstractProperty__ValuesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_TRUE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLMJAQ.g:1933:3: rule__AbstractProperty__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AbstractProperty__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAbstractPropertyAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__Group__2__Impl"


    // $ANTLR start "rule__Model__AbstractElmentsAssignment"
    // InternalLMJAQ.g:1942:1: rule__Model__AbstractElmentsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__AbstractElmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1946:1: ( ( ruleAbstractElement ) )
            // InternalLMJAQ.g:1947:2: ( ruleAbstractElement )
            {
            // InternalLMJAQ.g:1947:2: ( ruleAbstractElement )
            // InternalLMJAQ.g:1948:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getAbstractElmentsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAbstractElmentsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AbstractElmentsAssignment"


    // $ANTLR start "rule__AbstractElement__ElementTypeAssignment"
    // InternalLMJAQ.g:1957:1: rule__AbstractElement__ElementTypeAssignment : ( ( rule__AbstractElement__ElementTypeAlternatives_0 ) ) ;
    public final void rule__AbstractElement__ElementTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1961:1: ( ( ( rule__AbstractElement__ElementTypeAlternatives_0 ) ) )
            // InternalLMJAQ.g:1962:2: ( ( rule__AbstractElement__ElementTypeAlternatives_0 ) )
            {
            // InternalLMJAQ.g:1962:2: ( ( rule__AbstractElement__ElementTypeAlternatives_0 ) )
            // InternalLMJAQ.g:1963:3: ( rule__AbstractElement__ElementTypeAlternatives_0 )
            {
             before(grammarAccess.getAbstractElementAccess().getElementTypeAlternatives_0()); 
            // InternalLMJAQ.g:1964:3: ( rule__AbstractElement__ElementTypeAlternatives_0 )
            // InternalLMJAQ.g:1964:4: rule__AbstractElement__ElementTypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__ElementTypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getElementTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__ElementTypeAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalLMJAQ.g:1972:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1976:1: ( ( ruleQualifiedName ) )
            // InternalLMJAQ.g:1977:2: ( ruleQualifiedName )
            {
            // InternalLMJAQ.g:1977:2: ( ruleQualifiedName )
            // InternalLMJAQ.g:1978:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__AbstractClass__TypeAssignment_0"
    // InternalLMJAQ.g:1987:1: rule__AbstractClass__TypeAssignment_0 : ( ruleAbstractClassType ) ;
    public final void rule__AbstractClass__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:1991:1: ( ( ruleAbstractClassType ) )
            // InternalLMJAQ.g:1992:2: ( ruleAbstractClassType )
            {
            // InternalLMJAQ.g:1992:2: ( ruleAbstractClassType )
            // InternalLMJAQ.g:1993:3: ruleAbstractClassType
            {
             before(grammarAccess.getAbstractClassAccess().getTypeAbstractClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractClassType();

            state._fsp--;

             after(grammarAccess.getAbstractClassAccess().getTypeAbstractClassTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__TypeAssignment_0"


    // $ANTLR start "rule__AbstractClass__NameAssignment_1"
    // InternalLMJAQ.g:2002:1: rule__AbstractClass__NameAssignment_1 : ( ( rule__AbstractClass__NameAlternatives_1_0 ) ) ;
    public final void rule__AbstractClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2006:1: ( ( ( rule__AbstractClass__NameAlternatives_1_0 ) ) )
            // InternalLMJAQ.g:2007:2: ( ( rule__AbstractClass__NameAlternatives_1_0 ) )
            {
            // InternalLMJAQ.g:2007:2: ( ( rule__AbstractClass__NameAlternatives_1_0 ) )
            // InternalLMJAQ.g:2008:3: ( rule__AbstractClass__NameAlternatives_1_0 )
            {
             before(grammarAccess.getAbstractClassAccess().getNameAlternatives_1_0()); 
            // InternalLMJAQ.g:2009:3: ( rule__AbstractClass__NameAlternatives_1_0 )
            // InternalLMJAQ.g:2009:4: rule__AbstractClass__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClass__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__NameAssignment_1"


    // $ANTLR start "rule__AbstractClass__AbstractPropertiesAssignment_3"
    // InternalLMJAQ.g:2017:1: rule__AbstractClass__AbstractPropertiesAssignment_3 : ( ruleAbstractProperty ) ;
    public final void rule__AbstractClass__AbstractPropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2021:1: ( ( ruleAbstractProperty ) )
            // InternalLMJAQ.g:2022:2: ( ruleAbstractProperty )
            {
            // InternalLMJAQ.g:2022:2: ( ruleAbstractProperty )
            // InternalLMJAQ.g:2023:3: ruleAbstractProperty
            {
             before(grammarAccess.getAbstractClassAccess().getAbstractPropertiesAbstractPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractProperty();

            state._fsp--;

             after(grammarAccess.getAbstractClassAccess().getAbstractPropertiesAbstractPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClass__AbstractPropertiesAssignment_3"


    // $ANTLR start "rule__AbstractClassType__TypeAssignment"
    // InternalLMJAQ.g:2032:1: rule__AbstractClassType__TypeAssignment : ( ( rule__AbstractClassType__TypeAlternatives_0 ) ) ;
    public final void rule__AbstractClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2036:1: ( ( ( rule__AbstractClassType__TypeAlternatives_0 ) ) )
            // InternalLMJAQ.g:2037:2: ( ( rule__AbstractClassType__TypeAlternatives_0 ) )
            {
            // InternalLMJAQ.g:2037:2: ( ( rule__AbstractClassType__TypeAlternatives_0 ) )
            // InternalLMJAQ.g:2038:3: ( rule__AbstractClassType__TypeAlternatives_0 )
            {
             before(grammarAccess.getAbstractClassTypeAccess().getTypeAlternatives_0()); 
            // InternalLMJAQ.g:2039:3: ( rule__AbstractClassType__TypeAlternatives_0 )
            // InternalLMJAQ.g:2039:4: rule__AbstractClassType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractClassType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractClassTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractClassType__TypeAssignment"


    // $ANTLR start "rule__AbstractProperty__FormatAssignment_0"
    // InternalLMJAQ.g:2047:1: rule__AbstractProperty__FormatAssignment_0 : ( ( rule__AbstractProperty__FormatAlternatives_0_0 ) ) ;
    public final void rule__AbstractProperty__FormatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2051:1: ( ( ( rule__AbstractProperty__FormatAlternatives_0_0 ) ) )
            // InternalLMJAQ.g:2052:2: ( ( rule__AbstractProperty__FormatAlternatives_0_0 ) )
            {
            // InternalLMJAQ.g:2052:2: ( ( rule__AbstractProperty__FormatAlternatives_0_0 ) )
            // InternalLMJAQ.g:2053:3: ( rule__AbstractProperty__FormatAlternatives_0_0 )
            {
             before(grammarAccess.getAbstractPropertyAccess().getFormatAlternatives_0_0()); 
            // InternalLMJAQ.g:2054:3: ( rule__AbstractProperty__FormatAlternatives_0_0 )
            // InternalLMJAQ.g:2054:4: rule__AbstractProperty__FormatAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractProperty__FormatAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPropertyAccess().getFormatAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__FormatAssignment_0"


    // $ANTLR start "rule__AbstractProperty__ValuesAssignment_2"
    // InternalLMJAQ.g:2062:1: rule__AbstractProperty__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__AbstractProperty__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2066:1: ( ( ruleValue ) )
            // InternalLMJAQ.g:2067:2: ( ruleValue )
            {
            // InternalLMJAQ.g:2067:2: ( ruleValue )
            // InternalLMJAQ.g:2068:3: ruleValue
            {
             before(grammarAccess.getAbstractPropertyAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAbstractPropertyAccess().getValuesValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractProperty__ValuesAssignment_2"


    // $ANTLR start "rule__ClassReference__TypeAssignment"
    // InternalLMJAQ.g:2077:1: rule__ClassReference__TypeAssignment : ( ruleAbstractClassType ) ;
    public final void rule__ClassReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2081:1: ( ( ruleAbstractClassType ) )
            // InternalLMJAQ.g:2082:2: ( ruleAbstractClassType )
            {
            // InternalLMJAQ.g:2082:2: ( ruleAbstractClassType )
            // InternalLMJAQ.g:2083:3: ruleAbstractClassType
            {
             before(grammarAccess.getClassReferenceAccess().getTypeAbstractClassTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractClassType();

            state._fsp--;

             after(grammarAccess.getClassReferenceAccess().getTypeAbstractClassTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassReference__TypeAssignment"


    // $ANTLR start "rule__Property__PropertyTypeAssignment"
    // InternalLMJAQ.g:2092:1: rule__Property__PropertyTypeAssignment : ( ( rule__Property__PropertyTypeAlternatives_0 ) ) ;
    public final void rule__Property__PropertyTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLMJAQ.g:2096:1: ( ( ( rule__Property__PropertyTypeAlternatives_0 ) ) )
            // InternalLMJAQ.g:2097:2: ( ( rule__Property__PropertyTypeAlternatives_0 ) )
            {
            // InternalLMJAQ.g:2097:2: ( ( rule__Property__PropertyTypeAlternatives_0 ) )
            // InternalLMJAQ.g:2098:3: ( rule__Property__PropertyTypeAlternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyTypeAlternatives_0()); 
            // InternalLMJAQ.g:2099:3: ( rule__Property__PropertyTypeAlternatives_0 )
            // InternalLMJAQ.g:2099:4: rule__Property__PropertyTypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__PropertyTypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertyTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertyTypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00244643E8C00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x013FFFFFFFC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x003FFFFFFFC00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007FF0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007FF2L});

}