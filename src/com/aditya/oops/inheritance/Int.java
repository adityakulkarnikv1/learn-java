package com.aditya.oops.inheritance;

interface I1 {
	public void print();
}

interface I2 {
	public void display();
}

interface Final extends I1, I2 {
	public void show();
}

public class Int implements Final {
	
	@Override
	public void print() {
		System.out.println("Implementing interface I1");
	}
	
	@Override
	public void display() {
		System.out.println("Implementing interface I2");
	}

	@Override
	public void show() {
		System.out.println("Implementing interface final");
	}

	public static void main(String[] args) {
		(new Int()).print();
		(new Int()).display();
	}

}
