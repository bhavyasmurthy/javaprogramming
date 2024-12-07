package collectionconcepts;

import java.util.HashMap;
import java.util.Map;
//"Assignment 126
//Write a program on Contains() method both Key and Values in the Map Interface."

public class Assignment126 {

	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", 10);
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", null);
		System.out.println(m1);
		System.out.println(m1.containsKey("Bhavya"));
		System.out.println(m1.containsKey("vya"));
		System.out.println(m1.containsValue("E101"));
		System.out.println(m1.containsValue(10));

	}

}
