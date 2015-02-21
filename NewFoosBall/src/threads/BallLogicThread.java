package threads;

import game.Ball;
import mainclasses.Game;
import notifications.Notification;
import basicUI.GraphicData;

public class BallLogicThread implements Runnable{
	Ball ball;
	Game game;
	
	public BallLogicThread(Game game, Ball ball) {
		this.ball = ball;
		this.game = game;
	}

	private void handleNotification(Notification notification)
	{
		notification.handleByBallLogicThread();
	}
	
	@Override
	public void run() {
		while(true){
			
//			while(true)
//			{
//				if (ConcurrencyCheck.teamAThreadDone && 
//						ConcurrencyCheck.teamBThreadDone && 
//						!ConcurrencyCheck.ballThreadDone)
//				{
//					ConcurrencyCheck.reset();
//					break;
//				}
//				else
//				{
//					try
//					{
//						Thread.sleep(10);
//					} catch (InterruptedException e)
//					{
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			
			while(true)
			{
				if (game.notification == null) break;
				if (!game.notification.isHandlingLeft())
				{
					System.out.println("breaking");
					break;
				}
				this.handleNotification(game.notification);
			}
			this.game.notification = null;
//			System.out.println("BAll thread running running");
			ball.move();
			try {
				Thread.sleep(1000/GraphicData.FPS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
