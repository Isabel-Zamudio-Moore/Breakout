// citations: https://github.com/jjfiv/CSC212Aquarium, https://www.youtube.com/watch?v=f4OzM1lov3g
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Scanner;


public class Fish {
	// Initiation for needed variables
	Color color;
	int y;
	int x;
	Boolean size;
	Boolean direction;
	int xdest;
	int ydest;
	double slow;
	double fast;
	double moderate;

	// Fish constructor
	public Fish(int xPoint, int yPoint, Color color, Boolean size, Boolean direction) {
		this.x = yPoint; 
		this.y= xPoint;
		this.color= color;
		this.size= size;
		this.direction= direction;
		this.xdest= xdest;
		this.ydest= ydest;

		
		}
	
	
	
	public void Write(Graphics2D m) {
		
		Scanner scan = new Scanner();
		Random rand = new Random();
		this.xdest= rand(100);
		this.ydest= rand(100);
		
		move();
	// If statement determines the direction and size of fish and draws it
	if ((size==true) && (direction==true)) {
		this.xdest=this.xdest;
		DrawFish.facingLeft(m, this.color, this.x,this.y);

		// Draw small facing right fish
	} else if ((size==true) && (direction==false)){	
		this.xdest= -this.xdest;
		DrawFish.facingRight(m, this.color, this.x, this.y);
	
		// Draw big facing left fish		
	} else if ((size==false) && (direction==true)){
		this.xdest=this.xdest;
		DrawFish.smallFacingLeft(m, this.color, this.x, this.y);

		// Draw big facing right fish
	} else {	
		this.xdest=-this.xdest;
		DrawFish.smallFacingRight(m, this.color, this.x, this.y);	}
	}
	
	// tells fish in which direction to swim
	public void move() {
		this.x-=2;
	}
}


	




