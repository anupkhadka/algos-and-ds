/*
 * binary_search.c
 * Implementation of recursive and iterative binary search on 
 * an array of sorted integers
 */

#include <stdio.h>

typedef enum {FALSE, TRUE} boolean;

/* perform binary search recursively */
boolean binary_search_recursive(int arr[], int key, int lower_bound, int upper_bound) {

    int pos = (lower_bound + upper_bound)/2;

    if(lower_bound > upper_bound) 	
        return FALSE;
    else if(arr[pos] == key) 	
        return TRUE;
    else if(arr[pos] > key)
        return binary_search_recursive(arr, key, lower_bound, pos - 1);
    else 
        return binary_search_recursive(arr, key, pos + 1, upper_bound);
}

/* perform binary search iteratively */
boolean binary_search_iterative(int arr[], int key, int lower_bound, int upper_bound) {
    
    int pos = (lower_bound + upper_bound)/2;

    while(arr[pos] != key && lower_bound <= upper_bound) {
        if(arr[pos] > key) 
            upper_bound = pos - 1; 
        else
            lower_bound = pos + 1;
        pos = (lower_bound + upper_bound) / 2;  
    }
    return lower_bound <= upper_bound;
}

/* print array in the format [elem1, elem2, ...., elemN]*/
void printArray(int arr[], int len) {
    int i = 0; 
    printf("[");
    for(i; i < len; i++) {
        if(i != 0) 		printf(",");
        printf("%d ", arr[i]);
    }
    printf("]");
}

int main(void) {
    
    int arr [] = {1,3,4,4,5,7,9};
    int test_arr [] = {-45, 0, 4, 9, 100};
    
    int i;
    int len = sizeof(arr)/sizeof(arr[0]);
    int test_arr_len = sizeof(test_arr)/sizeof(test_arr[0]);
    
    printf("\nBinary search recursive test on array: ");
    printArray(arr, len);
    printf("\n");
    for(i = 0; i < test_arr_len; i++) {
        if(binary_search_recursive(arr, test_arr[i], 0, len - 1)) {
            printf("%d is found\n", test_arr[i]);
        } else {
            printf("%d is not found\n", test_arr[i]);
        }
    } 
    
    printf("\nBinary search iterative test on array: ");
    printArray(arr, len);
    printf("\n");
    for(i = 0; i < test_arr_len; i++) {
        if(binary_search_iterative(arr, test_arr[i], 0, len - 1)) {
            printf("%d is found\n", test_arr[i]);
        } else {
            printf("%d is not found\n", test_arr[i]);
        }
    } 
}

