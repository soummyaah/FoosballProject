package notifications;

import game.Team;
import mainclasses.Game;
import misc.ScoreBoard;

public class GoalNotification extends ResetLayoutNotification
{	
	String goalMessage;
	private ScoreBoard goalsScored;
	
	public GoalNotification(Team winner, String goalMessage, Game game,ScoreBoard scoreBoard) 
	{
		super(game, winner);
		this.goalsScored = scoreBoard;
		winner.incrementScore();
		System.out.println(goalMessage + "Score: "+ this.getGoalsScored().getScoreTeamA()+" - "+this.getGoalsScored().getScoreTeamB());
	}

	public ScoreBoard getGoalsScored() {
		return goalsScored;
	}

}