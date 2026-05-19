package PRACTISE_SHEET;

import java.util.Scanner;

public class Student_Result__Scholarship_System {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Attendance");
		int a=sc.nextInt();
		System.out.println("enter marks");
		int m=sc.nextInt();
		if(a<75)
			System.out.println("Fail");
		else if(m<40)
			System.out.println("Fail");
		else
		{
			System.out.println("Pass");
			if(m>=90)
				System.out.println("Scholarship:100%");
			else if(m>=75 && m<90)
				System.out.println("Scholarship:50%");
			else if(m>=60 && m<75)
				System.out.println("Scholarship:25%");
			else
				System.out.println("NO Scholarship");
		}

	}
}