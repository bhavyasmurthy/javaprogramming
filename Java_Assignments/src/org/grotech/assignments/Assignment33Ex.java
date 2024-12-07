package org.grotech.assignments;

// Assignment 33: Write a program to print the value from 1 to 8, but skip the value when a equals 3

public class Assignment33Ex {

	public static void main(String[] args) {
		int a;
		for (a = 1; a <= 8; a++) {
			switch (a) {
			case 3: {

				break;
			}
			default:
				System.out.println(a);

			}

		}
	}

	/*
	 * int i; for (i = 1; i <= 8; i++) { switch (i) { case 3: // 1st method when
	 * case 3 just break break; // if (i == 3) { 2nd method // continue; // }
	 * default: System.out.println(i); }
	 * 
	 * }
	 */
}
