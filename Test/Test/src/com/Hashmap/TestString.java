package com.Hashmap;

public class TestString {
	
	//static int x=9;
	public static void main(String arg[])
	{
		int x=9;
		TestString ts=new TestString();
		ts.method(x);
		System.out.println(x);
		StringBuffer sb=new StringBuffer("Shakar");
		ts.method(sb);
		System.out.println(sb);
		
		String s="this is a sentance";
		String s2="";
		String[] s1=s.split(" ");
		for(int j=s1.length-1;j>=0;j--)
		{   s2=s2+s1[j]+" ";
			System.out.println(s1[j]);
		}
		System.out.println(s2);
	}
	
	public void method(int x)
	{
	  	x=5;
	}
	public void method(StringBuffer s)
	{
	  s.append("desh");
	}
	

}
