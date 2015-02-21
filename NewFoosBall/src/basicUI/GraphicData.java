package basicUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GraphicData
{
	public static final int granuality = 15;
	public static final int playerySpeed = 50;
	public static int stickWidth = 4;
	public static int playerWidth = 20;
	private static Dimension temp = Toolkit.getDefaultToolkit().getScreenSize();
	public static Dimension playingDimension = new Dimension(9*temp.width/10,9*temp.height/10);
	public static int playingAreaHeight = playingDimension.height;
	public static int playingAreaWidth = playingDimension.width;
	public static int FPS = 60;
	public static final int ballWidth = 10;
	public static final int ballHeight = 10;
	public static final int goalCenter = playingAreaHeight / 2;
	public static final int goalHeight = playingAreaHeight / 7;
	public static final int goalStartY = goalCenter - goalHeight/2;
	public static final double effectivePanelPercentage = 0.90;
	public static final double effectivePlayingAreaPercentage = 0.80;
}
