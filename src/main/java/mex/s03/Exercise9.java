package mex.s03;

public class Exercise9 {
	/**
	 * Prime number checker
	 * 
	 * @param value
	 * @return true if positive > 1 and prime
	 */

	public static boolean isPrime(int value) {
		if (value <= 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

}
