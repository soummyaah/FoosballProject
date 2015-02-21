package players;

import misc.Randomiser;
import strategies.DefendingStrategy;
import strategies.TeamStrategy;
import exceptions.ShouldBeOverridenException;
import exceptions.UnsupportedMethodCalledException;

public class Defender extends Player implements DefendingStrategy{

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
