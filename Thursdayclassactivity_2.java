package cps2231_thursdaylecture7_2_6_2024;

import java.util.Arrays;
import java.util.Scanner;
public class Thursdayclassactivity_2 {

	public static void main (String[]args) {
		int[][] matrix = new int [3][3];
		System.out.println(Arrays.deepToString(matrix));
		
		Scanner input = new Scanner(System.in);
		System.out.println( "Enter" + matrix.length + "rows and " + matrix[0].length + "columns:");
		
		for ( int row=0; row< matrix.length; row ++) {
			for (int column = 0; column < matrix [row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		
	System.out.println( Arrays.deepToString(matrix));
	}
}
