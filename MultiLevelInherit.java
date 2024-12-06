/*
 * "Assignment 51
Write a Program for Multi Level Inheritance"
 */
package inhertanceassignment;
class Animal{
	void eat() {
		System.out.println("eating");
	}
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
public class MultiLevelInherit extends Dog {
	void weep() {
		System.out.println("weeeping");
	}

	public static void main(String[] args) {
		MultiLevelInherit m1 = new MultiLevelInherit();
		m1.bark();
		m1.weep();
		m1.eat();

	}

}
