package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 118
//Write a program to print name and gender using the put() method in the Map Interface."
public class Assignment118 {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Sita", 'F');
		m1.put("Hanuman", 'M');
		m1.put("Laxman", 'M');
		m1.put("Ram", 'F');
		m1.put("Mandara", 'F');

		System.out.println(m1);

	}

}
