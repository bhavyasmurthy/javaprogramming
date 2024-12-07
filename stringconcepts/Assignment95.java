package stringconcepts;
/* "Assignment 95 Write a program where Input is "Manish Kumar tiwari" 
 * Output: 
 * M
 * K
 * T
 */

public class Assignment95 {

	public static void main(String[] args) {
		/*
		 * String a = "Manish Kumar Tiwari"; String b = a.replaceAll("[a-z]",
		 * "").replace(" ", ""); System.out.println(b); // String c = b.replace(" ",
		 * ""); for (int i = 0; i < b.length(); i++) { char c1 = b.charAt(i);
		 * System.out.println(c1);
		 */

		String s1 = "Bhavya S Murthy";
		String replaceStr = s1.replaceAll("[a-z]", "").replace(" ", "");

		System.out.println(replaceStr);
		for (int i = 0; i < replaceStr.length(); i++) {
			System.out.println(replaceStr.charAt(i));
		}

	}
}
