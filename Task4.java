package cps_2231_Assignment2;

import java.util.Arrays;
public class Task4 {
	/********************************************************************************************
	 * 
	 * Kean University
	 * Spring 2024
	 * Course: CPS 2231- Computer Programming
	 * 
	 * Author: Elisha Marie Smith- CPS 2231- Section 02
	 * Assignment: 2
	 * Task #3
	 * Program Description: 
	 * 
	 *********************************************************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,15,10,25,30};
		double median = findmedian(array);
		System.out.println(" The Median Is: " + median);
	}
	public static double findmedian(int[] array) {
		Arrays.sort(array);
		// this will first sort the array
		
		if (array.length % 2 == 0) {
		// if the array has an even number of elements, take the two middle values and average them
		int middle1 = (array.length/2 -1);
		int middle2 = (array.length/2);
		return (array [middle1]+ array[middle2])/2.0;
		} else {
			int middle = array.length/ 2;
			return array[middle];
		}
		
	}

}
