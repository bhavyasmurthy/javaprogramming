package stringconcepts;

import java.util.Arrays;

//"Assignment 77:Write a program to check if 2 Arrays are equals or not"

public class Assignment77 {
	public static void main(String[] args) {
		int age[] = new int[4];
		age[0] = 10;
		age[1] = 20;
		age[2] = 34;
		age[3] = 21;
		int age1[] = new int[4];
		age1[0] = 10;
		age1[1] = 20;
		age1[2] = 34;
		age1[3] = 21;
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
		System.out.println(Arrays.equals(age, age1)); // returns boolean value
		boolean b1 = Arrays.equals(age, age1); // so store it in boolean datatype
		if (b1 == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

}
