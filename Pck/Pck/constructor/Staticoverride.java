package constructor;

public class Staticoverride extends B {

	public static void fun1()
	{
		System.out.println("in Staticoverride.FUN1");
	}
	
	public void fun2()
	{
		System.out.println("in Staticoverride.FUN2");
	}

	public static void main(String args[])
	{
		B b=new B();
		 b.fun1();
		 b.fun2();
		
		 Staticoverride b1=new Staticoverride();
		b1.fun1();
		b1.fun2();
		
	/*	Staticoverride b2=new Staticoverride();
		b2.fun1();*/
		
	}
}
