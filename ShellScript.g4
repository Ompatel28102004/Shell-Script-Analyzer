grammar ShellScript;

script: statement* EOF;

statement
    : ifStatement
    | forStatement
    | whileStatement
    | echoStatement
    | assignment
    ;

ifStatement
    : 'if' condition 'then' statement* ('else' statement*)? 'fi'
    ;

forStatement
    : 'for' ID 'in' valueList 'do' statement* 'done'
    ;

whileStatement
    : 'while' condition 'do' statement* 'done'
    ;

echoStatement
    : 'echo' (STRING | variable)+
    ;

assignment
    : ID '=' (value | arithmeticExpr | variable)
    ;

condition
    : '[' expr comparator expr ']'
    ;

expr
    : variable
    | NUMBER
    ;

comparator
    : '-lt'
    | '-le'
    | '-eq'
    | '-ne'
    | '-gt'
    | '-ge'
    ;

valueList
    : (ID | STRING)+
    ;

value
    : STRING
    | NUMBER
    | ID
    ;

arithmeticExpr
    : '$' '(' '(' arithmeticOperation ')' ')'
    ;

arithmeticOperation
    : arithmeticTerm (('+' | '-') arithmeticTerm)*
    ;

arithmeticTerm
    : arithmeticFactor (('*' | '/') arithmeticFactor)*
    ;

arithmeticFactor
    : NUMBER
    | variable
    | ID            
    | '(' arithmeticOperation ')'
    ;


variable
    : '$' ID
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
STRING: '"' (~["\r\n])* '"';

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
