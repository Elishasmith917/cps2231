package cps2231_Homework5;
/***************************************************************
*
* Kean University
* Spring 2024
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Elisha Smith, CPS 2231, section-02*
* Homework: 5, part 2 and 4
* Program Description: Testing the parent class and the subclasses
***************************************************************/


public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer dellcomputer = new Computer("Dell", 1189160321024L, " April 1,2020", 2);
		
		Computer applecomputer = new Computer(" Apple Inc", 269283712040L, " March 31, 2020", 4);
		
		Computer lenovocomputer = new Computer (" lenovo", 837495867481L, "September 17, 2017", 5 );
		
		Computer c1 = new Computer ();
		
		Desktop d1 = new Desktop ("Dell Inspiron ", 118910293724L, " April 1,2010",4 , "Blue", 380, 23.65);
		Desktop d2 = new Desktop ("HP ", 118910293724L, " February 14,2014",5 , "Navy", 380, 23.65);
		
		Laptop a = new Laptop ("Dell Inspiron ", 758574293724L, " April 1,2023",4 , "Black", 3.8);
		Laptop b = new Laptop ("HP ", 198370293724L, " March 14,2021",5 , "Silver", 3.65);
		
		/*System.out.println(dellcomputer);
		System.out.println(applecomputer);
		System.out.println(lenovocomputer);
		System.out.println(c1);*/
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(a);
		System.out.println(b);




	}

}
