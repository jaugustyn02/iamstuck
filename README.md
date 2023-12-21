# iamstuck
Compilator made with ANTL4: Custom language -> C++


# Code syntax:

STRUCTURE TYPES: STACK (LIFO), QUQUE (FIFO), DEQUE (DOUBLE ENDED QUEUE)

STRUCTURE OPERATIONS: PUSH, POP, POPLEFT, PUSHLEFT, PEEK, ISEMPTY, ISFULL, DELETE

DATA TYPES: int, double, char, string, bool, void

CLASS: STRUCT

OPERATORS: 
- ARITHMETIC: +, -, *, /, %, ++, --, +=, -=, *=, /=, %=
- COMPARATIVE: =, ==, !=, >, <, >=, <=
- LOGICAL: &&, ||, !

LOOPS: FOR, WHILE, DO WHILE

LOGIC: IF, ELSE

## Example 1

STRUCT Element:
    int value;
    char name;
    # Element* next;


STACK <int> stack1; # stack
QUEUE <float> queue1; #queue
DEQUE <string> deque1; # deque


DELETE stack1;
DELETE queue2;
DELETE deque3;

## Example 2

DEF MAIN:
    print(siema)


IF siema > 0:
    PASS
ELIF siema == 0:
    PASS
ELSE:
    PASS
END


':' -> '{'
'END' -> '}'
'ELIF' -> '{ END ELSE IF'
'ELSE' -> '{ END ELSE'


DEF MAIN:
    PRINT()
    PRINT("SIEMA")
END

RETURN



FOR EL IN QUEUE:
    IF 'SMTH':
        # DO SMTH
    ELSE: 

WHILE EL != NULL:





## Example 3


FUNC MAIN:
    INIT QUEUE 10 q1




####################################################################

// Function to print all elements in the queue without popping
void printQueue(const std::queue<int>& myQueue) {
    std::cout << "Elements in the queue:\n";
    
    // Create a copy of the original queue to iterate without modifying it
    std::queue<int> tempQueue = myQueue;

    while (!tempQueue.empty()) {
        std::cout << tempQueue.front() << " ";
        tempQueue.pop();
    }
    std::cout << "\n";
}
