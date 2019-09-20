//citations: https://moodle.smith.edu/pluginfile.php/730027/mod_resource/content/0/03_Java_OOP_Lists.pdf, DrawFish Class,
//https://www.youtube.com/watch?v=QkGI5_HhiU8&feature=youtu.be
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.jjfoley.gfx.GFX;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/** 
 * Class for the Bubble Array
*/
public class Bubble {
	int speed;
	int x0;
	int y0;
	int radius;
	Color color;
	int trx;
	int trwidth;
	int twidth;
	int theight;
	Random random = new Random();


	
	public Bubble(int width, int height) {
		this.speed=speed;
		this.x0= x0;
		this.y0= y0;
		this.radius= radius;
		this.color= color;
		// for treasure
		this.trx=trx;
		this.trwidth=trwidth;
		this.trx=500;
		this.trwidth=200;
		// for tank
		this.twidth=width;
		this.theight=height;
		// Calculate random center points & radiuses
		
	}
		
		// Create Bubble
	//draw bubbles
	public void Write(Graphics2D g, int radius, int x0, int y0) {	
		// Create random parameters per bubble

		this.radius=radius;
		this.x0=x0;
		this.y0=y0;
		// Create bubble shape
		Shape Bubble = new Ellipse2D.Double(this.x0, this.y0, this.radius, this.radius);
		g.setColor(Color.magenta);
		g.fill(Bubble);
		g.draw(Bubble);
		drift();
	}
		
	// Bubble drift upwards
		public void drift() {
			this.speed-=2;
			this.y0-=this.speed;
		}
			
			}
	

