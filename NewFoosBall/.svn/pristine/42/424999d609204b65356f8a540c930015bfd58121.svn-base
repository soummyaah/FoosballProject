package game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import misc.Position;

public class Goal {

	Position goalPosition;
	int goalHeight;
	Rectangle silhouette;
	
	public Goal(Position goalPosition, int goalHeight)
	{
		this.goalPosition = goalPosition;
		this.goalHeight = goalHeight;
		this.silhouette = new Rectangle(goalPosition.getX(), goalPosition.getY(), 50, goalHeight);
	}
	
	public Position getGoalPosition() {
		return goalPosition;
	}
	public void setGoalPosition(Position goalPosition) {
		this.goalPosition = goalPosition;
	}
	public int getGoalHeight() {
		return goalHeight;
	}
	public void setGoalHeight(int goalHeight) {
		this.goalHeight = goalHeight;
	}
	
	public void draw(Graphics2D g)
	{
		g.setColor(Color.RED);
		g.drawRect(this.silhouette.x, this.silhouette.y,
				this.silhouette.width, this.silhouette.height);
	}
}
