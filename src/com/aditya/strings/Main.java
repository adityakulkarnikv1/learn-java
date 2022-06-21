package com.aditya.strings;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1. Strings are immutable
		 * 2. s = s1 + s2 returns new String object pointed by s
		 * 3. StringBuilder and StringBuffer are used to create mutable strings
		 * 4. StringBuilder not thread safe
		 * 5. StringBuffer thread safe
		 */
		
		String s = "name";
		String s1 = s + " user";
		String s2 = "name user";
		
		System.out.println(s1.equals(s2));
		
		String str1 = "string"; // str1 points to "string"
		String str2 = str1; // (shallow cloning) str2 also points to "string" in the string pool
		
		String str3 = new String("string");
		String str4 = new String("string");
		System.out.println("str3" + str3.hashCode() + " str1 " + str1.hashCode() + " str4 " + str4.hashCode());
		// str3.hashcode() == str4.hashcode() ??
		
		System.out.println(str3 == str4);
		
		String string1 = "str";
		String string2 = "ing";
		String string3 = string1 + string2; // creates new string object with value "string"
		
		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // false
		
		System.out.println(string3 == str1); // false
		System.out.println(string3.equals(str1)); // true
	}

}
