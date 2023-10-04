package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5,0.5,0.35,0.25);	
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(0.5,0.5,0.35,0.25);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5,0.5,0.35,0.05);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(0.5,0.5,0.35,0.02);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5,0.5,0.05,0.25);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(0.5,0.5,0.02,0.25);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledEllipse(0.5, 0.5, 0.1, 0.1);
		StdDraw.setPenRadius(0.012);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.ellipse(0.5, 0.5, 0.1, 0.1);
		StdDraw.text(0.5, 0.5, "JL");
	}
	
}