package mex.s02;

public class Exercise2 {
	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		double x = Math.pow(x0 - x1, 2);
		double y = Math.pow(y0 - y1, 2);
		return Math.sqrt(x + y);
		 
		
	}
}
