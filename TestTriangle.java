package cps2231_Assignment4;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith- CPS 2231- Section 02
 * Assignment: 4
 * Task #1
 * Program Description: Testing Triangle
 * 
 *********************************************************************************************/
public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle a = new Triangle ();
		Triangle b = new Triangle (3,4);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		 a.testOverriding();
	     b.testOverriding();
	}

}
