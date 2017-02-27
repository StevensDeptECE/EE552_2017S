package edu.stevens.draw;

import javax.swing.JPanel;
import java.awt.*;

public class DrawArea extends JPanel {
	private Shape[] shapes;
	//private ArrayList<Shape> shapes;
	public DrawArea() {
		setBackground(Color.BLACK);
		shapes = new Shape[10];
		shapes[0] = new Circle(300,200, 50);
		shapes[1] = new Rect(500,400, 200, 100);
	}
	public void paint(Graphics g) {
		for (int i = 0; i < shapes.length; ++i)
			if (shapes[i] != null)
				shapes[i].draw(g);
		
	}

}
