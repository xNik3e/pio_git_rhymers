package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

//TODO: Remove redundant public modifiers

public interface Rhymersfactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
