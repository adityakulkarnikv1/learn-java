package pack;

import java.lang.*;
import java.util.Stack;
import java.util.Queue;


import java.util.*;

class t1 extends Thread
{
	public  static Stack st=new Stack();
	private int j=10;
	

	public synchronized  void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("in t1 thread="+i);
			st.push(i);
			//System.out.println("in t1 st.pop()="+st.pop());
		}
	}
	public void start()
	{
	run();	
	}
	
}

 class t2 extends t1 implements Runnable
{
	 public void run()
		{ //System.out.println("j="+j);
			for(int i=0;i<=50;i++)
			{
				System.out.println("in t2 thread="+i);
				
				System.out.println("in t2=st.pop()"+st.pop());
			}
		}
		
}

public class Threadex {
	public static void main(String arg[])
	{
		t1 a=new t1();
		//t1 c=new t1();
		t2 b=new t2();
		
		a.start();
		//c.start();
		//b.start();
		//a.start();
	}
}
