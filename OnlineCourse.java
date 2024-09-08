package cps2231_Lab5;

public class OnlineCourse extends Course {
	    // data fields
	    private String platform;
	    private String meetingLink;

	    // Constructors
	    public OnlineCourse() {
	       
	    }

	    public OnlineCourse(String courseName, int sectionNumber, String instructorName, String platform, String meetingLink) {
	        super(courseName, sectionNumber, instructorName);
	        this.platform = platform;
	        this.meetingLink = meetingLink;
	    }

	    //implementing the abstract method from Course
	    @Override
	    public int getCapacity() {
	        return 100;// just put a random number
	    }

	    // Getters and setters
	    protected String getMeetingLink() {
	        return meetingLink;
	    }

	    protected void setMeetingLink(String meetingLink) {
	        this.meetingLink = meetingLink;
	    }

	    // toString
	    @Override
	    public String toString() {
	        return super.toString() + ", Platform= " + platform + ", MeetingLink= " + meetingLink + "]";
	    }
	}
