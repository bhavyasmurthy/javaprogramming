package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 116
//Write a program using the put() method with String, String parameters in the Map Interface. "
public class Assignment116 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Sita", "GTM102");
		m1.put("Hanuman", "GTM12");
		m1.put("Laxman", "GTM10");
		m1.put("Ram", "GTM2");
		m1.put("Mandara", "GTM2");
		// m1.clear();

		System.out.println(m1);

	}

}
