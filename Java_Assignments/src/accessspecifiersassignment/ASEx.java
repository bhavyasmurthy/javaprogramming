package accessspecifiersassignment;

public class ASEx {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	void mul(int a, int b) {
		System.out.println(a * b);
	}

	void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		ASEx as = new ASEx();
		as.add(1, 2);
		as.sub(11, 2);
		as.mul(8, 2);
		as.div(4, 2);

	}

}
