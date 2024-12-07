package stringconcepts;

import java.util.Arrays;

//"Assignment 79
//Write a program on all the Methods of String Functions from length() to till toCharArray()"

public class Assignment79 {
	public static void main(String[] args) {
		String name = "Bhavya S Murthy";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String n1 = "vaish   navi Sidda";
		System.out.println(n1.trim());
		System.out.println(n1.charAt(2));
		System.out.println(n1.charAt(10));
		System.out.println(n1.charAt(13));
		System.out.println(n1.indexOf('i'));
		System.out.println(n1.lastIndexOf('i'));
		System.out.println(n1.substring(7));
		System.out.println(n1.substring(7, 11));
		System.out.println(name.equals(n1));
		System.out.println(name.equals(name));
		System.out.println(name.contains("Murthy"));
		System.out.println(n1.contains("r"));
		System.out.println(n1.equals(name));
		System.out.println(name.equalsIgnoreCase("bhavya s murthy"));
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println(Arrays.toString(c1));

	}

}
