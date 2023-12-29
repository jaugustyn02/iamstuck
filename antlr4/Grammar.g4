grammar Grammar;

// START
program : statement* EOF;


// STATEMENTS
statement : single_statement ';'
          | block_statement 'END'
          ;

block_statement : if_statement 
                | loop_statement 
                | block_declaration
                ;

single_statement: return_statement 
                | pass_statement 
                | printing_statement 
                | single_declaration 
                | assign_statement 
                | method_call 
                | function_call
                ;

// IF STATEMENTS
if_statement : 'IF' logical_expression ':' statement+ ('ELIF' logical_expression ':' statement+)* ('ELSE' ':' statement+ )?;

// LOOP STATEMENTS
loop_statement : while_statement | for_statement;

for_statement : for_range_statement | for_each_statement;
while_statement : 'WHILE' logical_expression ':' statement+;
for_range_statement : 'FOR' Id_literal 'IN RANGE(' expression ((',' expression)? ',' expression)? ')' ':' statement+;
for_each_statement : 'FOR' Id_literal 'IN' Id_literal ':' statement+;

// PRINT STATEMENTS
printing_statement : print_statement | println_statement | printf_statement;

print_statement : 'PRINT' '(' (expression (',' expression)*)? ')';
println_statement : 'PRINTLN' '(' (expression (',' expression)*)? ')';
printf_statement : 'PRINTF' '(' string_literal (',' expression)* ')';

// CALL STATEMENTS
method_call : Id_literal '.' Id_literal '(' (expression (',' expression)*)? ')';
function_call : Id_literal '(' (expression (',' expression)*)? ')';

// REST STATEMENTS
pass_statement : 'PASS';
return_statement : 'RETURN' (expression)?;


// EXPRESSION STATEMENTS
expression : single_expression 
           | arithmetic_expression
           | logical_expression
           ;

// LOGICAL EXPRESSION
logical_expression : logical_expression logical_operator logical_expression
                   | logical_expression comparator logical_expression
                   | not logical_expression
                   | '(' logical_expression ')'
                   | single_expression
                   | arithmetic_expression
                   ;

// ARITHMETIC EXPRESSION
arithmetic_expression : arithmetic_expression arith_operator arithmetic_expression
                      | '(' arithmetic_expression ')'
                      | single_expression
                      ;

// EXPRESSIONS
single_expression : Id_literal
                  | Id_literal '[' single_expression ']'
                  | '(' single_expression ')'
                  | constant
                  | method_call
                  | function_call
                //    | expression arith_operator expression
                  ;


// CONDITION
// condition : bool_literal
//           | expression comparator expression 
//           ;


logical_operator : and | or | xor;

and : 'AND';
or : 'OR';
xor : 'XOR';
not : 'NOT';

// DECLARATIONS
single_declaration : container_declaration
                   | variable_declaration
                   ;

block_declaration : function_definition ;

variable_declaration : data_type Id_literal (assign expression)?  (',' Id_literal (assign expression)?)*;

container_declaration : container_type '<' data_type '>' Id_literal (',' Id_literal)*;

function_definition : 'DEF' data_type Id_literal '(' (data_type Id_literal (',' data_type Id_literal)*)? ')' ':' (statement)+;


// IDENTIFIERS
Id_literal : [a-zA-Z_][a-zA-Z0-9_]*;


// CONSTANT
constant : Integer_literal | Floating_point_literal | char_literal | string_literal | bool_literal | null_literal;

Integer_literal : '-'? [0-9]+;
Floating_point_literal : '-'? [0-9]+ '.' [0-9]+;
char_literal : '\'' . '\'';
// string_literal : '"' . '"';
string_literal : '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') | '{' | '}' )* '"';
ESCAPE_SEQUENCE : '\\' ( '"' | '\\' | 'n' | 't' | 'r' | /* add other escape sequences as needed */ );
bool_literal : 'true' | 'false';
null_literal : 'null';


// COMPARATORS
comparator : equal | not_equal | greater | lesser | greater_equal | lesser_equal;

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


// ASSIGN OPERATORS
assign_statement : Id_literal assign_operator expression
                 | Id_literal increment
                 | Id_literal decrement
                 | increment Id_literal
                 | decrement Id_literal
                 ;

assign_operator : add_assign
                | sub_assign
                | mul_assign
                | div_assign
                | mod_assign
                | assign
                ;

add_assign : '+=';
sub_assign : '-=';
mul_assign : '*=';
div_assign : '/=';
mod_assign : '%=';
increment  : '++';
decrement  : '--';
assign     : '=';


// ARITHMETIC OPERATORS
arith_operator : add | sub | mul | div | mod ;

add : '+';
sub : '-';
mul : '*';
div : '/';
mod : '%';


// SKIP
White_spaces : [ \t\n\r]+ -> skip;

Comment : '//' ~[\r\n]* -> skip;
Line_comment : '/*' .*? '*/' -> skip;