package com.serialisation;

//abstract public class AbsIntImpl extends AbsInterface {

  class AbsIntImpl implements AbsInterface
{
	
	public int method(Integer st)
	{
		return 8;
	}
	
	public static void main(String arg[])
	{
		System.out.println("im main");
		
		AbsIntImpl a=new AbsIntImpl();
		
	}

}
