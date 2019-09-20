package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

public class Rocks {
	int ix;
	int iy;
	int Width;
	int Height;
	

	/** 
	 * Class for Moving Rocks
	*/
public Rocks(Graphics2D r, int Width, int Height) {
	this.ix=ix;
	this.iy=iy;
	this.Width=Width;
	this.Height=Height;
}

public void WriteR(Graphics2D r) {
	Random random= new Random();
	this.ix= random.nextInt(Width);
	this.iy= random.nextInt(Height);
	r.setColor(Color.green);	
	r.drawString(".", this.ix, this.iy);
	//Rocks.draw();
	
}

public void move() {
	//
}
}



