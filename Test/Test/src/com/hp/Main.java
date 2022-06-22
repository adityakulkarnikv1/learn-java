package com.hp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List; 
import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Map m1 = new LinkedHashMap();
		m1.put("1","One");
		m1.put("3","Three");
		m1.put("3","Three");
		Map m2 = new IdentityHashMap();
		m2.put("2","Two");
		m2.put("4","Four");
		m2.put("4","Four"); 
		List<String> list = new ArrayList<String>();
		list.addAll(m1.keySet());
		list.addAll(m2.keySet());  
		for(String s : list) 
		{
			System.out.println(s);
			}
		}
	} 