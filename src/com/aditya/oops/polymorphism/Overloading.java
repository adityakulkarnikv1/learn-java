package com.aditya.oops.polymorphism;

import java.io.IOException;

class Area {
	public float area(double length, double breadth) throws IOException {
		throw new IOException();
		//return (float) (length * breadth);
	}
	
	public double area(double radius) {
		return Math.PI * radius * radius;
	}
}

public class Overloading {

	public static void main(String[] args) {
		Area circle = new Area();
		try {
			circle.area(1,2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		System.out.println(String.format("%.4f", circle.area(7)));
	}

}
