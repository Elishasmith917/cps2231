package cps_2231_Assignment2;

public class Task3 {
	/********************************************************************************************
	 * 
	 * Kean University
	 * Spring 2024
	 * Course: CPS 2231- Computer Programming
	 * 
	 * Author: Elisha Marie Smith- CPS 2231- Section 02
	 * Assignment: 2
	 * Task #3
	 * Program Description: finding the index difference
	 * 
	 *********************************************************************************************/
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static int findindexdifference(int[]arr) {
			int max= arr[0];
			int min= arr[0];
			int minindex=0;
			int maxindex=0;
			
			 for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		                minindex=i;
		            }
		            if (arr[i] > max) {
		                max = arr[i];
		                maxindex=i;
		            }
		        }
		        
		        return maxindex - minindex;
		}
		
		public static void main(String[]args) {
			int[] array = {3,1,4,1,5,9,9,2,6,5};
			int result = findindexdifference(array);
			System.out.println("Index difference: " + result);
		}
	}

