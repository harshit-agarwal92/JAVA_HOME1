package UTIL;

import java.util.*;

public class POWER_1234 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long  sum=0;
		long lastdigit=n%10;
		sum+=Math.pow(lastdigit,0);
		n/=10;
		
		while(n!=0)
		{
			long currentdigit=n%10;
			sum+=Math.pow(currentdigit,lastdigit);
			lastdigit=currentdigit;
			n/=10;
			
		}
		System.out.println(sum);
		
	}

}
