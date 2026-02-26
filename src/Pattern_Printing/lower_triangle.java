package Pattern_Printing;

public class lower_triangle {
	public static void main(String[] args) {
	int i,j;
	for(i=1;i<=5;i++) {
		for(j=5-i;j>=0;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
