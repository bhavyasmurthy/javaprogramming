package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

// "Assignment 117
//Write a program using the put() method with Object, Object parameters in the Map Interface."
public class Assignment117 {

	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", "E10");
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", null);
		m1.put("def1", null); // only 1 null value

		System.out.println(m1);

	}

}
