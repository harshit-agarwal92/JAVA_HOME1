package PRACTISE_SHEET;

import java.util.Scanner;

public class loan_elgibilty {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Age");
	int age=sc.nextInt();
	System.out.println("Enter Monthly Salary");
	int monthly_salary=sc.nextInt();
	System.out.println("Enter Credit Score");
	int Credit_Score=sc.nextInt();
	if(age>=21)
		System.out.println("Loan Approved");
	else if(monthly_salary>=30000)
	System.out.println("Laon Approved");
	else if(Credit_Score>=700)
		System.out.println("Laon Approved");
	else
		System.out.println("Loan Rejected");
}
}
