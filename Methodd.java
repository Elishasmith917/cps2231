package exam2_review;

import java.util.Scanner;
public abstract class Methodd {

	protected int input;
	protected String output;
	
	// abstract methods 
	
	public abstract boolean isHard();
	public abstract String specificWay();
	
	// constructors
	
	public Methodd() {
		
	}
	
	public Methodd(int input, String output) {
		this.input=input;
		this.output=output;
	}
	
	public int getinput() {
		return input;
	}
	public void setinput(int input) {
		this.input=input;
	}
	
	public String output() {
		return output;
	}
	public void setoutput(String output) {
		this.output=output;
	}
	
	public String toString() {
		return " input: " + input + ", output:" + output;
    }
}

 class ReadMethod extends Methodd {
	// data fields 
	private String language; 
	
	// constructors 
	
	public ReadMethod() {
		
	}
	public ReadMethod(int input, String output, String language) {
		super(input, output);
		this.language=language;
	}
	// implement abstract methods from superclass
	
	public boolean isHard() {
		return true;
		
	}
	
	public String specificWay() {
          return "Speak loud!";		

	}
	
	public String getLanguage() {
		return language;
		
	}
	public void setLanguage(String language) {
		this.language=language;
	}

@Override 
public String toString() {
	return super.toString() + " language:" +language;
}

public static void main(String[]args) {
	
	int c;
	Scanner input = new Scanner(System.in);
	  
  	System.out.println("input integer");
  	c= input.nextInt();

     ReadMethod a = new ReadMethod(1000, " talks 1000 times", "English");
     
     System.out.println(a.toString());
     }
}

