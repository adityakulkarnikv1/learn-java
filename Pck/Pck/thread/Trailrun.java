package thread;
import java.lang.Object;
import java.util.Collections;
import java.lang.Thread;

public class Trailrun extends Thread{
	
	public synchronized void run()// throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
		System.out.println("i="+i);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie)
		{
			System.out.println("intruupted ex="+ie.getMessage());
		}
		}
				
	}
	
	public void start()
	{
		//System.out.println("Before starting thread");
		super.start();
	//	System.out.println("After completing thread");
	}
	public static void main(String args[])
	{
		
		Trailrun t,t1,t2;
		
		t=new Trailrun();
		t1=new Trailrun();
		t2=new Trailrun();
		
		System.out.println("Before calling t.start");
		t.start();
		System.out.println("After calling t.start");
		System.out.println("Before calling t1.start");
		t1.start();
		System.out.println("After calling t1.start");
		System.out.println("Before calling t2.start");
		t2.start();
		System.out.println("after calling t2.start");
		/*
		 	
		System.out.println("Before calling t.run");
		t.run();
		System.out.println("After calling t.run");
		System.out.println("Before calling t1.run");
		t1.run();
		System.out.println("After calling t1.run");
		System.out.println("Before calling t2.run");
		t2.run();
		System.out.println("after calling t2.run");
		
		*/
		
	}
	

}
