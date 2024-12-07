package stringbuilderandbufferconcepts;

public class StringBufferInsertExample {
	public static void main(String[] args) {
		// Create a new StringBuffer with initial string
		StringBuffer stringBuffer = new StringBuffer("Hello World!");

		// Print the original string
		System.out.println("Original String: " + stringBuffer);

		// Insert a string at a specific index
		stringBuffer.insert(6, "Beautiful "); // Insert "Beautiful " at index 6

		// Print the modified string
		System.out.println("After Insertion: " + stringBuffer);

		// Insert a character at a specific index
		stringBuffer.insert(0, 'X'); // Insert character 'X' at the beginning (index 0)

		// Print the modified string
		System.out.println("After Inserting Character: " + stringBuffer);

		// Insert a substring into the StringBuffer
		String additionalString = " Enjoy!";
		stringBuffer.insert(stringBuffer.length(), additionalString); // Append at the end

		// Print the final result
		System.out.println("Final String after append: " + stringBuffer);
	}
}