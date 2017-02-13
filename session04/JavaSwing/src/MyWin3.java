import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.JFrame;

public class MyWin3 {
	public MyWin3(String title, int w, int h, Color color) {
		JFrame f = new JFrame();
		f.setTitle(title);
		f.setSize(w,h);
		Container c = f.getContentPane();
		c.setBackground(color);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		MyWin3 w1 = new MyWin3("hello", 1000, 700, Color.RED);
		MyWin3 w2 = new MyWin3("test", 800, 800, Color.BLUE);
	
	}
}
