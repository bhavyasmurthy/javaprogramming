package interface_concepts;
//"Assignment 67 Write a program for multiple level inheritance using interface"

interface A{
	void add();
	void sub();
}
interface B{
	void mul();
	void div();
}
public class Assignment67 implements A,B {
	public void mul() {
		System.out.println("multiply");
		
	}

	public void div() {
		System.out.println("divide");

	}

	public void add() {
		System.out.println("add");

	}

	public void sub() {
		System.out.println("subtract");

	}
	public static void main(String[] args) {
		Assignment67 a67 = new Assignment67();
		a67.add();
		a67.div();
		a67.sub();
		a67.mul();

	}


}
