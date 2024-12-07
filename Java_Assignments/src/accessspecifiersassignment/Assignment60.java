package accessspecifiersassignment;

/*
 * Assignment 60 Write a program to check which method access specifiers 
 * are accessible inside same class
 */
public class Assignment60 {
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	private void sub(int a, int b) {
		System.out.println(a - b);

	}

	protected void mul(int a, int b) {
		System.out.println(a * b);

	}

	void div(int a, int b) {
		System.out.println(a / b);

	}

	public static void main(String[] args) {
		Assignment60 masp = new Assignment60();
		masp.add(12, 10); // public
		masp.sub(4, 10); // private
		masp.mul(5, 20); // protected
		masp.div(15, 10); // default
	}

}
