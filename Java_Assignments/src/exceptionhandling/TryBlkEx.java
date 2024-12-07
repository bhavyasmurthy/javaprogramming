package exceptionhandling;

//"Assignment 137:Write a program with exception handlling using one catch block "
public class TryBlkEx {

	public static void main(String[] args) {
		try {
			int c = 1 / 0; // value 1 has come from parent class a/b
							// and 0 has come from grand parent class
			System.out.println(c);

		}

		catch (ArithmeticException ae) {
			// ae.printStackTrace();
			System.out.println("Exception occurs: there is a problem but you can proceed " + ae.getMessage());
		}
	}

}
