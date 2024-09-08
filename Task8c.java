package cps2231_thursdaylecture6lab2;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith, Partner: Naomi Joa- CPS 2231- Section 02
 * Lab 2
 * Task 8C
 * Program Description: This program utilizes method overloading to display the minimum between  2 integers, the minimum between 3 integers,and then the minimum between 4
 * 
 *********************************************************************************************/
public class Task8c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(min(3,4));
		System.out.println(min(3,4,5));
		System.out.println(min(3,4,5,6));
		
	}
	public static int min(int num1,int num2) {
		return java.lang.Math.min(num1, num2);
	}
	public static int min(int num1, int num2, int num3) {
		return java.lang.Math.min(Math.min(num1, num2), num3);
	}
	public static int min(int num1, int num2, int num3, int num4){
		return java.lang.Math.min(Math.min(num1, num2), Math.min(num3, num4));
	}


}
