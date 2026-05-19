package PRACTISE_SHEET;

import java.util.Scanner;

public class Bank_Loan_risk_evaluation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Salalry");
		int Salary = sc.nextInt();
		System.out.println("Enter credit score");
		int Credit_Score = sc.nextInt();
		System.out.println("enter existing loan");
		String s = sc.next();
		if (age < 21)
			System.out.println("Reject");
		else if (Credit_Score < 650)
			System.out.println("Reject");
		else if (Salary >= 40000 || (Salary >= 25000 && s.equals("no_existing_loan")))
			System.out.println("approved");
		else
			System.out.println("Review Pending");

	}

}
