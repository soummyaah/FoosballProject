package foosballTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import game.Formation;
import game.TeamSide;
import mainclasses.Game;
import misc.CoinSide;
import notifications.Notification;
import notifications.ResetLayoutNotification;

import org.testng.annotations.Test;

import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;

public class BallxSpeedResetToZero {
	@Test
	public void BallxSpeedResetToZero() {
		Game game  = init();
		Notification reset = new ResetLayoutNotification(game, game.getField().getTeamA());
		int speedAfterCollision = game.getField().getBall().getxSpeed();
		assertThat(speedAfterCollision, is(equalTo(0)));
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
