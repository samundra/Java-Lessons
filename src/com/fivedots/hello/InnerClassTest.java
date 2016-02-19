package com.fivedots.hello;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;
import javax.swing.JOptionPane;

public class InnerClassTest {
	public static void main(String[] args){
		TalkingClock clock = new TalkingClock(4000, true);
		clock.start();
		
		// keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null,  "Quit Program");
		System.exit(0);
		
	}
}

/**

class TalkingClock
{
	public TalkingClock(int interval, boolean beep)
	{
		this.interval = interval;
		this.beep = beep;
		
	}
	
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	private int interval;
	private boolean beep;
	
	public class TimePrinter implements ActionListener
	{

		
		public void actionPerformed(ActionEvent event) {
			
			Date now = new Date();
			System.out.println("At the tone, the time is "+now);
			if(beep) Toolkit.getDefaultToolkit().beep();
			
		}
		
	}
}
**/