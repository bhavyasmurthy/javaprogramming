package exceptionhandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//"Assignment 138:Write a program with exception handlling using multiple catch block "
public class MultiCatchTyrBlk {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			scanOutput();
			/*
			 * Scanner sc = new Scanner(System.in); System.out.println("enter array size:");
			 * int rolno[] = new int[sc.nextInt()]; System.out.println("enter values:"); for
			 * (int i = 0; i < rolno.length; i++) { rolno[i] = sc.nextInt();
			 * 
			 * }
			 */
			// sc.close();
			// System.out.println(Arrays.toString(rolno));
		} catch (InputMismatchException e1) {

			/*
			 * System.out.println("Enter positive values:"); Scanner sc = new
			 * Scanner(System.in); System.out.println("enter array size:"); int rolno[] =
			 * new int[sc.nextInt()]; System.out.println("enter values:"); for (int i = 0; i
			 * < rolno.length; i++) { rolno[i] = sc.nextInt(); } sc.close();
			 * System.out.println(Arrays.toString(rolno));
			 */
			scanOutput();

		} catch (NegativeArraySizeException e2) {
			/*
			 * System.out.println("Enter positive values:"); Scanner sc = new
			 * Scanner(System.in); System.out.println("enter array size:"); int rolno[] =
			 * new int[sc.nextInt()]; System.out.println("enter values:"); for (int i = 0; i
			 * < rolno.length; i++) { rolno[i] = sc.nextInt(); }
			 * System.out.println(Arrays.toString(rolno)); sc.close();
			 */
			scanOutput();
		} finally {
			sc.close();
		}

	}

	private static void scanOutput() {
		System.out.println("enter array size:");
		int rolno[] = new int[sc.nextInt()];
		System.out.println("enter values:");
		for (int i = 0; i < rolno.length; i++) {
			rolno[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(rolno));
	}
}