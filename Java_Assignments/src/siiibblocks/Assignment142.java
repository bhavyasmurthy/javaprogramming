package siiibblocks;

//"Assignment 142:Write a program where u have
//1SIB,3IIB,2Constructor,1Main method
//Create 2 object to invoke 2 constructor. Check order of execution"
public class Assignment142 {
	Assignment142() {
		System.out.println("constructor1");
	}

	Assignment142(int a) {
		System.out.println("constructor2");
	}

	static {
		System.out.println("SIB1");
	}
	static {
		System.out.println("SIB2");
	}
	

		{
			System.out.println("IIB1");

		}
		{
			System.out.println("IIB2");

		}
		{
			System.out.println("IIB3");

		}
	

	public static void main(String[] args) {
		System.out.println("main method");
		new Assignment142();
		new Assignment142(8);

	}

}
