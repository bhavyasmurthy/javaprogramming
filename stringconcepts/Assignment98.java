package stringconcepts;

import java.util.Date;

//"Assignment 98 Write a program to find out 
//Current time
//Future Time
//Past time"
public class Assignment98 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		System.out.println(d1);
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);

		String humantime = d2.toString();
		String date = humantime.substring(8, 10);
		System.out.println(date);
		String month = humantime.substring(4, 7);
		System.out.println(month);
		String year = humantime.substring(humantime.length() - 4);
		System.out.println(year);
		String format1 = date.concat(month).concat(year);
		System.out.println(format1);
		String format2 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format2);
		String format3 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
		String format4 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format4);

		// Future date
		Date d3 = new Date(d2.getTime() + (1000 * 60 * 60 * 24 * 1));
		System.out.println(d3);

		// past date
		Date d4 = new Date(d2.getTime() - (1000 * 60 * 60 * 24 * 5));
		System.out.println(d4);
	}

}
