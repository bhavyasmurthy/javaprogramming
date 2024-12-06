package org.grotech.assignments;

import java.util.Scanner;
//"Assignment 39: Write a program to find out area of  triangle using scanner class"
//"Assignment 40: Write a program to find out area of  Circle using scanner class"
//"Assignment 41: Write a program to find out area of  rectangle using scanner class"
//"Assignment 42: Write a program to find out area of  Square using scanner class"
public class Assignment40 {

	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner scls = new Scanner(System.in);
		System.out.println("Enter radius value:");
		int r = scls.nextInt();
		System.out.println("Enter values for length and breadth:");
		int l = scls.nextInt();
		int b = scls.nextInt();
		System.out.println("Enter values for breadth and height:");
		int h = scls.nextInt();
		System.out.println("Area of Triangle:" +(.5*b*h));
		System.out.println("Area of circle:" +(pi*r*r));
		System.out.println("Area of rectangle:" +(l*b));
		System.out.println("Area of Square:" +(l*l));
		scls.close();
		
	}

}
