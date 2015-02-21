package foosballTests;



public class NewTest {
  //Note: Single Test Case Works 

/* 1. all the notifications are running after all the flags have been cleared
 * 2. ball goes to the  conceding team's gk
 * d3. wall reflections are perfect (compare initial and after reflection speeds) X
 * d4. wall reflections are perfect (compare initial and after reflection speeds) Y
 * 5. attacker stays an attacker after shooting
 * 6. defence team strategy changes after blocking and passing
 * d7. score being updated on Goal
 * d8. ball x speed resetting to zero
 * d9. ball y speed resetting to zero
 * 10. 
 * 11. 
 * 12. 
 * 13. 
 * 14. 
 * 15. 
 * 16. 
 */

//	@Test
//	public void allThreadsHaveProcessedTheNotification() {
//		Difficult
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
////		Notification goal = new GoalNotification("Goal!",game,game.getField().getTeamA(),game.getScoreBoard());
//
//		boolean finalValue = goal.handledByBallLogicThread && goal.handledByMainThread 
//				&& goal.handledByRenderingThread && goal.handledByTeamLogicThreadA
//				&& goal.handledByTeamLogicThreadB;
//		assertThat(finalValue,is(equalTo(true)));
//	}

//	@Test
//	public void wallReflectionsArePerfectinTermsOfXAxis() {
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
//		Ball ball = game.getField().getBall();
//		int initialXSpeed = ball.getxSpeed();
//		for(int i = 0;i<4;i++) 
//		{
//			if(ball.silhouette.intersects(ball.game.getField().getWalls().silhouette[i]))
//			{
//				if (i%2 == 0)		ball.setySpeed(-1 * ball.getySpeed());
//				else				ball.setxSpeed(-1 * ball.getxSpeed());
//			}
//		}	
//		assertThat(ball.getxSpeed(), is(equalTo(initialXSpeed)));
//	}

//	@Test
//	public void wallReflectionsArePerfectinTermsOfYAxis() {
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
//		Ball ball = game.getField().getBall();
//		int initialYSpeed = ball.getySpeed();
//		for(int i = 0;i<4;i++) {
//			if(ball.silhouette.intersects(ball.game.getField().getWalls().silhouette[i]))
//			{
//				if (i%2 == 0)
//				{
//					ball.setySpeed(-1 * ball.getySpeed());
//				}
//				else
//				{
//					ball.setxSpeed(-1 * ball.getxSpeed());
//				}
//			}
//		}	
//		assertThat(ball.getySpeed(), is(equalTo(initialYSpeed)));
//	}
//	
//	
//	@Test
//	public void attackerStaysAnAttackerAfterShooting(){
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
//		Ball ball = game.getField().getBall();
//		Position ballPossitionAfterGoal = new Position(ball.getBallPosition());
//
//		Team concedingTeam = ball.getLastContactTeam().getOpponent();
//		Position concedingTeamGKPostion = new Position(concedingTeam.getPositionOfGoalKeeper());
//
//		assertThat(ballPossitionAfterGoal, is(equalTo(concedingTeamGKPostion)));
//	}
//	
//	@Test
//	public void defenceStratergyChangesToAttack() {
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
//		Team teamA = game.getField().getTeamA();
//		
//		TeamStrategy teamStratergy = teamA.getStrategy();
////		assertThat(ballPossitionAfterGoal, is(equalTo(concedingTeamGKPostion)));
//	}


//	@Test
//	public void concedingTeamGKHasTheBallAfterAGoal() {
//		Game game = new Game(new Formation(4, 3, 3), TeamSide.LEFT, CoinSide.HEADS);
//		Ball ball = game.getField().getBall();
//		
//		Position ballPossitionAfterGoal = new Position(ball.getBallPosition());
//		Team concedingTeam = ball.getLastContactTeam().getOpponent();
//		Position concedingTeamGKPostion = new Position(concedingTeam.getPositionOfGoalKeeper());
//
//		assertThat(ballPossitionAfterGoal, is(equalTo(concedingTeamGKPostion)));
//	}

	
}
