lexer grammar EelLexer;

//@lexer::header {package org.eel.antlr;}

// Whitespace
WS:         [ \t\r\n]+ -> skip;

// Keywords
LET:            'let';
BEGINPROCEDURE: 'procedure';
ENDPROCEDURE:   'endProcedure';
RETURN:         'return';
REPEATWHILE:    'repeat while';
ENDREPEAT:      'endRepeat';
IF:             'if';
ENDIF:          'endIf';
THEN:           'then';
ELSE:           'else';

// Literals
INTLIT:         [0-9]+;
STRINGLIT:      '"' ~[\r\n"]* '"';

// Operators
PLUS:       '+';
MINUS:      '-';
ASTERISK:   '*';
DIVISION:   '/';
ASSIGN:     '=';
LPAREN:     '(';
RPAREN:     ')';
COMMA:      ',';

// Identifiers
FUNCTIONS:          'SUM' | 'AVERAGE' | 'print';
METHODS:            '.'('format' | 'count');
BOOLEANOPERATOR:    [<>]'='?|'=='|'!=';
ID:                 [a-zA-Z][a-zA-Z0-9]*;