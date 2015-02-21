package misc;

import game.Team;

import java.util.Random;

import strategies.TeamStrategy;

public class Coin{

	int toss;
	
    public static void setStrategy(Team team, CoinSide side){

    	if(team.getCoinSide().getSide() == CoinSide.HEADS.ordinal()) {
			team.setStrategy(TeamStrategy.ATTACK);
		} else {
			team.setStrategy(TeamStrategy.DEFEND);
		}
    }
    
	public CoinSide toss() {
		/* 0 signifies HEADS, 1 signifies 1*/
		Random toss = new Random();
		int coinToss = toss.nextInt(2);
		return CoinSide.values()[coinToss];
	}	
}
