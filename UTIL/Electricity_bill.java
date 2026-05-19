package UTIL;

import java.util.*;

public class Electricity_bill {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Units");
		 int units=sc.nextInt();
		 double Amount=0.00;
		 if(units<=100)
			 Amount=units*2.5;
		 else if(units>100 && units<=200)
			 Amount=100*2.5+(units-100)*3.5;
		 else
			 Amount=100*2.5+100*3.5+(units-200)*5;
		 
		 if(Amount>500) {
			 Amount=Amount*0.10+Amount;
		 System.out.println("The Electricity Bill is "+Amount);}
		 else
			 System.out.println("The Electricity Bill is "+Amount);
	}

}
