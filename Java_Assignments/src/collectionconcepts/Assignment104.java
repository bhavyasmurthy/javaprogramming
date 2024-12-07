package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 104
//write a program on Contains method in the Collection class."
public class Assignment104 {

	public static void main(String[] args) {
		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);
		boolean contains = c2.contains("hello");
		System.out.println(contains);
		boolean contains1 = c2.contains(12);
		System.out.println(contains1);
		System.out.println(c2.contains(c2)); // false
		System.out.println(c2.containsAll(c2)); // true

	}

}
