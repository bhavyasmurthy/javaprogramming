package org.grotech.assignments;
// else if
public class Assignment9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else if (c > a) {
			System.out.println(c);
		} else if (a == c) {
			System.out.println("print c");
		} else if (a != c) {
			System.out.println("print not equal");
		} else if (b >= c) {
			System.out.println(b);
		} else if (a <= c) {
			System.out.println(a);
		}
		System.out.println("Exit");
	}
}
