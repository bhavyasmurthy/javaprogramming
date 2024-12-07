package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 125
//Write a program on Get() method in the Map Interface."

public class Assignment125 {
	public static void main(String[] args) {

		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", "E10");
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", " ");
		m1.remove("def");

		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.get("def"));
	}

}
