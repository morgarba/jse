package mex.s02;

import java.util.logging.Logger;

public class Exercise5 {
	private static final Logger log = Logger.getGlobal();

	/**
	 * Score based on distance from (0, 0)
	 * <li>less or equals to 1: 10
	 * <li>in (1, 5]: 5
	 * <li>in (5, 10]: 1
	 * <li>more than 10: 0
	 *
	 * @param x
	 * @param y
	 *
	 * @return resulting points: 0, 1, 5, or 10
	 */
	public static int score(double x, double y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	
		log.info(String.format("(%.5f, %.5f) -> %.5f", x, y, distance));
		if (distance <= 1)
			return 10;
		else if (distance > 1 && distance <= 5)
			return 5;
		else if (distance > 5 && distance < 10)
			return 1;
		else
			return 0;
			}
}
