// citations: https://github.com/jjfiv/CSC212Aquarium, https://www.youtube.com/watch?v=f4OzM1lov3g, 
// https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/package-summary.html
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class Fish {
	// Initiation for needed variables
	Color color;
	int y;
	int x;
	Boolean size;
	Boolean direction;
	int xdest;
	int ydest;
	int speed;
	double slow;
	double fast;
	double moderate;
	

	// Fish constructor
	public Fish(int xPoint, int yPoint, Color color, Boolean size, Boolean direction, int Speed) {
		this.x = yPoint; 
		this.y= xPoint;
		this.color= color;
		this.size= size;
		this.direction= direction;
		this.speed=Speed;
		this.xdest= xdest;
		this.ydest= ydest;
		
		}
	
	
	
	public void Write(Graphics2D m) {
		Scanner scan= new Scanner(System.in);
		Random rand = new Random();
		
		
	// If statement determines the direction and size of fish and draws it
	if ((size==true) && (direction==true)) {
		DrawFish.facingLeft(m, this.color, this.x, this.y);
		randDest();
		this.xdest= -this.xdest;
		move();

		// Draw small facing right fish
	} else if ((size==true) && (direction==false)){	
		DrawFish.facingRight(m, this.color, this.x, this.y);
		randDest();
		this.xdest= this.xdest;
		move();
	
		// Draw big facing left fish		
	} else if ((size==false) && (direction==true)){
		DrawFish.smallFacingLeft(m, this.color, this.x, this.y);
		randDest();
		this.xdest= -this.xdest;
		move();
		
		// Draw big facing right fish
	} else {	
		DrawFish.smallFacingRight(m, this.color, this.x, this.y);	
		randDest();
		this.xdest= this.xdest;
		move();
		}
	}
	
	public void randDest() {
		int start= 0;
		int stop= 200;
		this.xdest= rand(stop);
		this.ydest= rand(stop);
		return;
	}
	
	private int rand(int i) {
		// TODO Auto-generated method stub
		return 0;
	}



	// tells fish in which direction to swim
	public void move() {
		if (this.direction ==true) {
		this.x-= this.speed;
	}
		else if (this.direction==false) {
			this.x+= this.speed;
	} else {
				this.x+=this.speed;
			}
			
}
		// Check if fish is within 10 units of y or x
		public void destCheck() {
			
			if ((Math.abs(this.xdest-this.x)< 10) && (Math.abs(this.ydest-this.y)< 10)) {
				randDest();
			}
		}
		


}


	




