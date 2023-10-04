package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(241, 91, 134);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		double[] x = {0.1, 0.2, 0.3, 0.2};
		double[] y = {0.6, 0.7, 0.6, 0.5};
		StdDraw.setPenColor(251, 241, 134);
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(225, 0, 0);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		double[] xt = {0.5, 0.55, 0.5,};
		double[] yt = {0.55, 0.6, 0.65,};
		StdDraw.setPenColor(44, 251, 28);
		StdDraw.filledPolygon(xt, yt);
		}
}