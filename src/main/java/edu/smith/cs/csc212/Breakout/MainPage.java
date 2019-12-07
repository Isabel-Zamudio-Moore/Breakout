package edu.smith.cs.csc212.Breakout;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

public class MainPage extends GFX{
	
	
	// citation Based on the Aquarium Assignment which used the
	//starter code from  https://github.com/jjfiv/CSC212Aquarium
	//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
	//
	
	public static int W=450;
	public static int H=450;
	
	/**
	 * Call to draw the main Page
	 * @param MP
	 */
	public MainPage(Graphics2D MP) {	
		drawMainPage(MP);
	}

	public void drawMainPage(Graphics2D MP) {
		int BreakoutW=W/7;
		int BreakoutH= H/30;
		int WelcomeW=W/6;
		int WelcomeH=H/6;
		MP.setColor(Color.black);
		MP.fillRect(0,0,W,H);
		MP.setColor(Color.lightGray);
		MP.fillRect(35, 35,W-70,H-70);
		MP.scale(0.5,0.5);
		MP.setColor(Color.white);
		MP.scale(2,2);
		MP.drawString("Welcome To Breakout.",WelcomeW, WelcomeH);
		MP.setColor(Color.black);
		MP.drawString("History.", WelcomeW-15, WelcomeH-15);
		MP.setColor(Color.black);
		MP.scale(.9,0.9);
		MP.drawString("History.", W/9, WelcomeH+30);
		MP.scale(4*.7,3*.7);
		MP.setColor(Color.white);
		MP.drawString("Breakout", BreakoutW, BreakoutH);
		}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
}
