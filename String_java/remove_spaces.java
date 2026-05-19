package String_java;

import java.util.*;

public class remove_spaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.replace(" ", "");
		System.out.print(str1);
	}

}
