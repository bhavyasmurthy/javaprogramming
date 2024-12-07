package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 121
//Write a program using the putIfAbsent() method in the Map Interface."
public class Assignment121 {

	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", "E10");
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", null);
		System.out.println(m1);

		m1.putIfAbsent("Sera", 89);
		System.out.println(m1);
		m1.putIfAbsent("Bhavya", 90000);
		System.out.println(m1);

	}

}
