package inhertanceassignment;

public class Assign57Ex {
	Assign57Ex(int k,int l){
		System.out.println(k+l);
	}
	Assign57Ex(int a){
		this(2,3);
		System.out.println(a);
	}
	Assign57Ex(char ca){
		this(2);
		System.out.println(ca);
	}

	public static void main(String[] args) {
		new Assign57Ex('V');
		System.out.println("this calling statement");

	}

}
