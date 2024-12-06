package inhertanceassignment;
class ParentEx1{
	void addSalary() {
		System.out.println("Parent class");
	}
}
class child1 extends ParentEx1{
	void add1() {
		System.out.println("child class 1");
	}
}
class child2 extends ParentEx1{
	void add2() {
		System.out.println("child class2");
	}
}
public class HierarchialEx1 {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.add1();
		c1.addSalary();
		child2 c2 = new child2();
		c2.add2();
		c2.addSalary();

	}

}
