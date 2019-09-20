package edu.smith.cs.csc212.aquarium;

	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.Shape;
	import java.awt.geom.Ellipse2D;
	import java.util.ArrayList;
	import java.util.Random;
	
	public class FeedFishSoon{
			int y0;
			int x0;
			int radius0;
			int radius1;
			int radius2;
			int Height;
			int Width;
			Fish Fish;

			
public FeedFishSoon(Graphics2D b, int Width, int Height, Fish Fish) {
		this.y0= y0;
		this.x0= x0;
		this.radius0= radius0;
		this.radius1= radius1;
		this.radius2= radius2;
		this.Height=Height;
		this.Width=Width;
		this.Fish=Fish;
			}	
			
	public void Write(Graphics2D b, int Width, int Height) {
			this.radius0=50;
			this.radius1=20;
			this.radius2=30;
			this.y0 =this.Height-50;
			this.x0= this.Width-50;
			Shape Sw0 = new Ellipse2D.Double(this.x0, this.y0, this.radius0, this.radius0);
			Shape Sw1 = new Ellipse2D.Double(this.x0-20, this.y0, this.radius0, this.radius0);
			Shape Sw2 = new Ellipse2D.Double(this.x0-40, this.y0, this.radius2, this.radius0);
			b.setColor(Color.green);
			b.fill(Sw0);
			b.fill(Sw1);
			b.fill(Sw2);
					b.draw(Sw0);
					b.draw(Sw1);
					b.draw(Sw2);
					}
		
		
		
		
		
					}

	
	
		
