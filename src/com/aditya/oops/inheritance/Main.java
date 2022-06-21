package com.aditya.oops.inheritance;

import java.lang.reflect.Method;
import java.util.Date;

class Person {
	String name;
	int age;
	
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
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void overridable() {
		System.out.println("In Person class");
	}

}

class Employee extends Person {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	public void setPersonName(String name) {
		super.setName(name);
	}
	
	public void setPersonAge(int age) {
		super.setAge(age);
	}
	
	public String getPersonName() {
		return super.getName();
	}
	
	public int getPersonAge() {
		return super.getAge();
	}
	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void overridable() {
		super.overridable();
		System.out.println("In Employee class");
	}
	
}

class Contractor extends Employee {
	Date endDate;

	public Contractor(String name, int age, int id, Date endDate) {
		super(name, age, id);
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Contractor [endDate=" + endDate + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	// Employee
	public void setEmpId(int id) {
		super.setId(id);
	}
	
	public int getEmpId() {
		return super.getId();
	}
	
	// Person
	public void setPersonName(String name) {
		super.setPersonName(name);
	}
	
	public void setPersonAge(int age) {
		super.setPersonAge(age);
	}
	
	public String getPersonName() {
		return super.getPersonName();
	}
	
	public int getPersonAge() {
		return super.getPersonAge();
	}
	
	public Contractor() {
		
	}

	@Override
	public void overridable() {
		super.overridable();
		System.out.println("In Contractor class");
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		
		Person c = new Employee();
		
		c.overridable();
		
		Method methods[] = c.getClass().getDeclaredMethods();
		System.out.println(c.getClass());
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
	}

}
