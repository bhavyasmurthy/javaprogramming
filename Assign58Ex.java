package inhertanceassignment;

class A58 {
	void login() {
		System.out.println("login by mobile");
	}
}

public class Assign58Ex extends A58 {
	void login() {
		super.login();
		System.out.println("login by username");
	}

	public static void main(String[] args) {
		Assign58Ex a1 = new Assign58Ex();
		a1.login();

	}

}
