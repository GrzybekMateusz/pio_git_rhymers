package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int LIST_EMPTY_INT = -1;
    public static final Node LIST_EMPTY = null;
    public static final boolean LIST_NOT_FULL = false;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == LIST_EMPTY;
    }
    
    public boolean isFull() {
        return LIST_NOT_FULL;
    }

    public int top() {
        if (isEmpty())
            return LIST_EMPTY_INT;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return LIST_EMPTY_INT;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
