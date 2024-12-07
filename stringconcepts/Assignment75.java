package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

//"Assignment 75 Write a program to create Array of size as 5 to store boolean data type values"
public class Assignment75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		// int size = sc.nextInt();
		// int bool[] = new int[5];
		String bool[] = new String[sc.nextInt()];
		System.out.println("enter values");
		for (int i = 0; i < bool.length; i++) {
			bool[i] = (String) sc.next();
		}
		System.out.println(Arrays.toString(bool));

		/*
		 * boolean b1[]= new boolean[5]; b1[0]=true; b1[1]=false;
		 */
		// System.out.println(Arrays.toString(b1));

	}

}
