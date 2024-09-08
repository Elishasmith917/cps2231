package sisessions;
import java.util.Scanner;
public class SiSession_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int r=0, c=0;
		
		System.out.println("Enter number of rows:");
		r= input.nextInt();
		
		System.out.println("Enter number of columns: ");
		c= input.nextInt();
		
		int [][]matrix= new int [r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0 ; j<c; j++) {
				matrix[i][j]= (int)(Math.random()*2);
			}
		}
		
		for (r=0; r<matrix.length; r++) {
			for (c=0; c< matrix[r].length; c++) {
				System.out.print(matrix[r][c]);
		
			}
			System.out.println();
		}

	}

	
}
