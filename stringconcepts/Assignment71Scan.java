package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

//"Assignment 71:Write a program to create Array of size as 4 to store Int data type values"

public class Assignment71Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int arrsize = sc.nextInt();
		System.out.println("enter roll numbers");
		int rollno[] = new int[arrsize];
		for (int i = 0; i < rollno.length; i++) {
			rollno[i] = sc.nextInt();
		}
		System.out.println(rollno.length);
		System.out.println(Arrays.toString(rollno));
		sc.close();

	}

}
