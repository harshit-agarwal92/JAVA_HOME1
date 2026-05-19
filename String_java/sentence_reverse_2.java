package String_java;

import java.util.*;

public class sentence_reverse_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String[] words=str.split(" ");
	for(String word:words) {
		String rev=new StringBuilder(word).reverse().toString();
		System.out.print(rev+" ");
	}
}
}
