package String_java;

import java.util.Scanner;

public class valid_palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s= "A man, a plan, a canal: Panama";
	s=s.toLowerCase();
	s=s.replaceAll("[^a-z0-9]","");
	String ans="";
	for(int i=s.length()-1;i>0;i--) {
		ans=ans+s.charAt(i);
	}
	System.out.print(ans);
}
}
