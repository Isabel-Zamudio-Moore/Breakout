//https://moodle.smith.edu/pluginfile.php/733979/mod_resource/content/0/04_Java_OOP_Lists.pdf
package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

	

public class ColorGet {
	int ix;
	int iy;
	int Width;
	int Height;
	int i;
	Random random= new Random();
	
	
	public ColorGet(int Width, int Height) {
		this.ix=ix;
		this.iy=iy;
		this.Width=Width;
		this.Height=Height;
	}
	
	public void WriteR(Graphics2D cg) {
		Random random= new Random();
		this.ix= 0;
		this.iy= 0;
		cg.setColor(Color.green);	
		cg.drawString(".", this.ix, this.iy);
	}
	
	public ColorGet() {
		Color [] Colors = {Color.green, Color.blue, Color.magenta, Color.yellow};
	}
	
	
	
	


	public void move() {
		this.ix+= 5;
		
	}
	
}
