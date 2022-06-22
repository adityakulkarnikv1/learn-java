package synch;

public class A extends java.lang.Thread {

	public static synchronized void m1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("A=static-synch-m1=="+i);
		}
	}
	
	public synchronized void m2()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("A==synch-m2=="+i);
		}
	}
	

	public static void m3()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("A==static-m3=="+i);
		}
	}
	public  void m4()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("A==static-m4=="+i);
		}
	}
	
	public void run()
	{
		B b=new B();
		//b.m4();
		//b.m3();
		//b.m2();
		b.m1();
	
	}
	
	
}
