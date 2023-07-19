grammar APLGrammar;

program
  : PROGRAM ident
  (LOAD ident)?
  CBASE LBRACE capabilities? RBRACE
  BBASE LBRACE beliefs? RBRACE
  GBASE LBRACE goals? RBRACE
  PBASE LBRACE plans? RBRACE
  PGRULE LBRACE p_rules? RBRACE
  PRRULE LBRACE r_rules? RBRACE
  ;
capabilities
  : capability (COMMA capability)*
  ;
capability
  : LBRACE query RBRACE aatom LBRACE literals RBRACE
  ;
beliefs
  : belief*
  ;
belief
  : atom DOT | atom BARROW literals DOT
  ;
goals
  : goal (COMMA goal)*
  ;
goal
  : atom (AND atom)*
  ;
plans
  : LBRACE plan RBRACE (LBRACE plan RBRACE)*
  ;
plan
  : basicaction (plant)*
  ;
basicaction
  : aatom                                           #aatomAction
  | SEND LPAREN iv COMMA iv COMMA atom RPAREN       #sendAction
  | JAVA LPAREN ident COMMA atom COMMA var RPAREN   #javaAction
  | wff QUESTION                                    #wffAction
  | atom                                            #atomAction
  | IF wff THEN LBRACE plan SEMICOLON RBRACE (ELSE LBRACE plan SEMICOLON RBRACE)?                   #ifAction
  | WHILE query DO LBRACE plan SEMICOLON RBRACE                             #whileAction
  ;
plant
  : SEMICOLON plan;
p_rules
  : p_rule (COMMA p_rule)*
  ;
p_rule
  : atom PARROW query ORS LBRACE plan RBRACE
  | PARROW query ORS LBRACE plan RBRACE
  ;
r_rules
  : r_rule (COMMA r_rule)*
  ;
r_rule
  : plan PARROW query ORS LBRACE plan RBRACE
  ;
literals
  : literal ( COMMA literal)*
  ;
literal
  : atom
  | NOT atom
  ;
wff
  : literal                                 #literalWff
  | wff AND wff                             #andWff
  | wff OR wff                              #orWff
  ;
query
  : wff
  | TRUE
  ;
iv
  : ident | pvarval
  ;
ident
  : IDENT
  ;
var
  : ALPHA (ALPHANUMERIC)*
  ;
atom
  : pname LPAREN argument? (COMMA argument)* RPAREN?
  ;
argument
  : pvarval
  | atom;
aatom
  : pvar LPAREN argument? (COMMA argument)* RPAREN
  ;
pvarval
  : pvar | pval;
pvar
  : CAPVAR
  ;
pname
  : NAMEVAR
  ;
pval
  : pname | (DIGIT)+
  ;
// lexer rules --------

// keywords
PROGRAM : 'PROGRAM' ;
LOAD : 'LOAD' ;
CBASE : 'CAPABILITIES' ;
BBASE : 'BELIEFBASE' ;
GBASE : 'GOALBASE' ;
PBASE : 'PLANBASE' ;
PGRULE : 'PG-RULES' ;
PRRULE : 'PR-RULES' ;
QUOTE: '"';
SEMI : ':';
LBRACE : '{';
RBRACE : '}';
DOT : '.';
BARROW : ':-';
COMMA : ',';
AND : 'AND';
OR : 'OR';
LPAREN : '(';
RPAREN : ')';
SEND : 'SEND';
JAVA : 'JAVA';
QUESTION : '?';
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
WHILE : 'WHILE';
DO : 'DO';
SEMICOLON : ';';
PARROW : '<-';
ORS : '|';
NOT : 'NOT';
TRUE : 'TRUE';
IDENT : QUOTE ALPHA (ALPHANUMERIC)* QUOTE;
CAPVAR: [A-Z] ([0-9a-zA-Z_])*;
NAMEVAR: [a-z] ([0-9a-zA-Z_])*;
fragment ALPHANUMERIC: ALPHA | DIGIT | '.' ;
ALPHA: '_' | [a-z] | [A-Z];
DIGIT: [0-9] ;
WS : [ \t\r\n]+ -> skip ;
