package mex.s03;

public class Exercise5 {
	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * <li>A if value > 90
	 * <li>B if value in (80, 90]
	 * <li>...
	 * <li>F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if (percentile <= 50)
			return 'F';
		else if (percentile > 50 && percentile <= 60)
			return 'E';
		else if (percentile > 60 && percentile <= 70)
			return 'D';
		else if (percentile > 70 && percentile <= 80)
			return 'C';
		else if (percentile > 80 && percentile <= 90)
			return 'B';
		else
			return 'A';
	}
}
