package org.grotech.assignments;

import java.util.Scanner;

/*
 * "Assignment 39
Write a program to find out area of  triangle using scanner class"
area_tri = .5*b*h
area_circle = Math.pi*r*r;
area_square = a*a;
area_rectangle=l*b;
 */

public class Assignment39 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		double area = .5*s1.nextInt()*s1.nextInt();
		System.out.println(area);

	}

}
