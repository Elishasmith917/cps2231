package cps2231_tuesdaylecture4HW1;
import java.util.*;

/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith- CPS 2231- Section 02
 * Homework 1
 * Program Description: In this program I will be implementing methods and loops to create unique passwords and emails for 5 different names.
 * 
 *********************************************************************************************/
public class Elisha_Smith_Unit1_Assignment1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String first,last,full = ""; //added the "" to initialize
		Scanner input = new Scanner (System.in);
	
		int i;

	for (i=0; i<5; i++) {
		System.out.println();
		System.out.println("enter your first name: ");
		first= input.next();  
		System.out.println("enter your last name: ");
		last= input.next(); 
		full= first + " " +  last;		
		System.out.println();
		System.out.printf("%-20s%-20s%-20s\n", "full name", "Email Address", "password");
		System.out.printf("%-20s%-20s%-20s\n",  full , generateEmail(first, last), generatepassword());
	}
	//This is the main method containing the forloop and also invokes the methods listed below. I invoke the method in the printf statement
	
	}
 
  public static int generatepassword() {
      //int num1=100000;
	  int num1=(int)(Math.random()*1000000 +100000); 
	 // System.out.println(num1);
	  return num1;
	  //this method will generate the password
  }
   public static String generateEmail(String fname,String lname){
	   String fulladdress = "";
   
	   //what do we know: 
	   //use full last name 
	   //always use @kean.edu
	   
	   String emailEnding = "@kean.edu";
	   fulladdress = fname.toLowerCase().substring(0,1) + lname.toLowerCase() + emailEnding;
	   //.toLowerCase()is to make the first letter in each name lowercase.
	   // if i wanted to make it uppercase use .toUpperCase().
	   return fulladdress;
	   //this method will generate the email
   		}
   }

