package cps2231_Unit8_ThursdayLecture;

public class Person {

	//data fields 
	
	private String name;
	private String street;
	private String city;
	
	// constructors 
	
	public Person () {
		
	}
	
	public Person (String name, String street, String city) { 
		this.name = name;
		this.street = street;
		this.city = city;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
//		return "Person [name=" + name + ", street=" + street + ", city=" + city + "]";
		return "name: " + name + ", street: " + street + ", city: " + city;
	}
	
	
}
 class Student extends Person{

	private int id;
	
	public Student (String name, String street, String city, int id) { 
		super(name,street,city);
		this.id= id; 
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
//		return  "name: " + getName() + ", street: " + getStreet() + ", city: " + getCity() + ", id: " + id;
		return super.toString() + ", id: " + id;
	}
 }

