package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/** 
 * Class for the Predator & Prey Interactions
*/
public class Interactions {
	// Variables for Predator 
	int xr;
	int yr;
	int x0r;
	int y0r;
	int radiusr;
	Color color;
	// Variables for Fish
	int xf;
	int yf;
	int x0f;
	int y0f;
	int radiusf;
	
	public Interactions() {
		this.xr= xr;
		this.yr= yr;
		this.x0r= x0r;
		this.y0r= y0r;
		this.radiusr= radiusr;
		this.color= color;
		this.xf= xf;
		this.yf= yf;
		this.x0f= x0f;
		this.y0f= y0f;
		this.radiusf= radiusf;
	
		
	}		
		
	
	public void MonsterFish (Graphics2D d){
		// Create Monster Fish
		this.xr=50;
		this.yr=50;
		this.radiusr=10;
		Shape body = new Ellipse2D.Double( this.xr, this.yr, this.radiusr, this.radiusr*2);
		Shape eyes = new Ellipse2D.Double(this.xr-20,  this.yr+5,  this.radiusr*(1/8), this.radiusr*(1/8));
		
	d.fill(body);
	d.setColor(Color.cyan);
	}
	

	public void drawMonsterF(Graphics2D d) {
		
	}
	
	public void PreyFish(Graphics2D d) {
	//Create array of fish
	List PreyFish[] = new ArrayList[20];
	for (int i=0; i< PreyFish.length; i++) {
		}
	}

	public void drawPreyFish(Graphics2D d) {
		this.xf=50/2;
		this.yf=50/2;
		this.radiusf=10/2;
		Shape body = new Ellipse2D.Double( this.xf, this.yf, this.radiusf, this.radiusf*2);
		Shape eyes = new Ellipse2D.Double(this.xf-20,  this.yf+5,  this.radiusf*(1/8), this.radiusf*(1/8));
				
	}
	
	//Fish Destination
	
	//Remove Fish from Array
	
	// Undraw fish outside of array
	
}