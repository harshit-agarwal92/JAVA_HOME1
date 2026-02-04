package UTIL;

import java.util.Scanner;

public class Strong_NUmber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n/=10;
		}
		if(num==sum)
		{
			System.out.println("Strong NO.");
		}
		else
		{
			System.out.println("Not a Strong No.");
		}
	}

}
