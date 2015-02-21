package foosballTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import game.Formation;
import game.TeamSide;
import mainclasses.Game;
import misc.CoinSide;

import org.testng.annotations.Test;

import difficulty.DifficultyContext;
import difficulty.EasyDifficulty;
import exceptions.BallAlreadyCreatedException;

public class totalNoOfPLayersEqualToElevenTeamB {
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

	@Test
	public void totalNoOfPlayersEqualToZeroTeamB() {
		Game game = init();
		int i,totalPlayers=0;
		for(i=0;i<4;i++) {
			totalPlayers += game.getField().getTeamB().getSticks()[i].getNoOfPlayers();
		}
		assertThat(totalPlayers, is(equalTo(11)));
	}
}
