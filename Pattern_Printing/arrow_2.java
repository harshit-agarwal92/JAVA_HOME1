package Pattern_Printing;

import java.util.Scanner;

public class arrow_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		for (int i = 1; i <= 2 * n - 1; i++) {
			if(i<=n)
				s=i;
			else
				s--;
			
			for (int k =2;k<=2*s-1;k++) {
				System.out.print(" ");
			}
			for (int j =n-s;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
