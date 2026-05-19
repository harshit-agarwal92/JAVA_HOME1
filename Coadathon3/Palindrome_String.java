package Coadathon3;

import java.util.Scanner;

public class Palindrome_String {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s = sc.next();
	String q = "";
	for(int i=s.length()-1;i>=0;i--) {
	     q=q+s.charAt(i);
	}
	if(q.equals(s)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
}
}
