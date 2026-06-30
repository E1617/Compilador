parser grammar Parser1;

options {
    tokenVocab = Lexer1;
}
//INICIO DEL PROGRAMA
program : (declaracion | sentencia | tipoFuncion)+ EOF ;
//DECLARACIONES (lista de variables y asignaciones)
declaracion : TIPO (listaId SEMICOLON | asignacion);
//DECLARACIÓN DE FUNCIONES
tipoFuncion : TIPO funcion;
//ADMINITR LISTAS DE VARIABLES CON EL MISMO TIPO DE DATO
listaId : ID (COMMA ID)* ;
//SENTENCIA QUE PUEDE CONTENDER UNA ASIGNACIÓN O UN BLOQUE IF
sentencia: asignacion | ifStmt ;
//ASIGANACION DE VALORES (valor literal u operación)
asignacion : ID ASSIGN expr SEMICOLON ;
//ESTRUCTURA DE UNA FUNCION
funcion : FUNC ID LPAREN parametros? RPAREN LBRACE bloque RETURN expr SEMICOLON RBRACE;
//LLAMADA DE UNA FUNCION
llamadaFuncion : ID LPAREN argumentos? RPAREN SEMICOLON;
//DEFINIR PAREMETROS
parametros : TIPO ID (COMMA TIPO ID)*;
//DEFINIR ARGUMENTOS
argumentos : expr (COMMA expr)*;
//ESTRUCTURA DE IF
ifStmt: IF LPAREN condicion RPAREN LBRACE bloque (RETURN expr SEMICOLON)? RBRACE (ELSE LBRACE bloque RBRACE (RETURN expr SEMICOLON)?)? ;
//ESTRUCTURA DE UN BLOQUE
bloque: (sentencia | declaracion)*;
//ESTRUTURA DE UNA CONDICIONAL
condicion: expr COMP_OP expr;
//ESTRUCTURA DE UNA EXPRESION
expr: term ( ( PLUS | MINUS ) term )* ;
//ESTRUCTURA DE UN TERMINO
term: factor ( ( MULT | DIV ) factor )* ;
//ESTRCUTRA DE UN VALOR LITERAL
factor: NUM | ID | FLOATNUM | LPAREN expr RPAREN ;