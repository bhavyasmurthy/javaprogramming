package stringbuilderandbufferconcepts;

//"Assignment 129 Write a program on Append() method using StringBuffer Class"
public class Assignment129 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		print(sb1); // length = 0 capacity=16
		sb1.append("bhavya");
		print(sb1); // length =6 capacity =16
		sb1.append("mrutyunjay");
		print(sb1); // length = 16 capacity=16
		sb1.append("hello");
		print(sb1); // length=21 capacity = 34
		sb1.append("abcdefghijklm");
		print(sb1);// length=34 capacity = 34
		sb1.append("word");
		print(sb1); // length = 38 capacity =70
		sb1.append("abcdefghijklmnopqrstuvwxyz123456");
		print(sb1); // length = 70 capacity =70
		sb1.append("hi");
		System.out.println(sb1);
		print(sb1);// length 72 capacity=142
	}

	private static void print(StringBuffer sb) {// even sb1 can be declared becoz its private method
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
