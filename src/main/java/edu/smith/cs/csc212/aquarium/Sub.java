//citation https://www.youtube.com/watch?v=2zbhI_Vo1G8&feature=youtu.be
package edu.smith.cs.csc212.aquarium;

	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.Shape;
	import java.awt.geom.Ellipse2D;
	import java.util.ArrayList;
	import java.util.Random;
	
	
	public class Sub {
			int y0;
			int x0;
			int radius0;
			int radius1;
			int Height;
			int Width;
			int speed;
			int xdest;
			int ydest;

			
public Sub(Graphics2D b, int Width, int Height) {
		this.y0= y0;
		this.x0= x0;
		this.radius0= radius0;
		this.radius1= radius1;
		this.Height=Height;
		this.Width=Width;
		this.speed=speed;
		this.xdest=xdest;
		this.ydest=ydest;
			this.radius0= 70;
			this.radius1= this.radius0 -20;
			this.y0 = 10;
			this.x0= this.Width-50;
			xdest= 10;
			ydest=10;
		
			}	
			
	public void Write(Graphics2D u) {
		Shape body = new Ellipse2D.Double(this.x0, this.y0, this.radius0, this.radius1);
		Shape top = new Ellipse2D.Double(this.x0, this.y0-10, this.radius0, this.radius1);
		u.setColor(Color.lightGray);
		u.fill(body);
		u.draw(body);
		u.setColor(Color.black);
		u.fill(top);
		u.draw(top);
		
		if (this.xdest<=this.x0) {
			this.x0=-2;
		
		} else {
			this.x0-=2;
		}
		
	}
			
	public void move() {
		this.x0+=2;
		/*
		 * if (this.xdest<=this.x0) { this.x0-= 2; } else if (this.xdest >= this.x0) {
		 * this.x0-=2; }
		 */
	}

}

	
	