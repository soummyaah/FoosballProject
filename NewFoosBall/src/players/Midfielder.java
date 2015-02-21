package players;

import misc.Randomiser;
import strategies.MidfieldingStategy;
import strategies.TeamStrategy;
import exceptions.ShouldBeOverridenException;
import exceptions.UnsupportedMethodCalledException;

public class Midfielder extends Player implements MidfieldingStategy
{
	@Override
	public boolean play() throws UnsupportedMethodCalledException, ShouldBeOverridenException
	{
		if (!super.play()) return false;
		
		if (this.getTeamStrategy().equals(TeamStrategy.ATTACK))
		{
			if (Randomiser.getRandomBool()) 
				this.shoot();
			else
				this.pass();
		}
		else
		{
			this.block();
		}
		
		return true;
	}
}
