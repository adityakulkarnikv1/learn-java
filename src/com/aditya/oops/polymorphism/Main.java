package com.aditya.oops.polymorphism;

class Shape {
	public void draw() {
		System.out.println("Drawing...");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing Circle...");
	}
}

public class Main {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

}
