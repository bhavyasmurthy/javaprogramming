package inhertanceassignment;
class ParentHire{
	void addSalary() {
		System.out.println("parent class");
	}
}
class Bx extends ParentHire{
	void addB1() {
		System.out.println("class B inheriting Parent");
	}
}
class Ax extends ParentHire{
	void addA1(){
		System.out.println("class A inheriting parent class");
	}
}
public class HierarchialEx {

	public static void main(String[] args) {
		Ax hx = new Ax();
		hx.addA1();
		hx.addSalary();
		Bx hx1 = new Bx();
		hx1.addB1();
		hx1.addSalary();
		
		

	}

}