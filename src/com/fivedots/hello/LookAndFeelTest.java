package com.fivedots.hello;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookAndFeelTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				LookAndFeelFrame frame = new LookAndFeelFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				frame.addWindowListener(new Terminator());
				
			}
		});
	}
}

class Terminator extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		if(true){
			System.out.print("Exit system.");
			System.exit(0);
		}
	}
}

class LookAndFeelFrame extends JFrame{
	public LookAndFeelFrame(){
		setTitle("LookAndFeel Test");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		buttonPanel = new JPanel();
		add(buttonPanel);
		
		makeButton("Windows", "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		makeButton("Motif", "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		makeButton("Metal", "javax.swing.plaf.metal.MetalLookAndFeel");
		
		
				
	}
	
	public void makeButton(String name, String themeName){
		JButton button = new JButton(name);
		buttonPanel.add(button);
		
		LookAndFeelChangeListener listener = new LookAndFeelChangeListener(themeName);
		button.addActionListener(listener);
	}
	
	class LookAndFeelChangeListener implements ActionListener{

		public LookAndFeelChangeListener(String plaf){
			theme = plaf;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				UIManager.setLookAndFeel(theme);
				SwingUtilities.updateComponentTreeUI(LookAndFeelFrame.this);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
		
		private String theme;
	}

	
	private JPanel buttonPanel;
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
}

