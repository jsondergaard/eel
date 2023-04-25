parser grammar EelParser;

//@header {package org.eel.antlr;}

options {tokenVocab=EelLexer;}

program:                    procedures=procedure+ EOF;
procedure:                  BEGINPROCEDURE ID LPAREN formalParameters? RPAREN lines=line+ ENDPROCEDURE;
formalParameters:           ID (COMMA ID)*;
line:                       (declaration | statement | controlStructure);
declaration:                LET ID assignment? #varDelaration;
assignment:                 ASSIGN expression;
statement:                  RETURN? expression;
expression:                 userValue (assignment | (operator value)*)
                            | staticValue (operator value)* ;
operator:                   (binaryOperator
                            | boolOperator);
binaryOperator:             (PLUS
                            |MINUS
                            |ASTERISK
                            |DIVISION);
boolOperator:               BOOLEANOPERATOR;
controlStructure:           (iterativeControlStructure
                            | selectiveControlStructure);
selectiveControlStructure:  ifStructure;
ifStructure:                ifCondition THEN line elseIfStructure* elseStructure? ENDIF;
ifCondition:                IF LPAREN expression RPAREN;
elseIfStructure:            ELSE ifCondition line;
elseStructure:              ELSE THEN line;
iterativeControlStructure:  repeatStructure;
repeatStructure:            REPEATWHILE LPAREN expression RPAREN line ENDREPEAT;
value:                      (staticValue
                            | userValue);
staticValue:                (INTLIT
                            | STRINGLIT
                            |function) method*;
function:                   FUNCTIONS LPAREN actualParameters RPAREN;
userValue:                  ID (LPAREN actualParameters? RPAREN)?;
actualParameters:           value (COMMA value)*;
method:                     METHODS (LPAREN actualParameters? RPAREN)?;