#include <iostream>
#include <deque>
#include <utility>


template <typename T>
class Container {
    public:
        Container() = default;
        // Constructor with max size
        Container(int max_size): m_max_size(max_size) {}
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

        int size(){
            return m_queue.size();
        }

        T back() {
            return Container<T>::m_queue.back();
        }

        void print() {
            for (auto i: m_queue) {
                std::cout << i << " ";
            }
            std::cout << std::endl;
        }

    protected:
        std::deque<T> m_queue;
        int m_max_size;
};


template <typename T>
class Queue: public Container<T> {
    public:
        Queue() = default;
        ~Queue() = default;

        void push(int val) {
            Container<T>::m_queue.push_back(val);
        }

        void pop_front() {
            Container<T>::m_queue.pop_front();
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

        void push_back(int val) {
            Container<T>::m_queue.push_back(val);
        }

        void pop_back() {
            Container<T>::m_queue.pop_back();
        }
};


template <typename T>
class Deque: public Container<T> {
    public:
        Deque() = default;
        ~Deque() = default;

        void push_front(int val) {
            Container<T>::m_queue.push_front(val);
        }

        void push_back(int val) {
            Container<T>::m_queue.push_back(val);
        }

        void pop_front() {
            Container<T>::m_queue.pop_front();
        }

        void pop_back() {
            Container<T>::m_queue.pop_back();
        }

        T front() {
            return Container<T>::m_queue.front();
        }
};


int main() {
    Queue<int> q;
    q.push(1);
    q.push(2);

    std::cout << "Queue: " << std::endl;
    q.print();

    delete &q;

    Stack<float> s1;
    s1.push_back(1.1);
    s1.push_back(2.2);

    std::cout << "Stack: " << std::endl;
    s1.print();

    return 0;
}
