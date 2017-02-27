import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonAction extends JFrame {
	public ButtonAction(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		JButton b = new JButton("Ok");
		c.add(BorderLayout.CENTER, b);
		b.addActionListener(new MyAction());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonAction w1 = new ButtonAction("Button Action", 400, 400, Color.YELLOW);	
	}
}

class MyAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("yo!");
	}
}
