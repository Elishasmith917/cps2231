package cps2231_Assignment4;
/********************************************************************************************
 * 
 * Kean University
 * Spring 2024
 * Course: CPS 2231- Computer Programming
 * 
 * Author: Elisha Marie Smith- CPS 2231- Section 02
 * Assignment: 4
 * Task #1
 * Program Description: creating a triangle class that extends the SimpleGeometricObject class
 * 
 *********************************************************************************************/
public class Triangle extends SimpleGeometricObject  {
// data fields
	public double base; 
	public double height;
// constructors 
	public Triangle () {
		base =5;
		height= 10;
	}
	
	public Triangle(double newBase, double newHeight) {
		base=newBase;
		height=newHeight;
		
	}
	// override 
	
	public void testOverriding() {
        System.out.println("This is the overridden testOverriding() method in the Triangle class");
    }
	
	
	// methods
	
	public double getArea () {
		return 0.5 *base*height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString () + "base=" + base + ", height=" + height + ", area=" + getArea() ;
	}
	
	
}
