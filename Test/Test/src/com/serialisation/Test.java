package com.serialisation;

import java.io.*;
public class  Test
{
	public static void main( String[] args ){  
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("c:\\logInfo.out"));
			X a = new X();
			System.out.println("Before Serialization ...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + a.transientFinalVar);   
			System.out.println("transientStaticFinalVar = " +X.transientStaticFinalVar); 
			System.out.println("transientVar = " + a.transientVar);
			o.writeObject(a);
			o.close();
			X.transientStaticVar = "newTransientStaticVar";
			}catch(Exception e) { 
				//deal with exception
				}
			try {
				ObjectInputStream in =new ObjectInputStream(new FileInputStream("c:\\logInfo.out"));
				X x = (X)in.readObject();   
				System.out.println("After Serialization ...");
				System.out.println("transientStaticVar = " + X.transientStaticVar);
				System.out.println("transientFinalVar = " + x.transientFinalVar);
				System.out.println("transientStaticFinalVar = " + X.transientStaticFinalVar);
				System.out.println("transientVar = " + x.transientVar); 
				}catch(Exception e) 
				{      //deal with exception
					
				} 	
				
		
	}
}