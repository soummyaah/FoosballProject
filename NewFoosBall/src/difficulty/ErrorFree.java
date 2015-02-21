package difficulty;

public class ErrorFree implements Difficulty {

	public static final double selfError = 0;
	public static final double compError = 0;
	
	public double getSelfError(){
		return this.selfError;
	}
	
	public double getCompError(){
		return this.compError;
	}
	
}
