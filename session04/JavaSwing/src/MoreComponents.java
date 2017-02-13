import java.awt.*;
//import java.awt.Color;
//import java.awt.Container;
import javax.swing.*;

public class MoreComponents extends JFrame {
	public MoreComponents(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		
		c.setLayout(new GridLayout(1, 4, 5, 5));
		JTextField f = new JTextField("testing");
		c.add(f);
		JScrollBar b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 256); 
		c.add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		MoreComponents w1 = new MoreComponents("My Clock", 400, 400, Color.YELLOW);	
	}
}
