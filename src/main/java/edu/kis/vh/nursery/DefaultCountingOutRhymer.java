package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_QUANTITY = 12;
    public static final int TOTAL_EMPTY = -1;
    public static final int TOTAL_FULL = NUMBERS_QUANTITY - 1;
    public static final int RETURN_VAL_IF_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_QUANTITY];

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
            return RETURN_VAL_IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (checkCall())
            return RETURN_VAL_IF_EMPTY;
        return numbers[total--];
    }

}
