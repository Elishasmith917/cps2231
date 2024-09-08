package cps2231_Thursdaylecture2_29_2024;

public class CodingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]matrix= matrixSetUp();
		System.out.println(" Generated 2D array:");
		printArray(matrix);

		
	System.out.println(" Smallest item for each row:");
	findRowSmall(matrix);
	System.out.println(" Largest item for each column");
	findColumnLarge(matrix);
	
			}
		
	public static int[][] matrixSetUp(){
		int [][]matrix= new int [4][5];
		
		for(int i=0;i<4;i++) {
			for(int j=0 ; j<5; j++) {
				matrix[i][j]= 10+ (int)(Math.random()*90);
			 
			}
		}
		return matrix;
	
	}
    public static void printArray (int [][] matrix){
    	for (int i=0; i< matrix.length; i++) {
    		for (int j = 0; j< matrix[i].length; j++) {
    			System.out.printf("%5d", matrix[i][j]);
    		}
    		System.out.println();
	}
 }
    public static void findRowSmall (int [][] matrix){
    	for (int i=0; i< matrix.length; i++) {
    		int small = matrix [i][0];
    		for (int j = 0; j< matrix[i].length; j++) {
    			if (small > matrix[i][j]) {
    				small = matrix[i][j];
    			}
    		}
    		System.out.println("Row" + (i+1) + ":" + small);
    	}
    	
    }
    public static void findColumnLarge (int [][] matrix){
    	for (int j=0; j< matrix[0].length; j++) {
    		int large = matrix [0][j];
    		for (int i = 0; i< matrix.length; i++) {
    			if (large < matrix[i][j]) {
    				large = matrix[i][j];
    			}
    		}
    		System.out.println("Column" + (j+1) + ":" + large);
         } 
    }
}

