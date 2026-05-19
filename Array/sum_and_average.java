package Array;

import java.util.Scanner;

public class sum_and_average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0,avg=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println(sum+" "+avg);

	}
}
