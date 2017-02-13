import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.JFrame;

public class MyWin2 {
	public static JFrame createWindow(String title, int w, int h, Color color) {
		JFrame f = new JFrame();
		f.setTitle(title);
		f.setSize(w,h);
		Container c = f.getContentPane();
		c.setBackground(color);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		return f;
	}
	public static void main(String[] args) {
		createWindow("hello", 1000, 700, Color.RED);
		createWindow("test", 800, 800, Color.BLUE);
	}
}
