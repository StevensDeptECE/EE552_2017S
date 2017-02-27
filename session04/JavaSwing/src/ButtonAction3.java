import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonAction3 extends JFrame {
	private JButton test;
	public ButtonAction3(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		JButton b = new JButton("Ok");
		c.add(BorderLayout.CENTER, b);
		test = new JButton("test");
		c.add(BorderLayout.WEST, test);
		b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("yo!");
					test.setBackground(Color.RED);
				}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonAction3 w1 = new ButtonAction3("Button Action", 400, 400, Color.YELLOW);	
	}

}

