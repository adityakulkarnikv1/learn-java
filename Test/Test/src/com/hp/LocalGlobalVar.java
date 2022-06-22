package com.hp;

public class LocalGlobalVar {
	static int x;
	
	public static void main(String atr[])
	{
		//int i;
		while(x<=0)
		{
			x++;
			x--;
		}
		System.out.println("x="+x);
		//System.out.println(" i="+i);
	}

}
