package Array;

import java.util.Scanner;

public class Shifting_zero_in_last {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		int k = 0;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				ans[k++] = a[i];
			}

		}
		
//		for (int i = k + 1; i < n; i++) {
//			ans[i] = 0;
//		}
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
