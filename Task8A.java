package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 8A
 * Program Description: This program utilizes methods to display the minimum between two integers 
 * 
 *********************************************************************************************/
import java.util.Scanner;

public class Task8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value for 'a' and press Enter: ");
	int a = sc.nextInt();
	
	System.out.println ("Enter the value for 'b' and press Enter: ");
	int b = sc.nextInt();
	
	System.out.printf("Provided Integers: %4d and %4d, the minimum is %5d\n", a,b,min(a,b));

	}
	
	public static int min(int num1, int num2) {
		
		int result;
		
		if (num1 < num2 )
			result = num1;
		else
			result = num2;
		return result;
	}

}
