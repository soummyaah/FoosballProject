package misc;

import java.awt.Color;
import java.awt.Graphics2D;

import basicUI.UI;

public class Timer
{
	public int clock;
	public Timer(){
		this.clock = 0;
	}
	
	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
		UI.updateTime(this.clock);
	}
	
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.red);
		g.drawString(Integer.toString(this.getClock()), 119.5F, 666.1200F);
	}
	
}
