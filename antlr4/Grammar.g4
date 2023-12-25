grammar Grammar;

// START
start_ : statement* EOF;


// STATEMENTS
statement : single_statement ';'
          | block_statement 'END'
          ;

block_statement : if_statement | loop_statement | block_declaration;
single_statement: single_declaration | assign_statement | pass_statement | method_call | function_call | printing_statement;

// IF STATEMENTS
if_statement : 'IF' condition ':' statement+ ('ELIF' condition ':' statement+)* ('ELSE' ':' statement+ )?;

// LOOP STATEMENTS
loop_statement : while_statement | for_statement;

for_statement : for_range_statement | for_each_statement;
while_statement : 'WHILE' condition ':' statement+;
for_range_statement : 'FOR' Id_literal 'IN RANGE(' expression ((',' expression)? ',' expression)? ')' ':' statement+;
for_each_statement : 'FOR' Id_literal 'IN' Id_literal ':' statement+;

// PRINT STATEMENTS
printing_statement : print_statement | println_statement | printf_statement;

print_statement : 'PRINT' '(' (expression (',' expression)*)? ')';
println_statement : 'PRINTLN' '(' (expression (',' expression)*)? ')';
printf_statement : 'PRINTF' '(' string_literal (',' expression)* ')';

// CALL STATEMENTS
method_call : Id_literal '.' Id_literal '(' (expression (',' expression)*)? ')';
function_call : Id_literal '(' (expression (',' expression)*) ')';

// REST STATEMENTS
pass_statement : 'PASS';
return_statement : 'RETURN' (expression)? ';';

// EXPRESSIONS
expression : Id_literal
           | Id_literal '[' expression ']'
           | expression arith_operator expression
           | '(' expression ')'
           | constant
           | method_call
           | function_call
           ;


// CONDITION
condition : bool_literal
          | expression comparator expression 
          ;


// DECLARATIONS
single_declaration : container_declaration
                   | variable_declaration
                   ;

block_declaration : function_definition ;

variable_declaration : data_type Id_literal (assign expression)?  (',' Id_literal (assign expression)?)*;

container_declaration : container_type '<' data_type '>' Id_literal (',' Id_literal)*;

function_definition : 'DEF' data_type Id_literal '(' (data_type Id_literal (',' data_type Id_literal)*)? ')' ':' (statement | return_statement)+;


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
arith_operator : two_arg_arith_operator ;

two_arg_arith_operator : add | sub | mul | div | mod ;

add : '+';
sub : '-';
mul : '*';
div : '/';
mod : '%';


// SKIP
White_spaces : [ \t\n\r]+ -> skip;

Comment : '//' ~[\r\n]* -> skip;
Line_comment : '/*' .*? '*/' -> skip;