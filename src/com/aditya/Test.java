package com.aditya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		File fileName = new File("file.txt");
		
		ArrayList<String> lines = new ArrayList<>();
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			
			long start = System.currentTimeMillis();
			
			Collections.sort(lines);
			
			long end = System.currentTimeMillis();
			
			
			
			System.out.println("Time taken: " + String.format("%.3f", (float)(end - start) / 1000));
			
//			for(String l : lines) {
//				System.out.println(l);
//			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}
	}

}
