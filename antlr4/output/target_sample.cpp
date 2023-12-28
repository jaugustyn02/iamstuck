#include <iostream>
#include "containers.h"


Stack<int> s;


// void print_hw();
// int max(int a, int b);

void print_hw() {
    std::cout << "Hello, World!" << "\n";
}

int max(int a, int b) {
    if (a > b) {
        return a;
    }
    return b;
}

int main() {
    int x = 10;
    s.push_back(x);
    std::cout << s.pop_back() << std::endl;
    print_hw();
    std::cout << max(6, 9) << "\n";
    return 0;
}

// Iamstuck code:
// int x = 10;

// DEF void print_hw():
//     PRINT("Hello World!\n");
// END

// STACK <int> s;

// s.push_back(x);
// PRINTLN(s.pop_back());

// print_hw();

// PRINT(max(6, 9), "\n");

// DEF int max(int a, int b):
//     IF a > b: RETURN a;
//     RETURN b;
// END