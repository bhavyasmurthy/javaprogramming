package org.grotech.assignments;
//method constructor
public class Assignment20 {
	Assignment20() 
	{
	 System.out.println("This is a Constructor");	
	}
	public static void main(String[] args) {
		new Assignment20(); //1
		Assignment20 a20 = new Assignment20();//2 objects is created twice so it will print twice
	}

}
