package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 8B
 * Program Description: This program utilizes method overloading to display the minimum between 2 integers, and then the minimum between 3
 * 
 *********************************************************************************************/
import java.util.Scanner;

public class Task8B {
	public static void main(String[]args) {
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
		
		System.out.printf( "Provided Integers: %4d and %4d and %4d, the minimum is %5d\n", a,b,c, min(a,b,c));
		
	}
	else {
		System.out.printf("Provided Integers: %4d and %4d, the minimum is %5d\n", a,b, min(a,b));
	}
}
public static int min(int num1, int num2) {
	return java.lang.Math.min(num1, num2);
}
public static int min(int num1, int num2, int num3) {
	return java.lang.Math.min(Math.min(num1,num2), num3);	}
}
