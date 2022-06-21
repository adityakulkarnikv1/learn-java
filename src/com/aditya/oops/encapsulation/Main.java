package com.aditya.oops.encapsulation;

class Employee {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 18) {
			this.age = -1;
		} else {
			this.age = age;
		}
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1001);
		e.setName("Aditya");
		e.setAge(12);
		
		System.out.println(e);
		
	}

}
