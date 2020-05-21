/** 
 * This class implements HeapSort on an array of integers. 
 * The advantage of heapsort is it is an in-place algorithm,
 * meaning it overwrites its input with output
 * Time complexity for heap sort is O(nlogn)
 */

public class HeapSort {
    private static void swapArrayElements(int [] arr, int index1, int index2) {
        if(index1 > arr.length || index1 < 0 || index2 > arr.length || index2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(); 	
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void siftDown(int [] arr, int parentIndex, int lastIndex) {
        int left = 2*parentIndex;
        int right = 2*parentIndex+1;
        int largest;

        if(left <= lastIndex && arr[left] > arr[parentIndex]) {
            largest = left;
        } else {
            largest = parentIndex;
        }

        if(right <= lastIndex && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != parentIndex) {
            swapArrayElements(arr, parentIndex, largest);
            siftDown(arr, largest, lastIndex);
        }
    }

    private static void buildHeap(int [] arr, int lastIndex) 
    {
        for(int parentIndex = (lastIndex/2)-1; parentIndex >= 0; parentIndex--) {
            siftDown(arr, parentIndex, lastIndex);
        }
    }
 
    public static void sort(int [] arr) 
    {
        int lastIndex = arr.length - 1;
        //first create a max-heap from the array
        buildHeap(arr, lastIndex);

        for(int i = lastIndex; i > 0; i--) {
            swapArrayElements(arr, 0, i);
            lastIndex -= 1;
            siftDown(arr, 0, lastIndex);
        }
    }
}
