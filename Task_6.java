package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 6
 * Program Description: This program utilizes method overloading to display the sum of 2 integers, the sum of 3 integers,and then the sum of 4
 * 
 *********************************************************************************************/
public class Task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(3,4));
		System.out.println(sum(3,4,5));
		System.out.println(sum(3,4,5,6));
		
	}
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static int sum(int num1, int num2, int num3, int num4){
		return num1 + num2 + num3 + num4;
	}

}
