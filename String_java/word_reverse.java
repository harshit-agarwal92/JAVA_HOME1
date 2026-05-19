package String_java;
import java.util.*;
public class word_reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] st=s.split(" ");
	String ans="";
	for(int i =st.length-1;i>=0;i--) {
		ans=ans+st[i]+" ";
	}
	System.out.println(ans.trim());
}
}
