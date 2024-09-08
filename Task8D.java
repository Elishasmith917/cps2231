package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 8D
 * Program Description: This program utilizes methods with variable length arguments to display the minimum of integers
 * 
 *********************************************************************************************/
public class Task8D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		min(34,3);
		min(34,3,3);
		min(34,3,3,2);
		min(34,3,3,2,56);
		min(34,3,3,2,56,5);
		min(34,3,3,2,56,55,990);
		
	}
	
	public static void min(int...numbers) {
		int min= numbers[0];
		
		for (int i=1; i < numbers.length; i++ ) {
			if (numbers[i] < min) {
				min= numbers[i];
			}
		}
		System.out.println("The minimum is:" + min);

			
		}
		
	}

