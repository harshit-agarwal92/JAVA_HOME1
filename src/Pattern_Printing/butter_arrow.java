package Pattern_Printing;

import java.util.Scanner;

public class butter_arrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		for (int i = 1; i <= 2 * n - 1; i++) 
		{
			if(i<=n)
				s=i;
			else
				s--;
			for(int j=2;j<=2*s-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-s;k>=0;k--)
			{
				System.out.print("*");
			}
			for(int space=2*(n-s);space>=1;space--)
			{
				System.out.print(" ");
			}
			for(int star=0;star<=n-s;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
