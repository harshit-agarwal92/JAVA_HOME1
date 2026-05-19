package Array;

import java.util.*;
public class k_times_rotate_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<n;i++) {
		arr.add((sc.nextInt()));
	}
	int k=sc.nextInt();
	Collections.rotate(arr,k);
	System.out.println(arr);
	
	
}
}
