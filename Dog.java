package cps2231_Lab5;
// similar to the book activity done in class
import java.util.*;

public record Dog(String name, String breed, int age, double weight) implements Comparable<Dog> {
    
    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.age(), o.age());
    }
    
   /* this is the two string I would use if I wanted to print everything. to match the assignment output, im gonna make one that only prints the age. want to keep this two string here for furture refeerence @Override
    public String toString() {
        return "Name: " + name + ",Breed: " + breed + ",Age: " + age + ", Weight: " + weight;
    } */
    
    //toString
    public String toString() {
    	return "Dog: " + "Age=" + age;
    }
    
    public static void main(String[] args) {
        // Creating the array for the dog objects
        Dog[] a = { new Dog("Buddy", "Labrador Retriever", 5, 25.5),
        		    new Dog("Max", "Golden Retriever", 3, 30),
        		    new Dog("Charlie", "German Shepherd", 2, 22)};

        // before sorting
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(a));

        // Sort the dogList by age
        Arrays.sort(a);

        // Print the dogs in dogList after sorting
        System.out.println("\n After sorting:");
        System.out.println(Arrays.toString(a));
    }
}