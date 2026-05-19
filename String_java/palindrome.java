package String_java;

import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ch = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ch = ch + str.charAt(i);

		}
		;
		if (ch.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindorme");

	}
}
