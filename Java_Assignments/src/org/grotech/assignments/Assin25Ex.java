package org.grotech.assignments;

public class Assin25Ex {
	Assin25Ex(){
		System.out.println("con1");
	}
	Assin25Ex(int i){
		System.out.println("con2");
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(String a1) {
		System.out.println(a1);
	}
	public static void main(String[] args) {
		Assin25Ex a1 = new Assin25Ex();
		new Assin25Ex(10);
		a1.add("rfaf");
		a1.add(1,2);

	}

}
