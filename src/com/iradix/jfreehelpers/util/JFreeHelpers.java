package com.iradix.jfreehelpers.util;

import java.awt.Color;

public class JFreeHelpers {
	/**
	 * Takes an RGB String and returns a java color
	 * @param rgb String representing a color, like AABBCC or #AABBCC
	 * @return Color representation
	 */
	public static Color getColorFromRGBString(String rgb){
		int offset = 0;
		if(rgb.trim().startsWith("#")){
			offset++;
		}
		char[] chars = rgb.trim().toCharArray();
		Color c = null;
		StringBuffer sb = new StringBuffer();
		sb.append(chars[0+offset]).append(chars[1+offset]);
		Integer col1 = Integer.parseInt(sb.toString() , 16);
		sb = new StringBuffer();
		sb.append(chars[2+offset]).append(chars[3+offset]);
		Integer col2 = Integer.parseInt(sb.toString(), 16);
		sb = new StringBuffer();
		sb.append(chars[0+offset]).append(chars[1+offset]);
		Integer col3 = Integer.parseInt(sb.toString(), 16);
		c = new Color(col1, col2, col3);
		return c;
	}
}
