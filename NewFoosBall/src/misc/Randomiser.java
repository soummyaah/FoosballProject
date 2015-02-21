package misc;

import java.util.Random;

public class Randomiser
{
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static boolean getRandomBool()
	{
		return (rand.nextBoolean());
	}
	
	public static int getRandomInt(int min, int max)
	{
		return (rand.nextInt(max - min + 1) + min);
	}
}
