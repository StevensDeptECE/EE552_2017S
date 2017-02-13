import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.JFrame;

public class MyWin4 extends JFrame { // MyWin4 IS_A JFrame
	public MyWin4(String title, int w, int h, Color color) {
		this.setTitle(title);
		this.setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyWin4 w1 = new MyWin4("hello", 300, 700, Color.YELLOW);
		MyWin4 w2 = new MyWin4("test", 500, 400, Color.ORANGE);
	
	}
}
