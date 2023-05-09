package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!checkCall() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
