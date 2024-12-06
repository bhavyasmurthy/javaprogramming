package inhertanceassignment;
/*"Assignment 51
Write a Program for Multi Level Inheritance" 
 */
class Two{
	static void logout() {
		System.out.println("logout");
	}
}
class One extends Two{
	static void login() {
		System.out.println("Login");
	}
}
public class MultiLevelEx extends One {
	static void login_auth() {
		System.out.println("multilevelEx");
	}
	public static void main(String[] args) {
		login();
		logout();
		login_auth();
	}
	
}
