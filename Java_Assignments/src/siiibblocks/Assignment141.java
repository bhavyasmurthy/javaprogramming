package siiibblocks;
//"Assignment 141:Write a program where u have 1SIB,2IIB,1Main method 
//Create 2 object Check order of execution"
public class Assignment141 {
	static {
		System.out.println("SIB1");
	}
	{
		System.out.println("IIB1");
	}
	{
	System.out.println("IIB2");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		new Assignment141();
		new Assignment141();
		
	}

}
