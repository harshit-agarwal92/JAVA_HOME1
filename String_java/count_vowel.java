package String_java;
import java.util.*;

public class count_vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toLowerCase();
		int c=0,v=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				v++;
			else
				c++;
		}
			}
		System.out.println(v+" "+c);
	}

}
