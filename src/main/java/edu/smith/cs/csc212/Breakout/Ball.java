package edu.smith.cs.csc212.Breakout;

// citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//
import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;


public class Ball{
	public Color color;
	public int xdest;
	public int ydest;
	public static int xSpeed=1;
	public static int ySpeed=1;
	static int bWidth=50/2;
	static int bHeight=50/2;

public Ball(int Width,int Height,Graphics2D g, int xdest,int ydest) {//,Graphics2D g) {
	Ball.draw(Width,Height,g,xdest,ydest);
}

/**
 * Get X Method
 * @return X destination of Ball
 */
public int getX() {
	return this.xdest;
}
/**
 * Get Y Method
 * @return  Y destination of Ball
 */
public int getY() {
	return this.ydest;
}

/**
 * Get Width Method
 * @return  Width of Ball
 */
public int getWidth() {
	return this.bWidth;
}
/**
 * Get Height Method
 * @return  Height of Ball
 */
public int getHeight() {
	return this.bHeight;
}


/**
 * Draw Method
 * @param Width
 * @param Height
 * @param g
 * @param xdest
 * @param ydest
 */
public static void draw(int Width,int Height,Graphics2D g, int xdest,int ydest) {//,Graphics2D g) {
	int W=Width;
	int H=Height;
	Graphics2D Ball=g;
	Ball.setColor(Color.blue);
	xdest=xdest+xSpeed;
	
//	Ball.fillRect(Width/2,Height/2,bWidth,bHeight);
	if (Height>0) {
		H-=1;
		W+=1;
		Ball.fillRect(xdest,ydest, bWidth, bHeight);
	}
}


}
