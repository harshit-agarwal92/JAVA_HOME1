package Pattern_Printing;

import java.util.Scanner;

public class pascal_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int star=0;
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
			{
				star=i;
			}
			else
			{
				star--;
			}
			
			for(int k=n-star;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			
			int num=1;
			for(int j=1;j<=2*star-1;j++)
			{
				
				System.out.print(num);
				if(j<star)
					num++;
				else
					num--;
				
		}
			System.out.println();
	}

}}