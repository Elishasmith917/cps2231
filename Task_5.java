package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 5
 * Program Description: This program utilizes method overloading to display the sum of 2 integers, and then the sum of 3
 * 
 *********************************************************************************************/
import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the number of integers you will provide: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the value for 'a' and press Enter: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value for 'b' and press Enter: ");
		int b = sc.nextInt();
		
		if (num == 3) {
			System.out.println("Enter the value for 'c' and press Enter: ");
			int c = sc.nextInt();
			
			System.out.printf( "Provided Integers: %4d and %4d and %4d, the total is %5d\n", a,b,c, sum(a,b,c));
			
		}
		else {
			System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, sum(a,b));
		}
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
