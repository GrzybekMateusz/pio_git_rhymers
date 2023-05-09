package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_QUANTITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int FULL_RHYMER_INDICATOR = NUMBERS_QUANTITY - 1;
    private static final int RETURN_VAL_IF_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_QUANTITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    //TODO: Remove unused method or modify code to find usage for it.
    public int getTotal() {
        return total;
    }

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

    //TODO: Create exception for handling empty numbers array, because numbers array may store -1
    protected int peekaboo() {
        if (checkCall())
            return RETURN_VAL_IF_EMPTY;
        return numbers[total];
    }

    //TODO: Create exception for handling empty numbers array, because numbers array may store -1
    public int countOut() {
        if (checkCall())
            return RETURN_VAL_IF_EMPTY;
        return numbers[total--];
    }

}
