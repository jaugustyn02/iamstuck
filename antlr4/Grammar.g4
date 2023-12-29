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
for_range_statement : 'FOR' id 'IN RANGE(' expression ((',' expression)? ',' expression)? ')' ':' statement+;
for_each_statement : 'FOR' id 'IN' id ':' statement+;

// PRINT STATEMENTS
printing_statement : print_statement | println_statement | printf_statement;

print_statement : 'PRINT' '(' (arguments)? ')';
println_statement : 'PRINTLN' '(' (arguments)? ')';
printf_statement : 'PRINTF' '(' String_literal (',' arguments)? ')';

// CALL STATEMENTS
method_call : id '.' id '(' (arguments)? ')';
function_call : id '(' (arguments)? ')';

// REST STATEMENTS
pass_statement : 'PASS';
return_statement : 'RETURN' (expression)?;


// ARGUMENTS
arguments : expression (',' expression)*;


// EXPRESSION
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
single_expression : id
                  | id '[' arithmetic_expression ']'
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

variable_declaration : data_type id (assign expression)?  (',' id (assign expression)?)*;

container_declaration : container_type '<' data_type '>' id (',' id)*;

function_definition : 'DEF' data_type id '(' (data_type id (',' data_type id)*)? ')' ':' (statement)+;


// IDENTIFIERS
id: Id_literal;
Id_literal : [a-zA-Z_][a-zA-Z0-9_]*;


// CONSTANT
constant : Integer_literal | Floating_point_literal | char_literal | String_literal | bool_literal | null_literal;

Integer_literal : '-'? [0-9]+;
Floating_point_literal : '-'? [0-9]+ '.' [0-9]+;
char_literal : '\'' . '\'';
// string_literal : '"' . '"';
String_literal : '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') | '{' | '}')* '"';
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
assign_statement : id assign_operator expression
                 | id increment
                 | id decrement
                 | increment id
                 | decrement id
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