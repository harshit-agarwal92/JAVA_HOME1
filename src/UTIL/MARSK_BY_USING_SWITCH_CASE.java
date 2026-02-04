package UTIL;

import java.util.Scanner;

public class MARSK_BY_USING_SWITCH_CASE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Marks");
	int marks=sc.nextInt();
	int m=marks/10;
	switch(m)
	{
	case 10:System.out.println("Grade A");
	break;
	case 9:System.out.println("Grade A");
	break;
	case 8:System.out.println("Grade B");
	break;
	case 7:System.out.println("Grade C");
	break;
	case 6:System.out.println("Grade D");
	break;
	default:System.out.println("Fail");
	}
}
}
