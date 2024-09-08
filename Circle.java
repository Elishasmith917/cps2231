package cps2231_tuesdaylecture11;

public class Circle {

	/** the radius of this circle*/
	// data fields 
	public double radius = 5.0;
    public String color;
    public static int numberofCircle;
    
	//constructors should use the constructor methods when creating an object
	public Circle() {
		numberofCircle += 1; // add one because each time you create an object you add one circle
	}
	
	
	public Circle(double newRadius) { 
		radius= newRadius;
		numberofCircle += 1;
	}
	
	//methods 
	/** return the area of this circle*/
	public double getArea() {
		return radius*radius*3.14159;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getperimeter() {
		return 3.14*2*radius;
	}
	public String getColor() {
		return color;
	}
	public void setcolor( String color) {
		this.color= color;
	}
	public  void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	
	}
	public static void main (String [] args) {
	
}
}
