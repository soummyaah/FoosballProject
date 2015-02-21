package basicUI;

import game.Field;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import mainclasses.Game;
import misc.Timer;


	
	
	public class DrawOnGlassPane{
		JPanel panel;
		Field field;
		Timer timer;
		Game game;
		
    public DrawOnGlassPane(final Game game) {
    	
    	this.field = game.getField();
    	this.game = game;
    	
		this.panel = new JPanel() 
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g)  
			{
				field.getTeamA().draw((Graphics2D)g);
				field.getTeamB().draw((Graphics2D)g);
				field.getBall().draw((Graphics2D)g);
				field.draw((Graphics2D)g);
			}
		};
};
}
