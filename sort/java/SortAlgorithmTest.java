/** 
 * This class tests following sorting algorithms: 
 * 		BubbleSort
 * 		SelectionSort
 *		InsertionSort
 *		MergeSort
 * 		QuickSort
 * 		HeapSort
 *		RadixSort
 */

import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public class SortAlgorithmTest {

    private static String getArrayString(int [] array) {
        StringBuilder str = new StringBuilder();
        str.append("[");	
        
        for(int i = 0; i < array.length; i++) {
            if(i != 0) {
                str.append(",");
            }
            str.append(array[i]);
        }
        str.append("]");

        return str.toString();
    } 

    /**
     * @param args
     */
    public static void main(String [] args) {
        int [] arr = {9,3,1,5,23,1000,3,2,766,2,7,7,99};
        
        /* Bubble sort */
        int [] array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before bubble sort    : "+ getArrayString(array));
        BubbleSort.sort(array);	
        System.out.println("Array after bubble sort     : "+ getArrayString(array));

        /* Selection sort */
        array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before selection sort : "+ getArrayString(array));
        SelectionSort.sort(array);	
        System.out.println("Array after selection sort  : "+ getArrayString(array));

        /* Insertion sort */
        array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before insertion sort : "+ getArrayString(array));
        InsertionSort.sort(array);	
        System.out.println("Array after insertion sort  : "+ getArrayString(array));

        /* Merge sort */
        array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before merge sort     : "+ getArrayString(array));
        MergeSort.sort(array);	
        System.out.println("Array after merge sort      : "+ getArrayString(array));

        /* Heap sort */
        array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before heap sort      : "+ getArrayString(array));
        HeapSort.sort(array);	
        System.out.println("Array after heap sort       : "+ getArrayString(array));

        /* Radix sort */
        array = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before radix sort     : "+ getArrayString(array));
        RadixSort.sort(array);	
        System.out.println("Array after radix sort      : "+ getArrayString(array));
    }
}
