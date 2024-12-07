package stringconcepts;

import java.util.Arrays;

/* Write a program with different string function mentioned below
1:Length 2:tolowercase 3:touppercase 4:trim 5:charAt(index) 6:indexof(char) 7:substring(start index)
8:substring(start index, end index) 9:equals 10:contains 11:equalsIgnoreCase
 */
public class Assignment68 {

	public static void main(String[] args) {
		String name = "bhavya s murthy";
		System.out.println("length:" + name.length()); // to print length in 2 ways length of string
		String name1 = new String("bhavya s murthy");
		System.out.println("Length:" + name1.length()); // length 2nd type length of string
		System.out.println("Uppercase:" + name.toUpperCase()); // uppercase
		System.out.println("lowercase:" + name.toLowerCase()); // lowercase
		String name2 = "     hi   welcome     ";
		System.out.println("Trim:" + name2.trim()); // trim functions at the beginning and end of the string
		System.out.println("Character:" + name.charAt(7)); // charAt(index)
		System.out.println("Indexof:" + name.indexOf('m')); // indexOf(char)
		System.out.println("Substring1:" + name.substring(2)); // substring(start index)
		System.out.println("substring of index 1,2:" + name.substring(3, 10)); // substring(start index, end index)
		System.out.println("Equals:" + name.equals(name1)); // returns boolean value
		System.out.println("Equals:" + name.equals("bhavya s murthy"));
		System.out.println("Equals:" + name.equals(name2));
		System.out.println("Contains:" + name.contains("h")); // returns boolean value
		System.out.println("Ignorecase:" + name.equalsIgnoreCase("BHAVYA S MURTHY")); // return boolean value
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println("chararray:" + Arrays.toString(c1));
		int[] i = new int[3];
		System.out.println(i.length);
	}

}
