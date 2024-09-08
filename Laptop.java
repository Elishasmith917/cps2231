package cps2231_Homework5;
/***************************************************************
*
* Kean University
* Spring 2024
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Elisha Smith, CPS 2231, section-02*
* Homework: 5, part 3B
* Program Description: creating a sub class
***************************************************************/
public class Laptop extends Computer {
	// additional instance variables AKA data fields
	
	private double weight;
	private String color;
	// constructors 
	
	public Laptop () {
		super();
		
	}
	
	public Laptop ( String manufacturer, long diskSize,String manufacturingDate, int numberofCores, String color, double weight) {
		super(manufacturer, diskSize,manufacturingDate, numberofCores);
		this.weight = weight;
		this.color = color;
		
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString () {
		return super.toString() + " Color: " + color + "\n weight:" + weight + " lbs \n";
	}

}
