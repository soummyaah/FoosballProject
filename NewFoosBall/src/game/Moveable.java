package game;

import exceptions.UnsupportedMethodCalledException;

public interface Moveable
{
	public void move(boolean up) throws UnsupportedMethodCalledException;
	public void moveX(int howMuch) throws UnsupportedMethodCalledException;
	public void moveY(int howMuch) throws UnsupportedMethodCalledException;
}