import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class AnimatedWindow extends JFrame implements Runnable {
	private Random r;
	public AnimatedWindow() {
		super("Draw lines");
		r = new Random(0);
		setSize(800,600);
		setBackground(Color.RED);
		setForeground(Color.BLACK);
		setVisible(true);
		Thread t = new Thread(this);
		t.start();
	}

	public void paint(Graphics g) {
		
	}
	public void run() {
		Graphics g = getGraphics();
		for (;;) {
			g.drawLine(r.nextInt(getWidth()), r.nextInt(getHeight()), r.nextInt(getWidth()), r.nextInt(getHeight()));
			try { Thread.sleep(10); } catch(InterruptedException e) {}
		}
	}
	public static void main(String[] args) {
		new AnimatedWindow();
	}
}
