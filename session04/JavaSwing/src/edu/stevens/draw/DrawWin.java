package edu.stevens.draw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawWin extends JFrame {
	public DrawWin() {
		super("Drawing");
		setSize(800,600);
		DrawArea d = new DrawArea();
		Container c = getContentPane();
		c.add(d, BorderLayout.CENTER);
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
		});
		setVisible(true);
	}
	public static void main(String[] args) {
			new DrawWin();
		
	}
}
