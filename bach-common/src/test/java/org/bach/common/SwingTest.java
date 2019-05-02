package org.bach.common;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				BounceFrame frame = new BounceFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class BounceFrame extends JFrame {
	private BallComponent comp;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;

	public BounceFrame() {
		setTitle("Bounce");

		comp = new BallComponent();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();
			}
		});

		addButton(buttonPanel, "Close", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}

	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}

	public void addBall() {
		Ball ball = new Ball();
		comp.add(ball);
		class BallRunable implements Runnable {

			@Override
			public void run() {
				for (int i = 1; i <= STEPS; i++) {
					try {
						ball.move(comp.getBounds());
						comp.repaint();
						Thread.sleep(DELAY);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		BallRunable r = new BallRunable();
		Thread t = new Thread(r);
		t.start();
	}
}

/**
 * ball component.
 * 
 * @author ricky
 *
 */
class BallComponent extends JPanel {
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 350;

	private List<Ball> balls = new ArrayList<>();

	public void add(Ball b) {
		balls.add(b);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (Ball b : balls) {
			g2.fill(b.getShape());
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}

/**
 * ball
 * 
 * @author ricky
 *
 */
class Ball {
	private static final int XSIZE = 15;
	private static final int YSIZE = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;

	public void move(Rectangle2D bounds) {
		x += dx;
		y += dy;

		if (x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}

		if (x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - XSIZE;
			dx = -dx;
		}
		if (y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}

		if (y + YSIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - YSIZE;
			dy = -dy;
		}
	}

	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	}
}
