package exam2_review;

public abstract class Method implements Comparable<Method>{
	// data fields
	private String methodName;
	private int priority;
	// constructors
	public Method() {
		
	}
	
	public Method (String methodName, int priority) {
		this.methodName=methodName;
		this.priority=priority;
	
	}
	// abstract method

}
