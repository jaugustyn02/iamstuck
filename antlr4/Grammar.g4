grammar Grammar;

// START
start_ : statement* EOF;


// STATEMENTS
statement : single_statement ';'
          | block_statement 'END'
          ;

block_statement : if_statement | loop_statement ;

single_statement: single_declaration | assign | pass_statement | method_call | function_call;


loop_statement : while_statement | for_statement | block_declaration;

for_statement : for_range_statement | for_each_statement ;

if_statement : 'IF' condition ':' statement+ ('ELIF' condition ':' statement+)* ('ELSE' ':' statement+ )?;

while_statement : 'WHILE' condition ':' statement+;

for_range_statement : 'FOR' Id_literal 'IN RANGE(' expression (',' expression){0,2} ')' ':' statement+;

for_each_statement : 'FOR' Id_literal 'IN' Id_literal ':' statement+;

pass_statement : 'PASS';

// variable definition (maybe change name)
assignment_statement : data_type (Id_literal '=' expression (',' Id_literal '=' expression)*)? ;

method_call : Id_literal '.' Id_literal '(' (expression (',' expression)*)? ')';

function_call : Id_literal '(' (expression (',' expression)*)? ')';

return_statement : 'RETURN' (expression)? ';';

// EXPRESSIONS
expression : Id_literal
           | expression arith_operator expression
           | '(' expression ')'
           | constant
           | method_call
           | function_call
           ;

// OPERATORS
arith_operator : add | sub | mul | div | mod | inc | dec ;

arith_assign_operator : add_assign
                | sub_assign
                | mul_assign
                | div_assign
                | mod_assign
                | '='
                ;

assign : Id_literal arith_assign_operator expression;

// COMPARATORS
comparator : equal
           | not_equal
           | greater
           | lesser
           | greater_equal
           | lesser_equal
           ;

// CONDITION
condition : bool_literal
          | expression comparator expression 
;


// DECLARATIONS
single_declaration : container_declaration
                   | variable_declaration
                   ;

block_declaration : function_declaration ;

variable_declaration : data_type Id_literal (',' Id_literal)*
                     | assignment_statement
                     ;
                     
container_declaration : container_type '<' data_type '>' Id_literal (',' Id_literal)*;

//TODO: check
function_declaration : 'DEF' data_type Id_literal '(' (data_type Id_literal (',' data_type Id_literal)*)? ')' ':' (statement | return_statement)+;


// LITERALS
Id_literal : [a-zA-Z_][a-zA-Z0-9_]*;

constant : Integer_literal | Floating_point_literal | char_literal | string_literal | bool_literal | null_literal;

Integer_literal : [0-9]+;
Floating_point_literal : [0-9]+ '.' [0-9]+;
char_literal : '\'' . '\'';
string_literal : '"' . '"';
bool_literal : 'true' | 'false';
null_literal : 'null';

// OPERATORS
equal : '==';
not_equal : '!=';
greater : '>';
lesser : '<';
greater_equal : '>=';
lesser_equal : '<=';

// DATA TYPES
data_type : integer | double | char | string | bool | float | void;

integer : 'int';
double : 'double';
char : 'char';
string : 'string';
bool : 'bool';
float : 'float';
void : 'void';

// DATA STRUCTURE
container_type : stack
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

// SKIP
White_spaces : [ \t\n\r]+ -> skip;

Comment : '//' ~[\r\n]* -> skip;
Line_comment : '/*' .*? '*/' -> skip;