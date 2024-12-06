package inhertanceassignment;
class A1{
	void add2() {
		System.out.println("non static method 1");
	}
	void add2(char c2) {
		System.out.println("non static method 2");
	}
}

public class CallonlyNonStaticMetodsUsingSIngleLevelInheritance extends A1 {

	public static void main(String[] args) {
		CallonlyNonStaticMetodsUsingSIngleLevelInheritance ns1= new CallonlyNonStaticMetodsUsingSIngleLevelInheritance();
		ns1.add2();
		ns1.add2('T');

	}

}
