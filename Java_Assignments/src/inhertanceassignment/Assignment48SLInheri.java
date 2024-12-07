package inhertanceassignment;
/* Assignment 48:Write a program for single-level inheritance using a static method 
 * in the same class name in the single package explorer."
 */
class Parent48{
	static void Google(){
		System.out.println("Google class");
		
	}
	static void add(int a,int b) {
		System.out.println(a+b);
	}

}
public class Assignment48SLInheri extends Parent48{
	static void Amazon() {
		System.out.println("Amazon class");
	}
	static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		System.out.println("Single level Inheritance");
		add(3,4);
		sub(2,3);
		Amazon();
		Google();
	}

}
