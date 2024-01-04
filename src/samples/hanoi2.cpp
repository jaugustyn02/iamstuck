#include <iostream>
#include "containers.h"

using namespace std;


Stack<int> A,B,C;

void print_stacks(){
    cout << "A: ";
    A.print();
    cout << "B: ";
    B.print();
    cout << "C: ";
    C.print();
}

int pop(char s){
    if (s=='A'){
        return A.pop();
    } else if (s=='B'){
        return B.pop();
    } else{
        return C.pop();
    }
}

void push(char s, int x){
    if (s=='A'){
        A.push(x);
    } else if (s=='B'){
        B.push(x);
    } else{
        C.push(x);
    }
}

void towerOfHanoi(int n, char a, char b, char c){
    if (n==1){
        cout << "Move disk 1 from " << a << " to " << c << "\n";
        int x=pop(a);
        push(c,x);
        print_stacks();
        return ;
    }
    towerOfHanoi(n-1,a,c,b);
    cout << "Move disk " << n << " from " << a << " to " << c << "\n";
    int x=pop(a);
    push(c,x);
    print_stacks();
    towerOfHanoi(n-1,b,a,c);
}

int main(){
    int n=3;
    for(auto i = n;(-1<0 ? i > 0: i < 0);i+=-1){
        A.push(i);
    }
    print_stacks();
    towerOfHanoi(n,'A','B','C');
    return 0;
}
