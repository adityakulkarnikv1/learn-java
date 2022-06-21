package com.aditya;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		List<String> strings = new ArrayList<>();
		
		strings.add(null);
		strings.add("null");
		
		System.out.println(strings);
	}

}
