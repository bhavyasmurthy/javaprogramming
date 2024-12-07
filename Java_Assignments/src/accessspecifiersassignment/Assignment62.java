package accessspecifiersassignment;

import inhertanceassignment.Assignment62Ex;

/* Assignment 62 Write a program to check which method access specifiers are accessible
 *  outside the package by becoming sub class. 
 */

public class Assignment62 extends Assignment62Ex {
	public static void main(String[] args) {
		Assignment62 a62 = new Assignment62();
		a62.add(12,10);  //public
		a62.mul(3, 4);		//protected
	}
	
	
	
}
