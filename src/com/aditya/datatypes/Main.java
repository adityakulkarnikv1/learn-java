package com.aditya.datatypes;

public class Main {

	public static void main(String[] args) {
		byte b = (byte) 128; // signed byte (1 byte) range -2^7 to (2^7 - 1) 
		short s = (short) 65535; // signed short (2 bytes) range -2^15 to (2^15 - 1)
		int i = (int) 2147483645; // signed int (4 bytes) range -2^32 to (2^32 - 1)
		System.out.println(i);
	}

}
