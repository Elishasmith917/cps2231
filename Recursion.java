package chapter_18_Recursion_4_9_2024;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 theFunction(3);
	}
	public static void theFunction(int i) {
		if (i>0) {
			System.out.println(" before recurive call: " + i + " ");
			
			theFunction(i-1);
			System.out.println(" After recurive call: " + i + " ");
		}
		else {
			System.out.println(" In else");// Base case
		}
	}

}
