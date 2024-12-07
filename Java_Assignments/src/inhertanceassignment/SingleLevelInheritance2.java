package inhertanceassignment;

/* Assignment 50
Write a program for single-level inheritance
 using a static and Non-static method 
 in the different class name in the single package explorer.
 * 
 */
public class SingleLevelInheritance2 extends StaticNonStaticMethod1{
	public static void main(String[] args) {
		SingleLevelInheritance2 sin2 = new SingleLevelInheritance2();
		add();
		sub();
		login("bsm@a.com","aba@123");
		sin2.add1();
		sin2.add1("Bhavya");
		sin2.add1(5, 10);

		
		
	}
	
}
