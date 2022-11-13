package org.xtext.lmjaq.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLMJAQLexer extends Lexer {
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

    public InternalLMJAQLexer() {;} 
    public InternalLMJAQLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLMJAQLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLMJAQ.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:11:7: ( 'Tela' )
            // InternalLMJAQ.g:11:9: 'Tela'
            {
            match("Tela"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:12:7: ( 'Objeto' )
            // InternalLMJAQ.g:12:9: 'Objeto'
            {
            match("Objeto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:13:7: ( 'Ativo' )
            // InternalLMJAQ.g:13:9: 'Ativo'
            {
            match("Ativo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:14:7: ( 'IU' )
            // InternalLMJAQ.g:14:9: 'IU'
            {
            match("IU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:15:7: ( 'Posicao' )
            // InternalLMJAQ.g:15:9: 'Posicao'
            {
            match("Posicao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:16:7: ( 'EventoComplexo' )
            // InternalLMJAQ.g:16:9: 'EventoComplexo'
            {
            match("EventoComplexo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:17:7: ( 'EventoSimples' )
            // InternalLMJAQ.g:17:9: 'EventoSimples'
            {
            match("EventoSimples"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:18:7: ( 'AoClicar' )
            // InternalLMJAQ.g:18:9: 'AoClicar'
            {
            match("AoClicar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:19:7: ( 'Comportamento' )
            // InternalLMJAQ.g:19:9: 'Comportamento'
            {
            match("Comportamento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:20:7: ( 'Imagem' )
            // InternalLMJAQ.g:20:9: 'Imagem'
            {
            match("Imagem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:21:7: ( 'Animacao' )
            // InternalLMJAQ.g:21:9: 'Animacao'
            {
            match("Animacao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:22:7: ( 'Texto' )
            // InternalLMJAQ.g:22:9: 'Texto'
            {
            match("Texto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:23:7: ( 'Conteudo' )
            // InternalLMJAQ.g:23:9: 'Conteudo'
            {
            match("Conteudo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:24:7: ( 'Tamanho' )
            // InternalLMJAQ.g:24:9: 'Tamanho'
            {
            match("Tamanho"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:25:7: ( 'TamanhoDaFonte' )
            // InternalLMJAQ.g:25:9: 'TamanhoDaFonte'
            {
            match("TamanhoDaFonte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:26:7: ( 'Caminho' )
            // InternalLMJAQ.g:26:9: 'Caminho'
            {
            match("Caminho"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:27:7: ( 'ConfigGeral' )
            // InternalLMJAQ.g:27:9: 'ConfigGeral'
            {
            match("ConfigGeral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:28:7: ( 'ComprimentoDaTela' )
            // InternalLMJAQ.g:28:9: 'ComprimentoDaTela'
            {
            match("ComprimentoDaTela"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:29:7: ( 'AlturaDaTela' )
            // InternalLMJAQ.g:29:9: 'AlturaDaTela'
            {
            match("AlturaDaTela"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:30:7: ( 'Questao' )
            // InternalLMJAQ.g:30:9: 'Questao'
            {
            match("Questao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:31:7: ( 'Alternativa' )
            // InternalLMJAQ.g:31:9: 'Alternativa'
            {
            match("Alternativa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:32:7: ( 'Enunciado' )
            // InternalLMJAQ.g:32:9: 'Enunciado'
            {
            match("Enunciado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:33:7: ( 'Resposta' )
            // InternalLMJAQ.g:33:9: 'Resposta'
            {
            match("Resposta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:34:7: ( 'FormatoQuiz' )
            // InternalLMJAQ.g:34:9: 'FormatoQuiz'
            {
            match("FormatoQuiz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:35:7: ( 'Estado' )
            // InternalLMJAQ.g:35:9: 'Estado'
            {
            match("Estado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:36:7: ( 'EstadoFinal' )
            // InternalLMJAQ.g:36:9: 'EstadoFinal'
            {
            match("EstadoFinal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:37:7: ( 'EstadoInicial' )
            // InternalLMJAQ.g:37:9: 'EstadoInicial'
            {
            match("EstadoInicial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:38:7: ( 'ProximoEstados' )
            // InternalLMJAQ.g:38:9: 'ProximoEstados'
            {
            match("ProximoEstados"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:39:7: ( 'Item' )
            // InternalLMJAQ.g:39:9: 'Item'
            {
            match("Item"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:40:7: ( 'Efeito' )
            // InternalLMJAQ.g:40:9: 'Efeito'
            {
            match("Efeito"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:41:7: ( 'EstadosAfetados' )
            // InternalLMJAQ.g:41:9: 'EstadosAfetados'
            {
            match("EstadosAfetados"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:42:7: ( 'package' )
            // InternalLMJAQ.g:42:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:43:7: ( '.' )
            // InternalLMJAQ.g:43:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:44:7: ( '{' )
            // InternalLMJAQ.g:44:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:45:7: ( '}' )
            // InternalLMJAQ.g:45:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:46:7: ( ':' )
            // InternalLMJAQ.g:46:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_TEXT_CONTENT"
    public final void mRULE_TEXT_CONTENT() throws RecognitionException {
        try {
            int _type = RULE_TEXT_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2107:19: ( RULE_STRING )
            // InternalLMJAQ.g:2107:21: RULE_STRING
            {
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_CONTENT"

    // $ANTLR start "RULE_EFEITO_ACTION"
    public final void mRULE_EFEITO_ACTION() throws RecognitionException {
        try {
            int _type = RULE_EFEITO_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2109:20: ( ( '[Bloqueia]' | '[Adiciona]' ) )
            // InternalLMJAQ.g:2109:22: ( '[Bloqueia]' | '[Adiciona]' )
            {
            // InternalLMJAQ.g:2109:22: ( '[Bloqueia]' | '[Adiciona]' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='[') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='B') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='A') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLMJAQ.g:2109:23: '[Bloqueia]'
                    {
                    match("[Bloqueia]"); 


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:2109:36: '[Adiciona]'
                    {
                    match("[Adiciona]"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EFEITO_ACTION"

    // $ANTLR start "RULE_UI_TYPE"
    public final void mRULE_UI_TYPE() throws RecognitionException {
        try {
            int _type = RULE_UI_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2111:14: ( ( '[Botao]' | '[Imagem]' | '[Animacao]' | '[Texto]' ) )
            // InternalLMJAQ.g:2111:16: ( '[Botao]' | '[Imagem]' | '[Animacao]' | '[Texto]' )
            {
            // InternalLMJAQ.g:2111:16: ( '[Botao]' | '[Imagem]' | '[Animacao]' | '[Texto]' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='[') ) {
                switch ( input.LA(2) ) {
                case 'B':
                    {
                    alt2=1;
                    }
                    break;
                case 'I':
                    {
                    alt2=2;
                    }
                    break;
                case 'A':
                    {
                    alt2=3;
                    }
                    break;
                case 'T':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLMJAQ.g:2111:17: '[Botao]'
                    {
                    match("[Botao]"); 


                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:2111:27: '[Imagem]'
                    {
                    match("[Imagem]"); 


                    }
                    break;
                case 3 :
                    // InternalLMJAQ.g:2111:38: '[Animacao]'
                    {
                    match("[Animacao]"); 


                    }
                    break;
                case 4 :
                    // InternalLMJAQ.g:2111:51: '[Texto]'
                    {
                    match("[Texto]"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UI_TYPE"

    // $ANTLR start "RULE_SIMPLE_EVENT_TYPE"
    public final void mRULE_SIMPLE_EVENT_TYPE() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_EVENT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2113:24: ( '[proximaTela]' )
            // InternalLMJAQ.g:2113:26: '[proximaTela]'
            {
            match("[proximaTela]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_EVENT_TYPE"

    // $ANTLR start "RULE_UNITYINTDECIMAL"
    public final void mRULE_UNITYINTDECIMAL() throws RecognitionException {
        try {
            int _type = RULE_UNITYINTDECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2115:22: ( ( '0' .. '9' )+ '.' '0' .. '9' )
            // InternalLMJAQ.g:2115:24: ( '0' .. '9' )+ '.' '0' .. '9'
            {
            // InternalLMJAQ.g:2115:24: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLMJAQ.g:2115:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNITYINTDECIMAL"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2117:14: ( '1' .. '9' ( '0' .. '9' )+ )
            // InternalLMJAQ.g:2117:16: '1' .. '9' ( '0' .. '9' )+
            {
            matchRange('1','9'); 
            // InternalLMJAQ.g:2117:25: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLMJAQ.g:2117:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_PATH"
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2119:11: ( RULE_SLASH ( RULE_ID RULE_SLASH )* )
            // InternalLMJAQ.g:2119:13: RULE_SLASH ( RULE_ID RULE_SLASH )*
            {
            mRULE_SLASH(); 
            // InternalLMJAQ.g:2119:24: ( RULE_ID RULE_SLASH )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='^' && LA5_0<='_')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLMJAQ.g:2119:25: RULE_ID RULE_SLASH
            	    {
            	    mRULE_ID(); 
            	    mRULE_SLASH(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATH"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            // InternalLMJAQ.g:2121:21: ( ( '/' | '\\b' ) )
            // InternalLMJAQ.g:2121:23: ( '/' | '\\b' )
            {
            if ( input.LA(1)=='\b'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2123:12: ( 'false' )
            // InternalLMJAQ.g:2123:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2125:11: ( 'true' )
            // InternalLMJAQ.g:2125:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_EVENT_CODE"
    public final void mRULE_EVENT_CODE() throws RecognitionException {
        try {
            int _type = RULE_EVENT_CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2127:17: ( 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' ( '0' .. '9' )+ )
            // InternalLMJAQ.g:2127:19: 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' ( '0' .. '9' )+
            {
            matchRange('A','Z'); 
            matchRange('A','Z'); 
            matchRange('A','Z'); 
            // InternalLMJAQ.g:2127:46: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLMJAQ.g:2127:47: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EVENT_CODE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2129:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLMJAQ.g:2129:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLMJAQ.g:2129:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLMJAQ.g:2129:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLMJAQ.g:2129:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLMJAQ.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2131:10: ( ( '0' .. '9' )+ )
            // InternalLMJAQ.g:2131:12: ( '0' .. '9' )+
            {
            // InternalLMJAQ.g:2131:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLMJAQ.g:2131:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            // InternalLMJAQ.g:2133:22: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLMJAQ.g:2133:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLMJAQ.g:2133:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLMJAQ.g:2133:25: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLMJAQ.g:2133:29: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLMJAQ.g:2133:30: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLMJAQ.g:2133:37: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLMJAQ.g:2133:57: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLMJAQ.g:2133:62: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalLMJAQ.g:2133:63: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLMJAQ.g:2133:70: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2135:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLMJAQ.g:2135:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLMJAQ.g:2135:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLMJAQ.g:2135:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2137:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLMJAQ.g:2137:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLMJAQ.g:2137:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLMJAQ.g:2137:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalLMJAQ.g:2137:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLMJAQ.g:2137:41: ( '\\r' )? '\\n'
                    {
                    // InternalLMJAQ.g:2137:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLMJAQ.g:2137:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2139:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLMJAQ.g:2139:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLMJAQ.g:2139:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLMJAQ.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLMJAQ.g:2141:16: ( . )
            // InternalLMJAQ.g:2141:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLMJAQ.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_TEXT_CONTENT | RULE_EFEITO_ACTION | RULE_UI_TYPE | RULE_SIMPLE_EVENT_TYPE | RULE_UNITYINTDECIMAL | RULE_INTEGER | RULE_PATH | RULE_FALSE | RULE_TRUE | RULE_EVENT_CODE | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=52;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalLMJAQ.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalLMJAQ.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalLMJAQ.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalLMJAQ.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalLMJAQ.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalLMJAQ.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalLMJAQ.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalLMJAQ.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalLMJAQ.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalLMJAQ.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalLMJAQ.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalLMJAQ.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalLMJAQ.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalLMJAQ.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalLMJAQ.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalLMJAQ.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalLMJAQ.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalLMJAQ.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalLMJAQ.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalLMJAQ.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalLMJAQ.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalLMJAQ.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalLMJAQ.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalLMJAQ.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalLMJAQ.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalLMJAQ.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalLMJAQ.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalLMJAQ.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalLMJAQ.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalLMJAQ.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalLMJAQ.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalLMJAQ.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalLMJAQ.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalLMJAQ.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalLMJAQ.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalLMJAQ.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalLMJAQ.g:1:226: RULE_TEXT_CONTENT
                {
                mRULE_TEXT_CONTENT(); 

                }
                break;
            case 38 :
                // InternalLMJAQ.g:1:244: RULE_EFEITO_ACTION
                {
                mRULE_EFEITO_ACTION(); 

                }
                break;
            case 39 :
                // InternalLMJAQ.g:1:263: RULE_UI_TYPE
                {
                mRULE_UI_TYPE(); 

                }
                break;
            case 40 :
                // InternalLMJAQ.g:1:276: RULE_SIMPLE_EVENT_TYPE
                {
                mRULE_SIMPLE_EVENT_TYPE(); 

                }
                break;
            case 41 :
                // InternalLMJAQ.g:1:299: RULE_UNITYINTDECIMAL
                {
                mRULE_UNITYINTDECIMAL(); 

                }
                break;
            case 42 :
                // InternalLMJAQ.g:1:320: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 43 :
                // InternalLMJAQ.g:1:333: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 44 :
                // InternalLMJAQ.g:1:343: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 45 :
                // InternalLMJAQ.g:1:354: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 46 :
                // InternalLMJAQ.g:1:364: RULE_EVENT_CODE
                {
                mRULE_EVENT_CODE(); 

                }
                break;
            case 47 :
                // InternalLMJAQ.g:1:380: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalLMJAQ.g:1:388: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalLMJAQ.g:1:397: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalLMJAQ.g:1:413: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // InternalLMJAQ.g:1:429: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalLMJAQ.g:1:437: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\13\41\4\uffff\3\35\2\101\1\105\3\41\1\35\4\uffff\3\41\1\uffff\5\41\1\122\16\41\11\uffff\1\143\2\uffff\1\101\3\uffff\2\41\1\uffff\11\41\1\uffff\17\41\2\uffff\2\41\1\u0082\2\41\1\u0085\7\41\1\u008d\17\41\1\u009e\1\uffff\1\u009f\1\41\1\uffff\1\41\1\u00a2\5\41\1\uffff\17\41\1\u00b7\2\uffff\1\41\1\u00b9\1\uffff\4\41\1\u00be\4\41\1\u00c7\1\u00c8\11\41\1\uffff\1\u00d3\1\uffff\4\41\1\uffff\1\u00d8\7\41\2\uffff\4\41\1\u00e4\1\u00e5\2\41\1\u00e8\1\41\1\uffff\1\u00ea\1\u00eb\2\41\1\uffff\11\41\1\u00f7\1\41\2\uffff\1\u00f9\1\41\1\uffff\1\41\2\uffff\5\41\1\u0101\5\41\1\uffff\1\41\1\uffff\7\41\1\uffff\11\41\1\u0118\3\41\1\u011c\4\41\1\u0121\1\u0122\1\41\1\u0124\1\uffff\3\41\1\uffff\4\41\2\uffff\1\41\1\uffff\2\41\1\u012f\1\u0130\1\41\1\u0132\1\41\1\u0134\1\u0135\1\u0136\2\uffff\1\41\1\uffff\1\41\3\uffff\1\u0139\1\41\1\uffff\1\41\1\u013c\1\uffff";
    static final String DFA18_eofS =
        "\u013d\uffff";
    static final String DFA18_minS =
        "\1\0\12\101\1\141\4\uffff\2\0\1\101\2\56\1\52\1\141\1\162\2\101\4\uffff\1\154\1\155\1\101\1\uffff\1\152\1\151\1\103\1\151\1\164\1\60\1\141\1\145\1\163\1\157\1\145\1\165\1\164\1\145\2\155\1\145\1\163\1\162\1\143\5\uffff\1\154\1\144\2\uffff\1\56\2\uffff\1\56\3\uffff\1\154\1\165\1\uffff\1\141\1\164\1\141\1\60\1\145\1\166\1\154\1\155\1\145\1\uffff\1\147\1\155\1\151\1\170\2\156\1\141\1\151\1\160\1\146\1\151\1\163\1\160\1\155\1\153\2\uffff\1\163\1\145\1\60\1\157\1\156\1\60\1\164\1\157\1\151\1\141\2\162\1\145\1\60\1\143\1\151\1\164\1\143\1\144\1\164\1\157\1\145\1\151\1\156\1\164\1\157\2\141\1\145\1\60\1\uffff\1\60\1\150\1\uffff\1\157\1\60\2\143\1\141\1\156\1\155\1\uffff\1\141\1\155\1\157\1\151\2\157\1\162\1\151\1\165\1\147\1\150\1\141\1\163\1\164\1\147\1\60\2\uffff\1\157\1\60\1\uffff\2\141\1\104\1\141\1\60\2\157\1\103\1\141\2\60\1\164\1\155\1\144\1\107\2\157\1\164\1\157\1\145\1\uffff\1\60\1\uffff\1\162\1\157\1\141\1\164\1\uffff\1\60\1\105\1\157\1\151\1\144\1\151\1\156\1\101\2\uffff\1\141\1\145\1\157\1\145\2\60\1\141\1\121\1\60\1\141\1\uffff\2\60\1\124\1\151\1\uffff\1\163\2\155\1\157\1\156\1\151\1\146\1\155\1\156\1\60\1\162\2\uffff\1\60\1\165\1\uffff\1\106\2\uffff\1\145\1\166\1\164\2\160\1\60\1\141\1\143\2\145\1\164\1\uffff\1\141\1\uffff\1\151\1\157\1\154\2\141\2\154\1\uffff\1\154\1\151\1\164\1\156\1\157\1\154\1\172\1\156\1\141\1\60\1\144\2\145\1\60\2\141\1\164\1\104\2\60\1\164\1\60\1\uffff\1\157\1\170\1\163\1\uffff\1\154\1\144\1\157\1\141\2\uffff\1\145\1\uffff\1\163\1\157\2\60\1\157\1\60\1\124\3\60\2\uffff\1\163\1\uffff\1\145\3\uffff\1\60\1\154\1\uffff\1\141\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\145\1\142\2\164\1\162\1\166\1\157\1\165\1\145\1\157\1\141\4\uffff\2\uffff\1\160\2\71\1\57\1\141\1\162\1\132\1\172\4\uffff\1\170\1\155\1\132\1\uffff\1\152\1\151\1\103\1\151\1\164\1\172\1\141\1\145\1\163\1\157\1\145\1\165\1\164\1\145\1\156\1\155\1\145\1\163\1\162\1\143\5\uffff\1\157\1\156\2\uffff\1\71\2\uffff\1\71\3\uffff\1\154\1\165\1\uffff\1\141\1\164\1\141\1\71\1\145\1\166\1\154\1\155\1\165\1\uffff\1\147\1\155\1\151\1\170\2\156\1\141\1\151\1\160\1\164\1\151\1\163\1\160\1\155\1\153\2\uffff\1\163\1\145\1\172\1\157\1\156\1\172\1\164\1\157\1\151\1\141\2\162\1\145\1\172\1\143\1\151\1\164\1\143\1\144\1\164\1\162\1\145\1\151\1\156\1\164\1\157\2\141\1\145\1\172\1\uffff\1\172\1\150\1\uffff\1\157\1\172\2\143\1\141\1\156\1\155\1\uffff\1\141\1\155\1\157\1\151\2\157\1\162\1\151\1\165\1\147\1\150\1\141\1\163\1\164\1\147\1\172\2\uffff\1\157\1\172\1\uffff\2\141\1\104\1\141\1\172\2\157\1\123\1\141\2\172\1\164\1\155\1\144\1\107\2\157\1\164\1\157\1\145\1\uffff\1\172\1\uffff\1\162\1\157\1\141\1\164\1\uffff\1\172\1\105\1\157\1\151\1\144\1\151\1\156\1\101\2\uffff\1\141\1\145\1\157\1\145\2\172\1\141\1\121\1\172\1\141\1\uffff\2\172\1\124\1\151\1\uffff\1\163\2\155\1\157\1\156\1\151\1\146\1\155\1\156\1\172\1\162\2\uffff\1\172\1\165\1\uffff\1\106\2\uffff\1\145\1\166\1\164\2\160\1\172\1\141\1\143\2\145\1\164\1\uffff\1\141\1\uffff\1\151\1\157\1\154\2\141\2\154\1\uffff\1\154\1\151\1\164\1\156\1\157\1\154\1\172\1\156\1\141\1\172\1\144\2\145\1\172\2\141\1\164\1\104\2\172\1\164\1\172\1\uffff\1\157\1\170\1\163\1\uffff\1\154\1\144\1\157\1\141\2\uffff\1\145\1\uffff\1\163\1\157\2\172\1\157\1\172\1\124\3\172\2\uffff\1\163\1\uffff\1\145\3\uffff\1\172\1\154\1\uffff\1\141\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\14\uffff\1\41\1\42\1\43\1\44\12\uffff\1\57\1\53\1\63\1\64\3\uffff\1\57\24\uffff\1\41\1\42\1\43\1\44\1\45\2\uffff\1\47\1\50\1\uffff\1\51\1\60\1\uffff\1\61\1\62\1\53\2\uffff\1\63\11\uffff\1\4\17\uffff\1\46\1\52\36\uffff\1\1\2\uffff\1\56\7\uffff\1\35\20\uffff\1\55\1\14\2\uffff\1\3\24\uffff\1\54\1\uffff\1\2\4\uffff\1\12\10\uffff\1\31\1\36\12\uffff\1\16\4\uffff\1\5\13\uffff\1\20\1\24\2\uffff\1\40\1\uffff\1\10\1\13\13\uffff\1\15\1\uffff\1\27\7\uffff\1\26\26\uffff\1\25\3\uffff\1\32\4\uffff\1\21\1\30\1\uffff\1\23\12\uffff\1\7\1\33\1\uffff\1\11\1\uffff\1\17\1\34\1\6\2\uffff\1\37\2\uffff\1\22";
    static final String DFA18_specialS =
        "\1\2\17\uffff\1\0\1\1\u012b\uffff}>";
    static final String[] DFA18_transitionS = {
            "\10\35\1\33\2\34\2\35\1\34\22\35\1\34\1\35\1\20\4\35\1\21\6\35\1\14\1\25\1\24\11\23\1\17\6\35\1\3\1\30\1\7\1\30\1\6\1\12\2\30\1\4\5\30\1\2\1\5\1\10\1\11\1\30\1\1\6\30\1\22\2\35\1\31\1\32\1\35\5\32\1\26\11\32\1\13\3\32\1\27\6\32\1\15\1\35\1\16\uff82\35",
            "\32\40\6\uffff\1\37\3\uffff\1\36",
            "\32\40\7\uffff\1\42",
            "\32\40\21\uffff\1\46\1\uffff\1\45\1\44\4\uffff\1\43",
            "\24\40\1\47\5\40\22\uffff\1\50\6\uffff\1\51",
            "\32\40\24\uffff\1\52\2\uffff\1\53",
            "\32\40\13\uffff\1\57\7\uffff\1\55\4\uffff\1\56\2\uffff\1\54",
            "\32\40\6\uffff\1\61\15\uffff\1\60",
            "\32\40\32\uffff\1\62",
            "\32\40\12\uffff\1\63",
            "\32\40\24\uffff\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "\0\72",
            "\0\72",
            "\1\74\1\73\6\uffff\1\75\12\uffff\1\75\33\uffff\1\76",
            "\1\100\1\uffff\12\77",
            "\1\100\1\uffff\12\102",
            "\1\103\4\uffff\1\104",
            "\1\106",
            "\1\107",
            "\32\40",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\1\111\13\uffff\1\112",
            "\1\113",
            "\32\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\41\7\uffff\32\114\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "\1\142\2\uffff\1\75",
            "\1\142\11\uffff\1\75",
            "",
            "",
            "\1\100\1\uffff\12\77",
            "",
            "",
            "\1\100\1\uffff\12\102",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\17\uffff\1\156",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\15\uffff\1\171",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0083",
            "\1\u0084",
            "\12\151\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\2\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00b8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\17\uffff\1\u00c2",
            "\1\u00c3",
            "\12\41\7\uffff\5\41\1\u00c4\2\41\1\u00c5\21\41\4\uffff\1\41\1\uffff\22\41\1\u00c6\7\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\41\7\uffff\3\41\1\u00d2\26\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e6",
            "\1\u00e7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00e9",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f8",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0123",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0131",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0133",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0137",
            "",
            "\1\u0138",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u013a",
            "",
            "\1\u013b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_TEXT_CONTENT | RULE_EFEITO_ACTION | RULE_UI_TYPE | RULE_SIMPLE_EVENT_TYPE | RULE_UNITYINTDECIMAL | RULE_INTEGER | RULE_PATH | RULE_FALSE | RULE_TRUE | RULE_EVENT_CODE | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_16 = input.LA(1);

                        s = -1;
                        if ( ((LA18_16>='\u0000' && LA18_16<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_17 = input.LA(1);

                        s = -1;
                        if ( ((LA18_17>='\u0000' && LA18_17<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='T') ) {s = 1;}

                        else if ( (LA18_0=='O') ) {s = 2;}

                        else if ( (LA18_0=='A') ) {s = 3;}

                        else if ( (LA18_0=='I') ) {s = 4;}

                        else if ( (LA18_0=='P') ) {s = 5;}

                        else if ( (LA18_0=='E') ) {s = 6;}

                        else if ( (LA18_0=='C') ) {s = 7;}

                        else if ( (LA18_0=='Q') ) {s = 8;}

                        else if ( (LA18_0=='R') ) {s = 9;}

                        else if ( (LA18_0=='F') ) {s = 10;}

                        else if ( (LA18_0=='p') ) {s = 11;}

                        else if ( (LA18_0=='.') ) {s = 12;}

                        else if ( (LA18_0=='{') ) {s = 13;}

                        else if ( (LA18_0=='}') ) {s = 14;}

                        else if ( (LA18_0==':') ) {s = 15;}

                        else if ( (LA18_0=='\"') ) {s = 16;}

                        else if ( (LA18_0=='\'') ) {s = 17;}

                        else if ( (LA18_0=='[') ) {s = 18;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 19;}

                        else if ( (LA18_0=='0') ) {s = 20;}

                        else if ( (LA18_0=='/') ) {s = 21;}

                        else if ( (LA18_0=='f') ) {s = 22;}

                        else if ( (LA18_0=='t') ) {s = 23;}

                        else if ( (LA18_0=='B'||LA18_0=='D'||(LA18_0>='G' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='N')||LA18_0=='S'||(LA18_0>='U' && LA18_0<='Z')) ) {s = 24;}

                        else if ( (LA18_0=='^') ) {s = 25;}

                        else if ( (LA18_0=='_'||(LA18_0>='a' && LA18_0<='e')||(LA18_0>='g' && LA18_0<='o')||(LA18_0>='q' && LA18_0<='s')||(LA18_0>='u' && LA18_0<='z')) ) {s = 26;}

                        else if ( (LA18_0=='\b') ) {s = 27;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 28;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\u0007')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='-')||(LA18_0>=';' && LA18_0<='@')||(LA18_0>='\\' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}