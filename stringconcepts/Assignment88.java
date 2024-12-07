package stringconcepts;
//"Assignment 88

//Check if the given strig consist of exact 3 letters string""axe"""

//"Assignment 89 check if the given string starts with 'a'string""axe"""
//"Assignment 90check if the given string ends with 'e'string""axe"""

public class Assignment88 {
	public static void main(String[] args) {
		String a = "axe";
		// System.out.println(a.matches("..."));
		// System.out.println(a.matches("a(.*)"));
		System.out.println(a.matches("(.*)e"));
		System.out.println(a.matches("a(.*)(.*)a"));

	}

}
