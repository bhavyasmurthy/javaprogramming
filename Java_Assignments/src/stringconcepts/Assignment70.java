package stringconcepts;
//Assignment 70:Write a program to check if the given String is Palindrome or not"

public class Assignment70 {
	public static void main(String[] args) {
		String input = "liril";
		String output = "";
		for(int i =input.length()-1;i>=0;i--) {
        char c1 = input.charAt(i);
        output = output +c1;
	}
		System.out.println(output);
		if(input.equals(output)== true){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");

		}
	}
}
