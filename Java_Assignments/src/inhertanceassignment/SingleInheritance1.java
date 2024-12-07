package inhertanceassignment;
/*
 * Assignment 49
Write a program for single-level inheritance using a Non-static method 
in the same class name in the single package explorer.
 */
class Parent1{
	void add() {
		System.out.println("Addition");
	}
	void add(int a, int b) {
		System.out.println("add:" +(a+b));
	}
	void add(String name) {
		System.out.println("Enter name:"+name);
	}
	
}
public class SingleInheritance1 extends Parent1 {

	public static void main(String[] args) {
		SingleInheritance1 sin1 = new SingleInheritance1();
		sin1.add();
		sin1.add("Bhavya");
		sin1.add(5, 10);

	}

}
