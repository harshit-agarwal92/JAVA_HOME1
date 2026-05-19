package Array;

import java.util.Scanner;

public class odd_even_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0,t=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				continue;
			}
		else if(a[i]%2==0)
			{
				count++;
			}
			else
				
				t++;
		}
		System.out.println("Even:"+count+" Odd:"+t);
		
				
	}
	

}
