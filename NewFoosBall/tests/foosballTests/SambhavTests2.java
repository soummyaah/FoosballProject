package foosballTests;

import static org.testng.AssertJUnit.assertFalse;
import mainclasses.Game;
import misc.CoinSide;
import threads.TimerThread;
import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;
import game.Formation;
import game.TeamSide;


public class SambhavTests2
{
	public void timeIsIncrementedEverySecond() throws BallAlreadyCreatedException, InterruptedException
	{
		Game game = new Game(new DifficultyContext(new EasyDifficulty()),
				new Formation(1, 2, 3), TeamSide.LEFT, CoinSide.HEADS);
		Thread timer = new Thread(new TimerThread(game));
		timer.start();
		
		int initial = game.getTimer().getClock();
		
		Thread.sleep(3000);
		
		int final_t = game.getTimer().getClock();
						
		assertFalse(final_t < initial);

		
	}
}
