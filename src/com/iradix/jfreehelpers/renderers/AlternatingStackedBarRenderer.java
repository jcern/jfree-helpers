package com.iradix.jfreehelpers.renderers;

import java.awt.Color;
import java.awt.Paint;

import org.jfree.chart.renderer.category.StackedBarRenderer;

/**
 * This provides a renderer which will render stacked bars, with each 
 * section in the stack having the next color in the Paint Array. When the 
 * end of the array is reached, the selection will loop.
 * @author jason
 *
 */
public class AlternatingStackedBarRenderer extends StackedBarRenderer {

    private static final long serialVersionUID = 1L;

    public AlternatingStackedBarRenderer() {
    	
    }
    
    public AlternatingStackedBarRenderer(Paint[] colors) {
    	this.colors = colors;
    }
    
    private Paint[] colors = new Paint[] {
	        new Color(255, 0, 0), 
	        new Color(0, 255, 0),
	        new Color(0, 0, 255)
	};

	public Paint getSeriesPaint(int series) {
	       return colors[(series % colors.length)];
	}

	public Paint[] getColors() {
		return colors;
	}

	public void setColors(Paint[] colors) {
		this.colors = colors;
	}
}
