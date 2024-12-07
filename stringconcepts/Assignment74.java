package stringconcepts;

import java.util.Arrays;

//"Assignment 74 Write a program to create Array of Char data type to store values Alphabet of size as 5"
public class Assignment74 {

	public static void main(String[] args) {

		char c1[] = new char[5];
		c1[0] = 'a';
		c1[1] = 'e';
		c1[2] = 'i';
		c1[3] = 'o';
		c1[4] = 'u';
		System.out.println(c1.length);
		System.out.println(Arrays.toString(c1));

	}

}
