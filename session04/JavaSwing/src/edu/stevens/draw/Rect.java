package edu.stevens.draw;

import java.awt.Graphics;

public class Rect extends Shape {
	private int width, height;
	
	public Rect(int x, int y, int w, int h) {
		super(x,y);
		width = w; height = h;
	}
	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
