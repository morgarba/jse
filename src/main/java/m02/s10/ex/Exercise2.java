package m02.s10.ex;

import java.util.Arrays;

public class Exercise2 {
	public static void main(String[] args) {
		
		boolean[] flags = { true, false, false };
		for (int j=0; j < flags.length; j++){
			flags[j] = !flags[j];
		}
		System.out.println(Arrays.toString(flags));
	}
}
