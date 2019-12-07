package edu.smith.cs.csc212.Breakout;

//citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//


import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

public class EndPage extends GFX{

	public static int W=450;
	public static int H=450;
	
	public EndPage(Graphics2D EnP) {	
		drawMainPage(EnP);
	}

	public void drawMainPage(Graphics2D EnP) {
		int 
		WinMessage_W=W/2;
		int WinMessage_H= 2*H/3;
		EnP.setColor(Color.black);
		EnP.fillRect(0,0,W,H);
		EnP.setColor(Color.white);
		EnP.drawString("Congratulations, you won!", WinMessage_W, WinMessage_H);
		}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
