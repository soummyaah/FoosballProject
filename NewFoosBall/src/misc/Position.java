package misc;

import exceptions.UnsupportedMethodCalledException;
import game.Moveable;

public class Position implements Moveable
{

	private int xCoordinate;
	private int yCoordinate;
	
	public Position(int x,int y) 
	{
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public Position(Position p) 
	{
		this.xCoordinate = p.getX();
		this.yCoordinate = p.getY();
	}

	public int getX(){return xCoordinate;}
	public void setX(int xCoordinate){this.xCoordinate = xCoordinate;}

	public int getY(){return yCoordinate;}
	public void setY(int yCoordinate){this.yCoordinate = yCoordinate;}
	
	public void move() throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}

	public void moveX(int howMuch) throws UnsupportedMethodCalledException
	{
		this.xCoordinate += howMuch;
	}

	public void moveY(int howMuch) throws UnsupportedMethodCalledException
	{
		this.yCoordinate += howMuch;
	}

	@Override
	public void move(boolean up) throws UnsupportedMethodCalledException
	{
		throw new UnsupportedMethodCalledException();
	}
	
	@Override
	public String toString()
	{
		return "x: " + this.xCoordinate + " y: " + this.yCoordinate;
	}
	
	@Override
	public Position clone()
	{
		return new Position(this.xCoordinate, this.yCoordinate);
	}
}
