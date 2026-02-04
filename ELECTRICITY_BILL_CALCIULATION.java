package PRACTISE_SHEET;

import java.util.Scanner;

public class ELECTRICITY_BILL_CALCIULATION {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter units");
		int units = sc.nextInt();
		double final_bill = 0.0;
		if (units <= 100) 
		{
			final_bill = units * 1;
		} 
		else if (units > 100 && units <= 200) 
		{
			final_bill = 100 * 1 + (units - 100) * 2;
		}
		else 
		{
			final_bill = 100 * 1 + 100 * 2 + (units - 200) * 3;
		}
		System.out.println("The Electricity bill is "+final_bill);
	}

}
