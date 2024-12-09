package typecast;
//"Assignment 143:Write a program on primitive type casting for

// 1:Narrowing: convert double into int
// 2:Widning:convert int into double"
public class Assignment143 {

	public static void main(String[] args) {
		// Widening:convert int into double"

		int a = 28;
		
		double d1 = a;//implicit
		System.out.println(d1);
		
		double d2 = (double)a;//explicit
		System.out.println(d2);
		
		//Narrowing: convert double into int
		double d3 = 85.9;
		int i1 = (int)d3; //only explicit conversion is possible for narrowing
		System.out.println(i1);

		

	}

}
