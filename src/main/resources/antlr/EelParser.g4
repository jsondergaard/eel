parser grammar EelParser;
options {tokenVocab=EelLexer;}

procedures:                 procedure+ EOF;
procedure:                  BEGINPROCEDURE ID LPAREN parameters? RPAREN lines=line+ ENDPROCEDURE;
parameters:                 ID (COMMA ID)*;
line:                       statement;
statement:                  varDeclaration # varDeclarationStatement
                            | assignment   # assignmentStatement
                            | print        # printStatement
                            | ifStruct     # ifStructure
                            | return       # returnStatement;
varDeclaration:             LET assignment;
assignment:                 ID ASSIGN expression;
return:                     RETURN? expression;
expression:                 left=expression operator=(DIVISION|ASTERISK) right=expression       # binaryOperation
                            | left=expression operator=(PLUS|MINUS) right=expression            # binaryOperation
                            | left=expression operator=(GREATERTHAN|LESSTHAN) right=expression  # binaryOperation
                            | LPAREN expression RPAREN                                          # parenExpression
                            | ID                                                                # varReference
                            | MINUS expression                                                  # minusExpression
                            | INTLIT                                                            # intLiteral
                            | DECLIT                                                            # decimalLiteral
                            | STRINGLIT                                                         # stringLiteral;
ifStruct:                   IF LPAREN expression RPAREN THEN statement elseStructure? ENDIF;
elseStructure:              ELSE THEN statement;
function:                   FUNCTIONS LPAREN ID RPAREN;
print:                      PRINT LPAREN expression RPAREN;