package collectionconcepts;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
 * "Assignment 114
Write a program on sort method in collection class for integer values ."

"Assignment 115
Write a program on sort method in collection class for String values ."
 */

public class Assignment114 {

	public static void main(String[] args) {
		List<Integer> l1 = new Vector<Integer>();
		l1.add(987);
		l1.add(56);
		l1.add(67);
		l1.add(90);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("Integer Sort:" + l1);

		List<String> l2 = new Vector<String>();
		l2.add("vaishu");
		l2.add("bhavya");
		l2.add("tanush");
		l2.add("mittu");
		Collections.sort(l2);
		System.out.println("String sort:" + l2);
	}

}
