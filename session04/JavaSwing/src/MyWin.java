import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.JFrame;

public class MyWin {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Hello");
		f.setSize(1000,700);
		Container c = f.getContentPane();
		c.setBackground(Color.RED);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
