package cps2231_class_4_4_2024;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public record Employee(int id, String name, String department, LocalDate dateofHire, double salary) implements Comparable <Employee>{
	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary,  o.salary);
	}
	@Override
	public String toString() {
		
		return " id: " + id + " , Name: " + name + ", Department: " + department + ", Date of Hire: " + dateofHire + " , Salary: " + salary;
	}
	
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate parsedDate = LocalDate.parse("2024-04-01", format);
		Employee o = new Employee(100,"Kuan","Computer Science", parsedDate,1000);
		System.out.println(o);
	}
	
}
