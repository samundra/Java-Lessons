package com.fivedots.hello;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
					DrawFrame frame = new DrawFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
			}
		});
	}
}


class DrawFrame extends JFrame
{
	public DrawFrame()
	{
		setTitle("DrawTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		// add panel to frame
		DrawComponent component = new DrawComponent();
		add(component);
	}
	
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT  = 400;
	
	
	
}

class DrawComponent extends JComponent
{
	public void paintComponent(Graphics2D g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		//draw a rectangle
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
		// draw a diagonal line
		g2.draw(new Line2D.Double(leftX, topY, leftX+width, topY+height));
		
	}
}