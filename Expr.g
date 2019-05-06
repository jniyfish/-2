grammar Expr;

options{
  language = Java;
}

IF :'if';
fragment ELSE : 'else';
fragment LETTER : ('a'..'z' | 'A'..'Z' | '_');
fragment DIGIT : '0'..'9';
ID returns [String idname]
: (LETTER)(LETTER | DIGIT)* 
  {
    System.out.println(ID);
  };




SCOL : ';';

//------------------------
ASSIGN : '=';
EQ : '==';
GT : '>';
LT : '<';
OR : '||';
AND : '&&';
GTEQ : '>=';
LTEQ : '<=';
ADD :'+';
MINUS: '-';
MUL : '*';
DIV : '/';
NOT : '!=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
//-------------------------
eval
    :additionExp
    ;
additionExp
    :    multiplyExp 
         ( '+' multiplyExp 
           {
              System.out.println('+');
            }
         | '-' multiplyExp
         )* 
    ;
multiplyExp
    :    atomExp
         ( '*' atomExp 
         | '/' atomExp
         )* 
    ;
atomExp
    :    Number
         |    '(' additionExp ')'
    ;
Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;
WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;
//-----------------------------------
block
  : stat*
  ;
  
stat
    : assignment
    |if_stat
    ;

assignment  
  : ID ASSIGN Number SCOL
  {
    System.out.println("assignment");
  }
  ;

if_stat 
  :IF condition_block.
  {
    System.out.println("IF_CONDITION");
  }
  ;
condition_block 
  :expr stat_block
  ;
stat_block returns [String val]
  :OBRACE block CBRACE
  |stat
    {
    val = $stat.text;
    System.out.println(val);
  }
  ;
expr:Number
  |AND expr expr 
  |NOT expr
  |MINUS expr  
  |GTEQ expr expr
  |atom
  ;
atom
  :OPAR expr CPAR
  |ID
  ;


