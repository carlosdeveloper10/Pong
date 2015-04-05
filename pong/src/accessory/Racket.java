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
import org.newdawn.slick.Graphics;

/**
 * 
 * Represents a Racket on the game
 * 
 * @author Carlos Mario <carlos_programmer10@homail.comt>
 *
 */
public class Racket {

	/**
	 * 
	 * Image of racket
	 * 
	 * Visit and read to find more info about org.newdawn.slick.Image
	 */
	private Image image;//Contendra laimagen
	
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
	protected int Ysize;
	
	/**
	 * Position at x
	 */
	protected int X;
	
	/**
	 * Position at y
	 */
	protected int Y;
	

	/**
	 * initializes a instance of this class with the position at x and y of the racket
	 * 
	 * @param x position at x
	 * @param y position at y
	 */
	public Racket(int x, int y){

		this.Xsize = 40;
		this.Ysize = 180;
		this.X = x;
		this.Y = y;
		this.collisionArea = new Rectangle(this.X, this.Y, this.Xsize, this.Ysize);


		try {
			this.image = new Image("Imagenes/Raqueta.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}


	/*
	 *========================================================
	 * All gets and sets methods.
	 * =======================================================
	 * 
	 */
	public byte getXSize() {
		return Xsize;
	}

	public void setXSize(byte XSize) {
		this.Xsize = XSize;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
		this.collisionArea.setLocation(this.X, this.Y);
	}

	public int getYSize() {
		return Ysize;
	}

	public void setYsize(int Ysize) {
		this.Ysize = Ysize;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
		this.collisionArea.setLocation(this.X, this.Y);
	}

	public Rectangle getCollisionArea() {
		return collisionArea;
	}

	public void setCollisionArea(Rectangle collisionArea) {
		this.collisionArea = collisionArea;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
