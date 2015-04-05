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

package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import accessory.*;
import javax.swing.Timer;
import player.*;
import audio.*;

public class Management extends BasicGame {

	
	private Ball ball;
	
	/**
	 * Player's raket
	 */
	private Racket racket1;
	
	/**
	 * Player's raket
	 */
	private Racket racket2;
	
	/**
	 * payer number 1
	 */
	static Player player1;
	
	/**
	 * Player number 2
	 */
	static Player player2;
	
	/**
	 * State of game
	 */
	private boolean isPaused;
	
	/**
	 * Speed of ball (pixels per second)
	 * if time is pause, then, the game is paused
	 */
	private javax.swing.Timer time;
	
	/**
	 * Last key pressed 
	 */
	private Input key;
	
	/**
	 * "door" of the container
	 */
	private Rectangle collisionAreaUp;
	
	/**
	 * "roof" of the container
	 */
	private Rectangle collisionAreaDown;
	
	/**
	 * 
	 * Contains all elemnt of the game, and it is the screen of game.
	 */
	static AppGameContainer container;

	
	public Management(String title) {
		super(title);
		this.isPaused = false;
	}

	
	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		
		// estas tres lineas dibujan las lineas que dividen el tablero
		g.drawLine(600, 100, 600, 600);
		g.drawLine(0, 100, 1200, 100);
		g.drawRect(0, 599, 1200, 599);
		
		
		//Dran the rackets and the ball on the container
		this.ball.getBall().draw(this.ball.getX(), this.ball.getY());
		this.racket1.getImage().draw(this.racket1.getX(), this.racket1.getY());
		this.racket2.getImage().draw(this.racket2.getX(), this.racket2.getY());
		
		//Catch the last key pressed
		this.key = arg0.getInput();
		
		if(this.isPaused){
			g.drawString("Juego pausado\n\npresione Enter para comenzar", 475, 180);
		}
		
		drawScore(g);
		
	}

	/**
	 * Init all elemtns and puts the elements on container 
	 */
	@Override
	public void init(GameContainer container) throws SlickException {
		this.isPaused = true;
		this.ball = new Ball();
		this.racket1 = new Racket(0, 250);
		this.racket2 = new Racket(1160, 250);
		this.collisionAreaUp = new Rectangle (0, 0, 1200, 100); 
		this.collisionAreaDown = new Rectangle (0, 599, 1200, 599);
		time = new Timer(12, new TimerClass());
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {	
		this.detectKey();
		this.updateScore();
	}
	
	
	/**
	 * Motion flow of ball
	 */
	private void ballMotion(){

		//This method is too long, improve it
		
		byte option = 0;

		if(this.ball.getCollisionArea().intersects(this.racket1.getCollisionArea())){
			this.ball.setHorizontalMotion('E');

			if(this.ball.getVerticalMotion() == 'N'){

				if(this.ball.getEastNorth()== 1){
					option = 2;
					this.ball.setEastNorth(option);
				}else if(this.ball.getEastNorth() == 2){
					option = 3;
					this.ball.setEastNorth(option);
				} else if(this.ball.getEastNorth() == 3){
					option = 4;
					this.ball.setEastNorth(option);
				} else if(this.ball.getEastNorth() == 4){
					option = 5;
					this.ball.setEastNorth(option);
				} else if(this.ball.getEastNorth() == 5){
					option = 6;
					this.ball.setEastNorth(option);
				} else if(this.ball.getEastNorth() == 6){
					option = 1;
					this.ball.setEastNorth(option);
				}
				
				

			}else{

				if(this.ball.getEastSouth() == 1){
					option = 2;
					this.ball.setEastSouth(option);
				}else if(this.ball.getEastSouth() == 2){
					option = 3;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 3){
					option = 4;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 4){
					option = 5;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 5){
					option = 6;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 6){
					option = 1;
					this.ball.setEastSouth(option);
				}

			}
			
			GameAudio.beeSound();

		}


		if(this.ball.getCollisionArea().intersects(this.racket2.getCollisionArea())){
			this.ball.setHorizontalMotion('O');

			if(this.ball.getVerticalMotion() == 'N'){

				if(this.ball.getWestNorth() == 1){
					option = 2;
					this.ball.setWestNorth(option);
				}else if(this.ball.getWestNorth() == 2){
					option = 3;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 3){
					option = 4;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 4){
					option = 5;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 5){
					option = 6;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 6){
					option = 1;
					this.ball.setWestNorth(option);
				}

			}else{

				if(this.ball.getWestSouth() == 1){
					option = 2;
					this.ball.setWestSouth(option);
				}else if(this.ball.getWestSouth() == 2){
					option = 3;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 3){
					option = 4;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 4){
					option = 5;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 5){
					option = 6;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 6){
					option = 1;
					this.ball.setWestSouth(option);
				}

			}
			
			GameAudio.beeSound();
		}



		if(this.ball.getCollisionArea().intersects(this.collisionAreaUp)){
			this.ball.setVerticalMotion('S');

			if(this.ball.getHorizontalMotionl()== 'E'){		

				if(this.ball.getEastSouth() == 1){
					option = 2;
					this.ball.setEastSouth(option);
				}else if(this.ball.getEastSouth() == 2){
					option = 3;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 3){
					option = 4;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 4){
					option = 5;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 5){
					option = 6;
					this.ball.setEastSouth(option);
				}else  if(this.ball.getEastSouth() == 6){
					option = 1;
					this.ball.setEastSouth(option);
				}
			}else{

				if(this.ball.getWestSouth() == 1){
					option = 2;
					this.ball.setWestSouth(option);
				}else if(this.ball.getWestSouth() == 2){
					option = 3;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 3){
					option = 4;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 4){
					option = 5;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 5){
					option = 6;
					this.ball.setWestSouth(option);
				}else  if(this.ball.getWestSouth() == 6){
					option = 1;
					this.ball.setWestSouth(option);
				}
			}
		}
		if(this.ball.getCollisionArea().intersects(this.collisionAreaDown)){
			this.ball.setVerticalMotion('N');

			if(this.ball.getHorizontalMotionl()== 'E'){		

				if(this.ball.getEastNorth() == 1){
					option = 2;
					this.ball.setEastNorth(option);
				}else if(this.ball.getEastNorth() == 2){
					option = 3;
					this.ball.setEastNorth(option);
				}else  if(this.ball.getEastNorth() == 3){
					option = 4;
					this.ball.setEastNorth(option);
				}else  if(this.ball.getEastNorth() == 4){
					option = 5;
					this.ball.setEastNorth(option);
				}else  if(this.ball.getEastNorth() == 5){
					option = 6;
					this.ball.setEastNorth(option);
				}else  if(this.ball.getEastNorth() == 6){
					option = 1;
					this.ball.setEastNorth(option);
				}

			}else{

				if(this.ball.getWestNorth() == 1){
					option = 2;
					this.ball.setWestNorth(option);
				}else if(this.ball.getWestNorth() == 2){
					option = 3;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 3){
					option = 4;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 4){
					option = 5;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 5){
					option = 6;
					this.ball.setWestNorth(option);
				}else  if(this.ball.getWestNorth() == 6){
					option = 1;
					this.ball.setWestNorth(option);
				}
			}
		}

	}

	
	/**
	 * 
	 * Dectects key thet was press
	 */
	private void detectKey(){
		if(key.isKeyDown(Input.KEY_UP) && !this.isPaused){
			if(this.racket2.getY() > 100){
				this.racket2.setY(this.racket2.getY()-1);
			}
		}

		if(key.isKeyDown(Input.KEY_DOWN) && !this.isPaused){
			if(this.racket2.getY() < 420){
				this.racket2.setY(this.racket2.getY()+1);
			}
		}

		if(key.isKeyDown(Input.KEY_A) && !this.isPaused){
			if(this.racket1.getY() > 100){
				this.racket1.setY(this.racket1.getY()-1);
			}
		}

		if(key.isKeyDown(Input.KEY_Z) && !this.isPaused){
			if(this.racket1.getY() < 420){
				this.racket1.setY(this.racket1.getY()+1);
			}
		}
		
		
		if(key.isKeyDown(Input.KEY_SPACE) && !this.isPaused){
			this.time.stop();
			this.isPaused = true;
		}
		if(key.isKeyDown(Input.KEY_ENTER) && this.isPaused){
			this.time.start();
			this.isPaused = false;
		}
	}


	/**
	 * 
	 * Draw on the container the score
	 * 
	 * @param g
	 */
	private void drawScore(Graphics g){
		
         g.drawString(this.player1.getName()+":  "+this.player1.getScore()+"  Vs  "+
        		 this.player2.getName()+":  "+this.player2.getScore() , 470, 50);
         
	}
	
	
	/**
	 * Update scores of the players, re-establishes the element in start position 
	 * and pause the game
	 */
	private void updateScore(){
		
		//It improve
		
		if(this.ball.getX()< 0 ){
			
			this.time.stop();
			Ball newb = new Ball();
			Racket r1 = new Racket(0, 250);
			Racket r2 = new Racket(1160, 250);
			this.racket1 = r1;
			this.racket2 = r2;
			this.ball = newb;
			this.player2.setScore(this.player2.getScore() + 1);
			this.isPaused = true;
			
		}else if(this.ball.getX()> 1200){
			
			this.time.stop();
			Ball newb = new Ball();
			Racket r1 = new Racket(0, 250);
			Racket r2 = new Racket(1160, 250);
			this.racket1 = r1;
			this.racket2 = r2;
			this.ball = newb;
			this.player1.setScore(this.player1.getScore() + 1);
			this.isPaused = true;
			
		}	
	}



	/**
	 * Init the game
	 * 
	 * @param args
	 * @throws SlickException
	 */
	public static void main(String []args) throws SlickException{
		
		String j1, j2;
		j1 = JOptionPane.showInputDialog("ingrese el nombre del\njugador 1");
		while (j1.equals("")) {
			j1 = JOptionPane.showInputDialog("debe ingresar un nombre\ningrese el nombre del\njugador 1");
		}

		j2 = JOptionPane.showInputDialog("ingrese el nombre del\njugador 2");
		while (j2.equals("")) {
			j2 = JOptionPane.showInputDialog("debe ingresar un nombre\ningrese el nombre del\njugador 2");
		}

		player1 = new Player(j1);
		player2 = new Player(j2);

		container = new AppGameContainer(new Management(""));//creamos un conteenedor que llevara este juego como parametro
		container.setDisplayMode(1200, 600, false);//el parametro con la propiedad false, es para evitar que ocupe toda la panttalla
		container.start();
	}

	
	public class TimerClass implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			
			//Set direction
			ballMotion();

			if(ball.getHorizontalMotionl() == 'E' && ball.getVerticalMotion() == 'N'){ 
				ball.eastNorthMotion(ball.getEastNorth());

			}

			if(ball.getHorizontalMotionl() == 'E' && ball.getVerticalMotion() == 'S'){
				ball.eastSouthMotion(ball.getEastSouth());

			}

			if(ball.getHorizontalMotionl() == 'O' && ball.getVerticalMotion() == 'N'){
				ball.westNorthMotion(ball.getWestNorth());
			}

			if(ball.getHorizontalMotionl() == 'O' && ball.getVerticalMotion() == 'S'){
				ball.westSouthMotion(ball.getWestSouth());
			}

		}
	}
}
