package stringconcepts;

import java.util.Arrays;

/*Assignment 81:
Write a program to calculate average value of below array element
[5,8,16,20,5]"
 */
public class Assignment81 {

	public static void main(String[] args) {
		double arr[] = new double[5];
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 16;
		arr[3] = 20;
		arr[4] = 5;
		System.out.println(Arrays.toString(arr));
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		double average = sum / arr.length;
		System.out.println("Average value of an array:" + average);

	}

}
