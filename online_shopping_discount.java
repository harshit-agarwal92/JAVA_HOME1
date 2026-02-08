package PRACTISE_SHEET;

import java.util.Scanner;

public class online_shopping_discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bill");
		int bill = sc.nextInt();
		System.out.println("ENTER MEMBERSHIP STATUS");
		String STATUS = sc.next();
		double discount=0.00;
		if (bill >= 2000 && STATUS.equals("MEMBER") ) {
			discount = bill * 0.20;
			System.out.println("THE DISCOUNT OF "+bill+"is "+discount);
		} else if ( bill >= 2000 && STATUS.equals("NON_MEMBER")) {
              discount=bill*0.10;
              System.out.println("THE DISCOUNT OF "+bill+"is "+discount);
		}else {
			discount=0;
			System.out.println("THE DISCOUNT OF "+bill+"is "+discount);
		}
		
	}

}
