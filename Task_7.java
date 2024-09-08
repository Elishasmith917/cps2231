package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 7
 * Program Description: This program utilizes methods with variable length arguments to display the sum of integers
 * 
 *********************************************************************************************/
public class Task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(34,3);
		sum(34,3,3);
		sum(34,3,3,2);
		sum(34,3,3,2,56);
		sum(34,3,3,2,56,5);
		sum(34,3,3,2,56,55,990);
	}
	
	public static void sum(int...numbers) {
		int sum = 0;
		
		for (int i : numbers)
			sum+=i;
		
		System.out.println("The sum of numbers is: " + sum);
	}

}
