package cps2231_Lab5;
public abstract class Course {
	
    // Data fields
    private String courseName;
    private int sectionNumber;
    private String instructorName;
    private static int numberOfStudentsEnrolled;// Remember underlined means static

    // Constructors also remember, # means protected
    protected Course() {
    	numberOfStudentsEnrolled =+ 1;
    }

    protected Course(String courseName) {
        this.courseName = courseName;
    }

    protected Course(String courseName, int sectionNumber, String instructorName) {
        this.courseName = courseName;
        this.sectionNumber = sectionNumber;
        this.instructorName = instructorName;
        numberOfStudentsEnrolled =+ 1;
    }

    // Abstract method because it is italicized on UML diagram
    public abstract int getCapacity();

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public static int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    // toString 
    @Override
    public String toString() {
        return "[" + "CoursName= " + courseName + ", SectionNumber= " + sectionNumber + ", InstructorName= " + instructorName; // + ", Enrolled: " + numberOfStudentsEnrolled;
    }
}