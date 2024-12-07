package exceptionhandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//using try and multi catch blocks
public class ArrayProblem {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter array size");
			int rollno[] = new int[sc.nextInt()];
			System.out.println("enter values");
			for (int i = 0; i < rollno.length; i++) {
				rollno[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			// System.out.println(rollno.length);
		} catch (InputMismatchException ipme1) {
			System.out.println("enter positive value for size");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter array size");
			int rollno[] = new int[sc.nextInt()];
			System.out.println("enter values");
			for (int i = 0; i < rollno.length; i++) {
				rollno[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(rollno));

		} catch (NegativeArraySizeException nae1) {
			System.out.println("enter a +ve value to continue");

		}
	}

}
