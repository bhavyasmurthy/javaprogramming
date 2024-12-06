package inhertanceassignment;

public class StaticNonStaticMethod1 {
	static void add() {// static non parameterized method
		System.out.println("Addition");
	}
	static void sub() {
		System.out.println("subtraction");
	}
	static void login(String Username, String password) { // static  parameterized method
		System.out.println("Login");
	}

	void add1() {
		System.out.println("Addition");
	}
	void add1(int a, int b) {
		System.out.println("add:" +(a+b));
	}
	void add1(String name) {
		System.out.println("Enter name:"+name);
	}
}
