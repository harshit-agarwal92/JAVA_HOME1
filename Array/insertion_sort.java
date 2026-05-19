package Array;

import java.util.*;

public class insertion_sort {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,3,5,6};
		int target=5,c=0,d=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==target) {
				c=i;
				break;
			}
		}
		System.out.println(c);
	}
}
