package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTAL_MAX_SIZE = 12;
    public static final int TOTAL_EMPTY = -1;
    public static final int TOTAL_FULL = 11;
    private int[] numbers = new int[TOTAL_MAX_SIZE];

    public int total = TOTAL_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean checkCall() {
        return total == TOTAL_EMPTY;
    }

    public boolean isFull() {
        return total == TOTAL_FULL;
    }

    protected int peekaboo() {
        if (checkCall())
            return TOTAL_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (checkCall())
            return TOTAL_EMPTY;
        return numbers[total--];
    }

}
