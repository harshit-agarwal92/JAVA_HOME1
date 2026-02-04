package UTIL;

import java.util.*;

public class Railway_Management_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age");
		int age = sc.nextInt();
		System.out.println("Enter The Gender");
		String Gender = sc.next();
		System.out.println("Enter The Ticket_Price");
		double Ticket_Price = sc.nextDouble();
		if (age < 5) {
			System.out.println("The Ticket is Free");
		} else if (age >= 60) {
			Ticket_Price = Ticket_Price - Ticket_Price * 0.40;
			System.out.println(Ticket_Price);
		} else if (Gender.equals("Female") || Gender.equals("female")) {
			Ticket_Price = Ticket_Price - Ticket_Price * 0.25;
			System.out.println(Ticket_Price);
		}

		else {
			System.out.println(Ticket_Price);
		}

	}

}
