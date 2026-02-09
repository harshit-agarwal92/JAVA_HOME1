package UTIL;

import java.util.*;

public class Heart1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name =sc.next();
		for (int i = n / 2; i <= n; i += 2) {

            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

		for (int i = n; i >= 1; i--) {

            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                // FIRST LOWER ROW = CENTER
                if (i == n && j == (i - name.length() / 2)) {
                    System.out.print(name);
                    j += name.length() - 1;
                }

                else if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
