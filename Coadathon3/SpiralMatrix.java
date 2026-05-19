package Coadathon3;

import java.util.Scanner;

public class SpiralMatrix {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int r =sc.nextInt();
	    	int col=sc.nextInt();

	        int[][] arr = new int[r][col];
	        for(int i=0;i<r;i++) {
	        	for(int j=0;j<r;j++) {
	        		arr[i][j]=sc.nextInt();
	        	}
	        }

	        int top = 0;
	        int bottom = arr.length - 1;

	        int left = 0;
	        int right = arr[0].length - 1;

	        while (top <= bottom && left <= right) {

	            // left to right
	            for (int i = left; i <= right; i++) {
	                System.out.print(arr[top][i] + " ");
	            }
	            top++;

	            // top to bottom
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(arr[i][right] + " ");
	            }
	            right--;

	            // right to left
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(arr[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            // bottom to top
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(arr[i][left] + " ");
	                }
	                left++;
	            }
	        }
	    }
	}

