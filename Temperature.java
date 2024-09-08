package cps2231_thursdaylecture3;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double C=0,F=0; 
		
		  Scanner input = new Scanner(System.in);
		  
		  	System.out.println(" enter temperature");
		  	C= input.nextDouble();
		  	F= (9.0/5.0) * C + 32;
		  	System.out.printf("Temperature in Fahrenheit: % .2f\n", F);
		  	//System.out.print("temperature in Fahrenheit is:" + F);
		  	// i messed up the last line and didnt implement the print f statement because he wanted 2 decimal places.
	}

}
