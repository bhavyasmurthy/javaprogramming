package org.grotech.assignments;

import java.util.Scanner;

/*"Assignment 38
Write a program to do declaration and initialisation of all methods of Scanner class"
 */

public class Assignment38 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		byte s4 = s1.nextByte();
		System.out.println(s4);
		short s = s1.nextShort();
		System.out.println(s);
		int i = s1.nextInt();
		System.out.println(i);

		long l1 = s1.nextLong();
		System.out.println(l1);

		float f1 = s1.nextFloat();
		System.out.println(f1);

		double d = s1.nextDouble();
		System.out.println(d);

		boolean b = s1.hasNextByte();
		System.out.println(b);

		/*
		 * String s2=s1.next(); byte b1 = s1.nextByte(); short s3= s1.nextShort(); int
		 * s4 = s1.nextInt(); long s5 = s1.nextLong(); float s6 =s1.nextFloat(); double
		 * d1 =s1.nextDouble(); boolean b2= s1.nextBoolean(); Stream<MatchResult> s7 =
		 * s1.findAll(Pattern.compile("hi")); boolean b3 =s1.equals(s2); String sr
		 * =s1.findInLine("hi"); String s8 =s1.findWithinHorizon(Pattern.compile("hi"),
		 * 0); s1.findInLine(Pattern.quote("hello"));
		 * System.out.println("Byte value:"+b1); System.out.println("String value:"+s2);
		 */
		s1.close();

	}

}
