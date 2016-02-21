package com.fivedots.hello;

import java.awt.GraphicsEnvironment;

public class ListFonts {
	public static void main(String[] args) {
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
//		System.out.print(fontNames.length);
		for(String fontName: fontNames)
		{
			System.out.println(fontName);
		}
	}
}
