grammar ShellScript;

// Parser rules
program: statement* EOF;

statement
    : simpleCommand
    | pipeline
    | compoundStatement
    | assignment
    | arrayAssignment
    | SEMI // Allow empty statements
    ;

simpleCommand
    : WORD (WORD | STRING | variable | NUMBER)* (redirection)* // e.g., ls -l, echo "hello"
    ;

pipeline
    : simpleCommand (PIPE simpleCommand)+ // e.g., ls | grep txt
    ;

compoundStatement
    : ifStatement
    | whileStatement
    | forStatement
    | functionDefinition
    ;

ifStatement
    : IF testClause THEN statement* (ELIF testClause THEN statement*)* (ELSE statement*)? FI
    ; // e.g., if [ $x -eq 0 ]; then echo "Zero"; fi

whileStatement
    : WHILE testClause DO statement* DONE // e.g., while [ $x -lt 5 ]; do echo $x; done
    ;

forStatement
    : FOR WORD IN (STRING | variable | WORD | NUMBER)* (SEMI)? DO statement* DONE
    ; // e.g., for fruit in "${fruits[@]}"; do echo $fruit; done

functionDefinition
    : FUNCTION WORD LPAREN RPAREN LBRACE statement* RBRACE // e.g., function myfunc() { echo "Hello"; }
    ;

testClause
    : LBRACK expression RBRACK // e.g., [ $x -eq 0 ]
    ;

expression
    : (WORD | STRING | variable | NUMBER) (OPERATOR | EQUALS) (WORD | STRING | variable | NUMBER)?
    ; // e.g., $x -eq 0, x = y

assignment
    : WORD EQUALS (WORD | STRING | variable | NUMBER | arithmeticExpansion)
    ; // e.g., x=5, x=$((x + 1))

arrayAssignment
    : WORD EQUALS LPAREN (STRING)* RPAREN // e.g., fruits=("apple" "banana" "cherry")
    ;

variable
    : DOLLAR (WORD | LBRACE WORD (ARRAY_INDEX)? RBRACE) // e.g., $x, ${x}, ${fruits[@]}
    ;

arithmeticExpansion
    : DOLLAR LPAREN LPAREN arithExpr RPAREN RPAREN // e.g., $((x + 1))
    ;

arithExpr
    : (WORD | NUMBER) (ARITH_OP (WORD | NUMBER))* // e.g., x + 1
    ;

redirection
    : (GREATER | LESS | GREATER_GREATER) (WORD | STRING) // e.g., > file.txt, >> log.txt
    ;

// Lexer rules
IF: 'if';
THEN: 'then';
ELSE: 'else';
ELIF: 'elif';
FI: 'fi';
WHILE: 'while';
DO: 'do';
DONE: 'done';
FOR: 'for';
IN: 'in';
FUNCTION: 'function';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMI: ';';
PIPE: '|';
GREATER: '>';
LESS: '<';
GREATER_GREATER: '>>';
EQUALS: '=';
DOLLAR: '$';
ARRAY_INDEX: '[@]' | '[*]';

// Arithmetic operators
ARITH_OP: '+' | '-' | '*' | '/' | '%';

// Operators for test expressions (excluding '=' to avoid overlap with EQUALS)
OPERATOR: '-eq' | '-ne' | '-lt' | '-gt' | '-le' | '-ge' | '!=' | '-z' | '-n';

// Words (commands, arguments, identifiers)
WORD: [a-zA-Z_][a-zA-Z0-9_]*;

// Numbers (integers)
NUMBER: [0-9]+;

// Strings (quoted or unquoted)
STRING: '"' ~["\r\n]* '"' | '\'' ~['\r\n]* '\'';

// Whitespace (ignored)
WS: [ \t\r\n]+ -> skip;

// Comments (ignored)
COMMENT: '#' ~[\r\n]* -> skip;