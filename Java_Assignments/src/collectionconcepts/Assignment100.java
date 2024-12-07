package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 100
//Write a Program on add method in the collection class with hetrogeneous Values."
public class Assignment100 {

	public static void main(String[] args) {
		// collection1
		Collection<Object> c1 = new ArrayList();
		c1.add("cat");
		c1.add("rat");
		c1.add("cow");
		c1.add("lion");
		c1.add(10);
		c1.add(null);
		c1.add(0);
		c1.add(true);
		System.out.println(c1);

		// collection2
		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);

		System.out.println(c2.addAll(c1));
		System.out.println(c2);
		System.out.println(c2.remove(c1)); // o/p--->false removeAll--> true
		System.out.println(c2);

	}

}
