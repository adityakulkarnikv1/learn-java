package pack;

import java.sql.*;
import  java.io.*;



public class Except {
	int i=2,j=0,k;
	//static int l;
	public static void main(String arg[])
	{
		
		try
		 {
			m1();
		 
		 }catch(ArithmeticException ae)
		  {}
		 catch(NumberFormatException e)
		   {}
		 catch(Exception e ){}
		
		
	}

	
	public static void m1()// throws NumberFormatException,ArithmeticException,FileNotFoundException
	try{
		System.out.println("before exce");
		
		k=i/j;
		int h=Integer.parseInt("we");
		
		System.out.println("after exce");
		
	   }catch(ArithmeticException ae)
	  {
		  // ae.printStackTrace();
		   System.out.println("in ae=");
		   //String[]  en=ae.getStackTrace();
		   
		 /*  for(int i=0;i<en.length;i++)
		   {
			   System.out.println(en[i]);
		   }*/
		
	   }catch(NumberFormatException e)
	   {
		   System.out.println("in  exce");
	   } finally{
		   System.out.println("in finally-before try");
		   
		   try
		   {
			throw new FileNotFoundException();   
		   
		   }catch(Exception e ){
			   e.printStackTrace();
			   StackTraceElement[] str=e.getStackTrace();
			   for (int x=0;i<str.length;x++)
			   {
				   System.out.println("str=="+i+"=="+str[i]);
				   
			   }
			   System.out.println("in finally-catch");
		   }
		   System.out.println("in finally-After catch");
	   }
}
