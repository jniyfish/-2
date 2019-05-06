// $ANTLR 3.5.2 Expr.g 2019-05-06 14:43:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "ASSIGN", "CBRACE", 
		"CPAR", "DIGIT", "DIV", "ELSE", "EQ", "GT", "GTEQ", "ID", "IF", "LETTER", 
		"LT", "LTEQ", "MINUS", "MUL", "NOT", "Number", "OBRACE", "OPAR", "OR", 
		"SCOL", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Expr.g"; }



	// $ANTLR start "eval"
	// Expr.g:41:1: eval : additionExp ;
	public final void eval() throws RecognitionException {
		try {
			// Expr.g:42:5: ( additionExp )
			// Expr.g:42:6: additionExp
			{
			pushFollow(FOLLOW_additionExp_in_eval233);
			additionExp();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eval"



	// $ANTLR start "additionExp"
	// Expr.g:44:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
	public final void additionExp() throws RecognitionException {
		try {
			// Expr.g:45:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
			// Expr.g:45:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
			{
			pushFollow(FOLLOW_multiplyExp_in_additionExp252);
			multiplyExp();
			state._fsp--;

			// Expr.g:46:10: ( '+' multiplyExp | '-' multiplyExp )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ADD) ) {
					alt1=1;
				}
				else if ( (LA1_0==MINUS) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// Expr.g:46:12: '+' multiplyExp
					{
					match(input,ADD,FOLLOW_ADD_in_additionExp266); 
					pushFollow(FOLLOW_multiplyExp_in_additionExp268);
					multiplyExp();
					state._fsp--;


					              System.out.println('+');
					            
					}
					break;
				case 2 :
					// Expr.g:50:12: '-' multiplyExp
					{
					match(input,MINUS,FOLLOW_MINUS_in_additionExp295); 
					pushFollow(FOLLOW_multiplyExp_in_additionExp297);
					multiplyExp();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "additionExp"



	// $ANTLR start "multiplyExp"
	// Expr.g:53:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
	public final void multiplyExp() throws RecognitionException {
		try {
			// Expr.g:54:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
			// Expr.g:54:10: atomExp ( '*' atomExp | '/' atomExp )*
			{
			pushFollow(FOLLOW_atomExp_in_multiplyExp329);
			atomExp();
			state._fsp--;

			// Expr.g:55:10: ( '*' atomExp | '/' atomExp )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MUL) ) {
					alt2=1;
				}
				else if ( (LA2_0==DIV) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// Expr.g:55:12: '*' atomExp
					{
					match(input,MUL,FOLLOW_MUL_in_multiplyExp342); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp344);
					atomExp();
					state._fsp--;

					}
					break;
				case 2 :
					// Expr.g:56:12: '/' atomExp
					{
					match(input,DIV,FOLLOW_DIV_in_multiplyExp358); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp360);
					atomExp();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiplyExp"



	// $ANTLR start "atomExp"
	// Expr.g:59:1: atomExp : ( Number | '(' additionExp ')' );
	public final void atomExp() throws RecognitionException {
		try {
			// Expr.g:60:5: ( Number | '(' additionExp ')' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Number) ) {
				alt3=1;
			}
			else if ( (LA3_0==OPAR) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Expr.g:60:10: Number
					{
					match(input,Number,FOLLOW_Number_in_atomExp392); 
					}
					break;
				case 2 :
					// Expr.g:61:15: '(' additionExp ')'
					{
					match(input,OPAR,FOLLOW_OPAR_in_atomExp408); 
					pushFollow(FOLLOW_additionExp_in_atomExp410);
					additionExp();
					state._fsp--;

					match(input,CPAR,FOLLOW_CPAR_in_atomExp412); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atomExp"



	// $ANTLR start "block"
	// Expr.g:70:1: block : ( stat )* ;
	public final void block() throws RecognitionException {
		try {
			// Expr.g:71:3: ( ( stat )* )
			// Expr.g:71:5: ( stat )*
			{
			// Expr.g:71:5: ( stat )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ID && LA4_0 <= IF)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expr.g:71:5: stat
					{
					pushFollow(FOLLOW_stat_in_block498);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "stat"
	// Expr.g:74:1: stat : ( assignment | if_stat );
	public final ExprParser.stat_return stat() throws RecognitionException {
		ExprParser.stat_return retval = new ExprParser.stat_return();
		retval.start = input.LT(1);

		try {
			// Expr.g:75:5: ( assignment | if_stat )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==IF) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Expr.g:75:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_stat516);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// Expr.g:76:6: if_stat
					{
					pushFollow(FOLLOW_if_stat_in_stat523);
					if_stat();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"



	// $ANTLR start "assignment"
	// Expr.g:79:1: assignment : ID ASSIGN Number SCOL ;
	public final void assignment() throws RecognitionException {
		try {
			// Expr.g:80:3: ( ID ASSIGN Number SCOL )
			// Expr.g:80:5: ID ASSIGN Number SCOL
			{
			match(input,ID,FOLLOW_ID_in_assignment540); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment542); 
			match(input,Number,FOLLOW_Number_in_assignment544); 
			match(input,SCOL,FOLLOW_SCOL_in_assignment546); 

			    System.out.println("assignment");
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "if_stat"
	// Expr.g:86:1: if_stat : IF condition_block . ;
	public final void if_stat() throws RecognitionException {
		try {
			// Expr.g:87:3: ( IF condition_block . )
			// Expr.g:87:4: IF condition_block .
			{
			match(input,IF,FOLLOW_IF_in_if_stat563); 
			pushFollow(FOLLOW_condition_block_in_if_stat565);
			condition_block();
			state._fsp--;

			matchAny(input); 

			    System.out.println("IF_CONDITION");
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stat"



	// $ANTLR start "condition_block"
	// Expr.g:92:1: condition_block : expr stat_block ;
	public final void condition_block() throws RecognitionException {
		try {
			// Expr.g:93:3: ( expr stat_block )
			// Expr.g:93:4: expr stat_block
			{
			pushFollow(FOLLOW_expr_in_condition_block582);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_stat_block_in_condition_block584);
			stat_block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition_block"



	// $ANTLR start "stat_block"
	// Expr.g:95:1: stat_block returns [String val] : ( OBRACE block CBRACE | stat );
	public final String stat_block() throws RecognitionException {
		String val = null;


		ParserRuleReturnScope stat1 =null;

		try {
			// Expr.g:96:3: ( OBRACE block CBRACE | stat )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==OBRACE) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= ID && LA6_0 <= IF)) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Expr.g:96:4: OBRACE block CBRACE
					{
					match(input,OBRACE,FOLLOW_OBRACE_in_stat_block599); 
					pushFollow(FOLLOW_block_in_stat_block601);
					block();
					state._fsp--;

					match(input,CBRACE,FOLLOW_CBRACE_in_stat_block603); 
					}
					break;
				case 2 :
					// Expr.g:97:4: stat
					{
					pushFollow(FOLLOW_stat_in_stat_block608);
					stat1=stat();
					state._fsp--;


					    val = (stat1!=null?input.toString(stat1.start,stat1.stop):null);
					    System.out.println(val);
					  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "stat_block"



	// $ANTLR start "expr"
	// Expr.g:103:1: expr : ( Number | AND expr expr | NOT expr | MINUS expr | GTEQ expr expr | atom );
	public final void expr() throws RecognitionException {
		try {
			// Expr.g:103:5: ( Number | AND expr expr | NOT expr | MINUS expr | GTEQ expr expr | atom )
			int alt7=6;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt7=1;
				}
				break;
			case AND:
				{
				alt7=2;
				}
				break;
			case NOT:
				{
				alt7=3;
				}
				break;
			case MINUS:
				{
				alt7=4;
				}
				break;
			case GTEQ:
				{
				alt7=5;
				}
				break;
			case ID:
			case OPAR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Expr.g:103:6: Number
					{
					match(input,Number,FOLLOW_Number_in_expr622); 
					}
					break;
				case 2 :
					// Expr.g:104:4: AND expr expr
					{
					match(input,AND,FOLLOW_AND_in_expr627); 
					pushFollow(FOLLOW_expr_in_expr629);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr631);
					expr();
					state._fsp--;

					}
					break;
				case 3 :
					// Expr.g:105:4: NOT expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr637); 
					pushFollow(FOLLOW_expr_in_expr639);
					expr();
					state._fsp--;

					}
					break;
				case 4 :
					// Expr.g:106:4: MINUS expr
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr644); 
					pushFollow(FOLLOW_expr_in_expr646);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					// Expr.g:107:4: GTEQ expr expr
					{
					match(input,GTEQ,FOLLOW_GTEQ_in_expr653); 
					pushFollow(FOLLOW_expr_in_expr655);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr657);
					expr();
					state._fsp--;

					}
					break;
				case 6 :
					// Expr.g:108:4: atom
					{
					pushFollow(FOLLOW_atom_in_expr662);
					atom();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "atom"
	// Expr.g:110:1: atom : ( OPAR expr CPAR | ID );
	public final void atom() throws RecognitionException {
		try {
			// Expr.g:111:3: ( OPAR expr CPAR | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==OPAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Expr.g:111:4: OPAR expr CPAR
					{
					match(input,OPAR,FOLLOW_OPAR_in_atom673); 
					pushFollow(FOLLOW_expr_in_atom675);
					expr();
					state._fsp--;

					match(input,CPAR,FOLLOW_CPAR_in_atom677); 
					}
					break;
				case 2 :
					// Expr.g:112:4: ID
					{
					match(input,ID,FOLLOW_ID_in_atom682); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_additionExp_in_eval233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp252 = new BitSet(new long[]{0x0000000000100012L});
	public static final BitSet FOLLOW_ADD_in_additionExp266 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp268 = new BitSet(new long[]{0x0000000000100012L});
	public static final BitSet FOLLOW_MINUS_in_additionExp295 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp297 = new BitSet(new long[]{0x0000000000100012L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp329 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_MUL_in_multiplyExp342 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp344 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_DIV_in_multiplyExp358 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp360 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_Number_in_atomExp392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPAR_in_atomExp408 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_additionExp_in_atomExp410 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPAR_in_atomExp412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block498 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_assignment_in_stat516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stat_in_stat523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment540 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment542 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Number_in_assignment544 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SCOL_in_assignment546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stat563 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_condition_block_in_if_stat565 = new BitSet(new long[]{0x000000001FFFFFF0L});
	public static final BitSet FOLLOW_expr_in_condition_block582 = new BitSet(new long[]{0x0000000001018000L});
	public static final BitSet FOLLOW_stat_block_in_condition_block584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBRACE_in_stat_block599 = new BitSet(new long[]{0x0000000000018080L});
	public static final BitSet FOLLOW_block_in_stat_block601 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CBRACE_in_stat_block603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_block608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_expr622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_expr627 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr629 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr637 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr644 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GTEQ_in_expr653 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr655 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_expr657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_expr662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPAR_in_atom673 = new BitSet(new long[]{0x0000000002D0C020L});
	public static final BitSet FOLLOW_expr_in_atom675 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CPAR_in_atom677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom682 = new BitSet(new long[]{0x0000000000000002L});
}
