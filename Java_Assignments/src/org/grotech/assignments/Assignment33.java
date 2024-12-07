package org.grotech.assignments;

/* Write a program that creates a class 
to print the value of a from 1 to 8, 
but skip the value when a equals 3, using the switch concept."
*/
public class Assignment33 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 8; i++) {
			switch (i) {
			case 3: // to skip 3
				// case 4://to skip 4
				// case 5: // to skip 5
				break;
			default:
				System.out.println(i);
				/*
				 * case 1:System.out.println(i); // using for loop from case 1 to case 8 its
				 * iterating values and printing all cases have same code so logic can be moved
				 * to default break; case 2:System.out.println(i); break;` case
				 * 3://System.out.println(i); break; case 4:System.out.println(i); break; case
				 * 5:System.out.println(i); break; case 6:System.out.println(i); break; case
				 * 7:System.out.println(i); break; case 8:System.out.println(i); break; default:
				 * System.out.println(i);
				 */
			}

		}

	}
}
