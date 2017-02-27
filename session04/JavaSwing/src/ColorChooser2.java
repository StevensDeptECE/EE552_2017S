import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChooser2 extends JFrame {
	private JPanel p;
	private JScrollBar r,g,b;
	public ColorChooser2(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		c.setLayout(new GridLayout(1, 4, 5, 0));
		c.add(r = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		ChangeColor changeColor = new ChangeColor();
		c.add(g=new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		c.add(b=new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		c.add(p=new JPanel());
		r.addAdjustmentListener(changeColor);
		g.addAdjustmentListener(changeColor);
		b.addAdjustmentListener(changeColor);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private class ChangeColor implements AdjustmentListener {
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			Color c = new Color(r.getValue(), g.getValue(), b.getValue());
			p.setBackground(c);
		}
	}
	
	public static void main(String[] args) {
		ColorChooser2 w1 = new ColorChooser2("Button Action", 400, 400, Color.YELLOW);	
	}

}

