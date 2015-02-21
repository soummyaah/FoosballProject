package game;

import java.awt.Graphics2D;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import mainclasses.Game;
import misc.Coin;
import misc.CoinSide;
import misc.Position;
import misc.ScoreBoard;
import players.Player;
import strategies.Playable;
import strategies.TeamStrategy;
import basicUI.GraphicData;
import exceptions.ShouldBeOverridenException;
import exceptions.UnsupportedMethodCalledException;
import exceptions.YouMessedUpException;

public class Team implements Playable, Moveable
{

	private String teamName;
	Formation formation;
	private Stick[] sticks;
	private Goal goal;
	TeamStrategy teamStrategy;
	public TeamSide teamSide;
	CoinSide coinSide;
	public long threadID;
	private Game game;
	int distanceMoved;
	ScoreBoard scoreBoard;
	
	public ScoreBoard getScoreBoard() {return scoreBoard;}
	public void incrementScore() {
		if (this.getTeamSide() == TeamSide.LEFT)
		{
			this.scoreBoard.setScoreTeamA(getScoreBoard().getScoreTeamA()+1);
		} else {
			this.scoreBoard.setScoreTeamB(getScoreBoard().getScoreTeamB()+1);
		}
		}
	
//	public void incrementScoreB() {this.scoreBoard.setScoreTeamB(getScoreBoard().getScoreTeamB()+1);}

	public CoinSide getCoinSide() {
		return coinSide;
	}

	public Team() {
		
	}
	
	public Team(
			String name, Formation formation,
			CoinSide coinSide, TeamSide teamSide, Game game, ScoreBoard scoreBoard) throws YouMessedUpException
		{
			this.setTeamName(name);
			this.formation = formation;
			this.game = game;
			this.coinSide = coinSide;
			Coin.setStrategy(this, coinSide);
			this.teamSide = teamSide;
			sticks = new Stick[4];
			this.formation.createStick(this, this.teamStrategy, sticks);
			this.goal = new Goal(new Position(this.teamSide.equals(TeamSide.LEFT) ? 
					GraphicData.playingAreaWidth/20: GraphicData.playingAreaWidth-(GraphicData.playingAreaWidth/11), GraphicData.goalStartY - (GraphicData.playingAreaHeight/22)), GraphicData.goalHeight);
			this.scoreBoard = scoreBoard;
		}

	public Formation getFormation() {return formation;}
	public void setFormation(Formation formation) {this.formation = formation;}

	@Override
	public boolean play() throws ShouldBeOverridenException,
			UnsupportedMethodCalledException
	{
		for (Stick stick: sticks)
			stick.play();
		
		return true;
	}

	/**
	 * This method will be called by the action listener.
	 */
	@Override
	public void move(boolean up) throws UnsupportedMethodCalledException
	{
		if (this.teamStrategy.equals(TeamStrategy.ATTACK)) return;
		
		this.distanceMoved += GraphicData.playingAreaHeight /(GraphicData.granuality*2)
				*(up?1:-1);
		if(Math.abs(this.distanceMoved)>=GraphicData.playingAreaHeight/2){
			this.distanceMoved -= GraphicData.playingAreaHeight /(GraphicData.granuality*2)
					*(up?1:-1);
			return;
		}
		for(Stick stick: sticks)
			stick.move(up);	
	}

	@Override
	public void moveX(int howMuch) throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}

	@Override
	public void moveY(int howMuch) throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}

	public Stick[] getSticks() {
		return sticks;
	}

	public void setSticks(Stick[] sticks) {
		this.sticks = sticks;
	}

	public void draw(Graphics2D g)
	{
		this.goal.draw(g);
		for(Stick stick: this.sticks)
		{
			stick.draw(g);
		}
		
	}

	public Position getPositionOfGoalKeeper() {
//		for(Stick stick : this.sticks) {
//			for(Player player : stick.getPlayers()) {
//				if (playerWanted.equals(player)) {
//					return player.getPlayerPosition();
//				}
//			}
//		}
//		return null;
		return this.sticks[0].getPlayers()[0].getPlayerPosition();
	}

	public void setStrategy(TeamStrategy teamStrategy) {
		this.teamStrategy = teamStrategy;
	}
	
	public TeamStrategy getStrategy()
	{
		return this.teamStrategy;
	}

	public Stick nextPassableStick(Stick stick)
	{
		for(int i = 0; i < 4; i++)
		{
			if (this.sticks[i].equals(stick))
				return this.sticks[i+1];
		}
		return null;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public TeamSide getTeamSide() {
		return teamSide;
	}


	@Override
	public String toString()
	{
		return this.getTeamName();
	}
	
	public Team getOpponent()
	{
		return (this.equals(this.game.getField().getTeamA())) ?
				this.game.getField().getTeamB():
					this.game.getField().getTeamA();
	}

	public Player getNearestPlayer(Ball ball)
	{
		int x = ball.getBallPosition().getX();
		int y = ball.getBallPosition().getY();
		Player answer = null;
		double min = Double.MAX_VALUE;
		
		for (Stick stick: this.sticks)
		{
			for(Player player: stick.getPlayers())
			{
				double temp = Math.sqrt(
						Math.pow((player.getPlayerPosition().getX() - x), 2) +
						Math.pow((player.getPlayerPosition().getY() - y), 2));
				if (temp < min)
				{
					answer = player;
					min = temp;
				}
			}
		}
		return answer;
		
	}

	public void mirrorBall(Robot bot) throws InterruptedException
	{
		//No Need of checking which team calls this function
		//Position oldPosition = new Position(this.game.getField().getBall().getBallPosition());
				//would just press UP and down if the ball is above the center or not.
//			if(this.game.getField().getBall().getBallPosition().getY() > GraphicData.goalCenter)
		
		if (Thread.currentThread().getId() != this.game.getField().getTeamB().threadID)
		{
			return;
		}
		
		Ball ball = this.game.getField().getBall();
		Player toMove = this.getNearestPlayer(ball);
//		System.out.println("Nearest player is " + toMove);
		
		if(toMove.getPlayerPosition().getY() == ball.getBallPosition().getY()) return;
		
		if (toMove.getPlayerPosition().getY() < ball.getBallPosition().getY()*(1-this.game.getContext().getCompError()))
		{
			
//						bot.keyPress(KeyEvent.VK_S);
//						try
//						{
//							Thread.sleep(10);
//						} catch (InterruptedException e)
//						{
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
			try
			{
				this.move(false);
				if (toMove.getPlayerPosition().getY() > ball.getBallPosition().getY())
				{
					this.move(true);
				}
				else
				{
					this.move(true);
					bot.keyPress(KeyEvent.VK_S);
				}
			} catch (UnsupportedMethodCalledException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("W!");
			//press up
		}
		else
		{
			try
			{
				this.move(true);
				if (toMove.getPlayerPosition().getY() < ball.getBallPosition().getY())
				{
					this.move(false);
				}
				else
				{
					this.move(false);
					bot.keyPress(KeyEvent.VK_W);
					Thread.sleep(100);
				}
			} catch (UnsupportedMethodCalledException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//press down
			//				System.out.println("s!"); //getting the same position as before
//						bot.keyPress(KeyEvent.VK_D);
//						try
//						{
//							Thread.sleep(10);
//						} catch (InterruptedException e)
//						{
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
		}	
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}	
}
