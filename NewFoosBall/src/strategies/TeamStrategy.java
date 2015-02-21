package strategies;

public enum TeamStrategy
{
	ATTACK, DEFEND;
	
	public TeamStrategy getInverseStrategy()
	{
		return this.equals(ATTACK)? DEFEND : ATTACK;
	}
	
	@Override
	public String toString()
	{
		return this.name();
	}
}
