import java.awt.Color;
import java.awt.Graphics;


public class HumanPaddle implements Paddle {
	
	double y, yVel;
	boolean upAccel, downAccel;
	int player, x;
	final double GRAVITY = 0.04;
	
	public HumanPaddle(int player){
		upAccel = false; 
		downAccel = false;
		y = 210;
		yVel = 0;
		if(player == 1){
			x = 20;
		}
		else {
			x = 660;
		}
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int) y, 20, 80);
	}

	public void move() {
		if(upAccel){
			yVel = yVel - 2;
		}
		else if(downAccel){
			yVel = yVel + 2;
		}
		else if(!upAccel && !downAccel){
			yVel = yVel * GRAVITY;
		}
		y = y + yVel;
	}
	
	public void setUpAccel(boolean input){
		upAccel = input;
	}
	
	public void setDownAccel(boolean input){
		downAccel = input;
	}

	public int getY() {
		return (int)y;
	}

}
