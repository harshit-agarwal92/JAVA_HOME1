package String_java;
import java.util.*;
public class each_element_reverse {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] st=s.split(" ");
String ans="";
for(int i=st.length-1;i>=0;i--) {
	ans=st[i]+ans;
	
}
String rev="";
for(int i =ans.length()-1;i>=0;i--) {
	rev=rev+ans.charAt(i);
}
System.out.println(rev+" ");

}}
