/** 
 * This class detects if a cycle exists in a doubly-linked linked list 
 */

public class CycleDetection {

    private LinkedListWithCycle<Integer> list;

    public CycleDetection(LinkedListWithCycle<Integer> list) {
        this.list = list;
    }

    /** 
     * Creates a cycle
     * @param index to create cycle at
     */
    public boolean createCycle(int index) {
        return list.createCycle(index);
    }

    /**
     * Detects cycle
     */
    public void detectCycle() {
        System.out.println("Checking if a cycle exists...");
        list.detectCycle();
    }

    /** 
     * Removes cycle
     */
    public void removeCycle() {
        list.removeCycle();
    }

    /**
     * @param args
     */
    public static void main(String [] args) {
        int [] arr = {1,3,7,8,10,23,21,44};
        int [] searchArray = {3,8,4,2,10,23};
        int i;
        LinkedListWithCycle<Integer> list = new LinkedListWithCycle(); 

        for(i = 0; i < arr.length; i++) {
            list.add(new Integer(arr[i]));
        }

        System.out.println("Original list before cycle: "+list);

        CycleDetection cd = new CycleDetection(list);

        for(i = 2; i < arr.length - 1; i++) {
            if(cd.createCycle(i)) {
                System.out.println("Created cycle starting at element "+arr[i]);
            }
            cd.detectCycle();
            cd.removeCycle();
            cd.detectCycle();
        }
    }
}
