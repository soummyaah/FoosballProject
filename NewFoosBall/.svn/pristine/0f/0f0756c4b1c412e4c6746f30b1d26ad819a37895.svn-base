package game;

import java.awt.Graphics2D;
import java.util.HashMap;

import misc.Position;
import players.Player;

public class Field {

	Ball ball;
	Team teamA;
	Team teamB;
	Position centreCoordinates;
	HashMap<Player, Position> playerInitialPositionTeamA;
	HashMap<Player, Position> playerInitialPositionTeamB;
	Walls walls;
	
	public Field(Team teamA, Team teamB, Ball ball) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.ball = ball;
		this.walls = new Walls();
		getInitialPositions();
	}

	public Walls getWalls() {
		return walls;
	}
	
	

	public Team getTeamA()
	{
		return teamA;
	}
	public Team getTeamB()
	{
		return teamB;
	}

	public Ball getBall() {
		return this.ball;
	}

	public void getInitialPositions() {
		//get the array list of all the players
		playerInitialPositionTeamA = new HashMap<>();
		for(Stick stick : this.getTeamA().getSticks()) {	
			for(Player player : stick.getPlayers()) {
				playerInitialPositionTeamA.put(player, player.getPlayerPosition().clone());
			}
		}
		
		playerInitialPositionTeamB = new HashMap<>();
		for(Stick stick : this.getTeamB().getSticks()) {
			for(Player player : stick.getPlayers()) {
				playerInitialPositionTeamB.put(player, player.getPlayerPosition().clone());
			}
		}
	}

	public void resetPositions()
	{	
		this.teamA.distanceMoved = this.teamB.distanceMoved = 0;
		if (this.teamA.threadID == Thread.currentThread().getId())
		{
			for(Stick stick : this.getTeamA().getSticks()) 
			{	
				for(Player player : stick.getPlayers()) 
				{
					player.setPlayerPosition(playerInitialPositionTeamA.get(player).clone());
				}
			}
		}
		
		else
		{
			for(Stick stick : this.getTeamB().getSticks()) 
			{	
				for(Player player : stick.getPlayers()) 
				{
					player.setPlayerPosition(playerInitialPositionTeamB.get(player).clone());
				}
			}	
		}

	}

	public void draw(Graphics2D g)
	{
		this.walls.draw(g);
	}
}
