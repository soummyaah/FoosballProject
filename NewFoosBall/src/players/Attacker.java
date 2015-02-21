package players;

import strategies.AttackingStrategy;
import strategies.TeamStrategy;
import exceptions.ShouldBeOverridenException;
import exceptions.UnsupportedMethodCalledException;

public class Attacker extends Player implements AttackingStrategy{

	@Override
	public boolean play() throws UnsupportedMethodCalledException, ShouldBeOverridenException
	{	
		if (!super.play()) return false;
		
		if (this.getTeamStrategy().equals(TeamStrategy.ATTACK))
		{
			this.shoot();
		}
		else
		{
			this.block();
		}
		return true;
	}
	
	@Override
	public void pass() throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}
	
}
