package com.aditya.oops.classes;


// Defines a blueprint for objects (more like a data type)
class Employee {
	
	// No argument constructor
	public Employee() {
		
	}
	
	// Constructor with all fields
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Fields corresponding to the class (State)
	int id;
	String name;
	
	// Method to initialize objects
	public void init(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Methods/actions (Behavior)
	public void work() {
		System.out.println("Work");
	}
	
	// Called when object is eligible for garbage collection
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object eligible for garbage collection");
	}
}

public class Main {

	public static void main(String[] args) {
		
		// Creating object using new keyword (Instance of class)
		// Object is created in the head (new Employee())
		// Reference to that object is placed on the stack (e)
		Employee e = new Employee();
		
		System.out.println(e.id);
		System.out.println(e.name);
		
		// Initializing object using reference variable
		e.id = 1001;
		e.name = "name";
		
		// Initializing object using method
		e.init(1001, "name");
		
		// Initializing object using constructor
		e = new Employee(1001, "name");
		
		System.out.println(e.id);
		System.out.println(e.name);
		
		// Setting the reference to null for garbage collection
		e = null;
		
		// Requesting JVM to garbage collect
		System.gc();
	}

}
