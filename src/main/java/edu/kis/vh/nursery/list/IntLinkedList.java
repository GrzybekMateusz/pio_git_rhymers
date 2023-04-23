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
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
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
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return LIST_EMPTY_INT;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
