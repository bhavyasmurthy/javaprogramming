package org.grotech.assignments;
//program to create a Non-Static Method
public class Assignment18 {
	void login() {
		System.out.println("login with mail id");
	}
	void logout() {
		System.out.println("logout");
	}
	public static void main(String[] args) {
		Assignment18 a18 = new Assignment18();
		a18.login();
		a18.logout();
	}

}
