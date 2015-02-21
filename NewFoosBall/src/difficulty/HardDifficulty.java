package difficulty;

public class HardDifficulty implements Difficulty{

	public static final double selfError = 0.2;
	public static final double compError = 0.05;
	
	public double getSelfError(){
		return this.selfError;
	}
	
	public double getCompError(){
		return this.compError;
	}
	
//	Pro – The margin of error for passes and shoots for computer is less than that of user.

}
