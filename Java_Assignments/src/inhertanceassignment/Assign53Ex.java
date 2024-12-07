package inhertanceassignment;
class Parent11{
	Parent11(char c1){
		System.out.println("constructor1");
	}
	
}
class AmazonE extends Parent11{
	AmazonE(int i,String x){
		super('T');
		System.out.println("constructor2");
		
	}
}
public class Assign53Ex extends AmazonE{
	Assign53Ex(int a){
		super(2,"bh");
		System.out.println("constructor");
	}
	
	

	public static void main(String[] args) {
		new Assign53Ex(1);

	}
}
