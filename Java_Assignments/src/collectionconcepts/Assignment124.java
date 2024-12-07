package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 124
//Write a program on Remove() method with Key and Both Key ,Value parameters in the Map Interface."
public class Assignment124 {

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
		System.out.println("updated map:" + m2);

		m2.remove("EMP12");
		System.out.println("After remove key:" + m2);
		m2.remove("hi", 89);
		System.out.println("After remove keyvalue:" + m2);

	}

}
