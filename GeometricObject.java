package chapter_13;

public abstract class GeometricObject {
	
	//data fields
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructors
	
	protected GeometricObject() { 
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject( String colo, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled=filled;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public abstract double getArea();
		
	public abstract double getPerimeter();
	public static void main (String[] args) {
		
	}
}

class circle extends GeometricObject{
	
}
