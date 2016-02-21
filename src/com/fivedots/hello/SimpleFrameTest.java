package com.fivedots.hello;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @version 1.32 2007-06-12
 * @author Cay Horstmann
 *
 */
public class SimpleFrameTest {
	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}


class SimpleFrame extends JFrame
{
	public SimpleFrame()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screensize = kit.getScreenSize();
		
		int screenWidth = screensize.width;
		int screenHeight = screensize.height;
		
		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Simple Frame Test");
		setLocationByPlatform(true);
		
		Image img = kit.getImage("F:\\workspace\\tutorials\\src\\icon.gif");
		setIconImage(img);
		
	}
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
}