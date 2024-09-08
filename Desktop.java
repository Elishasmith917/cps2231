package cps2231_Homework5;
/***************************************************************
*
* Kean University
* Spring 2024
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Elisha Smith, CPS 2231, section-02*
* Homework: 5, part 3A
* Program Description: creating a sub class
***************************************************************/

public class Desktop extends Computer {
	// additional instance variables
	
	private int width;
	private double height;
	private String color;
	// constructors 
	
	public Desktop () {
		super();
		
	}
	
	public Desktop ( String manufacturer, long diskSize,String manufacturingDate, int numberofCores, String color, int width, double height) {
		super(manufacturer, diskSize,manufacturingDate, numberofCores);
		this.width = width;
		this.height = height;
		this.color = color;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString () {
		return super.toString() + " Color: " + color + "\n Width:" + width + " mm \n Height: " + height + " mm \n";
	}

}
