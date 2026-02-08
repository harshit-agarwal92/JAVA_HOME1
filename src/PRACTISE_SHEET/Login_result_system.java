package PRACTISE_SHEET;

import java.util.Scanner;

public class Login_result_system {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		switch (code) {
		case 200:
			System.out.println("Login Success");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 403:
			System.out.println("Account Locked");
			break;
		case 500:
			System.out.println("Server Error");
			break;
		default:
			System.out.println("Invalid Code");

		}
	}

}
