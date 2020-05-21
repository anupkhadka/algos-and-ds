/** 
 * This class implements SelectionSort on an array of integers. 
 * Selection sort is a simple sorting algorithm, which has an O(n^2) 
 * time complexity
 */

public class SelectionSort {

    private static void swapArrayElements(int [] arr, int index1, int index2) {
        if(index1 > arr.length || index1 < 0 || index2 > arr.length || index2 < 0) {
            throw new IndexOutOfBoundsException(); 	
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int [] arr) {
        int currentMinimum, currentMinimumIndex;
        for(int i = 0; i < arr.length; i++) {
            currentMinimumIndex = i;
            currentMinimum = arr[i];

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < currentMinimum) {
                    currentMinimumIndex = j;
                    currentMinimum = arr[j];
                }
            }

            if(i != currentMinimumIndex) {
                swapArrayElements(arr, i, currentMinimumIndex);			
            }
        }
    }
} 
