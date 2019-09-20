package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * Class that tells treasure
*/
public class Treasure {
	int trx;
	int ery;
	int trwidth;
	int trheight; 
	int Height;
	int Width;


public Treasure(Graphics2D t, int Height, int Width) {
	this.trx=trx;
	this.ery=ery;
	this.trwidth=trwidth;
	this.trheight= trheight;
	this.Height= Height;
	this.Width=Width;
}

public void Write(Graphics2D t, int Height, int Width) {	
	this.trx=Width-500;
	this.ery=Height-100;
	this.trwidth=200;
	this.trheight=200;
	
		t.setColor(Color.black);
		Shape Treasure = new Rectangle2D.Double(this.trx, this.ery, this.trheight, this.trwidth);
		t.fill(Treasure);
		t.draw(Treasure); 	
}
	
}
