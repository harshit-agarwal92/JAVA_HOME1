package UTIL;

import java.util.Scanner;

public class Spy_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int product=1,sum=0,rem=0;
		int num=sc.nextInt();
		while(num!=0)
		{
			 rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(product==sum)
		System.out.println("Spy Number");
		else
			System.out.println("Not a Spy number");
	}

}
