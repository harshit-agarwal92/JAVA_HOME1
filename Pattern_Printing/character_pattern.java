package Pattern_Printing;

import java.util.Scanner;

public class character_pattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int stars=0;
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
				stars=i;
			}
			else
			{
				stars--;
			}
			for(int j=n-stars;j>=1;j--)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(int k=1;k<=2*stars-1;k++)
			{
//				System.out.print(ch++);
				if(k<stars)
					System.out.print(ch++);
				else
					System.out.print(ch--);
				
			}
			System.out.println();
	}
	
}
}
