package inhertanceassignment;

//"Assignment 53
//"Write a program for constructor inheritance using the super calling statement with Implicit Invocation"

class A2 {

	A2() {
		System.out.println("constructor 3");
	}

	class Amazon extends A2 {
		Amazon() {
			System.out.println("Constructor2");
		}
	}

	public class ConstSupr extends A2 {
		ConstSupr() {
			System.out.println("Constructor1");
		}

		public static void main(String[] args) {
			new A2();

		}

	}

}
