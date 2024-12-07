package exceptionhandling;

//"Assignment 139:Write a program with exception handlling using 
//multiple catch block and finally block "
public class Assignment139 {

	public static void main(String[] args) {
		try {
			int c = 1 / 1;
			System.out.println(c);

			int k = 1 / 0;
			System.out.println(k);
		} catch (ArithmeticException ae) {
			System.out.println("exception occurs");
		} finally {
			System.out.println("this block will execute always whether an exception occurs or not");
		}

	}

}
