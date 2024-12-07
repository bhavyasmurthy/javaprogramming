package inhertanceassignment;
//"Assignment 57

//Write a Program on This Calling Statement"

public class Assignment57this {
	Assignment57this(int k) {
		this();
		System.out.println("constructor1");
	}

	Assignment57this() {

		System.out.println("calling constructor using this statemnt");

	}

	Assignment57this(String s1) {
		this(10);
		System.out.println("constructor 2");
	}

	public static void main(String[] args) {
		new Assignment57this("Mittu");

	}

}
