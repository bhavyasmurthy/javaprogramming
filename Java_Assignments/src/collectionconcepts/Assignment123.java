package collectionconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*"Assignment 123
Write a program on Iteration methods in the Map Interface using For Each Loop Concept.
1.keySet().
2.values().
3.entrySet()."
*/

public class Assignment123 {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Sita", "GTM102");
		m1.put("Hanuman", "GTM12");
		m1.put("Laxman", "GTM10");
		m1.put("Ram", "GTM2");
		m1.put("Mandara", "GTM2");
		System.out.println(m1);

		System.out.println("To get only keys using for each loop");
		for (String s1 : m1.keySet()) {
			System.out.println(s1);
		}

		System.out.println("To get only values using for each loop");
		for (String s2 : m1.values()) {
			System.out.println(s2);
		}

		System.out.println("To get both keys and values using for each loop");

		for (Entry<String, String> s3 : m1.entrySet()) {
			System.out.println(s3);
		}

	}

}
