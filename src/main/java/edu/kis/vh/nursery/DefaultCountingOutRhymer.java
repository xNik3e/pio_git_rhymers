package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERR_Value = -1;
    public static final int MAX_Length = 12;
    private int[] numbers = new int[MAX_Length];

    public int total = -1;

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
