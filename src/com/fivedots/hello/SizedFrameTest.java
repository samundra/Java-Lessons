package com.fivedots.hello;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SizedFrameTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SizedFrame frame = new SizedFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});

	}

}


class SizedFrame extends JFrame
{
	public SizedFrame(){
		// get Screen dimensions
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		// set frame width, height and let platform pick screen location
		setSize(screenWidth/2, screenHeight/2);
		
		setLocationByPlatform(true);

		// set frame icon and title
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setTitle("SizedFrame");
	}
	
}