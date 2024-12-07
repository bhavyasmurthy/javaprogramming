package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

//"Assignment 72:Write a program to create Array of size as 5 to store String data type values at run time"

public class Assignment72Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");

		int arrsiz = sc.nextInt();
		System.out.println("enter array values");
		// System.out.println(arrsiz);
		String names[] = new String[arrsiz];

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();

		}

		System.out.println(names.length);
		System.out.println(Arrays.toString(names));
	}

}
