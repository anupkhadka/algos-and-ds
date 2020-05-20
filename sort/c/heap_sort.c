/* 
 * heap_sort.c
 * Perform heap sort on an array of integers
 */

#include "sort.h"

static void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b; 
    *b = temp;
}

static void sift_down(int arr[], int parent_index, int last_index) {
    int left = 2 * parent_index;
    int right = 2 * parent_index + 1;
    int largest;

    if(left <= last_index && arr[left] > arr[parent_index])
        largest = left;
    else
        largest = parent_index;
    
    if(right <= last_index && arr[right] > arr[largest]) 
        largest = right;

    if(largest != parent_index) {
        swap(&arr[parent_index], &arr[largest]);
        sift_down(arr, largest, last_index);
    }
}

static void build_heap(int arr[], int last_index) {
    int parent_index; 
    for(parent_index = (last_index/2)-1; parent_index >= 0; parent_index--) {
        sift_down(arr, parent_index, last_index);
    }
}

void heap_sort(int arr[], int len) {
    int i, last_index; 
    last_index = len - 1;
    /* first create a max-heap from the array */
    build_heap(arr, last_index);
    /*now take elements from heap*/
    for(i = last_index; i > 0; i--) {
        swap(&arr[0], &arr[i]); 
        last_index -= 1; 
        sift_down(arr, 0, last_index);
    }
}
