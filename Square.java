package cps2231_Unit8_TuesdayLecture;
//square is the child class and SimpleGeometricObject is the parent class
public class Square extends SimpleGeometricObject{
	// data fields
	private double side;
	// constructors
	public Square() {
		super(); // this means that you are using the constructors from the superclass SimpleGeometricObject. since the () are blank, that means that you are using the default constructor
		
		
	}
	public Square(String color, boolean filled, double side) {
		super(color,filled); // this is how you would use the more detailed constructor from the parent class 
		this.side = side;
	}
	
	// methods
	public double getArea() {
		return 4 * side;
		
	}
	public double getPerimeter() {
		return side*side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	@Override
	public java.util.Date getDateCreated() {
		return new java.util.Date();
	}
}
