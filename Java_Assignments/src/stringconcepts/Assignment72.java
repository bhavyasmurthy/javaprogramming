package stringconcepts;

import java.util.Arrays;

//"Assignment 72:Write a program to create Array of size as 5 to store String data type values"

public class Assignment72 {
	public static void main(String[] args) {
		String input[] = new String[5];
		input[0] = "Bhavya";
		input[1] = "Vaishu";
		input[2] = "Tanush";
		input[3] = "Tanush";
		input[4] = "Mittu";
		System.out.println(input.length);
		System.out.println(Arrays.toString(input));
	}

}
