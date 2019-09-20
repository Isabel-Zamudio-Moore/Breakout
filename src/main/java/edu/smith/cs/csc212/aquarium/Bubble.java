//citations: https://moodle.smith.edu/pluginfile.php/730027/mod_resource/content/0/03_Java_OOP_Lists.pdf, DrawFish Class,
//https://www.youtube.com/watch?v=QkGI5_HhiU8&feature=youtu.be
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/** 
 * Class for the Bubble Array
*/
public class Bubble {
	int speed;
	int x0;
	int y0;
	int radius;
	Color color;
	
	
	public Bubble(Graphics2D b) {
		this.speed=speed;
		this.x0= x0;
		this.y0= y0;
		this.radius= radius;
		this.color= color; 
	}		
	
	public void BubbleArray(Graphics2D b) {
		Random rand= new Random();
		
		// Create a list of 10 bubbles and draw
		List [] Bubbles = new ArrayList[10];
		for (int i=0; i<Bubbles.size(); i++) {
			// Calculate random center points & radiuses
			this.x0= rand.nextInt(200);
			this.y0= rand.nextInt(200);
			this.radius= rand.nextInt(20);
			Shape Bubble = new Ellipse2D.Double(this.x0, this.y0, this.radius, this.radius);
			b.setColor(Color.cyan);
			b.fill(Bubble);
			drawB(b);
			}
		
		//for (Bubbles:Bubbles) {
			//Bubble.drawB(b); }
		}
		
		// Create Bubble
	//draw bubbles
	public void drawB(Graphics2D g, ArrayList t) {
		g.setColor(this.color);
		for (int i=0; i< Bubbles.length()); i++) {
			//Bubbles[i].draw(g);
		}
		//g.fill(Bubble);
		//g.draw(Bubble);
	}
		
	// Bubble drift upwards
		public void drift() {
			this.speed-=2;
		}
			
			}
	

