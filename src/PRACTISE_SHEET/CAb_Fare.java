package PRACTISE_SHEET;

import java.util.Scanner;

public class CAb_Fare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fare = 50;
		System.out.println("Enter Distance");
		int d = sc.nextInt();
		System.out.println("Enter hours");
		int h = sc.nextInt();
		if (d <= 5)
			fare = fare + 10 * d;
		else if (d <= 10)
			fare = fare + 5 * 10 + (d - 5) * 8;
		else
			fare = fare + 5 * 10 + 10* 8 + (d - 15) * 6;
		if(h>=22 || h<5)
			fare=fare+fare*0.20;
		System.out.println("Total fare:"+(int)fare);
			

	}
}