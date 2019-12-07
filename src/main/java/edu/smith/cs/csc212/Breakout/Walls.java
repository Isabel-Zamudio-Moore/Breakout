package edu.smith.cs.csc212.Breakout;

//citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//

import java.awt.Color; 
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
public class Walls {
	static Color color;
	int x;
	int y;
	

public Walls(int Width, int Height, Graphics2D g){
	Walls.draw(Width,Height,g);
}

public static void draw (int Width, int Height, Graphics2D g) {
	int bW=25;
	int bH=25;
	color=Color.green;
	g.setColor(color);
//Create Upper Bar
	g.fillRect(0, 0, Width,bH);
//Create Lower Bar
	g.fillRect(0, -bH+Height, Width,bH);
	g.setColor(Color.orange);
//Create Left bar
	g.fillRect(0, bH, bW,Height);
//Create Right Bar
	g.fillRect(Width-bW, bH, bW,Height);
	}
}
