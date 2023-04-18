package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!checkCall() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
