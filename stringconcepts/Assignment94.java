package stringconcepts;

//"Assignment 94 Write a program where Input is "Manish Kumar tiwari" "Output is "MKT"
public class Assignment94 {

	public static void main(String[] args) {
		String input = "Manish Kumar Tiwari";
		String output = input.replaceAll("[a-z]", "").replace(" ", "");
		// System.out.println(output);
		String c = output.replace(" ", "");
		System.out.println(c);
		for (int i = 0; i < c.length(); i++) {
			char c1 = c.charAt(i);
			System.out.println(c1);

		}

		String name = "BhavyaSMurthy";
		String name1 = name.replaceAll("[a-z]", "").replace(" ", "");
		System.out.println(name1);
		for (int i = 0; i < name1.length(); i++) {
			char ch = name1.charAt(i);
			System.out.println(ch);
		}

		// String output = input.replaceAll("[a-z]", "").replace(" ", "");
		// System.out.println(output);

	}

}
