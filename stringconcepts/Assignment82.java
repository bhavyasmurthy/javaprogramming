package stringconcepts;

import java.util.Arrays;

/* Assignment 82
Write a program to print the given array in reverse manner [5,8,16,20,5]
 */
public class Assignment82 {

	public static void main(String[] args) {
		int input[] = new int[5];
		input[0] = 5;
		input[1] = 8;
		input[2] = 16;
		input[3] = 20;
		input[4] = 5;

		int output[] = new int[input.length];
		for (int i = 0, j = (input.length - 1); i < input.length; i++, j--) {
			output[j] = input[i];

		}
		System.out.println("Reverse array" + Arrays.toString(output));

	}

}
