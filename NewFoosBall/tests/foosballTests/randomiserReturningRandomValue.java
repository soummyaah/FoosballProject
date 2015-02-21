package foosballTests;

import static org.testng.AssertJUnit.assertTrue;
import game.Formation;
import game.TeamSide;
import mainclasses.Game;
import misc.CoinSide;
import misc.Randomiser;

import org.testng.annotations.Test;

import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;

public class randomiserReturningRandomValue {
	@Test
	public void randomiserReturningRandomValue() {
			Game game = init();
			int random,a,b;
			a = 5;
			b = 10;
			random = Randomiser.getRandomInt(a, b);
			//assertThat((random).isBetween(a, b));
			assertTrue(a <= random && random <= b);
		}
	public Game init() {
		DifficultyContext context = new DifficultyContext(new EasyDifficulty());
		Game game=null;
		try {
			game = new Game(context, new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
		} catch (BallAlreadyCreatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return game;	
		
	}
}
