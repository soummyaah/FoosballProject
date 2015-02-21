package misc;

public enum CoinSide {
	HEADS (0),
	TAILS (1);
	
	private final int side;
	
	CoinSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return this.side;
	}

	public CoinSide getOtherSide() {
		return (this.equals(HEADS) ? TAILS: HEADS);
	}
}