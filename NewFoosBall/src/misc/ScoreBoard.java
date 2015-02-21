package misc;

import java.awt.Color;
import java.awt.Graphics2D;

public class ScoreBoard {
	public ScoreBoard() {
		super();
		this.scoreTeamA = 0;
		this.scoreTeamB = 0;
	}
	public int getTotalGoals() {
		return getScoreTeamA()+getScoreTeamB();
	}
	private int scoreTeamA;
	private int scoreTeamB;
	
	public int getScoreTeamA() {
		return scoreTeamA;
	}
	public void setScoreTeamA(int scoreTeamA) {
		this.scoreTeamA = scoreTeamA;
	}
	public int getScoreTeamB() {
		return scoreTeamB;
	}
	public void setScoreTeamB(int scoreTeamB) {
		this.scoreTeamB = scoreTeamB;
	}
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.cyan);
		g.drawString(Integer.toString(this.getScoreTeamA())+" - "+Integer.toString(this.getScoreTeamB()), 180.5F, 666.1200F);
	}
}
