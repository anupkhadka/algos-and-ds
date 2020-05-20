/* 
 * This is an example of a template LinkedList in C++. 
 * This file needs to be included at the end of corresponding template 
 * header file (LinkeList.h)
 */

#ifdef LINKEDLIST_H

template <class T>
LinkedList<T>::LinkedList() 
{
    head = NULL;
}

template <class T>
LinkedList<T>::~LinkedList() 
{
    struct Node<T> *node;
    node = head;
    while(node) {
        delete node;
        node = node->next;
    }
}

template <class T>
LinkedList<T>::LinkedList(const LinkedList<T>& list) 
{
    struct Node<T> *node	= NULL;
    struct Node<T> *lNode	= NULL;

    if(list->head == NULL) {
        head = NULL;
    } else {
        head = new struct Node<T>;
        head->element = list->head->element;
    
        node = head;
        lNode = list->head->next;	
    }

    while(lNode) {
        node->next = new struct Node<T>;
        node = node->next;
        node->element = lNode->element;
        lNode = lNode->next;
    }
    node = NULL;	
}

template <class T>
LinkedList<T>& LinkedList<T>::operator = (const LinkedList<T>& list) 
{
    this = LinkedList<T>(list);
    return this;
}

template <class T>
void LinkedList<T>::insert(const T& element) 
{
    struct Node<T> *node = new struct Node<T>;
    struct Node<T> *iterator;

    node->element = element;
    node->next = NULL;

    if(!head) {
        head = node;
    } else {
        iterator = head;
        while(iterator->next) {
            iterator = iterator->next;
        }
        iterator->next = node;
    }
}

template <class T>
bool LinkedList<T>::find(const T& element) const 
{
    struct Node<T> *node;
    node = head;
    
    while(node) {
        if(node->element == element) {
            return true;
        }
        node = node->next;
    }
    return false;
}

template <class T>
void LinkedList<T>::printList() const 
{
    struct Node<T> *node;
    
    node = head;

    cout<<"----- printing list -----"<<endl;
    while(node) {
        cout<<node->element<<endl;	
        node = node->next;
    }
    cout<<"-------------------------"<<endl;
}

#endif
