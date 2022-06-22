package com.hp;

public class B {
	
	public static void fun1()
	{
		System.out.println("in B.FUN1");
	}
	
	public void fun2() //throws NumberFormatException
	{System.out.println("in B.FUN2");
		//throw new NumberFormatException();
		
	}
	public B()
	{
		
	}
	public B(String s)
	{
		System.out.println("In B- Parameter cons="+s);
	}
	static int i=10;
	public static void main(String args[])
	{
		//int i=10;
		foo(100);
		System.out.println("i="+i);
	}
  
	public static void foo(int k)
	{
	int 	i=k;
	System.out.println("i(in foo)="+i);
		
		
	}
}
