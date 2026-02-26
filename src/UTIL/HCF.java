package UTIL;

import java.util.*;

public class HCF {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int x=Math.abs(a);
	int y=Math.abs(b);
	
	while(y!=0)
	{ 
		int temp=y;
		y=x%y;
		x=temp;
		
	}
	int h=x;
//	int min=Math.min(a, b);
//	int H=1;
//	for(int i=min;i>=1;i--){
//		if(a%i==0 && b%i==0)
//		{
//			H=i;
//			break;
//			
//		}
//	}
	System.out.println(h);
}
}
