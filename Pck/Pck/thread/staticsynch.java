package thread;

public class staticsynch extends Thread{
	
	 int  k=0;
	public  void run()// throws InterruptedException
	{
		for (int i=0;i<3;i++)
		{
		System.out.println("i="+i);
		
		m1(i);
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie)
		{
			System.out.println("intruupted ex="+ie.getMessage());
		}
		}
				
	}
	
	public    void m1(int j)
	{ 
		k++;
		System.out.println("in m1=k="+k+"=j="+j);
	}
	
	public void start()
	{
		//System.out.println("Before starting thread");
		super.start();
	//	System.out.println("After completing thread");
	}
	public static void main(String args[])
	{
		
		staticsynch t,t1,t2;
		
		t=new staticsynch();
		t1=new staticsynch();
		//t2=new staticsynch();
		
		System.out.println("Before calling t.start");
		t.start();
		System.out.println("After calling t.start");
		System.out.println("Before calling t1.start");
		t1.start();
		System.out.println("After calling t1.start");
		System.out.println("Before calling t2.start");
		//t2.start();
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