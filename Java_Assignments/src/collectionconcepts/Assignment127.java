package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 127
//Write a program on clear() and isempty() method in the Map Interface."
public class Assignment127 {

	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("EMP1", "E10");
		m1.put("EMP10", "E101");
		m1.put("EMP12", "E102");
		m1.put("Shubha", 'F');
		m1.put("Bhavya", 90000);
		m1.put("def", null);
		System.out.println(m1);
		// remove()
		// m2.put("ek", 78);
		// m2.remove(m1);
		// System.out.println("remove:" + m1);

		m1.clear();
		System.out.println(m1);
		System.out.println(m1.isEmpty());

	}

}
