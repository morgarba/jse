package mex.s03;

public class Exercise8 {
	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return the input values, sorted, in an array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		if (a <= b && b <= c) {
			result[0] = a;
			result[1] = b;
			result[2] = c;
		} else if (c <= a && a <= b) {
			result[0] = c;
			result[1] = a;
			result[2] = b;
		} else if (b <= a && a <= c) {
			result[0] = b;
			result[1] = a;
			result[2] = c;
		} else if (b <= c && c <= a) {
			result[0] = b;
			result[1] = c;
			result[2] = a;
		} else if (c <= b && b <= a) {
			result[0] = c;
			result[1] = b;
			result[2] = a;
		}
		return result;
	}

}
