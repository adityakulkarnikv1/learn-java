package com.aditya.objectclassmethods;

 class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
	
	public Object clone() {
		try {
//			return super.clone();
//			return this;
			return new Person("name", 12);
		} catch (Exception e) {
			return null;
		}
	}
	
	public void function() {
		Person p = new Person("name", 12);
		Person p1 = (Person) p.clone();
	}
	
}

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Name", 12);
		p.clone();
		System.out.println(p);
		Person p1 = p;
		Person p2 = new Person("Name", 34);
		System.out.println(p1 == p);
		Person person =(Person) p.clone();
		System.out.println(person.hashCode());
		System.out.println(p.hashCode());
	}

}
