package Array;

import java.util.Scanner;

public class transpose {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int sum = 0;
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		int[][] trans=new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				trans[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(trans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
