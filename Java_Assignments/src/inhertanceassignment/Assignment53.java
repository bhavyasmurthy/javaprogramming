package inhertanceassignment;

/*"Assignment 53
Write a program for constructor inheritance 
using the super calling statement with Implicit Invocation" implicit means already present

"Assignment 54:Write a program for constructor - single level inheritance
 using a non-parameterized super calling statement with explicit invocation"
 */
class Google3 {
	Google3() {
		System.out.println("Google constructor");
	}
}

public class Assignment53 extends Google3 {
	Assignment53() {

		// super(); // explicit
		System.out.println("constructor 1");
	}

	public static void main(String[] args) {
		new Assignment53();

	}

}
