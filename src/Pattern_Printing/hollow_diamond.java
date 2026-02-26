package Pattern_Printing;

public class hollow_diamond {
public static void main(String[] args) {
	int n=5;
	int s=0;
	for(int i=1;i<=2*n-1;i++)	
	{
		if(i<=n)
			s=i;
		else
			s--;
	  for(int j=n-s;j>=0;j--)
	  {
		  System.out.print(" ");
	  }
	  for(int k=1;k<=2*s-1;k++)
	  {
		  if(k==1||k==2*s-1)
		  System.out.print("*");
		  else
			  System.out.print(" ");
	  }
	  System.out.println();
	}
}
}
