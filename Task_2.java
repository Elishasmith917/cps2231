package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * Author: Elisha Marie Smith, Partner: naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 2
 * Program Description: Given two integers, the program
 * displays their sum and focuses on string formatting 
 * 
 *********************************************************************************************/
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5;
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, (a+b));
		
		a = 4;
		b = 4;
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, (a+b));
		
		a = 1000;
		b = 2000;
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, (a+b));
		
		a = 100;
		b = 101;
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a,b, (a+b));
	}

}
