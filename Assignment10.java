package org.grotech.assignments;

//nested if else block
public class Assignment10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		if (a < b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		if (c > a) {
			System.out.println(c);
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		System.out.println("Exit");
	}

}
