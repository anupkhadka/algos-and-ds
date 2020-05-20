/* 
 * This is my implementation of a template LinkedList in C++
 */

#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include <iostream>
using namespace std;

template <class T>
struct Node 
{
    T element;
    struct Node<T> *next;	
};

template <class T>
class LinkedList 
{
    public: 
        LinkedList();
        ~LinkedList();
        LinkedList(const LinkedList&);
        LinkedList& operator=(const LinkedList&);	
        void insert(const T&);
        bool find(const T&) const;	
        void printList() const;

    private:
        struct Node<T> *head;
};

// Now include the inline functions
#include "LinkedList.T"

#endif
