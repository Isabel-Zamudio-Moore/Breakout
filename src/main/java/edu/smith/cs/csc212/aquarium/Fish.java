// citations: https://github.com/jjfiv/CSC212Aquarium, https://www.youtube.com/watch?v=f4OzM1lov3g, 
//https://moodle.smith.edu/pluginfile.php/721331/mod_resource/content/0/01_Welcome_and_Java_Syntax.pdf
// https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/package-summary.html
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

/** 
 * Class for Specialized Fish
*/
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
	Scanner scan = new Scanner(System.in);
	Random random=  new Random();

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

	// If statement determines the direction and size of fish and draws it
	if ((size==true) && (direction==true)) {
		DrawFish.facingLeft(m, this.color, this.x, this.y);
		randDestx();
		this.xdest= -this.xdest;
		move();

		// Draw small facing right fish
	} else if ((size==true) && (direction==false)){	
		DrawFish.facingRight(m, this.color, this.x, this.y);
		randDestx();
		move();
	
		// Draw big facing left fish		
	} else if ((size==false) && (direction==true)){
		DrawFish.smallFacingLeft(m, this.color, this.x, this.y);
		randDestx();
		this.xdest= -this.xdest;
		move();
		
		// Draw big facing right fish
	} else {	
		DrawFish.smallFacingRight(m, this.color, this.x, this.y);	
		randDestx();
		move();
		}
	}
	
	// Create a Random Destination dependng on conditions
	public void randDestx() {
		// Initialize Random
		Random random=  new Random();
		//if destination is in bounds do not change
		if  ( (0 >= this.xdest) | (this.xdest <= 200)) {
			int start= 0;
			int stop= 200;
			if (destCheck()==true) {
				this.xdest = random.nextInt(stop-start);}
		} else {
			int start= 0;
			int stop= 200;
			//Create new destination
			this.xdest = random.nextInt(stop-start);
			//if x is less than zero or off screen reverse direction and find new destination
			if (this.xdest < 0) {
				this.direction =! this.direction;
				//get new x destination at least 20 greater than lower bound
				this.xdest = random.nextInt(stop-20-start)+20;
				// if x is greater than bound then ask for a new destination.
			} else if (this.xdest>200) {
				// get new direction and x dest at least 20 units less than upper bound
				this.direction =! this.direction;
				this.xdest = random.nextInt(stop-start)-20;
			}
			// check if fish center is within 10 units of its given destination
			else if (destCheck()==true) {
				this.xdest = random.nextInt(stop-start);
			}
		}
	}



	// tells fish in which direction to swim
	public void move() {
		// if within 10 units of destination then change direction and speed opposite direction
		if (destCheck() == true) {
			this.direction=! this.direction;
			this.x=-this.speed;
		} else {
			if (this.direction ==true) {
				this.x-= this.speed;
			} else if (this.direction==false) {
				this.x+= this.speed;
			} else {
				this.x+=this.speed; }	}}
		
		// Check if fish is within 10 units of y or x
		public boolean destCheck() {
			if ((Math.abs(this.xdest-this.x)< 10) && (Math.abs(this.ydest-this.y)< 10)) {
				return true;
			}	else {
					return false;
				}
				
			}
		}
		




	




