package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int sec=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>sec && arr[i]!=max) {
				sec=arr[i];
				
			}
		}
		System.out.println(sec);
	}
}
