import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.JFrame;

public class MyWin5 extends JFrame {
	public MyWin5(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin5 w1 = new MyWin5("hello", 300, 400, Color.YELLOW);	
		MyWin5 w2 = new MyWin5("test", 400, 300, Color.GREEN);	
	}
}
