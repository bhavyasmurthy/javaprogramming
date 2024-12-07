package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

//"Assignment 73 Write a program to create Array of size as 5 to store double data type values"
public class Assignment73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int arrsize = sc.nextInt();
		System.out.println("enter values");
		double rollno[] = new double[arrsize];
		for (int i = 0; i < arrsize; i++) {
			rollno[i] = sc.nextDouble();
		}
		System.out.println(rollno.length);
		System.out.println(Arrays.toString(rollno));

		/*
		 * at compile time double d1[]= new double[5]; d1[0]= 847.6117914; d1[1]=
		 * 87.1116117914; d1[2]= 41.096117914; d1[3]= 87.6117914; d1[4]= 911.6117914;
		 */
		// System.out.println(Arrays.toString(d1));
	}

}
