package cps2232_attendance15;

public class BookTest{
	  
	  public static void main (String [] args) {
	  	Book a = new Book ("Java Programming", "john Doe", "123456", true, "Programming", "Educational"); 
	  	System.out.println(a.getDisplayText());
	  	a.checkOut();
	  	a.returnItem();
	  	System.out.println(a.isAvailable());
	  	System.out.println(a);
	  	
	  }
}