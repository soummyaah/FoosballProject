package foosballTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import game.Formation;
import game.TeamSide;
import mainclasses.Game;
import misc.CoinSide;
import notifications.GoalNotification;
import notifications.Notification;

import org.testng.annotations.Test;

import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;

public class ScoreBeingUpdatedOnGoal {
	@Test
	public void scoreBeingUpdatedOnGoal() {
			Game game = init();
			Notification goal = new GoalNotification(game.getField().getTeamA(),"Goal!",game,game.getScoreBoard());
			assertThat(game.getScoreBoard().getTotalGoals(), is(equalTo(1)));
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
