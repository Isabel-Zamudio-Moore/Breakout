// citations: https://github.com/jjfiv/CSC212Aquarium
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

public class Fish{
	// Initiation for needed variables
	Color color;
	int y;
	int x;
	Boolean size;
	Boolean direction;

	// Fish constructor
	public Fish(int xPoint, int yPoint, Color color, Boolean size,
			Boolean direction) {
		this.x= xPoint;
		this.y= yPoint;
		this.color= color;
		this.size= size;
		this.direction= direction;
	}
	
	public void Draw(Graphics2D g){
		this.swim();
		
	// If statement determines the direction and size of fish
	// and draws it
	if ((size==true) && (direction==true)) {
		DrawFish.facingLeft(g, this.color, this.x,this.y);

		// Draw small facing right fish
	} else if ((size==true) && (direction==false)){	
		DrawFish.facingRight(g, this.color, this.x, this.y);
	
		// Draw big facing left fish		
	} else if ((size==false) && (direction==true)){
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);

		// Draw big facing right fish
	} else {	
		DrawFish.smallFacingRight(g, this.color, this.x, this.y);
	}
	}

	
	// tells fish in which direction to swim
	public void swim(){
		this.y+= -20;
		}

}
