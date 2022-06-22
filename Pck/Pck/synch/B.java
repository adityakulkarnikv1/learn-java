package synch;

public class B extends java.lang.Thread{
	
	public static synchronized  void m1()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("B=static-synch-m1=="+i);
		}
	}
	
	public synchronized void m2()
	{
		for(int i=0;i<45;i++)
		{
			System.out.println("B==synch-m2=="+i);
		}
	}
	

	public static void m3()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("B==static-m3=="+i);
		}
	}
 
	public  void m4()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("B==static-m4=="+i);
		}
	}
	
	public void run()
	{
		//A a=new A();
		//a.m4();
		//a.m3();
		//a.m2();
		//a.m1();
		B b=new B();
		b.m2();
		b.m1();
	}
}
