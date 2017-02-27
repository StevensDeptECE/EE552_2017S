import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AppBase extends JFrame {
	public AppBase(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AppBase w1 = new AppBase("Button Action", 400, 400, Color.YELLOW);	
	}

}

