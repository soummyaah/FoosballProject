package game;


public enum TeamSide
{
	LEFT(0), RIGHT(1);
	
	private final int side;
	
	TeamSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return this.side;
	}

	public TeamSide getOtherSide() {
		return this.equals(LEFT) ? RIGHT : LEFT;
	}
}
