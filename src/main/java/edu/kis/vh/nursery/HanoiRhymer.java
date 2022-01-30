package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	//TODO: Need to add literal
	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
