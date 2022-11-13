package org.xtext.lmjaq.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lmjaq.services.LMJAQGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLMJAQParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EVENT_CODE", "RULE_UNITYINTDECIMAL", "RULE_INTEGER", "RULE_PATH", "RULE_UI_TYPE", "RULE_SIMPLE_EVENT_TYPE", "RULE_EFEITO_ACTION", "RULE_TEXT_CONTENT", "RULE_FALSE", "RULE_TRUE", "RULE_STRING", "RULE_SLASH", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'{'", "'}'", "'Tela'", "'Objeto'", "':'", "'Ativo'", "'IU'", "'Posicao'", "'EventoComplexo'", "'EventoSimples'", "'AoClicar'", "'Comportamento'", "'Imagem'", "'Animacao'", "'Texto'", "'Conteudo'", "'Tamanho'", "'TamanhoDaFonte'", "'Caminho'", "'ConfigGeral'", "'ComprimentoDaTela'", "'AlturaDaTela'", "'Questao'", "'Alternativa'", "'Enunciado'", "'Resposta'", "'FormatoQuiz'", "'Estado'", "'EstadoFinal'", "'EstadoInicial'", "'ProximoEstados'", "'Item'", "'Efeito'", "'EstadosAfetados'"
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

        public InternalLMJAQParser(TokenStream input, LMJAQGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LMJAQGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLMJAQ.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLMJAQ.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalLMJAQ.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLMJAQ.g:71:1: ruleModel returns [EObject current=null] : ( (lv_abstractElments_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_abstractElments_0_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:77:2: ( ( (lv_abstractElments_0_0= ruleAbstractElement ) )* )
            // InternalLMJAQ.g:78:2: ( (lv_abstractElments_0_0= ruleAbstractElement ) )*
            {
            // InternalLMJAQ.g:78:2: ( (lv_abstractElments_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||(LA1_0>=26 && LA1_0<=27)||LA1_0==32||(LA1_0>=34 && LA1_0<=38)||LA1_0==43||(LA1_0>=46 && LA1_0<=47)||LA1_0==51||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLMJAQ.g:79:3: (lv_abstractElments_0_0= ruleAbstractElement )
            	    {
            	    // InternalLMJAQ.g:79:3: (lv_abstractElments_0_0= ruleAbstractElement )
            	    // InternalLMJAQ.g:80:4: lv_abstractElments_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAbstractElmentsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_abstractElments_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"abstractElments",
            	    					lv_abstractElments_0_0,
            	    					"org.xtext.lmjaq.LMJAQ.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalLMJAQ.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalLMJAQ.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalLMJAQ.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalLMJAQ.g:107:1: ruleAbstractElement returns [EObject current=null] : ( ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:113:2: ( ( ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) ) ) )
            // InternalLMJAQ.g:114:2: ( ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) ) )
            {
            // InternalLMJAQ.g:114:2: ( ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) ) )
            // InternalLMJAQ.g:115:3: ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) )
            {
            // InternalLMJAQ.g:115:3: ( (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass ) )
            // InternalLMJAQ.g:116:4: (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass )
            {
            // InternalLMJAQ.g:116:4: (lv_elementType_0_1= rulePackageDeclaration | lv_elementType_0_2= ruleAbstractClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=26 && LA2_0<=27)||LA2_0==32||(LA2_0>=34 && LA2_0<=38)||LA2_0==43||(LA2_0>=46 && LA2_0<=47)||LA2_0==51||LA2_0==55) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLMJAQ.g:117:5: lv_elementType_0_1= rulePackageDeclaration
                    {

                    					newCompositeNode(grammarAccess.getAbstractElementAccess().getElementTypePackageDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elementType_0_1=rulePackageDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    					}
                    					set(
                    						current,
                    						"elementType",
                    						lv_elementType_0_1,
                    						"org.xtext.lmjaq.LMJAQ.PackageDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:133:5: lv_elementType_0_2= ruleAbstractClass
                    {

                    					newCompositeNode(grammarAccess.getAbstractElementAccess().getElementTypeAbstractClassParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elementType_0_2=ruleAbstractClass();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    					}
                    					set(
                    						current,
                    						"elementType",
                    						lv_elementType_0_2,
                    						"org.xtext.lmjaq.LMJAQ.AbstractClass");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalLMJAQ.g:154:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalLMJAQ.g:154:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalLMJAQ.g:155:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalLMJAQ.g:161:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:167:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalLMJAQ.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalLMJAQ.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalLMJAQ.g:169:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalLMJAQ.g:173:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLMJAQ.g:174:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLMJAQ.g:174:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLMJAQ.g:175:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lmjaq.LMJAQ.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLMJAQ.g:196:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLMJAQ.g:196:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLMJAQ.g:197:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLMJAQ.g:203:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:209:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLMJAQ.g:210:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLMJAQ.g:210:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLMJAQ.g:211:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLMJAQ.g:218:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLMJAQ.g:219:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAbstractClass"
    // InternalLMJAQ.g:236:1: entryRuleAbstractClass returns [EObject current=null] : iv_ruleAbstractClass= ruleAbstractClass EOF ;
    public final EObject entryRuleAbstractClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClass = null;


        try {
            // InternalLMJAQ.g:236:54: (iv_ruleAbstractClass= ruleAbstractClass EOF )
            // InternalLMJAQ.g:237:2: iv_ruleAbstractClass= ruleAbstractClass EOF
            {
             newCompositeNode(grammarAccess.getAbstractClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractClass=ruleAbstractClass();

            state._fsp--;

             current =iv_ruleAbstractClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractClass"


    // $ANTLR start "ruleAbstractClass"
    // InternalLMJAQ.g:243:1: ruleAbstractClass returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractClassType ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) ) otherlv_2= '{' ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleAbstractClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_abstractProperties_3_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:249:2: ( ( ( (lv_type_0_0= ruleAbstractClassType ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) ) otherlv_2= '{' ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )* otherlv_4= '}' ) )
            // InternalLMJAQ.g:250:2: ( ( (lv_type_0_0= ruleAbstractClassType ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) ) otherlv_2= '{' ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )* otherlv_4= '}' )
            {
            // InternalLMJAQ.g:250:2: ( ( (lv_type_0_0= ruleAbstractClassType ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) ) otherlv_2= '{' ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )* otherlv_4= '}' )
            // InternalLMJAQ.g:251:3: ( (lv_type_0_0= ruleAbstractClassType ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) ) otherlv_2= '{' ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )* otherlv_4= '}'
            {
            // InternalLMJAQ.g:251:3: ( (lv_type_0_0= ruleAbstractClassType ) )
            // InternalLMJAQ.g:252:4: (lv_type_0_0= ruleAbstractClassType )
            {
            // InternalLMJAQ.g:252:4: (lv_type_0_0= ruleAbstractClassType )
            // InternalLMJAQ.g:253:5: lv_type_0_0= ruleAbstractClassType
            {

            					newCompositeNode(grammarAccess.getAbstractClassAccess().getTypeAbstractClassTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleAbstractClassType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractClassRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.lmjaq.LMJAQ.AbstractClassType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLMJAQ.g:270:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) ) )
            // InternalLMJAQ.g:271:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) )
            {
            // InternalLMJAQ.g:271:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE ) )
            // InternalLMJAQ.g:272:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE )
            {
            // InternalLMJAQ.g:272:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_EVENT_CODE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_EVENT_CODE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLMJAQ.g:273:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getAbstractClassAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:288:6: lv_name_1_2= RULE_EVENT_CODE
                    {
                    lv_name_1_2=(Token)match(input,RULE_EVENT_CODE,FOLLOW_7); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getAbstractClassAccess().getNameEVENT_CODETerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.xtext.lmjaq.LMJAQ.EVENT_CODE");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLMJAQ.g:309:3: ( (lv_abstractProperties_3_0= ruleAbstractProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=26 && LA5_0<=27)||(LA5_0>=29 && LA5_0<=57)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLMJAQ.g:310:4: (lv_abstractProperties_3_0= ruleAbstractProperty )
            	    {
            	    // InternalLMJAQ.g:310:4: (lv_abstractProperties_3_0= ruleAbstractProperty )
            	    // InternalLMJAQ.g:311:5: lv_abstractProperties_3_0= ruleAbstractProperty
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractClassAccess().getAbstractPropertiesAbstractPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_abstractProperties_3_0=ruleAbstractProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractProperties",
            	    						lv_abstractProperties_3_0,
            	    						"org.xtext.lmjaq.LMJAQ.AbstractProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAbstractClassAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractClass"


    // $ANTLR start "entryRuleAbstractClassType"
    // InternalLMJAQ.g:336:1: entryRuleAbstractClassType returns [EObject current=null] : iv_ruleAbstractClassType= ruleAbstractClassType EOF ;
    public final EObject entryRuleAbstractClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClassType = null;


        try {
            // InternalLMJAQ.g:336:58: (iv_ruleAbstractClassType= ruleAbstractClassType EOF )
            // InternalLMJAQ.g:337:2: iv_ruleAbstractClassType= ruleAbstractClassType EOF
            {
             newCompositeNode(grammarAccess.getAbstractClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractClassType=ruleAbstractClassType();

            state._fsp--;

             current =iv_ruleAbstractClassType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractClassType"


    // $ANTLR start "ruleAbstractClassType"
    // InternalLMJAQ.g:343:1: ruleAbstractClassType returns [EObject current=null] : ( ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) ) ) ;
    public final EObject ruleAbstractClassType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_1 = null;

        AntlrDatatypeRuleToken lv_type_0_2 = null;

        AntlrDatatypeRuleToken lv_type_0_3 = null;

        AntlrDatatypeRuleToken lv_type_0_4 = null;

        AntlrDatatypeRuleToken lv_type_0_5 = null;

        AntlrDatatypeRuleToken lv_type_0_6 = null;

        AntlrDatatypeRuleToken lv_type_0_7 = null;

        AntlrDatatypeRuleToken lv_type_0_8 = null;

        AntlrDatatypeRuleToken lv_type_0_9 = null;

        AntlrDatatypeRuleToken lv_type_0_10 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:349:2: ( ( ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) ) ) )
            // InternalLMJAQ.g:350:2: ( ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) ) )
            {
            // InternalLMJAQ.g:350:2: ( ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) ) )
            // InternalLMJAQ.g:351:3: ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) )
            {
            // InternalLMJAQ.g:351:3: ( (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao ) )
            // InternalLMJAQ.g:352:4: (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao )
            {
            // InternalLMJAQ.g:352:4: (lv_type_0_1= ruleTela | lv_type_0_2= ruleObjeto | lv_type_0_3= ruleRecurso | lv_type_0_4= ruleComponente | lv_type_0_5= ruleEventoComplexo | lv_type_0_6= ruleConfigGeral | lv_type_0_7= ruleEstado | lv_type_0_8= ruleItem | lv_type_0_9= ruleAlternativa | lv_type_0_10= ruleQuestao )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 36:
            case 37:
            case 38:
                {
                alt6=3;
                }
                break;
            case 34:
            case 35:
                {
                alt6=4;
                }
                break;
            case 32:
                {
                alt6=5;
                }
                break;
            case 43:
                {
                alt6=6;
                }
                break;
            case 51:
                {
                alt6=7;
                }
                break;
            case 55:
                {
                alt6=8;
                }
                break;
            case 47:
                {
                alt6=9;
                }
                break;
            case 46:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLMJAQ.g:353:5: lv_type_0_1= ruleTela
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeTelaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleTela();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"org.xtext.lmjaq.LMJAQ.Tela");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:369:5: lv_type_0_2= ruleObjeto
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeObjetoParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleObjeto();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"org.xtext.lmjaq.LMJAQ.Objeto");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:385:5: lv_type_0_3= ruleRecurso
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeRecursoParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleRecurso();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"org.xtext.lmjaq.LMJAQ.Recurso");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:401:5: lv_type_0_4= ruleComponente
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeComponenteParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_4=ruleComponente();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_4,
                    						"org.xtext.lmjaq.LMJAQ.Componente");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:417:5: lv_type_0_5= ruleEventoComplexo
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeEventoComplexoParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_5=ruleEventoComplexo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_5,
                    						"org.xtext.lmjaq.LMJAQ.EventoComplexo");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:433:5: lv_type_0_6= ruleConfigGeral
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeConfigGeralParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_6=ruleConfigGeral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_6,
                    						"org.xtext.lmjaq.LMJAQ.ConfigGeral");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:449:5: lv_type_0_7= ruleEstado
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeEstadoParserRuleCall_0_6());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_7=ruleEstado();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_7,
                    						"org.xtext.lmjaq.LMJAQ.Estado");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:465:5: lv_type_0_8= ruleItem
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeItemParserRuleCall_0_7());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_8=ruleItem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_8,
                    						"org.xtext.lmjaq.LMJAQ.Item");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:481:5: lv_type_0_9= ruleAlternativa
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeAlternativaParserRuleCall_0_8());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_9=ruleAlternativa();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_9,
                    						"org.xtext.lmjaq.LMJAQ.Alternativa");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:497:5: lv_type_0_10= ruleQuestao
                    {

                    					newCompositeNode(grammarAccess.getAbstractClassTypeAccess().getTypeQuestaoParserRuleCall_0_9());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_10=ruleQuestao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractClassTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_10,
                    						"org.xtext.lmjaq.LMJAQ.Questao");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractClassType"


    // $ANTLR start "entryRuleTela"
    // InternalLMJAQ.g:518:1: entryRuleTela returns [String current=null] : iv_ruleTela= ruleTela EOF ;
    public final String entryRuleTela() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTela = null;


        try {
            // InternalLMJAQ.g:518:44: (iv_ruleTela= ruleTela EOF )
            // InternalLMJAQ.g:519:2: iv_ruleTela= ruleTela EOF
            {
             newCompositeNode(grammarAccess.getTelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTela=ruleTela();

            state._fsp--;

             current =iv_ruleTela.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTela"


    // $ANTLR start "ruleTela"
    // InternalLMJAQ.g:525:1: ruleTela returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Tela' ;
    public final AntlrDatatypeRuleToken ruleTela() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:531:2: (kw= 'Tela' )
            // InternalLMJAQ.g:532:2: kw= 'Tela'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTelaAccess().getTelaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTela"


    // $ANTLR start "entryRuleObjeto"
    // InternalLMJAQ.g:540:1: entryRuleObjeto returns [String current=null] : iv_ruleObjeto= ruleObjeto EOF ;
    public final String entryRuleObjeto() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjeto = null;


        try {
            // InternalLMJAQ.g:540:46: (iv_ruleObjeto= ruleObjeto EOF )
            // InternalLMJAQ.g:541:2: iv_ruleObjeto= ruleObjeto EOF
            {
             newCompositeNode(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjeto=ruleObjeto();

            state._fsp--;

             current =iv_ruleObjeto.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // InternalLMJAQ.g:547:1: ruleObjeto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Objeto' ;
    public final AntlrDatatypeRuleToken ruleObjeto() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:553:2: (kw= 'Objeto' )
            // InternalLMJAQ.g:554:2: kw= 'Objeto'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getObjetoAccess().getObjetoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalLMJAQ.g:562:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalLMJAQ.g:562:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalLMJAQ.g:563:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractProperty=ruleAbstractProperty();

            state._fsp--;

             current =iv_ruleAbstractProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractProperty"


    // $ANTLR start "ruleAbstractProperty"
    // InternalLMJAQ.g:569:1: ruleAbstractProperty returns [EObject current=null] : ( ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) ) otherlv_1= ':' ( (lv_values_2_0= ruleValue ) )* ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_format_0_1 = null;

        EObject lv_format_0_2 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:575:2: ( ( ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) ) otherlv_1= ':' ( (lv_values_2_0= ruleValue ) )* ) )
            // InternalLMJAQ.g:576:2: ( ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) ) otherlv_1= ':' ( (lv_values_2_0= ruleValue ) )* )
            {
            // InternalLMJAQ.g:576:2: ( ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) ) otherlv_1= ':' ( (lv_values_2_0= ruleValue ) )* )
            // InternalLMJAQ.g:577:3: ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) ) otherlv_1= ':' ( (lv_values_2_0= ruleValue ) )*
            {
            // InternalLMJAQ.g:577:3: ( ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) ) )
            // InternalLMJAQ.g:578:4: ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) )
            {
            // InternalLMJAQ.g:578:4: ( (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty ) )
            // InternalLMJAQ.g:579:5: (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty )
            {
            // InternalLMJAQ.g:579:5: (lv_format_0_1= ruleClassReference | lv_format_0_2= ruleProperty )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=26 && LA7_0<=27)||LA7_0==32||(LA7_0>=34 && LA7_0<=38)||LA7_0==43||(LA7_0>=46 && LA7_0<=47)||LA7_0==51||LA7_0==55) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=29 && LA7_0<=31)||LA7_0==33||(LA7_0>=39 && LA7_0<=42)||(LA7_0>=44 && LA7_0<=45)||(LA7_0>=48 && LA7_0<=50)||(LA7_0>=52 && LA7_0<=54)||(LA7_0>=56 && LA7_0<=57)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLMJAQ.g:580:6: lv_format_0_1= ruleClassReference
                    {

                    						newCompositeNode(grammarAccess.getAbstractPropertyAccess().getFormatClassReferenceParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_format_0_1=ruleClassReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractPropertyRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_0_1,
                    							"org.xtext.lmjaq.LMJAQ.ClassReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:596:6: lv_format_0_2= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getAbstractPropertyAccess().getFormatPropertyParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_format_0_2=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractPropertyRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_0_2,
                    							"org.xtext.lmjaq.LMJAQ.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractPropertyAccess().getColonKeyword_1());
            		
            // InternalLMJAQ.g:618:3: ( (lv_values_2_0= ruleValue ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_TRUE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLMJAQ.g:619:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalLMJAQ.g:619:4: (lv_values_2_0= ruleValue )
            	    // InternalLMJAQ.g:620:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractPropertyAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"org.xtext.lmjaq.LMJAQ.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractProperty"


    // $ANTLR start "entryRuleClassReference"
    // InternalLMJAQ.g:641:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalLMJAQ.g:641:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalLMJAQ.g:642:2: iv_ruleClassReference= ruleClassReference EOF
            {
             newCompositeNode(grammarAccess.getClassReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassReference=ruleClassReference();

            state._fsp--;

             current =iv_ruleClassReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassReference"


    // $ANTLR start "ruleClassReference"
    // InternalLMJAQ.g:648:1: ruleClassReference returns [EObject current=null] : ( (lv_type_0_0= ruleAbstractClassType ) ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:654:2: ( ( (lv_type_0_0= ruleAbstractClassType ) ) )
            // InternalLMJAQ.g:655:2: ( (lv_type_0_0= ruleAbstractClassType ) )
            {
            // InternalLMJAQ.g:655:2: ( (lv_type_0_0= ruleAbstractClassType ) )
            // InternalLMJAQ.g:656:3: (lv_type_0_0= ruleAbstractClassType )
            {
            // InternalLMJAQ.g:656:3: (lv_type_0_0= ruleAbstractClassType )
            // InternalLMJAQ.g:657:4: lv_type_0_0= ruleAbstractClassType
            {

            				newCompositeNode(grammarAccess.getClassReferenceAccess().getTypeAbstractClassTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleAbstractClassType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getClassReferenceRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.lmjaq.LMJAQ.AbstractClassType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassReference"


    // $ANTLR start "entryRuleProperty"
    // InternalLMJAQ.g:677:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalLMJAQ.g:677:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalLMJAQ.g:678:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalLMJAQ.g:684:1: ruleProperty returns [EObject current=null] : ( ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_propertyType_0_1 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_2 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_3 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_4 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_5 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_6 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_7 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_8 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_9 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_10 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_11 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_12 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_13 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_14 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_15 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_16 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_17 = null;

        AntlrDatatypeRuleToken lv_propertyType_0_18 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:690:2: ( ( ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) ) ) )
            // InternalLMJAQ.g:691:2: ( ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) ) )
            {
            // InternalLMJAQ.g:691:2: ( ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) ) )
            // InternalLMJAQ.g:692:3: ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) )
            {
            // InternalLMJAQ.g:692:3: ( (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta ) )
            // InternalLMJAQ.g:693:4: (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta )
            {
            // InternalLMJAQ.g:693:4: (lv_propertyType_0_1= rulePosicao | lv_propertyType_0_2= ruleestaAtivo | lv_propertyType_0_3= ruleCaminho | lv_propertyType_0_4= ruleTamanhoDaFonte | lv_propertyType_0_5= ruleConteudo | lv_propertyType_0_6= ruleTamanho | lv_propertyType_0_7= ruleIU | lv_propertyType_0_8= ruleEventoSimples | lv_propertyType_0_9= ruleComprimentoDaTela | lv_propertyType_0_10= ruleAlturaDaTela | lv_propertyType_0_11= ruleEfeito | lv_propertyType_0_12= ruleEstadosAfetados | lv_propertyType_0_13= ruleEstadoInicial | lv_propertyType_0_14= ruleEstadoFinal | lv_propertyType_0_15= ruleProximoEstados | lv_propertyType_0_16= ruleFormatoQuiz | lv_propertyType_0_17= ruleEnunciado | lv_propertyType_0_18= ruleResposta )
            int alt9=18;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 41:
                {
                alt9=4;
                }
                break;
            case 39:
                {
                alt9=5;
                }
                break;
            case 40:
                {
                alt9=6;
                }
                break;
            case 30:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 44:
                {
                alt9=9;
                }
                break;
            case 45:
                {
                alt9=10;
                }
                break;
            case 56:
                {
                alt9=11;
                }
                break;
            case 57:
                {
                alt9=12;
                }
                break;
            case 53:
                {
                alt9=13;
                }
                break;
            case 52:
                {
                alt9=14;
                }
                break;
            case 54:
                {
                alt9=15;
                }
                break;
            case 50:
                {
                alt9=16;
                }
                break;
            case 48:
                {
                alt9=17;
                }
                break;
            case 49:
                {
                alt9=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLMJAQ.g:694:5: lv_propertyType_0_1= rulePosicao
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypePosicaoParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_1=rulePosicao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_1,
                    						"org.xtext.lmjaq.LMJAQ.Posicao");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:710:5: lv_propertyType_0_2= ruleestaAtivo
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEstaAtivoParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_2=ruleestaAtivo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_2,
                    						"org.xtext.lmjaq.LMJAQ.estaAtivo");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:726:5: lv_propertyType_0_3= ruleCaminho
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeCaminhoParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_3=ruleCaminho();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_3,
                    						"org.xtext.lmjaq.LMJAQ.Caminho");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:742:5: lv_propertyType_0_4= ruleTamanhoDaFonte
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoDaFonteParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_4=ruleTamanhoDaFonte();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_4,
                    						"org.xtext.lmjaq.LMJAQ.TamanhoDaFonte");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:758:5: lv_propertyType_0_5= ruleConteudo
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeConteudoParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_5=ruleConteudo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_5,
                    						"org.xtext.lmjaq.LMJAQ.Conteudo");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:774:5: lv_propertyType_0_6= ruleTamanho
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeTamanhoParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_6=ruleTamanho();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_6,
                    						"org.xtext.lmjaq.LMJAQ.Tamanho");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:790:5: lv_propertyType_0_7= ruleIU
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeIUParserRuleCall_0_6());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_7=ruleIU();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_7,
                    						"org.xtext.lmjaq.LMJAQ.IU");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:806:5: lv_propertyType_0_8= ruleEventoSimples
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEventoSimplesParserRuleCall_0_7());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_8=ruleEventoSimples();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_8,
                    						"org.xtext.lmjaq.LMJAQ.EventoSimples");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:822:5: lv_propertyType_0_9= ruleComprimentoDaTela
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeComprimentoDaTelaParserRuleCall_0_8());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_9=ruleComprimentoDaTela();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_9,
                    						"org.xtext.lmjaq.LMJAQ.ComprimentoDaTela");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:838:5: lv_propertyType_0_10= ruleAlturaDaTela
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeAlturaDaTelaParserRuleCall_0_9());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_10=ruleAlturaDaTela();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_10,
                    						"org.xtext.lmjaq.LMJAQ.AlturaDaTela");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 11 :
                    // InternalLMJAQ.g:854:5: lv_propertyType_0_11= ruleEfeito
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEfeitoParserRuleCall_0_10());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_11=ruleEfeito();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_11,
                    						"org.xtext.lmjaq.LMJAQ.Efeito");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 12 :
                    // InternalLMJAQ.g:870:5: lv_propertyType_0_12= ruleEstadosAfetados
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEstadosAfetadosParserRuleCall_0_11());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_12=ruleEstadosAfetados();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_12,
                    						"org.xtext.lmjaq.LMJAQ.EstadosAfetados");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 13 :
                    // InternalLMJAQ.g:886:5: lv_propertyType_0_13= ruleEstadoInicial
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEstadoInicialParserRuleCall_0_12());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_13=ruleEstadoInicial();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_13,
                    						"org.xtext.lmjaq.LMJAQ.EstadoInicial");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 14 :
                    // InternalLMJAQ.g:902:5: lv_propertyType_0_14= ruleEstadoFinal
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEstadoFinalParserRuleCall_0_13());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_14=ruleEstadoFinal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_14,
                    						"org.xtext.lmjaq.LMJAQ.EstadoFinal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 15 :
                    // InternalLMJAQ.g:918:5: lv_propertyType_0_15= ruleProximoEstados
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeProximoEstadosParserRuleCall_0_14());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_15=ruleProximoEstados();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_15,
                    						"org.xtext.lmjaq.LMJAQ.ProximoEstados");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 16 :
                    // InternalLMJAQ.g:934:5: lv_propertyType_0_16= ruleFormatoQuiz
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeFormatoQuizParserRuleCall_0_15());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_16=ruleFormatoQuiz();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_16,
                    						"org.xtext.lmjaq.LMJAQ.FormatoQuiz");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 17 :
                    // InternalLMJAQ.g:950:5: lv_propertyType_0_17= ruleEnunciado
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeEnunciadoParserRuleCall_0_16());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_17=ruleEnunciado();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_17,
                    						"org.xtext.lmjaq.LMJAQ.Enunciado");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 18 :
                    // InternalLMJAQ.g:966:5: lv_propertyType_0_18= ruleResposta
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropertyTypeRespostaParserRuleCall_0_17());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyType_0_18=ruleResposta();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propertyType",
                    						lv_propertyType_0_18,
                    						"org.xtext.lmjaq.LMJAQ.Resposta");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleestaAtivo"
    // InternalLMJAQ.g:987:1: entryRuleestaAtivo returns [String current=null] : iv_ruleestaAtivo= ruleestaAtivo EOF ;
    public final String entryRuleestaAtivo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleestaAtivo = null;


        try {
            // InternalLMJAQ.g:987:49: (iv_ruleestaAtivo= ruleestaAtivo EOF )
            // InternalLMJAQ.g:988:2: iv_ruleestaAtivo= ruleestaAtivo EOF
            {
             newCompositeNode(grammarAccess.getEstaAtivoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleestaAtivo=ruleestaAtivo();

            state._fsp--;

             current =iv_ruleestaAtivo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleestaAtivo"


    // $ANTLR start "ruleestaAtivo"
    // InternalLMJAQ.g:994:1: ruleestaAtivo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Ativo' ;
    public final AntlrDatatypeRuleToken ruleestaAtivo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1000:2: (kw= 'Ativo' )
            // InternalLMJAQ.g:1001:2: kw= 'Ativo'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEstaAtivoAccess().getAtivoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleestaAtivo"


    // $ANTLR start "entryRuleIU"
    // InternalLMJAQ.g:1009:1: entryRuleIU returns [String current=null] : iv_ruleIU= ruleIU EOF ;
    public final String entryRuleIU() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIU = null;


        try {
            // InternalLMJAQ.g:1009:42: (iv_ruleIU= ruleIU EOF )
            // InternalLMJAQ.g:1010:2: iv_ruleIU= ruleIU EOF
            {
             newCompositeNode(grammarAccess.getIURule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIU=ruleIU();

            state._fsp--;

             current =iv_ruleIU.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIU"


    // $ANTLR start "ruleIU"
    // InternalLMJAQ.g:1016:1: ruleIU returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IU' ;
    public final AntlrDatatypeRuleToken ruleIU() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1022:2: (kw= 'IU' )
            // InternalLMJAQ.g:1023:2: kw= 'IU'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getIUAccess().getIUKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIU"


    // $ANTLR start "entryRulePosicao"
    // InternalLMJAQ.g:1031:1: entryRulePosicao returns [String current=null] : iv_rulePosicao= rulePosicao EOF ;
    public final String entryRulePosicao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosicao = null;


        try {
            // InternalLMJAQ.g:1031:47: (iv_rulePosicao= rulePosicao EOF )
            // InternalLMJAQ.g:1032:2: iv_rulePosicao= rulePosicao EOF
            {
             newCompositeNode(grammarAccess.getPosicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosicao=rulePosicao();

            state._fsp--;

             current =iv_rulePosicao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosicao"


    // $ANTLR start "rulePosicao"
    // InternalLMJAQ.g:1038:1: rulePosicao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Posicao' ;
    public final AntlrDatatypeRuleToken rulePosicao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1044:2: (kw= 'Posicao' )
            // InternalLMJAQ.g:1045:2: kw= 'Posicao'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPosicaoAccess().getPosicaoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosicao"


    // $ANTLR start "entryRuleValue"
    // InternalLMJAQ.g:1053:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalLMJAQ.g:1053:45: (iv_ruleValue= ruleValue EOF )
            // InternalLMJAQ.g:1054:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalLMJAQ.g:1060:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Boolean_1= ruleBoolean | this_UNITYINTDECIMAL_2= RULE_UNITYINTDECIMAL | this_INTEGER_3= RULE_INTEGER | this_PATH_4= RULE_PATH | this_UI_TYPE_5= RULE_UI_TYPE | this_SIMPLE_EVENT_TYPE_6= RULE_SIMPLE_EVENT_TYPE | this_EVENT_CODE_7= RULE_EVENT_CODE | this_EFEITO_ACTION_8= RULE_EFEITO_ACTION | this_TEXT_CONTENT_9= RULE_TEXT_CONTENT ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNITYINTDECIMAL_2=null;
        Token this_INTEGER_3=null;
        Token this_PATH_4=null;
        Token this_UI_TYPE_5=null;
        Token this_SIMPLE_EVENT_TYPE_6=null;
        Token this_EVENT_CODE_7=null;
        Token this_EFEITO_ACTION_8=null;
        Token this_TEXT_CONTENT_9=null;
        AntlrDatatypeRuleToken this_Boolean_1 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:1066:2: ( (this_ID_0= RULE_ID | this_Boolean_1= ruleBoolean | this_UNITYINTDECIMAL_2= RULE_UNITYINTDECIMAL | this_INTEGER_3= RULE_INTEGER | this_PATH_4= RULE_PATH | this_UI_TYPE_5= RULE_UI_TYPE | this_SIMPLE_EVENT_TYPE_6= RULE_SIMPLE_EVENT_TYPE | this_EVENT_CODE_7= RULE_EVENT_CODE | this_EFEITO_ACTION_8= RULE_EFEITO_ACTION | this_TEXT_CONTENT_9= RULE_TEXT_CONTENT ) )
            // InternalLMJAQ.g:1067:2: (this_ID_0= RULE_ID | this_Boolean_1= ruleBoolean | this_UNITYINTDECIMAL_2= RULE_UNITYINTDECIMAL | this_INTEGER_3= RULE_INTEGER | this_PATH_4= RULE_PATH | this_UI_TYPE_5= RULE_UI_TYPE | this_SIMPLE_EVENT_TYPE_6= RULE_SIMPLE_EVENT_TYPE | this_EVENT_CODE_7= RULE_EVENT_CODE | this_EFEITO_ACTION_8= RULE_EFEITO_ACTION | this_TEXT_CONTENT_9= RULE_TEXT_CONTENT )
            {
            // InternalLMJAQ.g:1067:2: (this_ID_0= RULE_ID | this_Boolean_1= ruleBoolean | this_UNITYINTDECIMAL_2= RULE_UNITYINTDECIMAL | this_INTEGER_3= RULE_INTEGER | this_PATH_4= RULE_PATH | this_UI_TYPE_5= RULE_UI_TYPE | this_SIMPLE_EVENT_TYPE_6= RULE_SIMPLE_EVENT_TYPE | this_EVENT_CODE_7= RULE_EVENT_CODE | this_EFEITO_ACTION_8= RULE_EFEITO_ACTION | this_TEXT_CONTENT_9= RULE_TEXT_CONTENT )
            int alt10=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_FALSE:
            case RULE_TRUE:
                {
                alt10=2;
                }
                break;
            case RULE_UNITYINTDECIMAL:
                {
                alt10=3;
                }
                break;
            case RULE_INTEGER:
                {
                alt10=4;
                }
                break;
            case RULE_PATH:
                {
                alt10=5;
                }
                break;
            case RULE_UI_TYPE:
                {
                alt10=6;
                }
                break;
            case RULE_SIMPLE_EVENT_TYPE:
                {
                alt10=7;
                }
                break;
            case RULE_EVENT_CODE:
                {
                alt10=8;
                }
                break;
            case RULE_EFEITO_ACTION:
                {
                alt10=9;
                }
                break;
            case RULE_TEXT_CONTENT:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLMJAQ.g:1068:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1076:3: this_Boolean_1= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_1=ruleBoolean();

                    state._fsp--;


                    			current.merge(this_Boolean_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1087:3: this_UNITYINTDECIMAL_2= RULE_UNITYINTDECIMAL
                    {
                    this_UNITYINTDECIMAL_2=(Token)match(input,RULE_UNITYINTDECIMAL,FOLLOW_2); 

                    			current.merge(this_UNITYINTDECIMAL_2);
                    		

                    			newLeafNode(this_UNITYINTDECIMAL_2, grammarAccess.getValueAccess().getUNITYINTDECIMALTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:1095:3: this_INTEGER_3= RULE_INTEGER
                    {
                    this_INTEGER_3=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_3);
                    		

                    			newLeafNode(this_INTEGER_3, grammarAccess.getValueAccess().getINTEGERTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLMJAQ.g:1103:3: this_PATH_4= RULE_PATH
                    {
                    this_PATH_4=(Token)match(input,RULE_PATH,FOLLOW_2); 

                    			current.merge(this_PATH_4);
                    		

                    			newLeafNode(this_PATH_4, grammarAccess.getValueAccess().getPATHTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLMJAQ.g:1111:3: this_UI_TYPE_5= RULE_UI_TYPE
                    {
                    this_UI_TYPE_5=(Token)match(input,RULE_UI_TYPE,FOLLOW_2); 

                    			current.merge(this_UI_TYPE_5);
                    		

                    			newLeafNode(this_UI_TYPE_5, grammarAccess.getValueAccess().getUI_TYPETerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalLMJAQ.g:1119:3: this_SIMPLE_EVENT_TYPE_6= RULE_SIMPLE_EVENT_TYPE
                    {
                    this_SIMPLE_EVENT_TYPE_6=(Token)match(input,RULE_SIMPLE_EVENT_TYPE,FOLLOW_2); 

                    			current.merge(this_SIMPLE_EVENT_TYPE_6);
                    		

                    			newLeafNode(this_SIMPLE_EVENT_TYPE_6, grammarAccess.getValueAccess().getSIMPLE_EVENT_TYPETerminalRuleCall_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalLMJAQ.g:1127:3: this_EVENT_CODE_7= RULE_EVENT_CODE
                    {
                    this_EVENT_CODE_7=(Token)match(input,RULE_EVENT_CODE,FOLLOW_2); 

                    			current.merge(this_EVENT_CODE_7);
                    		

                    			newLeafNode(this_EVENT_CODE_7, grammarAccess.getValueAccess().getEVENT_CODETerminalRuleCall_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalLMJAQ.g:1135:3: this_EFEITO_ACTION_8= RULE_EFEITO_ACTION
                    {
                    this_EFEITO_ACTION_8=(Token)match(input,RULE_EFEITO_ACTION,FOLLOW_2); 

                    			current.merge(this_EFEITO_ACTION_8);
                    		

                    			newLeafNode(this_EFEITO_ACTION_8, grammarAccess.getValueAccess().getEFEITO_ACTIONTerminalRuleCall_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalLMJAQ.g:1143:3: this_TEXT_CONTENT_9= RULE_TEXT_CONTENT
                    {
                    this_TEXT_CONTENT_9=(Token)match(input,RULE_TEXT_CONTENT,FOLLOW_2); 

                    			current.merge(this_TEXT_CONTENT_9);
                    		

                    			newLeafNode(this_TEXT_CONTENT_9, grammarAccess.getValueAccess().getTEXT_CONTENTTerminalRuleCall_9());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleComponente"
    // InternalLMJAQ.g:1154:1: entryRuleComponente returns [String current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final String entryRuleComponente() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComponente = null;


        try {
            // InternalLMJAQ.g:1154:50: (iv_ruleComponente= ruleComponente EOF )
            // InternalLMJAQ.g:1155:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalLMJAQ.g:1161:1: ruleComponente returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Gatilho_0= ruleGatilho | this_Comportamento_1= ruleComportamento ) ;
    public final AntlrDatatypeRuleToken ruleComponente() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Gatilho_0 = null;

        AntlrDatatypeRuleToken this_Comportamento_1 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:1167:2: ( (this_Gatilho_0= ruleGatilho | this_Comportamento_1= ruleComportamento ) )
            // InternalLMJAQ.g:1168:2: (this_Gatilho_0= ruleGatilho | this_Comportamento_1= ruleComportamento )
            {
            // InternalLMJAQ.g:1168:2: (this_Gatilho_0= ruleGatilho | this_Comportamento_1= ruleComportamento )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLMJAQ.g:1169:3: this_Gatilho_0= ruleGatilho
                    {

                    			newCompositeNode(grammarAccess.getComponenteAccess().getGatilhoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gatilho_0=ruleGatilho();

                    state._fsp--;


                    			current.merge(this_Gatilho_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1180:3: this_Comportamento_1= ruleComportamento
                    {

                    			newCompositeNode(grammarAccess.getComponenteAccess().getComportamentoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comportamento_1=ruleComportamento();

                    state._fsp--;


                    			current.merge(this_Comportamento_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleEventoComplexo"
    // InternalLMJAQ.g:1194:1: entryRuleEventoComplexo returns [String current=null] : iv_ruleEventoComplexo= ruleEventoComplexo EOF ;
    public final String entryRuleEventoComplexo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventoComplexo = null;


        try {
            // InternalLMJAQ.g:1194:54: (iv_ruleEventoComplexo= ruleEventoComplexo EOF )
            // InternalLMJAQ.g:1195:2: iv_ruleEventoComplexo= ruleEventoComplexo EOF
            {
             newCompositeNode(grammarAccess.getEventoComplexoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventoComplexo=ruleEventoComplexo();

            state._fsp--;

             current =iv_ruleEventoComplexo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventoComplexo"


    // $ANTLR start "ruleEventoComplexo"
    // InternalLMJAQ.g:1201:1: ruleEventoComplexo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EventoComplexo' ;
    public final AntlrDatatypeRuleToken ruleEventoComplexo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1207:2: (kw= 'EventoComplexo' )
            // InternalLMJAQ.g:1208:2: kw= 'EventoComplexo'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEventoComplexoAccess().getEventoComplexoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventoComplexo"


    // $ANTLR start "entryRuleEventoSimples"
    // InternalLMJAQ.g:1216:1: entryRuleEventoSimples returns [String current=null] : iv_ruleEventoSimples= ruleEventoSimples EOF ;
    public final String entryRuleEventoSimples() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventoSimples = null;


        try {
            // InternalLMJAQ.g:1216:53: (iv_ruleEventoSimples= ruleEventoSimples EOF )
            // InternalLMJAQ.g:1217:2: iv_ruleEventoSimples= ruleEventoSimples EOF
            {
             newCompositeNode(grammarAccess.getEventoSimplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventoSimples=ruleEventoSimples();

            state._fsp--;

             current =iv_ruleEventoSimples.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventoSimples"


    // $ANTLR start "ruleEventoSimples"
    // InternalLMJAQ.g:1223:1: ruleEventoSimples returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EventoSimples' ;
    public final AntlrDatatypeRuleToken ruleEventoSimples() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1229:2: (kw= 'EventoSimples' )
            // InternalLMJAQ.g:1230:2: kw= 'EventoSimples'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEventoSimplesAccess().getEventoSimplesKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventoSimples"


    // $ANTLR start "entryRuleGatilho"
    // InternalLMJAQ.g:1238:1: entryRuleGatilho returns [String current=null] : iv_ruleGatilho= ruleGatilho EOF ;
    public final String entryRuleGatilho() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGatilho = null;


        try {
            // InternalLMJAQ.g:1238:47: (iv_ruleGatilho= ruleGatilho EOF )
            // InternalLMJAQ.g:1239:2: iv_ruleGatilho= ruleGatilho EOF
            {
             newCompositeNode(grammarAccess.getGatilhoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGatilho=ruleGatilho();

            state._fsp--;

             current =iv_ruleGatilho.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGatilho"


    // $ANTLR start "ruleGatilho"
    // InternalLMJAQ.g:1245:1: ruleGatilho returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_AoClicar_0= ruleAoClicar ;
    public final AntlrDatatypeRuleToken ruleGatilho() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AoClicar_0 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:1251:2: (this_AoClicar_0= ruleAoClicar )
            // InternalLMJAQ.g:1252:2: this_AoClicar_0= ruleAoClicar
            {

            		newCompositeNode(grammarAccess.getGatilhoAccess().getAoClicarParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AoClicar_0=ruleAoClicar();

            state._fsp--;


            		current.merge(this_AoClicar_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGatilho"


    // $ANTLR start "entryRuleAoClicar"
    // InternalLMJAQ.g:1265:1: entryRuleAoClicar returns [String current=null] : iv_ruleAoClicar= ruleAoClicar EOF ;
    public final String entryRuleAoClicar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAoClicar = null;


        try {
            // InternalLMJAQ.g:1265:48: (iv_ruleAoClicar= ruleAoClicar EOF )
            // InternalLMJAQ.g:1266:2: iv_ruleAoClicar= ruleAoClicar EOF
            {
             newCompositeNode(grammarAccess.getAoClicarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAoClicar=ruleAoClicar();

            state._fsp--;

             current =iv_ruleAoClicar.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAoClicar"


    // $ANTLR start "ruleAoClicar"
    // InternalLMJAQ.g:1272:1: ruleAoClicar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AoClicar' ;
    public final AntlrDatatypeRuleToken ruleAoClicar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1278:2: (kw= 'AoClicar' )
            // InternalLMJAQ.g:1279:2: kw= 'AoClicar'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAoClicarAccess().getAoClicarKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAoClicar"


    // $ANTLR start "entryRuleComportamento"
    // InternalLMJAQ.g:1287:1: entryRuleComportamento returns [String current=null] : iv_ruleComportamento= ruleComportamento EOF ;
    public final String entryRuleComportamento() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComportamento = null;


        try {
            // InternalLMJAQ.g:1287:53: (iv_ruleComportamento= ruleComportamento EOF )
            // InternalLMJAQ.g:1288:2: iv_ruleComportamento= ruleComportamento EOF
            {
             newCompositeNode(grammarAccess.getComportamentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComportamento=ruleComportamento();

            state._fsp--;

             current =iv_ruleComportamento.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComportamento"


    // $ANTLR start "ruleComportamento"
    // InternalLMJAQ.g:1294:1: ruleComportamento returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Comportamento' ;
    public final AntlrDatatypeRuleToken ruleComportamento() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1300:2: (kw= 'Comportamento' )
            // InternalLMJAQ.g:1301:2: kw= 'Comportamento'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getComportamentoAccess().getComportamentoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComportamento"


    // $ANTLR start "entryRuleRecurso"
    // InternalLMJAQ.g:1309:1: entryRuleRecurso returns [String current=null] : iv_ruleRecurso= ruleRecurso EOF ;
    public final String entryRuleRecurso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecurso = null;


        try {
            // InternalLMJAQ.g:1309:47: (iv_ruleRecurso= ruleRecurso EOF )
            // InternalLMJAQ.g:1310:2: iv_ruleRecurso= ruleRecurso EOF
            {
             newCompositeNode(grammarAccess.getRecursoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecurso=ruleRecurso();

            state._fsp--;

             current =iv_ruleRecurso.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecurso"


    // $ANTLR start "ruleRecurso"
    // InternalLMJAQ.g:1316:1: ruleRecurso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Imagem_0= ruleImagem | this_Animacao_1= ruleAnimacao | this_Texto_2= ruleTexto ) ;
    public final AntlrDatatypeRuleToken ruleRecurso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Imagem_0 = null;

        AntlrDatatypeRuleToken this_Animacao_1 = null;

        AntlrDatatypeRuleToken this_Texto_2 = null;



        	enterRule();

        try {
            // InternalLMJAQ.g:1322:2: ( (this_Imagem_0= ruleImagem | this_Animacao_1= ruleAnimacao | this_Texto_2= ruleTexto ) )
            // InternalLMJAQ.g:1323:2: (this_Imagem_0= ruleImagem | this_Animacao_1= ruleAnimacao | this_Texto_2= ruleTexto )
            {
            // InternalLMJAQ.g:1323:2: (this_Imagem_0= ruleImagem | this_Animacao_1= ruleAnimacao | this_Texto_2= ruleTexto )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalLMJAQ.g:1324:3: this_Imagem_0= ruleImagem
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getImagemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Imagem_0=ruleImagem();

                    state._fsp--;


                    			current.merge(this_Imagem_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1335:3: this_Animacao_1= ruleAnimacao
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getAnimacaoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Animacao_1=ruleAnimacao();

                    state._fsp--;


                    			current.merge(this_Animacao_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:1346:3: this_Texto_2= ruleTexto
                    {

                    			newCompositeNode(grammarAccess.getRecursoAccess().getTextoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texto_2=ruleTexto();

                    state._fsp--;


                    			current.merge(this_Texto_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecurso"


    // $ANTLR start "entryRuleImagem"
    // InternalLMJAQ.g:1360:1: entryRuleImagem returns [String current=null] : iv_ruleImagem= ruleImagem EOF ;
    public final String entryRuleImagem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImagem = null;


        try {
            // InternalLMJAQ.g:1360:46: (iv_ruleImagem= ruleImagem EOF )
            // InternalLMJAQ.g:1361:2: iv_ruleImagem= ruleImagem EOF
            {
             newCompositeNode(grammarAccess.getImagemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagem=ruleImagem();

            state._fsp--;

             current =iv_ruleImagem.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImagem"


    // $ANTLR start "ruleImagem"
    // InternalLMJAQ.g:1367:1: ruleImagem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Imagem' ;
    public final AntlrDatatypeRuleToken ruleImagem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1373:2: (kw= 'Imagem' )
            // InternalLMJAQ.g:1374:2: kw= 'Imagem'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getImagemAccess().getImagemKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImagem"


    // $ANTLR start "entryRuleAnimacao"
    // InternalLMJAQ.g:1382:1: entryRuleAnimacao returns [String current=null] : iv_ruleAnimacao= ruleAnimacao EOF ;
    public final String entryRuleAnimacao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnimacao = null;


        try {
            // InternalLMJAQ.g:1382:48: (iv_ruleAnimacao= ruleAnimacao EOF )
            // InternalLMJAQ.g:1383:2: iv_ruleAnimacao= ruleAnimacao EOF
            {
             newCompositeNode(grammarAccess.getAnimacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimacao=ruleAnimacao();

            state._fsp--;

             current =iv_ruleAnimacao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimacao"


    // $ANTLR start "ruleAnimacao"
    // InternalLMJAQ.g:1389:1: ruleAnimacao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Animacao' ;
    public final AntlrDatatypeRuleToken ruleAnimacao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1395:2: (kw= 'Animacao' )
            // InternalLMJAQ.g:1396:2: kw= 'Animacao'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAnimacaoAccess().getAnimacaoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimacao"


    // $ANTLR start "entryRuleTexto"
    // InternalLMJAQ.g:1404:1: entryRuleTexto returns [String current=null] : iv_ruleTexto= ruleTexto EOF ;
    public final String entryRuleTexto() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTexto = null;


        try {
            // InternalLMJAQ.g:1404:45: (iv_ruleTexto= ruleTexto EOF )
            // InternalLMJAQ.g:1405:2: iv_ruleTexto= ruleTexto EOF
            {
             newCompositeNode(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexto=ruleTexto();

            state._fsp--;

             current =iv_ruleTexto.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalLMJAQ.g:1411:1: ruleTexto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Texto' ;
    public final AntlrDatatypeRuleToken ruleTexto() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1417:2: (kw= 'Texto' )
            // InternalLMJAQ.g:1418:2: kw= 'Texto'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTextoAccess().getTextoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRuleConteudo"
    // InternalLMJAQ.g:1426:1: entryRuleConteudo returns [String current=null] : iv_ruleConteudo= ruleConteudo EOF ;
    public final String entryRuleConteudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConteudo = null;


        try {
            // InternalLMJAQ.g:1426:48: (iv_ruleConteudo= ruleConteudo EOF )
            // InternalLMJAQ.g:1427:2: iv_ruleConteudo= ruleConteudo EOF
            {
             newCompositeNode(grammarAccess.getConteudoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConteudo=ruleConteudo();

            state._fsp--;

             current =iv_ruleConteudo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConteudo"


    // $ANTLR start "ruleConteudo"
    // InternalLMJAQ.g:1433:1: ruleConteudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Conteudo' ;
    public final AntlrDatatypeRuleToken ruleConteudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1439:2: (kw= 'Conteudo' )
            // InternalLMJAQ.g:1440:2: kw= 'Conteudo'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConteudoAccess().getConteudoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConteudo"


    // $ANTLR start "entryRuleTamanho"
    // InternalLMJAQ.g:1448:1: entryRuleTamanho returns [String current=null] : iv_ruleTamanho= ruleTamanho EOF ;
    public final String entryRuleTamanho() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTamanho = null;


        try {
            // InternalLMJAQ.g:1448:47: (iv_ruleTamanho= ruleTamanho EOF )
            // InternalLMJAQ.g:1449:2: iv_ruleTamanho= ruleTamanho EOF
            {
             newCompositeNode(grammarAccess.getTamanhoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTamanho=ruleTamanho();

            state._fsp--;

             current =iv_ruleTamanho.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTamanho"


    // $ANTLR start "ruleTamanho"
    // InternalLMJAQ.g:1455:1: ruleTamanho returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Tamanho' ;
    public final AntlrDatatypeRuleToken ruleTamanho() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1461:2: (kw= 'Tamanho' )
            // InternalLMJAQ.g:1462:2: kw= 'Tamanho'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTamanhoAccess().getTamanhoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanho"


    // $ANTLR start "entryRuleTamanhoDaFonte"
    // InternalLMJAQ.g:1470:1: entryRuleTamanhoDaFonte returns [String current=null] : iv_ruleTamanhoDaFonte= ruleTamanhoDaFonte EOF ;
    public final String entryRuleTamanhoDaFonte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTamanhoDaFonte = null;


        try {
            // InternalLMJAQ.g:1470:54: (iv_ruleTamanhoDaFonte= ruleTamanhoDaFonte EOF )
            // InternalLMJAQ.g:1471:2: iv_ruleTamanhoDaFonte= ruleTamanhoDaFonte EOF
            {
             newCompositeNode(grammarAccess.getTamanhoDaFonteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTamanhoDaFonte=ruleTamanhoDaFonte();

            state._fsp--;

             current =iv_ruleTamanhoDaFonte.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTamanhoDaFonte"


    // $ANTLR start "ruleTamanhoDaFonte"
    // InternalLMJAQ.g:1477:1: ruleTamanhoDaFonte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TamanhoDaFonte' ;
    public final AntlrDatatypeRuleToken ruleTamanhoDaFonte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1483:2: (kw= 'TamanhoDaFonte' )
            // InternalLMJAQ.g:1484:2: kw= 'TamanhoDaFonte'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTamanhoDaFonteAccess().getTamanhoDaFonteKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanhoDaFonte"


    // $ANTLR start "entryRuleCaminho"
    // InternalLMJAQ.g:1492:1: entryRuleCaminho returns [String current=null] : iv_ruleCaminho= ruleCaminho EOF ;
    public final String entryRuleCaminho() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCaminho = null;


        try {
            // InternalLMJAQ.g:1492:47: (iv_ruleCaminho= ruleCaminho EOF )
            // InternalLMJAQ.g:1493:2: iv_ruleCaminho= ruleCaminho EOF
            {
             newCompositeNode(grammarAccess.getCaminhoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaminho=ruleCaminho();

            state._fsp--;

             current =iv_ruleCaminho.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaminho"


    // $ANTLR start "ruleCaminho"
    // InternalLMJAQ.g:1499:1: ruleCaminho returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Caminho' ;
    public final AntlrDatatypeRuleToken ruleCaminho() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1505:2: (kw= 'Caminho' )
            // InternalLMJAQ.g:1506:2: kw= 'Caminho'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCaminhoAccess().getCaminhoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaminho"


    // $ANTLR start "entryRuleConfigGeral"
    // InternalLMJAQ.g:1514:1: entryRuleConfigGeral returns [String current=null] : iv_ruleConfigGeral= ruleConfigGeral EOF ;
    public final String entryRuleConfigGeral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConfigGeral = null;


        try {
            // InternalLMJAQ.g:1514:51: (iv_ruleConfigGeral= ruleConfigGeral EOF )
            // InternalLMJAQ.g:1515:2: iv_ruleConfigGeral= ruleConfigGeral EOF
            {
             newCompositeNode(grammarAccess.getConfigGeralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigGeral=ruleConfigGeral();

            state._fsp--;

             current =iv_ruleConfigGeral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigGeral"


    // $ANTLR start "ruleConfigGeral"
    // InternalLMJAQ.g:1521:1: ruleConfigGeral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConfigGeral' ;
    public final AntlrDatatypeRuleToken ruleConfigGeral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1527:2: (kw= 'ConfigGeral' )
            // InternalLMJAQ.g:1528:2: kw= 'ConfigGeral'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConfigGeralAccess().getConfigGeralKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigGeral"


    // $ANTLR start "entryRuleComprimentoDaTela"
    // InternalLMJAQ.g:1536:1: entryRuleComprimentoDaTela returns [String current=null] : iv_ruleComprimentoDaTela= ruleComprimentoDaTela EOF ;
    public final String entryRuleComprimentoDaTela() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComprimentoDaTela = null;


        try {
            // InternalLMJAQ.g:1536:57: (iv_ruleComprimentoDaTela= ruleComprimentoDaTela EOF )
            // InternalLMJAQ.g:1537:2: iv_ruleComprimentoDaTela= ruleComprimentoDaTela EOF
            {
             newCompositeNode(grammarAccess.getComprimentoDaTelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComprimentoDaTela=ruleComprimentoDaTela();

            state._fsp--;

             current =iv_ruleComprimentoDaTela.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComprimentoDaTela"


    // $ANTLR start "ruleComprimentoDaTela"
    // InternalLMJAQ.g:1543:1: ruleComprimentoDaTela returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ComprimentoDaTela' ;
    public final AntlrDatatypeRuleToken ruleComprimentoDaTela() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1549:2: (kw= 'ComprimentoDaTela' )
            // InternalLMJAQ.g:1550:2: kw= 'ComprimentoDaTela'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getComprimentoDaTelaAccess().getComprimentoDaTelaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComprimentoDaTela"


    // $ANTLR start "entryRuleAlturaDaTela"
    // InternalLMJAQ.g:1558:1: entryRuleAlturaDaTela returns [String current=null] : iv_ruleAlturaDaTela= ruleAlturaDaTela EOF ;
    public final String entryRuleAlturaDaTela() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlturaDaTela = null;


        try {
            // InternalLMJAQ.g:1558:52: (iv_ruleAlturaDaTela= ruleAlturaDaTela EOF )
            // InternalLMJAQ.g:1559:2: iv_ruleAlturaDaTela= ruleAlturaDaTela EOF
            {
             newCompositeNode(grammarAccess.getAlturaDaTelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlturaDaTela=ruleAlturaDaTela();

            state._fsp--;

             current =iv_ruleAlturaDaTela.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlturaDaTela"


    // $ANTLR start "ruleAlturaDaTela"
    // InternalLMJAQ.g:1565:1: ruleAlturaDaTela returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AlturaDaTela' ;
    public final AntlrDatatypeRuleToken ruleAlturaDaTela() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1571:2: (kw= 'AlturaDaTela' )
            // InternalLMJAQ.g:1572:2: kw= 'AlturaDaTela'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAlturaDaTelaAccess().getAlturaDaTelaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlturaDaTela"


    // $ANTLR start "entryRuleQuestao"
    // InternalLMJAQ.g:1580:1: entryRuleQuestao returns [String current=null] : iv_ruleQuestao= ruleQuestao EOF ;
    public final String entryRuleQuestao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuestao = null;


        try {
            // InternalLMJAQ.g:1580:47: (iv_ruleQuestao= ruleQuestao EOF )
            // InternalLMJAQ.g:1581:2: iv_ruleQuestao= ruleQuestao EOF
            {
             newCompositeNode(grammarAccess.getQuestaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestao=ruleQuestao();

            state._fsp--;

             current =iv_ruleQuestao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestao"


    // $ANTLR start "ruleQuestao"
    // InternalLMJAQ.g:1587:1: ruleQuestao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Questao' ;
    public final AntlrDatatypeRuleToken ruleQuestao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1593:2: (kw= 'Questao' )
            // InternalLMJAQ.g:1594:2: kw= 'Questao'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getQuestaoAccess().getQuestaoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestao"


    // $ANTLR start "entryRuleAlternativa"
    // InternalLMJAQ.g:1602:1: entryRuleAlternativa returns [String current=null] : iv_ruleAlternativa= ruleAlternativa EOF ;
    public final String entryRuleAlternativa() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternativa = null;


        try {
            // InternalLMJAQ.g:1602:51: (iv_ruleAlternativa= ruleAlternativa EOF )
            // InternalLMJAQ.g:1603:2: iv_ruleAlternativa= ruleAlternativa EOF
            {
             newCompositeNode(grammarAccess.getAlternativaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativa=ruleAlternativa();

            state._fsp--;

             current =iv_ruleAlternativa.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativa"


    // $ANTLR start "ruleAlternativa"
    // InternalLMJAQ.g:1609:1: ruleAlternativa returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Alternativa' ;
    public final AntlrDatatypeRuleToken ruleAlternativa() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1615:2: (kw= 'Alternativa' )
            // InternalLMJAQ.g:1616:2: kw= 'Alternativa'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAlternativaAccess().getAlternativaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativa"


    // $ANTLR start "entryRuleEnunciado"
    // InternalLMJAQ.g:1624:1: entryRuleEnunciado returns [String current=null] : iv_ruleEnunciado= ruleEnunciado EOF ;
    public final String entryRuleEnunciado() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnunciado = null;


        try {
            // InternalLMJAQ.g:1624:49: (iv_ruleEnunciado= ruleEnunciado EOF )
            // InternalLMJAQ.g:1625:2: iv_ruleEnunciado= ruleEnunciado EOF
            {
             newCompositeNode(grammarAccess.getEnunciadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnunciado=ruleEnunciado();

            state._fsp--;

             current =iv_ruleEnunciado.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnunciado"


    // $ANTLR start "ruleEnunciado"
    // InternalLMJAQ.g:1631:1: ruleEnunciado returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Enunciado' ;
    public final AntlrDatatypeRuleToken ruleEnunciado() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1637:2: (kw= 'Enunciado' )
            // InternalLMJAQ.g:1638:2: kw= 'Enunciado'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEnunciadoAccess().getEnunciadoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnunciado"


    // $ANTLR start "entryRuleResposta"
    // InternalLMJAQ.g:1646:1: entryRuleResposta returns [String current=null] : iv_ruleResposta= ruleResposta EOF ;
    public final String entryRuleResposta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResposta = null;


        try {
            // InternalLMJAQ.g:1646:48: (iv_ruleResposta= ruleResposta EOF )
            // InternalLMJAQ.g:1647:2: iv_ruleResposta= ruleResposta EOF
            {
             newCompositeNode(grammarAccess.getRespostaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResposta=ruleResposta();

            state._fsp--;

             current =iv_ruleResposta.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResposta"


    // $ANTLR start "ruleResposta"
    // InternalLMJAQ.g:1653:1: ruleResposta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Resposta' ;
    public final AntlrDatatypeRuleToken ruleResposta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1659:2: (kw= 'Resposta' )
            // InternalLMJAQ.g:1660:2: kw= 'Resposta'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRespostaAccess().getRespostaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResposta"


    // $ANTLR start "entryRuleFormatoQuiz"
    // InternalLMJAQ.g:1668:1: entryRuleFormatoQuiz returns [String current=null] : iv_ruleFormatoQuiz= ruleFormatoQuiz EOF ;
    public final String entryRuleFormatoQuiz() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFormatoQuiz = null;


        try {
            // InternalLMJAQ.g:1668:51: (iv_ruleFormatoQuiz= ruleFormatoQuiz EOF )
            // InternalLMJAQ.g:1669:2: iv_ruleFormatoQuiz= ruleFormatoQuiz EOF
            {
             newCompositeNode(grammarAccess.getFormatoQuizRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormatoQuiz=ruleFormatoQuiz();

            state._fsp--;

             current =iv_ruleFormatoQuiz.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormatoQuiz"


    // $ANTLR start "ruleFormatoQuiz"
    // InternalLMJAQ.g:1675:1: ruleFormatoQuiz returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'FormatoQuiz' ;
    public final AntlrDatatypeRuleToken ruleFormatoQuiz() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1681:2: (kw= 'FormatoQuiz' )
            // InternalLMJAQ.g:1682:2: kw= 'FormatoQuiz'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFormatoQuizAccess().getFormatoQuizKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormatoQuiz"


    // $ANTLR start "entryRuleEstado"
    // InternalLMJAQ.g:1690:1: entryRuleEstado returns [String current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final String entryRuleEstado() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEstado = null;


        try {
            // InternalLMJAQ.g:1690:46: (iv_ruleEstado= ruleEstado EOF )
            // InternalLMJAQ.g:1691:2: iv_ruleEstado= ruleEstado EOF
            {
             newCompositeNode(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstado=ruleEstado();

            state._fsp--;

             current =iv_ruleEstado.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalLMJAQ.g:1697:1: ruleEstado returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Estado' ;
    public final AntlrDatatypeRuleToken ruleEstado() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1703:2: (kw= 'Estado' )
            // InternalLMJAQ.g:1704:2: kw= 'Estado'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEstadoAccess().getEstadoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleEstadoFinal"
    // InternalLMJAQ.g:1712:1: entryRuleEstadoFinal returns [String current=null] : iv_ruleEstadoFinal= ruleEstadoFinal EOF ;
    public final String entryRuleEstadoFinal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEstadoFinal = null;


        try {
            // InternalLMJAQ.g:1712:51: (iv_ruleEstadoFinal= ruleEstadoFinal EOF )
            // InternalLMJAQ.g:1713:2: iv_ruleEstadoFinal= ruleEstadoFinal EOF
            {
             newCompositeNode(grammarAccess.getEstadoFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstadoFinal=ruleEstadoFinal();

            state._fsp--;

             current =iv_ruleEstadoFinal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstadoFinal"


    // $ANTLR start "ruleEstadoFinal"
    // InternalLMJAQ.g:1719:1: ruleEstadoFinal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EstadoFinal' ;
    public final AntlrDatatypeRuleToken ruleEstadoFinal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1725:2: (kw= 'EstadoFinal' )
            // InternalLMJAQ.g:1726:2: kw= 'EstadoFinal'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEstadoFinalAccess().getEstadoFinalKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstadoFinal"


    // $ANTLR start "entryRuleEstadoInicial"
    // InternalLMJAQ.g:1734:1: entryRuleEstadoInicial returns [String current=null] : iv_ruleEstadoInicial= ruleEstadoInicial EOF ;
    public final String entryRuleEstadoInicial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEstadoInicial = null;


        try {
            // InternalLMJAQ.g:1734:53: (iv_ruleEstadoInicial= ruleEstadoInicial EOF )
            // InternalLMJAQ.g:1735:2: iv_ruleEstadoInicial= ruleEstadoInicial EOF
            {
             newCompositeNode(grammarAccess.getEstadoInicialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstadoInicial=ruleEstadoInicial();

            state._fsp--;

             current =iv_ruleEstadoInicial.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstadoInicial"


    // $ANTLR start "ruleEstadoInicial"
    // InternalLMJAQ.g:1741:1: ruleEstadoInicial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EstadoInicial' ;
    public final AntlrDatatypeRuleToken ruleEstadoInicial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1747:2: (kw= 'EstadoInicial' )
            // InternalLMJAQ.g:1748:2: kw= 'EstadoInicial'
            {
            kw=(Token)match(input,53,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEstadoInicialAccess().getEstadoInicialKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstadoInicial"


    // $ANTLR start "entryRuleProximoEstados"
    // InternalLMJAQ.g:1756:1: entryRuleProximoEstados returns [String current=null] : iv_ruleProximoEstados= ruleProximoEstados EOF ;
    public final String entryRuleProximoEstados() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProximoEstados = null;


        try {
            // InternalLMJAQ.g:1756:54: (iv_ruleProximoEstados= ruleProximoEstados EOF )
            // InternalLMJAQ.g:1757:2: iv_ruleProximoEstados= ruleProximoEstados EOF
            {
             newCompositeNode(grammarAccess.getProximoEstadosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProximoEstados=ruleProximoEstados();

            state._fsp--;

             current =iv_ruleProximoEstados.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProximoEstados"


    // $ANTLR start "ruleProximoEstados"
    // InternalLMJAQ.g:1763:1: ruleProximoEstados returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ProximoEstados' ;
    public final AntlrDatatypeRuleToken ruleProximoEstados() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1769:2: (kw= 'ProximoEstados' )
            // InternalLMJAQ.g:1770:2: kw= 'ProximoEstados'
            {
            kw=(Token)match(input,54,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getProximoEstadosAccess().getProximoEstadosKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProximoEstados"


    // $ANTLR start "entryRuleItem"
    // InternalLMJAQ.g:1778:1: entryRuleItem returns [String current=null] : iv_ruleItem= ruleItem EOF ;
    public final String entryRuleItem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleItem = null;


        try {
            // InternalLMJAQ.g:1778:44: (iv_ruleItem= ruleItem EOF )
            // InternalLMJAQ.g:1779:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalLMJAQ.g:1785:1: ruleItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Item' ;
    public final AntlrDatatypeRuleToken ruleItem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1791:2: (kw= 'Item' )
            // InternalLMJAQ.g:1792:2: kw= 'Item'
            {
            kw=(Token)match(input,55,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getItemAccess().getItemKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleEfeito"
    // InternalLMJAQ.g:1800:1: entryRuleEfeito returns [String current=null] : iv_ruleEfeito= ruleEfeito EOF ;
    public final String entryRuleEfeito() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEfeito = null;


        try {
            // InternalLMJAQ.g:1800:46: (iv_ruleEfeito= ruleEfeito EOF )
            // InternalLMJAQ.g:1801:2: iv_ruleEfeito= ruleEfeito EOF
            {
             newCompositeNode(grammarAccess.getEfeitoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEfeito=ruleEfeito();

            state._fsp--;

             current =iv_ruleEfeito.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEfeito"


    // $ANTLR start "ruleEfeito"
    // InternalLMJAQ.g:1807:1: ruleEfeito returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Efeito' ;
    public final AntlrDatatypeRuleToken ruleEfeito() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1813:2: (kw= 'Efeito' )
            // InternalLMJAQ.g:1814:2: kw= 'Efeito'
            {
            kw=(Token)match(input,56,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEfeitoAccess().getEfeitoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEfeito"


    // $ANTLR start "entryRuleEstadosAfetados"
    // InternalLMJAQ.g:1822:1: entryRuleEstadosAfetados returns [String current=null] : iv_ruleEstadosAfetados= ruleEstadosAfetados EOF ;
    public final String entryRuleEstadosAfetados() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEstadosAfetados = null;


        try {
            // InternalLMJAQ.g:1822:55: (iv_ruleEstadosAfetados= ruleEstadosAfetados EOF )
            // InternalLMJAQ.g:1823:2: iv_ruleEstadosAfetados= ruleEstadosAfetados EOF
            {
             newCompositeNode(grammarAccess.getEstadosAfetadosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstadosAfetados=ruleEstadosAfetados();

            state._fsp--;

             current =iv_ruleEstadosAfetados.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstadosAfetados"


    // $ANTLR start "ruleEstadosAfetados"
    // InternalLMJAQ.g:1829:1: ruleEstadosAfetados returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EstadosAfetados' ;
    public final AntlrDatatypeRuleToken ruleEstadosAfetados() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1835:2: (kw= 'EstadosAfetados' )
            // InternalLMJAQ.g:1836:2: kw= 'EstadosAfetados'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEstadosAfetadosAccess().getEstadosAfetadosKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstadosAfetados"


    // $ANTLR start "entryRuleBoolean"
    // InternalLMJAQ.g:1844:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalLMJAQ.g:1844:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalLMJAQ.g:1845:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalLMJAQ.g:1851:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FALSE_0= RULE_FALSE | this_TRUE_1= RULE_TRUE ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FALSE_0=null;
        Token this_TRUE_1=null;


        	enterRule();

        try {
            // InternalLMJAQ.g:1857:2: ( (this_FALSE_0= RULE_FALSE | this_TRUE_1= RULE_TRUE ) )
            // InternalLMJAQ.g:1858:2: (this_FALSE_0= RULE_FALSE | this_TRUE_1= RULE_TRUE )
            {
            // InternalLMJAQ.g:1858:2: (this_FALSE_0= RULE_FALSE | this_TRUE_1= RULE_TRUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_FALSE) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_TRUE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLMJAQ.g:1859:3: this_FALSE_0= RULE_FALSE
                    {
                    this_FALSE_0=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    			current.merge(this_FALSE_0);
                    		

                    			newLeafNode(this_FALSE_0, grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:1867:3: this_TRUE_1= RULE_TRUE
                    {
                    this_TRUE_1=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    			current.merge(this_TRUE_1);
                    		

                    			newLeafNode(this_TRUE_1, grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0088C87D0C400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x03FFFFFFEE400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007FF2L});

}