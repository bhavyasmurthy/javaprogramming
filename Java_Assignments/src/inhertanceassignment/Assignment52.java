package inhertanceassignment;

/*
 * "Assignment 52
Write a Program for hierarchical Level Inheritance"
 */
class Animal1 {
	void eat() {
		System.out.println("eating");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Barking");
	}
}

class Cat extends Animal1 {
	void meow() {
		System.out.println("meowmeow");

	}
}

public class Assignment52 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.meow();
		c1.eat();
		Dog1 d1 = new Dog1();
		d1.bark();
		d1.eat();

	}

}
