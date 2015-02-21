package threads;

import mainclasses.Game;
import misc.Timer;

public class TimerThread implements Runnable {
	Game game;
	
	public TimerThread(Game game) {
		this.game = game;
	}
	
	
	@Override
	public void run() {
		while(true)
		{
			Timer gameTimer = this.game.getTimer();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			gameTimer.setClock(gameTimer.getClock()+1);
		}
		
	}

}
