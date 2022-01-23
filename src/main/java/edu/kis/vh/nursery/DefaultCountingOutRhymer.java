package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERR_Value = -1;
    private static final int MAX_Length = 12;
    private final int[] numbers = new int[MAX_Length];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERR_Value;
    }

    public boolean isFull() { return total == 11; }

    protected int peekaboo() {
        if (callCheck())
            return ERR_Value;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_Value;
        return numbers[total--];
    }

}
