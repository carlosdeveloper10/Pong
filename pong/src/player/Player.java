/*
 * Copyright (c) 2012 Carlos Mario. 
 * Please, click on the link to find information about the
 * license: https://github.com/carlosprogrammer/Pong/blob/master/LICENSE
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


package player;

/**
 * 
 * Represents a player on the game
 * 
 * @author Carlos Mario <carlos_programmer10@homail.comt>
 *
 */
public class Player {
	
	/**
	 * Player name
	 */
	private String strName;
	
	/**
	 * Player score
	 */
	private int intScore;
	
	/**
	 * initializes an instance of this class with the player name
	 * and the score always starts on 0
	 * 
	 * @param name player name
	 */
	public Player(String name){
		this.strName = name;
		this.intScore = 0;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public String getName() {
		return strName;
	}

	/**
	 * 
	 * @param name the palyer name
	 */
	public void setName(String name) {
		this.strName = name;
	}

	/**
	 * 
	 * @return
	 */
	public int getScore() {
		return intScore;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.intScore = score;
	}
}
