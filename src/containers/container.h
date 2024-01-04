// BEGIN CONTAINER.H


#ifndef CONTAINER_H
#define CONTAINER_H
#endif


#include <utility>
#include <deque>
#include <iostream>


template <typename T>
class Container {
    public:
        Container() = default;
        // Copy constructor
        Container(const Container& other) {
            this->m_queue = other.m_queue;
            this->m_max_size = other.m_max_size;
        }
        // Move constructor
        Container(Container&& other) {
            this->m_queue = std::move(other.m_queue);
            this->m_max_size = other.m_max_size;
        }

        ~Container() = default;

        bool empty(){
            return m_queue.empty();
        }

        std::size_t size(){
            return m_queue.size();
        }

        T back() {
            return Container<T>::m_queue.back();
        }

        void print(){
            for (auto i: m_queue) {
                std::cout << i << " ";
            }
            std::cout << std::endl;
        };

        T& operator[](int index) {
            return Container<T>::m_queue[index];
        }

    protected:
        std::deque<T> m_queue;
};


// END CONTAINER.H