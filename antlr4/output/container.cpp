// BEGIN CONTAINER.CPP
#include "container.h"


template <typename T> void Container<T>::print()
{
    for (auto i: m_queue) {
        std::cout << i << " ";
    }
    std::cout << std::endl;
}



// END CONTAINER.CPP