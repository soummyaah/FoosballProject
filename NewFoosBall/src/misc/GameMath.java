package misc;

import game.Ball;
import players.Player;

public class GameMath
{
	static final float DEG_TO_RAD = (2.0f*3.14159f)/360.0f;
	static final double RAD_TO_DEG = 1.0/DEG_TO_RAD;
	static final int TABLE_SIZE = 360;
	static float cos_table[];
	static float sin_table[];
	
	static{
		cos_table  = new float[TABLE_SIZE];
		sin_table  = new float[TABLE_SIZE];
		double temp;
		for (int i=0; i<TABLE_SIZE; i++) {
			temp = DEG_TO_RAD*(double)i;
			cos_table[i] = (float)Math.cos(temp);
			sin_table[i] = (float)Math.sin(temp);
		}
	}
	
	public static double angleToRad(double angle){
		return angle*DEG_TO_RAD;
	}
	
	public static double radToDeg(double angle){
		return angle*RAD_TO_DEG;
	}

	public static float cos(int degree) {
		if (degree >= 360) {
			degree = degree % 360;
		}
		else if (degree < 0) {
			degree = (-degree)%360;
		}
		return cos_table[degree];
	}

	public static float sin(int degree) {
		if (degree >= 360) {
			degree = degree % 360;
		}
		else if (degree < 0) {
			degree = (-degree)%360;
		}
		return sin_table[degree];
	}

	public static double computeAngle(int v1x,int v1y) {
		double t= Math.atan2((double) v1y, (double)v1x);
		t *= RAD_TO_DEG;
		if (t < 0.0) t += 360.0;
		return (double)t;
	}
	
	public static double computeAngle(int x1, int y1, int x2, int y2){
		double t= Math.atan2((double) (y2-y1), (double) (x2-x1));
		//t *= RAD_TO_DEG;
		//if (t < 0.0) t += 360.0;
		return -1*(double)t;
	}

	public static float computeMagnitude(int v1x,int v1y) {
		return (float)Math.sqrt((double)(v1x*v1x+v1y*v1y));
	}

	public static int getRand(int Max) {
		return (int)(Math.random() * Max);
	}
	public static float getRand(float Max) {
		return (float)(Math.random() * Max);
	}
	public static double getRand(double Max) {
		return (Math.random() * Max);
	}

	public static boolean playerHasBall(final Player player,final Ball ball)
	{
		return ball.getSilhouette().intersects(player.getSilhouette());
	}

	private static boolean numberLiesBetween(int a, int b, int c)
	{
		return ((a >= b) && (a <= c));
	}

	public static int pythonOr(boolean... args)
	{
		for(int i = 0; i < args.length; i++)
		{
			if (args[i]) return i;
		}
		return -1;
	}
}
