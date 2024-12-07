package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

//"Assignment 119
//Write a program to print name and Salary using the put() method in the Map Interface."

public class Assignment119 {

	public static void main(String[] args) {
		Map<String, Double> m1 = new HashMap<String, Double>();
		m1.put("Bhavya", 95.000);
		m1.put("Shubha", 8.5000);
		m1.put("Muttu", 900.00);
		m1.put("Tanush", 50.00);
		m1.put("Vaishu", 900.0);
		System.out.println(m1);

	}

}
