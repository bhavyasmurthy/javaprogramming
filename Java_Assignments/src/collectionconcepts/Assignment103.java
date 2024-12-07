package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 103
//write a program on isempty method in the Collection class."
public class Assignment103 {

	public static void main(String[] args) {
		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);
		Collection c1 = new ArrayList();
		c1.add("book");
		c1.add("pencil");
		c1.add("paper");
		c1.add("pen");
		c1.add("ruler");
		System.out.println(c1);
		boolean isempty = c1.isEmpty();
		System.out.println(isempty); // returns value false because you did not clear
		c1.clear();
		System.out.println(c1);
		boolean b1 = c1.isEmpty();
		System.out.println(b1); // returns true because you clear the collection

	}

}
