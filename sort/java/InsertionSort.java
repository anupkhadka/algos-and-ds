/** 
 * This class implements InsertionSort on an array of integers. 
 * Insertion sort has a time complexity of O(n^2)
 */

public class InsertionSort {

    /**
     * @param the array to sort
     */
    public static void sort(int [] arr) {
        int i,j,temp;

        for(i = 1; i < arr.length; i++) {
            temp = arr[i];
            for(j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
} 
