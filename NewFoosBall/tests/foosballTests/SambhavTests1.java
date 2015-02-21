package foosballTests;

import mainclasses.Game;
import misc.CoinSide;

import org.testng.annotations.Test;

import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;
import game.Ball;
import game.Formation;
import game.Team;
import game.TeamSide;

/**
 * All tests are written in different files to avoid singleton pattern
 * errors from creating new ball
 * @author darkryder
 *
 */

public class SambhavTests1
{
	@Test(expectedExceptions={BallAlreadyCreatedException.class})
	public void testSingletonPatternOfBall() throws BallAlreadyCreatedException
	{
		// this will create a ball once
		Game game = new Game(new DifficultyContext(new EasyDifficulty()),
				new Formation(1, 2, 3), TeamSide.LEFT, CoinSide.HEADS);
		Ball ball = Ball.createNewBall(new Team(), game);
	}
}
