package inhertanceassignment;
class A{
	static void add1() {
		System.out.println("static method 1");
	}
	static void add1(String st) {
		System.out.println("static method 2");
	}
}

public class CallonlyStaticMetodsUsingSIngleLevelInheritance extends A {

	public static void main(String[] args) {
		add1();
		add1("Mrutyunjay");
		
	}

}
