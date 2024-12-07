package stringbuilderandbufferconcepts;

//"Assignment 133 Write a program on reverse() method using StringBuffer Class"
public class Assignment133 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("bhavya");
		sb.reverse();
		System.out.println(sb); // ayvahb
		sb.delete(2, 4);
		System.out.println(sb);// ayhb
	}

}
