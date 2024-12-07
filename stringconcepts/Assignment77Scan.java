package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		System.out.println("enter age values");
		int age[] = new int[size];
		System.out.println("enter age1 values");

		int age1[] = new int[size];
		for (int i = 0; i < age.length; i++) {
			age[i] = sc.nextInt();
		}

		for (int i = 0; i < age1.length; i++) {
			age1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
		// System.out.println(Arrays.equals(age, age1));
		// boolean b1 = age.equals(age1);
		if (Arrays.equals(age, age1) == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("not equal");
		}
	}

}
