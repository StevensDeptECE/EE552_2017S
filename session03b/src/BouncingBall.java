import processing.core.PApplet;

public class BouncingBall extends PApplet {
	private float x,y;
	
	public void settings() {
		size(800,600);
		
	}
	public void draw() {
		ellipse(x,y, 50,50);
		x ++;
		y += 0.5f;
	}
	public static void main(String[] args) {
		 PApplet.main("BouncingBall");
	}
}
