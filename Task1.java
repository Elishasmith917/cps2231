package cps22311_Lab3;

public class Task1 {

	/***************************************************************
	*
	* Kean University
	* Spring 2024
	* Course: CPS*2231 - Computer Programming *
	* Author: Elisha Smith - CPS 2231 - Section 02 *
	* Lab: 3, task 1
	* Program Description: This program will randomly generate 10 integers from -100 to 100, store them in a 1D array, and find their maximum value. It will Calculate the
    * execution time of finding a maximum. Will Repeat the test for 10,000 and
    * 10,000,000 numbers
	***************************************************************/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []array= new int [10];
		
		for(int i=0;i<10;i++) {
				array[i]= (int)(Math.random() * 101 * (Math.random() > 0.5 ? 1 : -1));
		}
	   //int max = array[0];
      // for (int j = 1; i < array.length; i++) {
    	// if (array[j] > max )
    		// max = array[i];
    	 
    	 long begin, end, time; // we will measure time it took
    	 begin = System.nanoTime(); //we measure in nanoseconds.
    	 
    	 int max = array[0];
         for (int i = 1; i < array.length; i++) {
      	 if (array[i] > max )
      		 max = array[i];
         }
      	 end = System.nanoTime();
    	 time = end - begin;
	
    	 System.out.println(" it took " + time  + " nanoseconds to find the maximum in the array of 10 elements. The maximum is : " + max);

		}
	}

