#include <iostream>
#include "containers.h"

using namespace std;



void tower_of_hanoi(int n, char from, char to, char aux){
    if (n==1){
        cout << "Move disk 1 from rod " << from << " to rod " << to << "\n";
        return ;
    }
    tower_of_hanoi(n-1,from,aux,to);
    cout << "Move disk " << n << " from rod " << from << " to rod " << to << "\n";
    tower_of_hanoi(n-1,aux,to,from);
}

int main(){
    int n=3;
    tower_of_hanoi(n,'A','C','B');
    return 0;
}
