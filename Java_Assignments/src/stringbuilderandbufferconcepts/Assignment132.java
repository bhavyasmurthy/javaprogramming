package stringbuilderandbufferconcepts;

//"Assignment 132: Write a program on delete() method using StringBuffer Class"
public class Assignment132 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1 = sb1.append("hello ").append(true);
		sb1.delete(5, 10);
		System.out.println(sb1);
		System.out.println(sb1.deleteCharAt(2));

	}

}
