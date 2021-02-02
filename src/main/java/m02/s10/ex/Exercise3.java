package m02.s10.ex;

public class Exercise3 {
	public static void main(String[] args) {
		// TODO: Print the number of arguments passed to this main
		// And then each of them
		System.out.println(args.length);

		for (String hi : args) {
			System.out.println(hi);
		}

	}
}
