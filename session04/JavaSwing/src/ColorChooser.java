import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChooser extends JFrame {
	private JPanel p;
	private JScrollBar r,g,b;
	public ColorChooser(String title, int w, int h, Color color) {
		super(title);
		setSize(w,h);
		Container c = this.getContentPane();
		c.setBackground(color);
		c.setLayout(new GridLayout(1, 4, 5, 0));
		c.add(r = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		r.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				int red = e.getValue();
				Color c = new Color(red, g.getValue(), b.getValue());
				//System.out.println(c);
				p.setBackground(c);
			}
			
		});
		c.add(g=new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		c.add(b=new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255));
		c.add(p=new JPanel());
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		ColorChooser w1 = new ColorChooser("Button Action", 400, 400, Color.YELLOW);	
	}

}

