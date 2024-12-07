package stringbuilderandbufferconcepts;

public class StringBuilderInserEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World");

		// Insert "Beautiful " at index 6
		sb.insert(6, "Beautiful ");

		System.out.println(sb.toString()); // Output: Hello Beautiful World
	}
}