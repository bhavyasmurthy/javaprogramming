package stringbuilderandbufferconcepts;
//"Assignment 128 Write a program on Append() method using StringBuilder Class"

public class Assignment128 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("bhavya");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		sb = sb.append(" s murthy ").append("hello12");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
