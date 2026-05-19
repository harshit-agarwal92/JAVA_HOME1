package String_java;

import java.util.Scanner;

public class same_element_doesnt_print {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s1.indexOf(s.charAt(i))!=-1){
				continue;
				
			}
			else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.print(s1);
				
	}

}
