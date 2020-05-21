/* 
 * This class implements merge sort on an array of integers. 
 * Merge sort is one of the faster sorting algorithms with a time complexity
 * of O(nlogn)
 *
 * @author anupkhadka
 */

public class MergeSort {

    private static void merge(int [] arr, int firstIndex, int firstHalfLength, int secondHalfLength) {
        int [] temp = new int[firstHalfLength+secondHalfLength];
        int i,j,k;
        i = firstIndex;
        j = firstIndex+firstHalfLength;
        k = 0;

        while(i < firstIndex + firstHalfLength && j < firstIndex + firstHalfLength + secondHalfLength) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //copy remaining elements
        while(i < firstIndex+firstHalfLength) {
            temp[k++] = arr[i++];
        }

        while(j < firstIndex + firstHalfLength + secondHalfLength) {
            temp[k++] = arr[j++];
        }

        //now copy temp to arr
        for(k = 0, i = firstIndex; k < temp.length; k++) {
            arr[i++] = temp[k];
        }
    }

    private static void mergeSort(int [] arr, int firstIndex, int arrLength) {
        if(arrLength <= 1) {
            return;
        }

        int firstHalfLength = arrLength/2;
        int secondHalfLength = arrLength - firstHalfLength;

        mergeSort(arr, firstIndex, firstHalfLength);
        mergeSort(arr, firstIndex+firstHalfLength, secondHalfLength);

        //now merge the two arrays
        merge(arr, firstIndex, firstHalfLength, secondHalfLength);
    }
    

    public static void sort(int [] arr) {
        mergeSort(arr, 0, arr.length);
    }
} 
