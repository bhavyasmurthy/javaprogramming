package org.grotech.assignments;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			Thread.sleep(1000);

		}
	}

}
