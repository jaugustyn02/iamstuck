// CONTAINERS.H
#include <iostream>
#include <deque>
#include <utility>


template <typename T>
class Container;

template <typename T>
class Queue: public Container<T>{
    public:
        Queue() = default;
        ~Queue() = default;

        void push(int val);
        T pop_front();
        T front();
};

template <typename T>
class Stack: public Container<T>{
    public:
        Stack() = default;
        ~Stack() = default;

        void push_back(int val);
        T pop_back();
};

template <typename T>
class Deque: public Container<T>{
    public:
        Deque() = default;
        ~Deque() = default;

        void push_front(int val);
        void push_back(int val);
        T pop_front();
        T pop_back();
};
// END CONTAINERS.H