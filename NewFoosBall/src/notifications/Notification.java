package notifications;

import mainclasses.Game;

public abstract class Notification implements Notifiable
{
	public boolean handledByRenderingThread  = false;
	public boolean handledByBallLogicThread  = false;
	public boolean handledByTeamLogicThreadA = false;
	public boolean handledByTeamLogicThreadB = false;
	
	/* change it when required */
	public boolean handledByMainThread 		 = true;

	
	public Game game;
	
	public Notification(Game game)
	{
		this.game = game;
	}
	
	public boolean isHandlingLeft()
	{
		return !(this.handledByBallLogicThread && this.handledByMainThread &&
				this.handledByRenderingThread && this.handledByTeamLogicThreadA &&
				this.handledByTeamLogicThreadB);
	}
}
