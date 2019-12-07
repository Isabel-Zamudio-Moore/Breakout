package edu.smith.cs.csc212.Breakout;

//citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//

import java.awt.Color;
import java.awt.Graphics2D;

public class Panel {
	static Color color=Color.darkGray;

	
	public Panel(int xdest, int ydest, int W, int H, Graphics2D g) {
		draw(xdest, ydest, W,H, g);
	}
	
	public static void draw(int xdest, int ydest, int W, int H, Graphics2D g) {
		int bW=100;
		int bH=15;
		g.setColor(Color.darkGray);
	//Create Lower Bar
		g.fillRect(xdest, H-100, bW, bH);
	}
	
}
