package cps2231_thursdaylecture1; 

public class HelloWorld { 
	public static void main (String[] args) { 
		int i,sum=0;
		for(i=11; i<=99; i++){
			sum= sum+i;
			i=i+2;
		}
		System.out.print(" sum is " + sum);
	}
}
