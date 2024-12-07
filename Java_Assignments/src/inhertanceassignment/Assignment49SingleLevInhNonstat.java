package inhertanceassignment;

/* "Assignment 49:Write a program for single-level inheritance 
 * using a Non-static method in the same class name in the single package explorer."
 */
class StstNonstat {

	void add1(int a, double b) {
		System.out.println("Non static method1");
	}

	void add1(String s1) {
		System.out.println("Non static method2");
	}
}

public class Assignment49SingleLevInhNonstat extends StstNonstat {

	public static void main(String[] args) {
		Assignment49SingleLevInhNonstat ns1 = new Assignment49SingleLevInhNonstat();
		ns1.add1(5, 3.5);
		ns1.add1("hello");
	}

}
