package collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Assignment 111
//write a program on List Interface for ListIterator() of forward Iteration and Backward Iteration and Iterator() also."

public class Assignment111 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(100);
		l1.add(876);
		l1.add(87);
		l1.add(3);
		System.out.println(l1);

		System.out.println(" iterator only in forward direction");
		Iterator i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("list iterator in forward direction");
		ListIterator li1 = l1.listIterator();
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}

		System.out.println("List Iterator on backward direction");
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
	}

}
