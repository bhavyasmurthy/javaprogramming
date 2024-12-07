package interface_concepts;

interface Calculator {
	void add(int a, int b);

	void sub(int a, int b);
}

public class Assignment65 implements Calculator {
	@Override
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a - b);

	}

	public static void main(String[] args) {
		Assignment65 a65 = new Assignment65();
		a65.add(10, 100);
		a65.sub(222, 120);

	}

}
