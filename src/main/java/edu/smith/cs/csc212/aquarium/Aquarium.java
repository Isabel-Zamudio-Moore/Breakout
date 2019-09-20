// citations: https://github.com/jjfiv/CSC212Aquarium
// https://www.youtube.com/watch?v=f4OzM1lov3g
package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top", WIDTH, HEIGHT);
	
	public Random random= new Random();

	// Create width and center for treasure chest which is used in two classes
	public int trx=500;
	public int trwidth=200;
	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
		
	}

	// Get initial positions of fish that were initially in starter code
	int fish1X = getWidth() + 100;
	int fish2X = getWidth() + 300;
	int fish3X = getWidth() - 100;

		// Create fish for fish class
		Fish lP = new Fish(190, 100, Color.blue, false, true, 2);
		Fish Tl= new Fish(180, 150, Color.green, true, true, 1);
		Fish Eu= new Fish(200, 200, Color.yellow, false, false, 1);
		Fish LS= new Fish(300, 100, Color.gray, true, false, 1);
	
	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		//TankChange(tank.Color);
		//Color color= colorGet(WIDTH, HEIGHT);
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());

		// Draw the fish!
		DrawFish.facingLeft(g, Color.yellow, fish1X, 200);
		// Draw the confused fish!
		DrawFish.facingRight(g, Color.green, fish3X, 300);

		// What if we wanted this little fish to swim, too?
		DrawFish.smallFacingLeft(g, Color.red, fish2X, 100);
		
		//DrawFish.smallFacingRight(g,  lP.color, lP.x, lP.y);
		
		// Create a new fish
		lP.Write(g);
		Tl.Write(g);
		Eu.Write(g);
		LS.Write(g);

		Treasure Tr= new Treasure(g, HEIGHT, WIDTH);
		Tr.Write(g, HEIGHT,WIDTH);

		// Draw our snail!
		algorithm.draw(g);

				
		Sub submarine=new Sub(g, WIDTH, HEIGHT);
		submarine.Write(g);
		// Move the fish!
		fish1X -= 1;
		fish2X -= 2;
		fish3X += 5;
		
		
		// Create a array of 10 bubbles and draw
		Bubble [] Bubbles = new Bubble[10];
		for (int i=0; i<Bubbles.length; i++) {;
			Bubbles[i]= new Bubble(WIDTH, HEIGHT);
		}

		
		Interactions INTERACT= new Interactions();
			
		// Draw the bubbles
		for (Bubble Bubble: Bubbles) {
			// Calculate random center points & radiuses
			int Bradius = random.nextInt(20);
			int x0=random.nextInt(trwidth);
			int y0=random.nextInt(HEIGHT)-120;
			if ((x0 < -100) | (x0 > trwidth)){
			y0=-1;}
			Bubble.Write(g, Bradius, x0, y0);
			
			}
		
		
		FeedFishSoon Sw=new FeedFishSoon(g, WIDTH, HEIGHT, lP);
		Sw.Write(g, WIDTH, HEIGHT);
		

		
		//Bubble.Write(g);
		// Create an Array of Rocks and have them drawn
		//List [] Rocks = new ArrayList[10];
		//for (int n=0; n< Rocks.length; i++) {
			//Rocks Rock= new Rocks(g, WIDTH, HEIGHT);
			//g.Write(Rocks);
	}
	

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
		
	}

}
