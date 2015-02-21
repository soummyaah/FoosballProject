package game;

import misc.Randomiser;
import players.Attacker;
import players.Defender;
import players.Goalkeeper;
import players.Midfielder;
import strategies.TeamStrategy;
import exceptions.YouMessedUpException;

public class Formation {

	private int defenderNumber;
	private int attackerNumber;
	private int midfielderNumber;
	
	public int getDefenderNumber() {return defenderNumber;}
	public void setDefenderNumber(int defenderNumber) {this.defenderNumber = defenderNumber;}
	public int getAttackerNumber() {return attackerNumber;}
	public void setAttackerNumber(int attackerNumber) {this.attackerNumber = attackerNumber;}
	public int getMidfielderNumber() {return midfielderNumber;}
	public void setMidfielderNumber(int midfielderNumber) {this.midfielderNumber = midfielderNumber;}
	
	public void createStick(Team team, TeamStrategy strategy, 
			Stick[] sticks) throws YouMessedUpException
	{
		if (sticks == null || sticks.length != 4)
			throw new YouMessedUpException();
		
		sticks[0] = new Stick(team, strategy, 1, Goalkeeper.class);
		sticks[1] = new Stick(team, strategy, this.defenderNumber, Defender.class);
		sticks[2] = new Stick(team, strategy, this.midfielderNumber, Midfielder.class);
		sticks[3] = new Stick(team, strategy, this.attackerNumber, Attacker.class);
	}
	
	public Formation(int a, int b, int c)
	{
		this.defenderNumber = a;
		this.midfielderNumber = b;
		this.attackerNumber = c;
	}
	
	public static Formation getRandomFormation() {
		int noOfDefenders = 0;
		int noOfMidFielders = 0;
		int noOfAttackers = 0;
		int total = 0;
		do{
			noOfDefenders = Randomiser.getRandomInt(3,6);
			noOfMidFielders = Randomiser.getRandomInt(2, 6);
			noOfAttackers = Randomiser.getRandomInt(1, 4);
			total = noOfDefenders + noOfAttackers + noOfMidFielders;
		}while(total!=10 && noOfAttackers<=4 && noOfAttackers>=1);
		Formation formation = new Formation(noOfDefenders, noOfMidFielders, noOfAttackers);
		return formation;
	}
}
