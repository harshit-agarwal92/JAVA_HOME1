package Pattern_Printing;

import java.util.Scanner;

public class HOLLOW_BUTTERFLy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n)
				s=i;
			else
				s--;
			for(int j=1;j<=s;j++)
			{
				if(j==s || j==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=1;k<=2*(n-s);k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=s;k++)
			{
				if(k==s || k==1)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}

}
