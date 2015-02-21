package players;

import strategies.GoalkeepingStrategy;
import exceptions.ShouldBeOverridenException;
import exceptions.UnsupportedMethodCalledException;

public class Goalkeeper extends Player implements GoalkeepingStrategy
{
	/**
	 * Assuming that if the ball reaches the goalkeeper even if
	 * the team is in defence state, it will pass the ball to the
	 * defender and will not blindly deflect it.
	 * @throws ShouldBeOverridenException 
	 */
	@Override
	public boolean play() throws UnsupportedMethodCalledException, ShouldBeOverridenException
	{
		if (!super.play()) return false;
		
		this.pass();
		
		return true;
	}
	
	@Override
	public void shoot() throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}
	
	@Override
	public void block() throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}
}
