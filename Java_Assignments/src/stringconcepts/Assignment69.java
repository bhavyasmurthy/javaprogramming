package stringconcepts;
// Assignment 69:Write a program for Reverse a String by using String Functions

public class Assignment69 {

	public static void main(String[] args) {
		String input ="liril";
		String output = "";
		for(int i=input.length()-1;i>=0;i--) {
		    char c1 = input.charAt(i);
		    output = output+c1;
		}
		System.out.println(output); //string reverse
		//palindrome code from here
		if(input.equals(output)==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
