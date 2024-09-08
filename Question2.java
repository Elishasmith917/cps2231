package cps2231_Assignment4;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith- CPS 2231- Section 02
 * Assignment: 4
 * Task #2
 * Program Description: Question 2
 * 
 *********************************************************************************************/
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// this is all for task 1
// 1D array for part a
		int[] numbers = new int[500]; 
// array for part b
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = i;
        }
// new string object
        String str = new String();
        
 // Recording start time
        long begin = System.nanoTime();

        // d) Using for loop to add the array elements one by one to the String
        for (int Number : numbers) {
            str += Number; 
        }

        // Recording end time
        long end = System.nanoTime();

        // Calculating the time taken
        long time = end - begin;

        
        System.out.println(str);

        // Displaying the runtime in nanoseconds
        System.out.println("Time taken to append 500 integers to the String: " + time + " ns");
        
        // Task 2 imitating task 1, using same 1D array
        StringBuilder stringBuilder = new StringBuilder();
        
        long begin2 = System.nanoTime();

        
        for (int Number : numbers) {
            stringBuilder.append(Number); 
        }

        
        long end2 = System.nanoTime();

        long time2 = end2 - begin2;

        System.out.println(stringBuilder.toString());

        // Displaying the runtime in nanoseconds
        System.out.println("Time taken to append 500 integers to the StringBuilder: " + time2 + " ns");
    
	}

}
