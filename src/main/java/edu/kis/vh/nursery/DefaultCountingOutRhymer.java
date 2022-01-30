package edu.kis.vh.nursery;

/**
 *  Rhymer based on stack implementation
 */
public class DefaultCountingOutRhymer {

    private static final int ERR_Value = -1;
    private static final int MAX_Length = 12;
    private final int[] numbers = new int[MAX_Length];

    private int total = -1;

    /**
     * @return number of elements
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adding new elements
     * @param in value of the new element
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return boolean value True when table is empty, False when it is not
     */
    public boolean callCheck() {
        return total == ERR_Value;
    }

    /**
     * @return boolean value True when table is full (total is equal to 11), False when it is not
     */
    public boolean isFull() { return total == 11; }

    /**
     * @return last element
     */
    protected int peekaboo() {
        if (callCheck())
            return ERR_Value;
        return numbers[total];
    }

    /**
     * @return last element and delete it from the stack
     */
    public int countOut() {
        if (callCheck())
            return ERR_Value;
        return numbers[total--];
    }

}
