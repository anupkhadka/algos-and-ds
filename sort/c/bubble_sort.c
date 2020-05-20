/*
 * bubble_sort.c
 * Perform bubble sort on an array of integers
 */

#include "sort.h"

static void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

void bubble_sort(int arr[], int len) {
    int i = 0, j = 0;  
    for(i = len - 1; i > 0; i--) {
        for(j = 0; j < i; j++) {
            if(arr[j] > arr[j+1]) {
                swap(&arr[j], &arr[j+1]);
            }
        }
    }		
}
