package UTIL;

import java.util.*;

public class Armstrong_NO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		int num1 = num;
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		double sum = 0;
		while (num1 != 0) {
			int rem = num1 % 10;
			sum = sum + Math.pow(rem, count);
			num1 = num1 / 10;

		}
		if (num == sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not strong number");
	}

}
