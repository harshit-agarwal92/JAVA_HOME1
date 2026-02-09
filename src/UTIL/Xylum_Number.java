package UTIL;

import java.util.Scanner;

public class Xylum_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	int l=0,a=0,mean=0;
	l=n%10;
	a=l;
	n=n/10;
	while(n>9)
	{
		int rem=n%10;
		mean+=rem;
		n=n/10;
	}
	int f=n;
	if(f+l==mean)
	{
		System.out.println("Xylum Number");
	}
	else
		System.out.println("No Xylum Number");
}
}
