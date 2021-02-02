package mex.s03;

public class Exercise7 {
	/**
	 * return the input value as String
	 * 
	 * <p>
	 * special cases:
	 * 
	 * <li>3, 6, ... : "Fizz"
	 * <li>5, 10, ... : "Buzz"
	 * <li>15, 30, ... : "FizzBuzz"
	 * 
	 * @param value an integer
	 * @return Fizz, Buzz, or the integer as String
	 */
	public static String fizzBuzz(int value) {
		if (value % 3 == 0 && value % 5 == 0) {
			return "FizzBuzz";
		} else if (value % 5 == 0) {
			return "Buzz";
		} else if (value % 3 == 0) {
			return "Fizz";
		} else {
			return Integer.toString(value);
		}
	}
}
