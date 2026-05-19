package UTIL;

import java.util.Scanner;

public class Income_Tax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income");
		int income=sc.nextInt();
		double Tax=0.0;
		if(income<250000)
		 Tax=income*0;
		else if(income>=250000 && income<500000)
			Tax=income*0.05;
		else if(income>=500000&& income<1000000)
			Tax=income*0.10;
		else
			Tax=income*0.20;
		
		System.out.println("The final income is:"+Tax);
		
	}

}
