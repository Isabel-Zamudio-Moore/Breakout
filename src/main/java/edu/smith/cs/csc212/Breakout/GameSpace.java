package edu.smith.cs.csc212.Breakout;

// citation Based on the Aquarium Assignment which used the
//starter code from  https://github.com/jjfiv/CSC212Aquarium
//Tutorials Viewed: https://www.youtube.com/watch?v=FyZ4_T0GZ1U, https://www.youtube.com/watch?v=3EMxBkqC4z0, https://www.youtube.com/watch?v=th9_fSSDGMA
//

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.math.*;
import java.util.Random;
import me.jjfoley.gfx.GFX;

/**
 * The Game Space will be the space where the objects are added to the window
 * 
 * 
 * @author izamudiomoore
 *
 */

public class GameSpace extends GFX {
	int Test=Math.abs(10);
	public static int W = 450;
	public static int H = 450;
	public static int WEnd = W - 40;
	public static int HEnd = H - 40;
	public static int HEnd_T = 40;
	public Random rand = new Random();
	public int xdest = W / 2;
	public int ydest = H / 2;
	public int xSpeed = 1;
	public int ySpeed = 1;
	public int xDestPanel = 50;
	public int yDestPanel = H - 100;
	public int xdestBlock;
	public int ydestBlock;
	public static int bW;
	public static int bH;
	public boolean MPLeave = false;
	public boolean EnPLeave = false;
	public boolean GameLost = false;
	public boolean WinCondition=false;
	public int score = 0;
	int BallX;
	int PanelX;
	int BallY;
	int PanelY;
//	public String ScoreString=((String) fwe);
//	this.yDestPanel=yDestPanel;

	public GameSpace() {
		super(W, H);
	}

	public void Play(Graphics2D g) {

	}

	public void draw(Graphics2D g) {
//		if (MPLeave == false) {
//			MainPage MPC = new MainPage(g);
//			MainPageLeave(g);
//		
//
//			 } else 
		if (MPLeave==false) {
			 EndPage ENP= new EndPage(g);
			 EndPageLeave(g);
		} else {

			Walls walls = new Walls(W, H, g);
			Panel panel = new Panel(this.xDestPanel, yDestPanel, W, H, g);
			Control(g);

			int shiftW = 100;
			int shiftH = 0;
			int shiftWN = 0;
			int shiftWNL1 = 0;
			int shiftWNL2 = 0;
			int shiftWNL3 = 0;

			int shiftW2 = 0;
			int shiftWO = W / 10;
			int shiftWOL1 = shiftWO;
			int shiftWOL2 = shiftWO * 5 / 3;
			int shiftWOL3 = shiftWO * 7 / 3;

			int color = 0;

			for (int i = 0; i < 9; i++) {
				if (shiftW < 110) {
//			shiftW=50;
//			shiftH=50;
					shiftWN = 50;
					shiftWNL1 = shiftWN;
					shiftWNL2 = shiftWN - 10;
					shiftWNL3 = shiftWN - 20;

				}

				// Block block2= new Block(W,H,shiftW, shiftH, g);
				if (i % 3 == 0) {
					shiftH = 50;
					int n = i;
					shiftW = n * shiftWNL1 + shiftWOL1;
					color = 0;
				} else if (i % 3 == 1) {
					shiftH = 100;
					int n = i - 1;
					shiftW = n * shiftWNL2 + shiftWOL2;
					color = 1;
				} else {
					shiftH = 150;
					int n = i - 2;
					shiftW = n * shiftWNL3 + shiftWOL3;
					color = 2;
				}
				ArrayList<Block> BlockList = new ArrayList();
				BlockList.add(new Block(W, H, shiftW, shiftH, g, color));
//}
				// Move hte blocks
				Ball ball = new Ball(W, H, g, xdest, ydest);
				move();
				g.setColor(Color.white);
				g.drawString("Score : ", W - 200, 20);
				g.drawString("Time : ", W - 100, 20);

				// String ScoreString=(String) score;
				// g.println.System.out(score, W-100, 20);
				// g.drawString(score, W-100, 20);
				
				SamePlace();
			}
		}
		
		
		
		if (GameOverCondition(g)==true) {
			EndPageLeave(g);	 
		}
		
		if (WinCondition(g)==true){
			EndPageLeave(g);
		}
	}

	public void move() {
		// Movement System
		// Has ball been moving right
		if (xSpeed > 0) {
			if (xdest >= WEnd) {
				xSpeed = -xSpeed;
				xdest = xdest + xSpeed;
			} else {
				xdest = xdest + xSpeed;
			}
			// If ball is moving left
		} else {
			if (xdest <= 0) {
				xSpeed = -xSpeed;
				xdest = xdest + xSpeed;
			} else {
				xdest = xdest + xSpeed;
			}
		}
		// if the ball is moving down
		// Has ball been moving right
		if (ySpeed > 0) {
			if (ydest >= HEnd) {
				ySpeed = -ySpeed;
				ydest = ydest + ySpeed;
			} else {
				ydest = ydest + ySpeed;
			}
			// If ball is moving left
		} else {
			if (ydest <= HEnd_T) {
				ySpeed = -ySpeed;
				ydest = ydest + ySpeed;
			} else {
				ydest = ydest + ySpeed;
			}
		}

		
	}

	/**
	 * Let the user control the panel
	 * @param g  
	 */
	public void Control(Graphics2D g) {
		// Determine if User clicked Right or Left
		boolean KeyRight = this.processKey(KeyEvent.VK_RIGHT);
		boolean KeyLeft = this.processKey(KeyEvent.VK_LEFT);
		boolean RightKey = false;
		boolean LeftKey = false;
		int BoundsW0 = 25;
		int BoundsWEnd = W - 125;
		int ShiftP = 100;

//			//Move Panel right by 5
		if (KeyRight == true) {
			// System.out.println("Right");
			if (this.xDestPanel >= BoundsWEnd) {
				this.xDestPanel = BoundsWEnd;

			} else {
				this.xDestPanel += ShiftP;
			}
//				System.out.println(this.xDestPanel);

		} else if (KeyLeft == true) {
			// System.out.println("Left");
			if (this.xDestPanel <= BoundsW0) {
				this.xDestPanel = BoundsW0;
			} else {
				this.xDestPanel -= ShiftP;
			}
			// System.out.println(xDestPanel);
			LeftKey = true;
		} else {}

	}

	
	/**
	 *  Determine if to Leave Main page
	 * @param g
	 * @return
	 */
	public boolean MainPageLeave(Graphics2D g) {
		// Determine if User clicked Right or Left
		boolean Space = this.processKey(KeyEvent.VK_SPACE);

		if (Space == true) {
			// System.out.println("MAINPAGE");
			MPLeave = true;
			return false;
		}
		return true;

	}

	public boolean EndPageLeave(Graphics2D g) {
		// Determine if User clicked Right or Left
		boolean Space = this.processKey(KeyEvent.VK_SPACE);

		if (Space == true) {
			// System.out.println("MAINPAGE");
			MPLeave = true;
			return false;
		}
		return true;

	}

	public boolean GameOverCondition(Graphics2D g) {
		// Determine if User clicked Right or Left
		boolean Space = this.processKey(KeyEvent.VK_SPACE);

		if (Space == true) {
			// System.out.println("MAINPAGE");
			boolean GameOver = true;
			return GameLost;
		}
		return GameLost;
	}
	
	public boolean WinCondition(Graphics2D g) {
		// Determine if User clicked Right or Left
		boolean Space = this.processKey(KeyEvent.VK_SPACE);

		if (Space == true) {
			// System.out.println("MAINPAGE");
			boolean WinCondition = true;
			return WinCondition;
		}
		return WinCondition;
	}	
	
	
	

	public boolean AddPoint() {
		boolean condition = false;
		return condition;
	}

	public boolean SamePlace() {
		score = 0;
		BallX = xdest;
		PanelX = xDestPanel;
		int xDiffBallPan= BallX-PanelX;
		BallY = ydest;
		PanelY = yDestPanel;
		int yDiffBallPan= BallY-PanelY;
		System.out.println(BallX + " " + PanelX);
		if ((Math.abs(xDiffBallPan)<20)) { 
		if ((Math.abs(yDiffBallPan)<20) ) {
			xdest+=10;
			ydest+=10;
			ySpeed=-(ySpeed);
			xSpeed=-(xSpeed);}


		}	else {
			System.out.println(xDiffBallPan);
			System.out.println("TRUE");
		}
		// if the ball is in same place as a WEnd or 40 in x direction
		// add point
		boolean condition = false;
		return condition;
	}

}
