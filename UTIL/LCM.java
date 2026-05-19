package UTIL;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=1;
		while(i<=b) {
			int factor=a*i;
			if(factor%b==0)
			{
				System.out.println(factor);
				break;
			}
			i++;
		}
	}

}
