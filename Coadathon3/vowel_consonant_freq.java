package Coadathon3;

import java.util.Scanner;

public class vowel_consonant_freq {
	public static void main(String[] args) {
		

				Scanner sc = new Scanner(System.in);

				String str = sc.next();
				str = str.toLowerCase();

				int v = 0, c = 0;

				int a = 0, e = 0, i = 0, o = 0, u = 0;

				for (int j = 0; j < str.length(); j++) {

					char ch = str.charAt(j);

					if (ch >= 'a' && ch <= 'z') {

						// vowel check
						if (ch == 'a') {
							v++;
							a++;
						}

						else if (ch == 'e') {
							v++;
							e++;
						}

						else if (ch == 'i') {
							v++;
							i++;
						}

						else if (ch == 'o') {
							v++;
							o++;
						}

						else if (ch == 'u') {
							v++;
							u++;
						}

						// consonant
						else {
							c++;
						}
					}
				}

				int max = a;
				char vowel = 'a';

				if (e > max) {
					max = e;
					vowel = 'e';
				}

				if (i > max) {
					max = i;
					vowel = 'i';
				}

				if (o > max) {
					max = o;
					vowel = 'o';
				}

				if (u > max) {
					max = u;
					vowel = 'u';
				}

				System.out.println("Total Vowels = " + v);
				System.out.println("Total Consonants = " + c);

				System.out.println("Highest occurring vowel = " + vowel);
				System.out.println("Frequency = " + max);
			}
		
	}


