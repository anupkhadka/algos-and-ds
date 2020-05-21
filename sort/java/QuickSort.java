/** 
 * This class implements quick sort on an array of integers. 
 * Quick sort is one of the faster sorting algorithms with a time complexity
 * of O(nlogn)
 */

public class QuickSort {
    private static void swapArrayElements(int [] arr, int index1, int index2) {
        if(index1 > arr.length || index1 < 0 || index2 > arr.length || index2 < 0) {
            throw new IndexOutOfBoundsException(); 	
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    private static void quickSort(int [] arr, int firstIndex, int lastIndex, int arrLength) {
        if(arrLength <= 1) {
            return;
        }

        int pivotIndex = (firstIndex + lastIndex)/2;
        int pivot = arr[pivotIndex];
        int i = firstIndex;
        int j = lastIndex;

        while(i < j ) {
            while(arr[i] < pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            swapArrayElements(arr,i,j);
        }

        //perform quick sort on array elements before pivot element	
        int length1 = (i - firstIndex);	//count of elements until pivot element
        int length2 = lastIndex - i;
        
        quickSort(arr, firstIndex, i-1, length1);
        quickSort(arr, i+1, lastIndex, length2);	
    }	 


    public static void sort(int [] arr) {
        quickSort(arr, 0, arr.length-1, arr.length);
    }
} 
