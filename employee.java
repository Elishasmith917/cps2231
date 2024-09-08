package sisessions;

public class employee {
	
	// data fields 
	
	private int ID;
	private String Firstname;
	private String Lastname;
	private int salary;
	
	// constructors
	
	public employee () {
		
		
	}
	
    public employee (int ID, String Firstname, String Lastname, int salary) {
    	this.ID = ID;
    	this.Firstname = Firstname;
    	this.Lastname = Lastname;
    	this.salary = salary;
    	
    }
    public int getID() {
    	return ID;
    	
    }
    public void setID() {
    	this.ID= ID;
    	
    } 
    public String getFirstname() {
    	return Firstname;
    	
    }
    public void setFirstname() {
    	this.Firstname = Firstname;
    	
    }
    public String getLastname() {
    	return Lastname;
    	
    }
    public void setLastname() {
    	this.Lastname = Lastname;
    }
    
    public String getName() {
    	return Firstname + " " + Lastname;
    	
    }
    
    public int getsalary() {
    	return salary;
    	
    }
    public void setsalary(int salary) {
    	this.salary = salary;
    	
    }
    // calculate annual salary 
    
    public int getAnnualsalary() {
    	return salary*12;
    	
    }
     public int raisesalary(int percent) {
    	 double increase = (percent / 100.0)* salary;
    	 salary += (int) increase ;
    	 return salary;
     }
     // to string

	@Override
	public String toString() {
		return "employee [ID=" + ID + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", salary=" + salary
				+ "]";
	}
     
     }
