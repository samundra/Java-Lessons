package com.fivedots.hello;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		
		// construct a timer that calls the listener
		// once every 10 seconds
		Timer t = new Timer(5000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null,  "Quit Program?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is "+now);
		Toolkit.getDefaultToolkit().beep();
	}
}
