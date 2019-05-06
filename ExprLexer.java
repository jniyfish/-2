// $ANTLR 3.5.2 Expr.g 2019-05-06 14:43:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int ASSIGN=6;
	public static final int CBRACE=7;
	public static final int CPAR=8;
	public static final int DIGIT=9;
	public static final int DIV=10;
	public static final int ELSE=11;
	public static final int EQ=12;
	public static final int GT=13;
	public static final int GTEQ=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int LETTER=17;
	public static final int LT=18;
	public static final int LTEQ=19;
	public static final int MINUS=20;
	public static final int MUL=21;
	public static final int NOT=22;
	public static final int Number=23;
	public static final int OBRACE=24;
	public static final int OPAR=25;
	public static final int OR=26;
	public static final int SCOL=27;
	public static final int WS=28;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expr.g"; }

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:7:4: ( 'if' )
			// Expr.g:7:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			// Expr.g:8:15: ( 'else' )
			// Expr.g:8:17: 'else'
			{
			match("else"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Expr.g:9:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
			// Expr.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Expr.g:10:16: ( '0' .. '9' )
			// Expr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		String idname = null;


		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:12:3: ( ( LETTER ) ( LETTER | DIGIT )* )
			// Expr.g:12:3: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expr.g:12:11: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}


			    System.out.println(ID);
			  
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "SCOL"
	public final void mSCOL() throws RecognitionException {
		try {
			int _type = SCOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:20:6: ( ';' )
			// Expr.g:20:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCOL"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:23:8: ( '=' )
			// Expr.g:23:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:24:4: ( '==' )
			// Expr.g:24:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:25:4: ( '>' )
			// Expr.g:25:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:26:4: ( '<' )
			// Expr.g:26:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:27:4: ( '||' )
			// Expr.g:27:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:28:5: ( '&&' )
			// Expr.g:28:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:29:6: ( '>=' )
			// Expr.g:29:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:30:6: ( '<=' )
			// Expr.g:30:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:31:5: ( '+' )
			// Expr.g:31:6: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:32:6: ( '-' )
			// Expr.g:32:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:33:5: ( '*' )
			// Expr.g:33:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:34:5: ( '/' )
			// Expr.g:34:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:35:5: ( '!=' )
			// Expr.g:35:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OPAR"
	public final void mOPAR() throws RecognitionException {
		try {
			int _type = OPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:36:6: ( '(' )
			// Expr.g:36:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPAR"

	// $ANTLR start "CPAR"
	public final void mCPAR() throws RecognitionException {
		try {
			int _type = CPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:37:6: ( ')' )
			// Expr.g:37:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPAR"

	// $ANTLR start "OBRACE"
	public final void mOBRACE() throws RecognitionException {
		try {
			int _type = OBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:38:8: ( '{' )
			// Expr.g:38:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBRACE"

	// $ANTLR start "CBRACE"
	public final void mCBRACE() throws RecognitionException {
		try {
			int _type = CBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:39:8: ( '}' )
			// Expr.g:39:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBRACE"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:64:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// Expr.g:64:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// Expr.g:64:10: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// Expr.g:64:22: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Expr.g:64:23: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// Expr.g:64:27: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Expr.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:67:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// Expr.g:67:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Expr.g:1:8: ( IF | ID | SCOL | ASSIGN | EQ | GT | LT | OR | AND | GTEQ | LTEQ | ADD | MINUS | MUL | DIV | NOT | OPAR | CPAR | OBRACE | CBRACE | Number | WS )
		int alt5=22;
		switch ( input.LA(1) ) {
		case 'i':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='f') ) {
				int LA5_20 = input.LA(3);
				if ( ((LA5_20 >= '0' && LA5_20 <= '9')||(LA5_20 >= 'A' && LA5_20 <= 'Z')||LA5_20=='_'||(LA5_20 >= 'a' && LA5_20 <= 'z')) ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}

			else {
				alt5=2;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=2;
			}
			break;
		case ';':
			{
			alt5=3;
			}
			break;
		case '=':
			{
			int LA5_4 = input.LA(2);
			if ( (LA5_4=='=') ) {
				alt5=5;
			}

			else {
				alt5=4;
			}

			}
			break;
		case '>':
			{
			int LA5_5 = input.LA(2);
			if ( (LA5_5=='=') ) {
				alt5=10;
			}

			else {
				alt5=6;
			}

			}
			break;
		case '<':
			{
			int LA5_6 = input.LA(2);
			if ( (LA5_6=='=') ) {
				alt5=11;
			}

			else {
				alt5=7;
			}

			}
			break;
		case '|':
			{
			alt5=8;
			}
			break;
		case '&':
			{
			alt5=9;
			}
			break;
		case '+':
			{
			alt5=12;
			}
			break;
		case '-':
			{
			alt5=13;
			}
			break;
		case '*':
			{
			alt5=14;
			}
			break;
		case '/':
			{
			alt5=15;
			}
			break;
		case '!':
			{
			alt5=16;
			}
			break;
		case '(':
			{
			alt5=17;
			}
			break;
		case ')':
			{
			alt5=18;
			}
			break;
		case '{':
			{
			alt5=19;
			}
			break;
		case '}':
			{
			alt5=20;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=21;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=22;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// Expr.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// Expr.g:1:13: ID
				{
				mID(); 

				}
				break;
			case 3 :
				// Expr.g:1:16: SCOL
				{
				mSCOL(); 

				}
				break;
			case 4 :
				// Expr.g:1:21: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 5 :
				// Expr.g:1:28: EQ
				{
				mEQ(); 

				}
				break;
			case 6 :
				// Expr.g:1:31: GT
				{
				mGT(); 

				}
				break;
			case 7 :
				// Expr.g:1:34: LT
				{
				mLT(); 

				}
				break;
			case 8 :
				// Expr.g:1:37: OR
				{
				mOR(); 

				}
				break;
			case 9 :
				// Expr.g:1:40: AND
				{
				mAND(); 

				}
				break;
			case 10 :
				// Expr.g:1:44: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 11 :
				// Expr.g:1:49: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// Expr.g:1:54: ADD
				{
				mADD(); 

				}
				break;
			case 13 :
				// Expr.g:1:58: MINUS
				{
				mMINUS(); 

				}
				break;
			case 14 :
				// Expr.g:1:64: MUL
				{
				mMUL(); 

				}
				break;
			case 15 :
				// Expr.g:1:68: DIV
				{
				mDIV(); 

				}
				break;
			case 16 :
				// Expr.g:1:72: NOT
				{
				mNOT(); 

				}
				break;
			case 17 :
				// Expr.g:1:76: OPAR
				{
				mOPAR(); 

				}
				break;
			case 18 :
				// Expr.g:1:81: CPAR
				{
				mCPAR(); 

				}
				break;
			case 19 :
				// Expr.g:1:86: OBRACE
				{
				mOBRACE(); 

				}
				break;
			case 20 :
				// Expr.g:1:93: CBRACE
				{
				mCBRACE(); 

				}
				break;
			case 21 :
				// Expr.g:1:100: Number
				{
				mNumber(); 

				}
				break;
			case 22 :
				// Expr.g:1:107: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
