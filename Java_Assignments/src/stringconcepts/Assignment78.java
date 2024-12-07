package stringconcepts;
//"Assignment 78:Write a program to check if the given number is part of an Array or not"

public class Assignment78 {
	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0] = 32;
		rollno[1] = 89;
		rollno[2] = 87;
		rollno[3] = 90;
		int givenno = 90;
		for (int i = 0; i <= 3; i++) {
			if (givenno == rollno[i]) {
				System.out.println("Number is present" +" at index "+i);
			} 
			}
			
	}

}
