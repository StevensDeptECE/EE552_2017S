package edu.stevens.draw;

import java.awt.Graphics;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		radius = r;
	}
	public void draw(Graphics g) {
		g.fillOval(x, y, 2*radius, 2*radius);
	}
}
