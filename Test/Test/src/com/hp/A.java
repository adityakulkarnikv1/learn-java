package com.hp;

//import mulcls.*;

public class A extends B {
	/*public A()
	{
		
	}*/
	public A(String str)
	{
		System.out.println( "In a -Para constr="+str);
	System.out.println("i="+i);
	}
	
	public static void main(String args[])
	{
		A x=new A("str");
		System.out.println("x.hc="+x.hashCode());
		System.out.println("x="+x);
		
		
		char c='a'+2;
		char b='b'+2;
		System.out.println(c);
		System.out.println(b);
		//B b=new B();
	try{
			x.fun2();
		}catch(NumberFormatException ex)
		{
			System.out.println("DSone");
	
		}
	
		//a.fun2();
	}
	
	
	
	
	

}
