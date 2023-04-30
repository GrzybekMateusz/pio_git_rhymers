package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_QUANTITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int FULL_RHYMER_INDICATOR = NUMBERS_QUANTITY - 1;
    private static final int RETURN_VAL_IF_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_QUANTITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean checkCall() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
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
