/** 
 * This class implements BubbleSort on an array of integers. 
 * Bubble sort is a simple sorting algorithm, which has an O(n^2) 
 * time complexity
 */

import java.lang.IndexOutOfBoundsException;

public class BubbleSort {
    private static void swapArrayElements(int [] arr, int index1, int index2) {
        if(index1 > arr.length || index1 < 0 || index2 > arr.length || index2 < 0) {
            throw new IndexOutOfBoundsException(); 	
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int [] arr) {
        for(int j = arr.length - 1; j > 0; j--) {
            for(int i = 0; i < j; i++) {
                if(arr[i] > arr[i+1]) {
                    swapArrayElements(arr, i, i+1);
                }
            }
        }
    }
} 
