package org.grotech.assignments;

import java.util.Scanner;

/*"Assignment 43
Write a program to find out Circumference of  triangle using scanner class"
ctri = a+b+c;
crect=2(l+b);
ccir = 2*pi*r;
csq = 4a
*/
public class Assignment43 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		System.out.println("Circumferenceoftriangle:"+(a+b+c));
	}

}
