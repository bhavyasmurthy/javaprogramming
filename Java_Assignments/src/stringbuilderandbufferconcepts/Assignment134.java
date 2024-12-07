package stringbuilderandbufferconcepts;

//"Assignment 134:Write a program on capacity() method using StringBuffer Class"
public class Assignment134 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("bhavya");
		System.out.println(sb.length());// 6
		System.out.println(sb.capacity());// 16+6=22

		sb = sb.append(" s murthy ").append("hello1");
		System.out.println(sb);
		System.out.println(sb.length());// 22
		System.out.println(sb.capacity());// 22
		sb.append("hi");
		System.out.println(sb.length());// 24
		System.out.println(sb.capacity());// 23*2=46

		StringBuilder s1 = new StringBuilder("automation");
		System.out.println(s1.length());// 10
		System.out.println(s1.capacity());// 26

		s1.append("testing");
		System.out.println(s1.length());// 17
		System.out.println(s1.capacity());// 26

		s1.append("hi12345671");
		System.out.println(s1.length());// 27
		System.out.println(s1.capacity());// 54

	}
}
