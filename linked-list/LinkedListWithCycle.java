/** 
 * This class extends generic linked list and adds support for creation and 
 * detection of cycles
 */

import java.lang.Comparable; 

public class LinkedListWithCycle<E extends Comparable<E>> extends LinkedList<E> {
    private Node<E> end;

    public LinkedListWithCycle() {
        super();
        end = null;
    }

    public Node<E> add(E e) {
        end = super.add(e);
        return end;
    }

    /**
     * @param index to create cycle at
     */
    public boolean createCycle(int index) {
        Node<E> cycleStart; 
        if((cycleStart = getNodeByIndex(index)) == null) {
            return false;
        }

        end.setNext(cycleStart);
        return true;		 
    } 

    /** 
     * Detects if the list has cycle 
     */
    public void detectCycle() {
        Node<E> slow = getHead();
        Node<E> fast = getHead();

        //Move two pointers, one twice as fast as the other
        //if the two are equal, a cycle is found
        while(fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast) {
                //cycle found
                break;
            }
        }

        if(fast == null || fast.getNext() == null) {
            System.out.println("No cycle detected!");
            return;
        }

        /* Move slow to head. keep fast at meeting point. 
         * Move both of them together. They will meet at loop start 
         */
        slow = getHead();

        while(slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        System.out.println("Cycle detected starting at element: "+fast.getElement());
    }

    /**
     * Removes cycle 
     */
    public void removeCycle() {
        end.setNext(null);
        System.out.println("Cycle removed!");
    }
}
