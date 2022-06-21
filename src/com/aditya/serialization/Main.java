package com.aditya.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Position implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2017182326800239586L;
	transient private int id;
	private double x;
	private double y;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Position(int id, double x, double y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", x=" + x + ", y=" + y + "]";
	}
	
	
}

public class Main {

	private static final String filename = "save.txt";
	
	public static void serialiazeObject(Position position) {
		
		try {
			FileOutputStream fos = new FileOutputStream(new File(filename));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(position);
			System.out.println("Object written to file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Position deserializeObject() {
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ObjectInputStream ois = new ObjectInputStream(fis);
			return (Position) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {

		Position p1 = new Position(1, 1.25, 2.34);
		serialiazeObject(p1);
		System.out.println(p1);
		
		// adding some comment
		
		Position p = deserializeObject();
		System.out.println(p);
		System.out.println(p.getId());
		System.out.println(p.getY());
	}

}
