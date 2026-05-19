package Array;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		int[] ans=new int[max+1];
		for(int i=0;i<n;i++)
		{
			ans[a[i]]++;
//			for(int j=0;j<n;j++)
//			{
//				if(a[i]==a[j])
////				
//					ans[a[i]]++;
//				
//			}
		}
		for(int i=0;i<max;i++)
		{
			System.out.println(i+" "+ans[i]);
		}
	}

}
