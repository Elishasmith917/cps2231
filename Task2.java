package cps22311_Lab3;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0, c=0;
		int [][]matrix= new int [5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0 ; j<5; j++) {
				matrix[i][j]= (int)(Math.random()*101);
			}
		}
		
		System.out.println("Initial Matrix: ");
		//System.out.println("New Matrix: ");
        System.out.println("");
		for (r=0; r<matrix.length; r++) {
			for (c=0; c< matrix[r].length; c++) {
				
				//if (matrix [r][c] % 2 ==0) 
					//matrix[r][c] *= 10;
				
				System.out.printf( "%5d |", matrix[r][c]);

			}
		System.out.println();
		}
		
		// summing everything
		System.out.println("\nSum of Elements in Each Row: ");
        int sum = 0;

		for ( r = 0; r < matrix.length; r++) {
            for ( c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
            System.out.println("Sum of Row " + (r) + ": " + sum);
        }
    }
	}



	

