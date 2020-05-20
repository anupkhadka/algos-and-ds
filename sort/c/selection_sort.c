/* 
 * selection_sort.c
 * Perform insertion sort on an array of integers
 */

#include "sort.h"

static void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b; 
    *b = temp;
}

void selection_sort(int arr[], int len) {
    int i, current_min, current_min_index, j;
    
    for(i = 0; i < len; i++) {
        current_min_index = i; 
        current_min = arr[current_min_index];
        for(j = i + 1; j < len; j++) {
            if(arr[j] < current_min) {
                current_min_index = j; 
                current_min = arr[j];
            }
        }
        if(current_min_index != i) {
            swap(&arr[i], &arr[current_min_index]);
        } 
    }
} 
