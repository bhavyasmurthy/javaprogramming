package stringconcepts;

//"Assignment 96
// Write a program using concate method"
public class Assignment96 {

	public static void main(String[] args) {
		String a = "bhavya murthy";
		String b = " test engineer";
		String c = a.concat(b);
		System.out.println(c);

		String s1 = "hello";
		String s2 = "hello";
		StringBuffer s3 = new StringBuffer("hello");
		if (s1 == s2) {
			System.out.println(s1 + s2);
		}
		// if (s1.equals(s3)) {
		System.out.println(s1.equals(s3));
		System.out.println(s2 == s3.toString());
		System.out.println(s2.equals(s3.toString()));

		// }
	}

}
