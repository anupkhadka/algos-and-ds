/* 
 * This class implements radix sort on an array of 
 * positive integers. This sorting algorithm will not work if the
 * number is negative
 */

import java.util.Queue;
import java.util.LinkedList;

public class RadixSort {

    /**
     * @param the array to sort
     */
    public static void sort(int [] arr) {
        int i, j, index;
        boolean loop = true;
        int divisor = 1;
        final int mod = 10;
    
        Queue [] buckets = new Queue[10];
        for(i = 0; i < 10; i++) {
            buckets[i] = new LinkedList<Integer>();
        }

        while(loop) {
            loop = false; 

            for(i = 0; i < arr.length; i++) {
                index = (arr[i] / divisor) % mod;
                if(index > 0) {
                    // this means, there are elements other than 
                    // in 0 bucket, which means, sorting is not complete yet
                    loop = true;
                }
                ((LinkedList<Integer>)buckets[index]).addLast(new Integer(arr[i]));
            }
            
            divisor = divisor * 10;
        
            //now put the semi-sorted elements back into the array
            
            for(i = 0, j = 0; i < 10; i++) {
                while(!buckets[i].isEmpty()) {
                    Integer num = ((LinkedList<Integer>)buckets[i]).removeFirst();
                    arr[j++] = num.intValue();
                }
            } 
        }	
    }
} 
