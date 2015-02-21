package difficulty;

public class DifficultyContext {

	private Difficulty difficulty;

	public DifficultyContext(Difficulty difficulty){
		this.difficulty = difficulty;
	}

	public double getSelfError(){
		return difficulty.getSelfError();
	}
	public double getCompError(){
		return difficulty.getCompError();
	}
	
}