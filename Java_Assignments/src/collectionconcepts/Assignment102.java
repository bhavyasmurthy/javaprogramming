package collectionconcepts;

import java.util.ArrayList;
import java.util.Collection;

//"Assignment 102
//Write a Program on Clear method in the collection class."
public class Assignment102 {

	public static void main(String[] args) {
		Collection c2 = new ArrayList();
		c2.add(12);
		c2.add(12.89);
		c2.add('T');
		c2.add(false);
		System.out.println(c2);
		c2.clear();
		System.out.println(c2);
	}

}
