package collectionconcepts;

import java.util.ArrayList;
import java.util.List;

//"Assignment 110
//write a program on List Methods from add() to size() in the List Class"

public class Assignment110 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("hi");
		l1.add("hello");
		l1.add(null);
		l1.add(90);
		l1.add(-8);
		l1.add(null);
		System.out.println("list l1" + l1);

		List l2 = new ArrayList();
		l2.addAll(l1);
		l2.add(2, 12);
		System.out.println("updatedlist l2" + l2);
		System.out.println(l2.contains(90));
		System.out.println(l2.containsAll(l1));
		System.out.println(l2.remove(null));
		System.out.println(l2);
		// System.out.println(l2.removeAll(l1));
		System.out.println(l2);
		// l2.clear();
		System.out.println(l2.isEmpty());
		System.out.println(l2.size());

	}

}
