package com.Hashmap;

import java.io.*;
import java.util.*;
public class LinkedHashMapEx {
	
	public static void main(String arg[])
	{
		String s1="abc";
		String s2=new String("abc");
		String s3=new String("abc");
		StringBuilder sb=new StringBuilder("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(sb));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		Map m1 = new HashMap();  
		m1.put("map", "HashMap");   
		m1.put("schildt", "java2"); 
		m1.put("mathew", "Hyden");  
		m1.put("schildt", "java2s"); 
		//System.out.println();
		System.out.println(m1.keySet());    
		System.out.println(m1.values());   
		SortedMap sm = new TreeMap();  
		sm.put("map", "TreeMap");   
		sm.put("schildt", "java2");   
		sm.put("mathew", "Hyden");   
		sm.put("schildt", "java2s"); 
		sm.put("asschildt", "java2s"); 
		System.out.println(sm.keySet());     
		System.out.println(sm.values());     
		LinkedHashMap lm = new LinkedHashMap(); 
		lm .put("map", "LinkedHashMap");  
		lm .put("schildt", "java2"); 
		lm .put("mathew", "Hyden"); 
		lm .put("schildt", "java2s");   
		System.out.println(lm .keySet());   
		System.out.println(lm .values());  
	}

}
