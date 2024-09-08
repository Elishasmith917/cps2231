package cps2231_class_4_4_2024;
import java.util.*;
public class InterTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] s = { new Student (100),new Student(10) , new Student (0)};
				Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		}
	}

	class Student implements Comparable <Student> { 
		int Id;
		//double weight;
		public Student (int Id) {
			this.Id= Id;
			
		}
		public String toString() {
			return " Student:Id=" + Id;
			
		}
		@Override
		public int compareTo(Student o) {
			return Integer.compare(this.Id, o.Id);
		}
	}

