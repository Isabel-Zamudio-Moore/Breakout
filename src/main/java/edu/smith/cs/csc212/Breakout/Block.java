package edu.smith.cs.csc212.Breakout;

//citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.Random;


public class Block {
	/**
	 * horizontal location of block
	 */
	public int xdestBlock;
	/**
	 * vertical location of block
	 */
	public int ydestBlock;
	/**
	 * width of block
	 */
	public static int bW=40;
	/**
	 * height of block
	 */
	public static int bH=20;
	/**
	 * color of block
	 */
	public static Color finColor=Color.black;


	/**
	 * Handle Block Specific cations draw
	 * @param Width
	 * @param Height
	 * @param xLoc
	 * @param yLoc
	 * @param g
	 * @param color
	 */
	public Block(int Width, int Height, int xLoc,int yLoc, Graphics2D g, int color){	
draw(Width, Height, xLoc, yLoc, g,color);
	}

/**
 * Draw the Block
 * @param Width
 * @param Height
 * @param xLoc
 * @param yLoc
 * @param g
 * @param color
 */
public static void draw(int Width, int Height, int xLoc, int yLoc, Graphics2D g, int color) {
	Random rand=new Random();
	int shiftW=50;
	int shiftH=50;
	int xdestBlock=xLoc;
	int ydestBlock=yLoc;//GameSpace.randomCoord2();
	Color setColor;
	if (color==0) {
		finColor=Color.red;
		g.setColor(finColor);
	} else if(color==1) {
			finColor=Color.pink;
			g.setColor(finColor);
		} else {
			finColor=Color.cyan;
			g.setColor(finColor);
	}
	//Create Bar
	g.fillRect(xdestBlock, ydestBlock, bW, bH);

}


/**
 * Get X Method
 * @return X destination of Block
 */
public int getX() {
	return xdestBlock;
}


/**
 * Get Y Method
 * @return Y destination of Block
 */
public int getY() {
	return ydestBlock;
}


/**
 * Get Width Method
 * @return Width of Block
 */
public int getWidth() {
	return bW;
}

/**
 * Get Height Method
 * @return Height of Block
 */
public int getHeight() {
	return bH;
}


/**
 * Get Color Method
 * @return Color of Block
 */
public Color getColor() {
	return finColor;	
}


}
