package cps2231_Lab5;

public class HybridCourse extends Course {
	 // data fields
	    private int percentOfRemoteLearning;

	    // Constructors
	    public HybridCourse() {
	    }
	    
	    public HybridCourse(String courseName, int sectionNumber, String instructorName, int percentOfRemoteLearning) {
	        super(courseName, sectionNumber, instructorName);
	        this.percentOfRemoteLearning = percentOfRemoteLearning;
	    }

	    // Implementing the abstract method from Course
	    @Override
	    public int getCapacity() {
	        return 40; // I just put a random number 
	    }

	    // Getters and setters
	    public int getPercentOfRemoteLearning() {
	        return percentOfRemoteLearning;
	    }

	    public void setPercentOfRemoteLearning(int percentOfRemoteLearning) {
	        this.percentOfRemoteLearning = percentOfRemoteLearning;
	    }

	    //  toString 
	    @Override
	    public String toString() {
	        return super.toString() + ", PercentofRemoteLearning= " + percentOfRemoteLearning + "]";
	    }

	    // Main method for  Part 1.2
	    
	    public static void main(String[] args) {
	        HybridCourse h1 = new HybridCourse("CPS1000", 1, "Tom",50);
	        OnlineCourse o1 = new OnlineCourse("CPS1001", 2, "Jack", "Zoom", "www.xxx.com");
	        System.out.println(h1);
	        System.out.println(o1);

	        
	    }
	}
