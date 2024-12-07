package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 101
//write a program on add All method in the Collection class ."
public class Assignment101 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("book");
		c1.add("pencil");
		c1.add("paper");
		c1.add("pen");
		c1.add("ruler");
		System.out.println(c1);

		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);

		c2.addAll(c1);

		System.out.println(c2);

	}

}
