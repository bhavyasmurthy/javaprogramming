package stringbuilderandbufferconcepts;

//"Assignment 131: Write a program on replace() method using StringBuffer Class"
public class Assignment131 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1 = sb1.append("hello ").append(true);
		System.out.println(sb1);
		sb1.replace(6, 13, "welcome");
		System.out.println(sb1);

		StringBuffer name = new StringBuffer("Manish Tiwari");
		// System.out.println(name.replaceAll("[A-Z]", "")); only strings replaceall
		name.replace(0, 5, "rai");
		System.out.println(name);
		String str1 = "java";
		String str2 = "java";

		// string buffer
		StringBuffer str3 = new StringBuffer("java");
		StringBuffer str4 = new StringBuffer("java");

		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equals(str3.toString());
		boolean b3 = str1 == str3.toString();

		boolean b4 = (str3.toString().equals(str4.toString())); // coverting str3 and str4 buffers to tostring()
		System.out.println("String buffer is checking for content:" + b4);

		// boolean b2 = str1.equals(str3.toString());
		System.out.println(b1 + " and " + b2);
		System.out.println("str1==str3.toString:" + b3);

	}

}
