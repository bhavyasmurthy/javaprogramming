package stringbuilderandbufferconcepts;

//"Assignment 136:Write a program on subString() method using StringBuffer Class"
public class Assignment136 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("automation");
		System.out.println(sb1.substring(2));
		System.out.println(sb1.substring(4, 9));
		String s1 = "testing";
		sb1 = sb1.insert(sb1.length(), s1);
		System.out.println(sb1);

	}

}
