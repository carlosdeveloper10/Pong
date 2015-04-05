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


package accessory;


import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


/**
 * 
 * Represents a ball on the game
 * 
 * @author Carlos Mario <carlos_programmer10@homail.comt>
 *
 */
public class Ball {

	/**
	 * 
	 * Image of racket
	 * 
	 * Visit and read to find more info about org.newdawn.slick.Image
	 */
	protected Image image;
	
	/**
	 * 
	 * Read to find more info about org.newdawn.slick.geom.Rectangle
	 */
	private Rectangle collisionArea;
	
	/**
	 * Size respect to X
	 */
	protected byte Xsize;
	
	/**
	 * Size respect to Y
	 */
	protected byte Ysize;
	
	/**
	 * Position at x
	 */
	protected int X;
	
	/**
	 * Position at y
	 */
	protected int Y;
	
	
	
	/*
	 * =================
	 * Atributes of motion:
	 * Direction and inclination for the ball motion
	 * =================
	 */
	
	/**
	 * 
	 * motion with towards east north
	 */
	private byte eastNorth;
	
	/**
	 * 
	 * motion with towards east south
	 */
	private byte eastSouth;
	
	/**
	 * 
	 * motion with towards west north
	 */
	private byte westNorth;
	
	/**
	 * 
	 * motion with towards west south
	 */
	private byte westSouth;
	
	/**
	 * 
	 * motion with towards
	 */
	private char horizontalMotion;
	
	/**
	 * 
	 * motion with towards
	 */
	private char verticalMotion;
	
	/**
	 * Initializes an instance of this class.
	 */
	public Ball(){
		
		this.horizontalMotion = 'E';
		this.verticalMotion = 'N';
		this.Xsize = 40;
		this.Ysize = 40;
		this.eastNorth = 1;
		this.eastSouth = 1;
		this.westNorth = 1;
		this.westSouth = 1;
		this.X = 580;
		this.Y = 320;
		this.collisionArea = new Rectangle(this.X, this.Y, this.Xsize, this.Ysize);
		
		
		try {
			this.image = new Image("Imagenes/Pelota.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * Move the ball towards east north
	 * 
	 * @param direction 
	 */
	public void eastNorthMotion(byte direction){
		switch(direction){
		case 1:
			this.setX(this.getX()+10);
			this.setY(this.getY()-1);
			break;
		case 2:
			this.setX(this.getX()+10);
			this.setY(this.getY()-2);
			break;
		case 3:	
			this.setX(this.getX()+10);
			this.setY(this.getY()-3);
			break;
		case 4:
			this.setX(this.getX()+10);
			this.setY(this.getY()-4);
			break;
		case 5:
			this.setX(this.getX()+10);
			this.setY(this.getY()-5);
			break;
		case 6:
			this.setX(this.getX()+10);
			this.setY(this.getY()-6);
			break;
		
		}
	}

	/**
	 * Move the ball towards east north
	 * 
	 * @param direction 
	 */
	public void eastSouthMotion(byte direction){
		switch(direction){
		case 1:
			this.setX(this.getX()+10);
			this.setY(this.getY()+1);
			break;
		case 2:
			this.setX(this.getX()+10);
			this.setY(this.getY()+2);
			break;
		case 3:	
			this.setX(this.getX()+10);
			this.setY(this.getY()+3);
			break;
		case 4:
			this.setX(this.getX()+10);
			this.setY(this.getY()+4);
			break;
		case 5:
			this.setX(this.getX()+10);
			this.setY(this.getY()+5);
			break;
		case 6:
			this.setX(this.getX()+10);
			this.setY(this.getY()+6);
			break;	
		}
	}

	/**
	 * Move the ball towards west south
	 * 
	 * @param direction 
	 */
	public void westSouthMotion(byte direction){
		switch(direction){
		case 1:
			this.setX(this.getX()-10);
			this.setY(this.getY()+1);
			break;	
		case 2:
			this.setX(this.getX()-10);
			this.setY(this.getY()+2);
			break;	
		case 3:	
			this.setX(this.getX()-10);
			this.setY(this.getY()+3);
			break;
		case 4:
			this.setX(this.getX()-10);
			this.setY(this.getY()+4);
			break;
		case 5:
			this.setX(this.getX()-10);
			this.setY(this.getY()+5);
			break;	
		case 6:
			this.setX(this.getX()-10);
			this.setY(this.getY()+6);
			break;
		}
	}

	/**
	 * Move the ball towards west north
	 * 
	 * @param direction 
	 */
	public void westNorthMotion(byte direction){
		switch(direction){
		case 1:
			this.setX(this.getX()-10);
			this.setY(this.getY()-1);
			break;
		case 2:
			this.setX(this.getX()-10);
			this.setY(this.getY()-2);
			break;
		case 3:	
			this.setX(this.getX()-10);
			this.setY(this.getY()-3);
			break;
		case 4:
			this.setX(this.getX()-10);
			this.setY(this.getY()-4);
			break;
		case 5:
			this.setX(this.getX()-10);
			this.setY(this.getY()-5);
			break;
		case 6:
			this.setX(this.getX()-10);
			this.setY(this.getY()-6);
			break;
		
		}
	}

	
	

	/*
	 *========================================================
	 * All gets and sets methods.
	 * =======================================================
	 * 
	 */
	
	public Image getBall() {
		return image;
	}

	public void setBall(Image ball) {
		this.image = ball;
	}

	public byte getXSize() {
		return Xsize;
	}

	public void setXsize(byte Xsize) {
		this.Xsize = Xsize;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
		this.UpdateCollisionArea();
	}

	public byte getYsize() {
		return Ysize;
	}

	public void setYSize(byte Ysize) {
		this.Ysize = Ysize;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
		this.UpdateCollisionArea();
	}

	public Rectangle getCollisionArea() {
		return collisionArea;
	}

	public void setAreaColision(Rectangle collisionArea) {
		this.collisionArea = collisionArea;
	}

	public char getHorizontalMotionl() {
		return horizontalMotion;
	}

	public void setHorizontalMotion(char horizontalMotion) {
		this.horizontalMotion = horizontalMotion;
	}

	public char getVerticalMotion() {
		return verticalMotion;
	}

	public void setVerticalMotion(char verticalMotion) {
		this.verticalMotion = verticalMotion;
	}
	
	/**
	 * Updates the collision are at new x and y position
	 */
	private void UpdateCollisionArea(){
		this.collisionArea.setLocation(this.X, this.Y);
	}

	public byte getEastNorth() {
		return eastNorth;
	}

	public void setEastNorth(byte eastNorth) {
		this.eastNorth = eastNorth;
	}

	public byte getEastSouth() {
		return eastSouth;
	}

	public void setEastSouth(byte astSouth) {
		this.eastSouth = astSouth;
	}

	public byte getWestNorth() {
		return westNorth;
	}

	public void setWestNorth(byte westNorth) {
		this.westNorth = westNorth;
	}

	public byte getWestSouth() {
		return westSouth;
	}

	public void setWestSouth(byte westSouth) {
		this.westSouth = westSouth;
	}
}
