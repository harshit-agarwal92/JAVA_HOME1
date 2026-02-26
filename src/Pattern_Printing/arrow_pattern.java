package Pattern_Printing;

import java.util.Scanner;

public class arrow_pattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int stars=0;
	for(int i=1;i<=2*n-1;i++)
	{
		if(i<=n)
			stars=i;
		else
			stars=2*n-i;
		for(int j=n-stars;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int k=n-stars;k>=0;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
