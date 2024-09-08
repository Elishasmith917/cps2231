package chapter_18_Recursion_4_9_2024;

import java.util.Scanner;
public class Computefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter a non-negative integer: ");
		int n = input.nextInt();
		
		// display factorial 
		System.out.println(" factorial of " + n + " is " + factorial(n));
	}
	// return the factorial for a specific number
	public static long factorial(int n){
		if (n==0)// base case
		return 1;
		else
			return n* factorial(n-1); // recursive call
	}

}
