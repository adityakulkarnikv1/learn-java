package com.hp;

public class TestInterfaceInstance extends Base implements TestInterface {
	
	public void m()
	{
		System.out.println("in M");
	}
	//Y=8;
	public static void main(String arg[])
	{
		//TestInterface ti=new TestInterface();
		System.out.println(TestInterface.i);
	//	System.out.println(Base.y);
		TestInterface ti=new TestInterfaceInstance();
		ti.m();
	}

}
