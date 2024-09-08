package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 3
 * Program Description: Provided two integers, the program
 * displays their sum
 * 
 *********************************************************************************************/
import java.util.Scanner;

public class Task_3 {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the value for 'a' and press Enter: ");
	int a = sc.nextInt();
	
	System.out.println("Enter the value for 'b' and press Enter: ");
	int b = sc.nextInt();
	
	// close the Scanner
	sc.close();
	
	System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, (a+b));
	}
}
