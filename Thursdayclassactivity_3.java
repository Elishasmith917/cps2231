package cps2231_thursdaylecture7_2_6_2024;

import java.util.Arrays;

public class Thursdayclassactivity_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double[][] matrix = new double [5][5];
		 for (int i = 0; i < matrix.length; i ++)//2d
			 for (int j = 0; j< matrix[i].length; j++)
				 matrix [i][j] = (int) (Math.random()* 1000);
		 
		 System.out.println(Arrays.deepToString(matrix));
		 double max = matrix [0][0];
		 
		 for (double [] arr : matrix)
			 for (double i :arr)
				 if (i> max) max=i;
		 
		 System.out.printf("the max is %5.2f", max);
	}

}
