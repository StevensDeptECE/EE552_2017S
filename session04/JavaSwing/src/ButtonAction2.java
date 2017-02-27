import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonAction2 extends JFrame {
	private JButton test;
	public ButtonAction2(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		JButton b = new JButton("Ok");
		c.add(BorderLayout.CENTER, b);
		test = new JButton("test");
		c.add(BorderLayout.WEST, test);
		b.addActionListener(new MyAction());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonAction2 w1 = new ButtonAction2("Button Action", 400, 400, Color.YELLOW);	
	}
	private class MyAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("yo!");
			test.setBackground(Color.RED);
		}
	}

}

