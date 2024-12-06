package inhertanceassignment;
class ParentEx{
	static void add() {
		System.out.println("addition");
		
	}
	static void add1() {
		System.out.println("addition1");
		
	}
}
public class SingleLevelInheritance3 extends ParentEx{
	 void auth() {
		System.out.println("authenticate");
	}

	public static void main(String[] args) {
		SingleLevelInheritance3 s3 = new SingleLevelInheritance3();
		add();
		add1();
		s3.auth();
	}

}
