package stringconcepts;

import java.util.Arrays;

/*Assignment 80:  write a program to find 
1: Number of Alphabet 
2: Number of Numeric
3: Number of Space
4:Number of Special character
in Given string : "KV no 2"
 */
public class Assignment80 {
	static int countOfAlphabets = 0;
	static int countOfnumbers = 0;
	static int countOfspaces = 0;

	public static void main(String[] args) {
		String a = "KV no 2";
		char ch[] = a.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < a.length(); i++) {
			// System.out.println(ch[i]);
			boolean v1 = Character.isAlphabetic(ch[i]);
			if (v1 == true) {
				countOfAlphabets++;
			}
			boolean v2 = Character.isDigit(ch[i]);

			if (v2 == true) {
				countOfnumbers++;
			}
			boolean v3 = Character.isWhitespace(ch[i]);

			if (v3 == true) {
				countOfspaces++;
			}
		}
		System.out.println("countOfAlphabets:" + countOfAlphabets);
		System.out.println("countOfnumbers:" + countOfnumbers);
		System.out.println("countOfspaces:" + countOfspaces);
		int countOfspecialcharacters = a.length() - (countOfAlphabets + countOfnumbers + countOfspaces);
		System.out.println("countOfspecialcharacters:" + countOfspecialcharacters);

	}

}
