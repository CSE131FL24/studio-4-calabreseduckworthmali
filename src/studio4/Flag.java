package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setCanvasSize(600, 800);
        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);
        
		StdDraw.clear();
		StdDraw.setPenColor(100, 200, 175);
		StdDraw.filledRectangle(5, 2, 2, 5);
		StdDraw.setPenColor(175, 75, 175);
		StdDraw.filledCircle(2,3,2);
	}
}