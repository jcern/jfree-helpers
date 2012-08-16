package com.iradix.jfreehelpers.renderers;

import java.awt.Paint;

import org.jfree.chart.renderer.category.BarRenderer;

/**
 * This provides a renderer which will render a series of bars, with each 
 * series having the next color in the Paint Array. When the 
 * end of the array is reached, the selection will loop.
 * @author jason
 *
 */
public class AlternatingSeriesBarRenderer extends BarRenderer {
	private static final long serialVersionUID = 1L;

	private Paint[] colors;

	public AlternatingSeriesBarRenderer(Paint[] colors) {
		this.colors = colors;
		for (int i = 0; i <= colors.length - 1; i++) {
			setSeriesPaint(i, colors[i]);
		}
	}

	public AlternatingSeriesBarRenderer() {
		
	}
	
	public Paint getItemPaint(int row, int column) {
		return this.colors[row % this.colors.length];
	}

	public Paint[] getColors() {
		return colors;
	}

	public void setColors(Paint[] colors) {
		this.colors = colors;
	}
}
