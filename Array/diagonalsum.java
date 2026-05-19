package Array;

import java.util.Scanner;

public class diagonalsum {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int col = sc.nextInt();
	int sum=0;
	int[][] arr = new int[row][col];
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			arr[i][j] = sc.nextInt();

		}
	}
	int d=0;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			if(i==j)
			{
				sum+=arr[i][j];
				//System.out.println(i+"  "+j+"  "+sum);
			}
			else if((i+j)==(row-1))
			{
				d+=arr[i][j];
				//System.out.println(i+"  "+j+"  "+sum);

			}
		}
	}
	System.out.println(sum+" "+d);
}
}
