package difficulty;

public class EasyDifficulty implements Difficulty {

	public static final double selfError = 0;
	public static final double compError = 0.3;
	

	public double getSelfError(){
		return this.selfError;
	}
	
	public double getCompError(){
		return this.compError;
	}
	
	
//	Novice level – The margin of error for passes and shoots for computer is greater than that of
//	user.

}
