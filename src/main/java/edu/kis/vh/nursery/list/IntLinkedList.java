package edu.kis.vh.nursery.list;

/**
 * Implementation of linked list containing integers.
 */
public class IntLinkedList {

    public static final int LIST_EMPTY_INT = -1;
    public static final Node LIST_EMPTY = null;
    public static final boolean LIST_NOT_FULL = false;
    Node last;
    int i;

    /**
     * Adds an integer to linked list.
     * @param i integer to be added to linked list.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if linked list is empty.
     * @return boolean value indicating that linked list is empty or not.
     */
    public boolean isEmpty() {
        return last == LIST_EMPTY;
    }

    /**
     * Checks if linked list is full.
     * @return boolean value indicating that linked list is not full.
     */
    public boolean isFull() {
        return LIST_NOT_FULL;
    }

    /**
     * Returns value of last added number to the linked list.
     * @return last added number to linked list
     *         or -1 if list is empty.
     */
    public int top() {
        if (isEmpty())
            return LIST_EMPTY_INT;
        return last.getValue();
    }

    /**
     * Returns value of last added number to the linked list
     * and removes it from the linked list.
     * @return last added number to linked list
     *         or -1 if list is empty.
     */
    public int pop() {
        if (isEmpty())
            return LIST_EMPTY_INT;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Implementation of linked list's node storing integer number
     * and references to next and previous nodes.
     */
    public class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Creates new node with
         * stored value defined by the parameter.
         * @param i integer value to be stored in node.
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Returns value stored in node.
         * @return value stored in node.
         */
        public int getValue() {
            return value;
        }

        /**
         * Gets reference to previous node.
         * @return reference to previous node.
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets reference to previous node.
         * @param prev reference to previous node.
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns reference to next node.
         * @return reference to next node.
         */
        public Node getNext() {
            return next;
        }
        
        /**
         * Sets reference to next Node.
         * @param next reference to next Node.
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

}
