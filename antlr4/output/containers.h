// CONTAINERS.H


#ifndef CONTAINERS_H
#define CONTAINERS_H
#endif


#include "container.h"

#include <iostream>
#include <deque>
#include <utility>


template <typename T>
class Queue: public Container<T> {
    public:
        Queue() = default;
        ~Queue() = default;

        void push(T val) {
            Container<T>::m_queue.push_back(val);
        }

        T pop_front() {
            T val = Container<T>::m_queue.front();
            Container<T>::m_queue.pop_front();
            return val;
        }

        T front() {
            return Container<T>::m_queue.front();
        }
};


template <typename T>
class Stack: public Container<T> {
    public:
        Stack() = default;
        ~Stack() = default;

        void push_back(T val) {
            Container<T>::m_queue.push_back(val);
        }

        T pop_back() {
            T val = Container<T>::m_queue.back();
            Container<T>::m_queue.pop_back();
            return val;
        }
};


template <typename T>
class Deque: public Container<T> {
    public:
        Deque() = default;
        ~Deque() = default;

        void push_front(T val) {
            Container<T>::m_queue.push_front(val);
        }

        void push_back(T val) {
            Container<T>::m_queue.push_back(val);
        }

        T pop_front() {
            T val = Container<T>::m_queue.front();
            Container<T>::m_queue.pop_front();
            return val;
        }

        T pop_back() {
            T val = Container<T>::m_queue.back();
            Container<T>::m_queue.pop_back();
            return val;
        }

        T front() {
            return Container<T>::m_queue.front();
        }
};


// END CONTAINERS.H