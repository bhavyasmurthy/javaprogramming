package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 120
//Write a program using the putAll() method with Object, Object parameters in the Map Interface."
public class Assignment120 {

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
		m2.putAll(m1);
		System.out.println(m2);
		m2.put("hi", 89);
		m2.put("hello", 23);
		m2.putIfAbsent("1", "one");

		// m2.isEmpty();
		System.out.println("updated map:" + m2);

	}

}
