package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 107
//write a program on Remove All method in the Collection class."
public class Assignment107 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("book");
		c1.add("pencil");
		c1.add("paper");
		c1.add("pen");
		c1.add("ruler");
		System.out.println(c1);
		c1.remove("pencil");
		System.out.println(c1);

		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);
		c1.addAll(c2);
		System.out.println(c1);
		c1.removeAll(c2);
		System.out.println(c1);
	}

}
