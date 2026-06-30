lexer grammar Lexer1;

// Palabras clave
IF    : 'if';
ELSE  : 'else';
WHEN  : 'when';
FOR   : 'for';
THEN  : 'then';
RETURN : 'return';
FUNC : 'function';
// Tipos
TIPO  : 'int' | 'float' | 'char' | 'string';
// Símbolos y Delimitadores (Nombres específicos para el Parser)
LBRACE    : '{';
RBRACE    : '}';
LPAREN    : '(';
RPAREN    : ')';
SEMICOLON : ';';
COMMA     : ',';
// Operadores
PLUS      : '+';
MINUS     : '-';
MULT      : '*';
DIV       : '/';
ASSIGN    : '=';
COMP_OP   : '==' | '<' | '>';
// Identificadores y Números
ID   : [a-zA-Z_][a-zA-Z0-9_]*;
NUM  : [0-9]+;
FLOATNUM : [0-9]+ '.' [0-9]+ ;
WS   : [ \t\r\n]+ -> skip;