parser grammar EelParser;

//@header {package org.eel.antlr;}

options {tokenVocab=EelLexer;}

prog:                       procedures EOF;
procedures:                 procecure+;
procecure:                  BEGINPROCEDURE ID LPAREN formalParameters? RPAREN lines ENDPROCEDURE;
formalParameters:           ID (COMMA ID)*;
lines:                      (declaration | statement | controlStructure)*;
declaration:                LET ID assignment?;
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
ifStructure:                ifCondition THEN lines elseIfStructure* elseStructure? ENDIF;
ifCondition:                IF LPAREN expression RPAREN;
elseIfStructure:            ELSE ifCondition lines;
elseStructure:              ELSE THEN lines;
iterativeControlStructure:  repeatStructure;
repeatStructure:            REPEATWHILE LPAREN expression RPAREN lines ENDREPEAT;
value:                      (staticValue
                            | userValue);
staticValue:                (INTLIT
                            | STRINGLIT
                            |function) method*;
function:                   FUNCTIONS LPAREN actualParameters RPAREN;
userValue:                  ID (LPAREN actualParameters? RPAREN)?;
actualParameters:           value (COMMA value)*;
method:                     METHODS (LPAREN actualParameters? RPAREN)?;