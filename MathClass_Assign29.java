package org.grotech.assignments;

public class MathClass_Assign29 {

	public static void main(String[] args) throws InterruptedException {
		for(int i =0;i<5;i++) {
			System.out.println("Bhavya");
			Thread.sleep(1000);
		}
		System.out.println(Math.addExact(10, 30)); //int,int
		System.out.println(Math.addExact(31310, 3510));//long,long
		System.out.println(Math.subtractExact(31, 10)); //int,int
		System.out.println(Math.subtractExact(131, 1110));//long,long
		System.out.println(Math.max(25, 30));//double
		System.out.println(Math.max(23.31, 10.31));//float
		System.out.println(Math.max(123231, 89999910));//int
		System.out.println(Math.max(3331.33, 09809.10));//long
		System.out.println(Math.min(31, 10)); //int
		System.out.println(Math.min(31.4, 23.10));//float
		System.out.println(Math.min(3187980, 18910));//long
		System.out.println(Math.min(3134134.8, 7387409.310));//double
		System.out.println(Math.abs(-31)); //int,float,long,double
		//System.out.println(Math.absExact(89));
		System.out.println(Math.abs(131.089810));
		System.out.println(Math.abs(-63424324));
		System.out.println(Math.abs(98790.324));
		System.out.println(Math.absExact(934213));//int,long
		System.out.println(Math.absExact(976023321));
		System.out.println(Math.multiplyExact(23, 10));  //int int//long,int//long,long
		System.out.println(Math.multiplyExact(432435, 1340));
		System.out.println(Math.multiplyExact(21441, 4214));
		System.out.println(Math.floorMod(21, 20));
		System.out.println(Math.floorMod(12312313,120));
		System.out.println(Math.floorMod(1221222222,23123120));
		System.out.println(Math.floorDiv(12, 10));
	}

}
