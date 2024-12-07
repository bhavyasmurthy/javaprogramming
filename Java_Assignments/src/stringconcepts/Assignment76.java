package stringconcepts;
//"Assignment 76: Write a program to create Array of size as 4 to store Int data type values at the run time"

import java.util.Arrays;
import java.util.Scanner;

public class Assignment76 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a[] = new int[4];

		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter int values of size 4 (indexing):" + i);

			a[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
		s1.close();
	}

}
