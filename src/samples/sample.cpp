#include <iostream>
#include "containers.h"

using namespace std;


Stack<int> s;

void print_hw(){
    cout << "Hello World\n";
}

int max(int a, int b){
    if (a>b){
        return a;
    } else if (a==b){
        return a;
    } else if (a<b){
        return b;
    } else{
        cout << "There is not else!\n";
    }
    return b;
    if (a<b){
        cout << "hello there\n";
    }
}

int main(){
    int x=10*(5%2);
    s.push(x);
    cout << s.pop() << endl;
    print_hw();
    cout << max(6,9) << "\n";
    int a=5,b=6;
    if (a>b){
        return a;
    } else if (a==b){
        return a;
    } else if (a<b){
        return 0;
    } else{
        cout << "There is not else!\n";
    }
    return b;
    if (a<b){
        cout << "hello there\n";
    }
    return 0;
}
