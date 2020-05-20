/*
 * sort_test.c
 * Simple program to test all the implemented sort algorithms
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "sort.h"

static void print_array(int arr[], int len) {
    int i = 0; 
    printf("[");
    for(i; i < len; i++) {
        if(i != 0) 		printf(",");
        printf("%d ", arr[i]);
    }
    printf("]");
}

int main(void) {
    int unsorted_arr[] = {6, 1, 8, 4, 9, 10, 7};		
    int len = sizeof(unsorted_arr)/sizeof(unsorted_arr[0]);
    int arr[len]; 

    /* bubble sort */
    memcpy(arr, unsorted_arr, sizeof(unsorted_arr));
    printf("Original array: ");
    print_array(arr, len);
    printf("\n");
    bubble_sort(arr, len);
    printf("Sorted array (bubble): ");
    print_array(arr, len);
    printf("\n");


    /* selection sort */
    memcpy(arr, unsorted_arr, sizeof(unsorted_arr));
    printf("Original array: ");
    print_array(arr, len);
    printf("\n");
    selection_sort(arr, len);
    printf("Sorted array (selection): ");
    print_array(arr, len);
    printf("\n");

    /* heap sort */
    memcpy(arr, unsorted_arr, sizeof(unsorted_arr));
    printf("Original array: ");
    print_array(arr, len);
    printf("\n");
    heap_sort(arr, len);
    printf("Sorted array (heap): ");
    print_array(arr, len);
    printf("\n");
    
    return EXIT_SUCCESS;
}
