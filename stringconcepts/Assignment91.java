package stringconcepts;
//"Assignment 91

//Check if the given string have the letter 'u' in it.string""manishtiwari"""

public class Assignment91 {

	public static void main(String[] args) {
		String a = "manishtiwari";
		System.out.println(a.matches("(.*)u(.*)"));
		System.out.println(a.contains("u"));
	}

}
