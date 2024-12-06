package org.grotech.assignments;

import java.util.Scanner;
/*"Assignment 47
Write a program to launch different browsers using Scanner class in switch Concept"
 */

public class Assignment47 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter option");
		int i = s1.nextInt();
		switch (i) {
		case 1:
			System.out.println("Mozilla firefox");
			break;
		case 2:
			System.out.println("Internet Explorer");
			break;
		case 3:
			System.out.println("Chrome");
			break;
		case 4:
			System.out.println("Edge");
			break;
		case 5:
			System.out.println("safari");
			break;
		default:
			System.out.println("choose the right option");
		}
		s1.close();
	}
}
