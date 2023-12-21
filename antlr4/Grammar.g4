grammar Grammar;

start_ : statement* EOF;


// STATEMENTS

statement : single_statement ';'
          | block_statement 'END'
          ;

block_statement : if_statement
                | loop_statement
                ;

single_statement: declaration
                | pass_statement
                | assign
                ;

loop_statement : while_statement
               | for_statement
               ;

for_statement : for_range_statement
              | for_each_statement
              ;

if_statement : 'IF' condition ':' statement+ ('ELIF' condition ':' statement+)* ('ELSE' ':' statement+ )?;

while_statement : 'WHILE' condition ':' statement+;

for_range_statement : 'FOR' Id 'IN RANGE(' expr ',' expr (',' expr)?')' ':' statement+;

for_each_statement : 'FOR' Id 'IN' Id ':' statement+;


pass_statement : 'PASS';
assignment_statement : data_types Id '=' expr
                     ;

expr : Id
     | expr arith_opr expr
     | '(' expr ')'
     | constant
     ;

declare : data_types Id
        ;

arith_opr : add
          | sub
          | mul
          | div
          | mod
          | inc
          | dec
          ;
          
arith_assign_opr : add_assign
                | sub_assign
                | mul_assign
                | div_assign
                | mod_assign
                | '='
                ;

assign : Id arith_assign_opr expr;

comparator : equal
           | not_equal
           | greater
           | lesser
           | greater_equal
           | lesser_equal
           ;

// CONDITION

condition : bool_literal
          | expr comparator expr 
;


// DECLARATIONS
declaration : structure_declaration
            | variable_declaration
            // | function_declaration
            ;

variable_declaration : data_types Id
                     | assignment_statement
                     ;
                     
structure_declaration : data_structures '<' data_types '>' Id
                      ;
//TODO: check
// function_declaration : 'DEF' '(' ;
                    //   ;


Id : [a-zA-Z_][a-zA-Z0-9_]*;

// LITERALS

constant : Integer_literal | Floating_point_literal | char_literal | string_literal | bool_literal | null_literal;

Integer_literal : [0-9]+;
Floating_point_literal : [0-9]+ '.' [0-9]+;
char_literal : '\'' . '\'';
string_literal : '"' . '"';
bool_literal : True_literal | False_literal;
True_literal : 'true';
False_literal : 'false';
null_literal : 'null';
// OPERATORS

equal : '==';
not_equal : '!=';
greater : '>';
lesser : '<';
greater_equal : '>=';
lesser_equal : '<=';

// DATA TYPES

data_types : integer | double | char | string | bool | float;

integer : 'int';
double : 'double';
char : 'char';
string : 'string';
bool : 'bool';
float : 'float';

// DATA STRUCTURE

data_structures : stack
                | deque
                | queue
                ;

stack : 'STACK' ;
queue : 'QUEUE' ;
deque : 'DEQUE' ;

// ARITHMETIC OPERATORS

add : '+';
sub : '-';
mul : '*';
div : '/';
mod : '%';
inc : '++';
dec : '--';

// ARITHMETIC ASSIGNMENT OPERATORS

add_assign : '+=';
sub_assign : '-=';
mul_assign : '*=';
div_assign : '/=';
mod_assign : '%=';

WS : [ \t\n\r]+ -> skip;


Comment : '//' ~[\r\n]* -> skip;
Line_comment : '/*' .*? '*/' -> skip;

// ':' -> '{'
// 'END' -> '}'
// 'ELIF' -> '{ END ELSE IF'
// 'ELSE' -> '{ END ELSE'