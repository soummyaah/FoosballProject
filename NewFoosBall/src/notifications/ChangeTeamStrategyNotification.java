package notifications;

import mainclasses.Game;

public class ChangeTeamStrategyNotification extends Notification
{

	public ChangeTeamStrategyNotification(Game game)
	{
		super(game);
	}

	@Override
	public void handleByTeamLogicThread()
	{
		if(Thread.currentThread().getId() == this.game.getField().getTeamA().threadID)
		{
			if (this.handledByTeamLogicThreadA)
			{
				try
				{
					Thread.sleep(10);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Switching");
				System.out.println(this.game.getField().getTeamA() + ": " + this.game.getField().getTeamA().getStrategy());
				this.game.getField().getTeamA().setStrategy(this.game.getField().getTeamA().getStrategy().getInverseStrategy());
				this.handledByTeamLogicThreadA = true;
				System.out.println(this.game.getField().getTeamA() + ": " + this.game.getField().getTeamA().getStrategy());
			}
		}
		else
		{
			if (this.handledByTeamLogicThreadB)
			{
				try
				{
					Thread.sleep(100);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Switching");
				System.out.println(this.game.getField().getTeamB() + ": " + this.game.getField().getTeamB().getStrategy());
				this.game.getField().getTeamB().setStrategy(this.game.getField().getTeamB().getStrategy().getInverseStrategy());
				this.handledByTeamLogicThreadB = true;
				System.out.println(this.game.getField().getTeamB() + ": " + this.game.getField().getTeamB().getStrategy());
			}
		}
	}

	@Override
	public void handleByRenderingThread()
	{
		if (this.handledByRenderingThread)
		{
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		this.handledByRenderingThread = true;
	}

	@Override
	public void handleByMainThread()
	{
		if (this.handledByMainThread)
		{
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			return;
		}
		this.handledByMainThread = true;
	}

	@Override
	public void handleByBallLogicThread()
	{
		if (this.handledByBallLogicThread)
		{
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		this.handledByBallLogicThread = true;
	}

}
