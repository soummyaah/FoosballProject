package difficulty;

public class YouLooseDifficulty implements Difficulty{

	public static final double selfError = 0.5;
	public static final double compError = 0.0;
	
	public double getSelfError(){
		return this.selfError;
	}
	
	public double getCompError(){
		return this.compError;
	}
	
//	Just yield baby!
	
}
