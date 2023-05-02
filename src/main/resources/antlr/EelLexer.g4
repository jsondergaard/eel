lexer grammar EelLexer;

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
PRINT:          'print';

// Literals
INTLIT:         [0-9]+;
STRINGLIT:      '"' ~[\r\n"]* '"';
DECLIT:         '0'|[1-9][0-9]* '.' [0-9]+ ;

// Operators
PLUS:         '+';
MINUS:        '-';
ASTERISK:     '*';
DIVISION:     '/';
ASSIGN:       '=';
LPAREN:       '(';
RPAREN:       ')';
COMMA:        ',';
GREATERTHAN:  '>';
LESSTHAN:     '<';

// Identifiers
FUNCTIONS:          'SUM' | 'AVERAGE' | PRINT;
METHODS:            '.'('format' | 'count');
BOOLEANOPERATOR:    [<>]'='?|'=='|'!=';

// Whitespace
WS:             [ \t\r\n]+ -> skip;
ID:             [a-zA-Z][a-zA-Z0-9]*;