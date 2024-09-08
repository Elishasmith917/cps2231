package cps2231_Unit9_tuesdaylecture_Attendance11;

public class Vehicle {

	// data fields 
	
	private String Make;
	private String Model;
	private int Year;
	
	// constructors 
	
	public Vehicle() {
		
	}
	
	public Vehicle (String Make, String Model, int Year) {
		this.Make= Make;
		this.Model= Model;
		this.Year= Year;
		
		
	}
	// methods- getters and setters


	public String getMake() {
		return Make;
	}

	public void setMake(String Make) {
		Make = Make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String Model) {
		Model = Model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int Year) {
		Year = Year;
	}
// gonna change the toString here
	@Override
	public String toString() {
		return "Make= " + Make + ", Model= " + Model + ", Year= " + Year;
	}
	
	
}

class car extends Vehicle { 
	
	// data fields 
	
	private int numDoors;
	public static int numberOfCar;

// constructors 

 public car () {
	 numberOfCar +=1;
 }
 
 public car (String Make, String Model, int Year, int numDoors) {
	 super(Make, Model,Year);
	 this.numDoors= numDoors;
	 numberOfCar +=1;
	 
 }
 // methods 

public int getNumDoors() {
	return numDoors;
}

public void setNumDoors(int numDoors) {
	this.numDoors = numDoors;
}

// toString
public String toString() {
return super.toString() + ", numDoors = " + numDoors;
	}
}
