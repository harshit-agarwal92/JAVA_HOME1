package UTIL;

import java.util.Scanner;

public class sum_of_number_it_reverse {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=443;
	int s=0;
	for(int i=0;i<=n;i++) {
		int temp=i,r=0;
		while(temp!=0) {
			int rem=temp%10;
			r=r*10+rem;
			temp/=10;
		}
		if(r+i==n) s=1;
		 
	}
	if(s==1)
	System.out.println("true");
	else
		System.out.println("false");
}
}
