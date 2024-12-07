package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 122
//Write a program using the Equals() method in the Map Interface."
public class Assignment122 {

	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", "E10");
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", null);
		System.out.println(m1);

		Map<Object, Object> m2 = new HashMap<Object, Object>();
		m2.put("EMP1", "E10");
		m2.put("EMP10", "E101");
		m2.put("EMP12", "E102");
		m2.put("Shubha", 'F');
		m2.put("Bhavya", 90000);
		m2.put("def", null);
		System.out.println(m2);
		// m1.putIfAbsent("hi", "hello");
		// System.out.println(m1);
		boolean b1 = m1.equals(m2);

		System.out.println(b1);

	}

}
