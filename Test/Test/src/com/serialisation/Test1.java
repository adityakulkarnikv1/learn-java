package com.serialisation;
import java.io.*;
public class  Test1
{ 
	public static void main( String[] args )
	{    
		try {  
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("c:\\logInfo1.out"));
			Y a = new Y();     
			System.out.println("Before Serialization ...");   
			System.out.println("transientStaticVar = " + Y.transientStaticVar);   
			System.out.println("transientFinalVar = " + a.transientFinalVar);     
			System.out.println("transientStaticFinalVar = " +  Y.transientStaticFinalVar);  
			System.out.println("transientVar = " + a.transientVar);   
			o.writeObject(a);  
			o.close();     
			Y.transientStaticVar = "newTransientStaticVar"; 
			}catch(Exception e) {   
				//deal with exception
				}  
			try { 
				ObjectInputStream in =new ObjectInputStream(new FileInputStream("C:\\logInfo1.out"));    
				Y x = (Y)in.readObject();     
				System.out.println("After Serialization ..."); 
				System.out.println("transientStaticVar = " + Y.transientStaticVar);    
				System.out.println("transientFinalVar = " + x.transientFinalVar);   
				System.out.println("transientStaticFinalVar = " +Y.transientStaticFinalVar); 
				System.out.println("transientVar = " + x.transientVar);  
				}     catch(Exception e) {   
					//deal with exception    } 		  }	}
		}
	}
}
