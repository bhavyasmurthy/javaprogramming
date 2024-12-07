package stringbuilderandbufferconcepts;

// "Assignment 130:Write a program on Insert() method using StringBuffer Class"
public class Assignment130 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1 = sb1.append("hello ").append(true);
		System.out.println(sb1);
		sb1.insert(0, "i ");
		System.out.println(sb1);

		sb1.insert(5, 'V');
		System.out.println(sb1);

		sb1.insert(7, " Sidda ");
		System.out.println(sb1);

		sb1.insert(13, " hi ");
		System.out.println(sb1);

		sb1.insert(13, 9.890);

		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder("automation ");
		sb2.append("testing!");
		System.out.println(sb2.insert(11, "course "));
		System.out.println(sb2.replace(2, 10, "automation")); // replace will not dlete other characters it will just
																// replace with the existing characters
		System.out.println(sb2);
		sb2.replace(3, 6, "$$$");
		System.out.println(sb2);
		sb2.replace(4, 5, "*");
		System.out.println(sb2);

	}

}
