package synch;

public class Mainthread {
	
	public static void main(String arg[])
	{
		A a=new A();
		B b=new B();
		a.start();
		
		//b.m1();
		//b.m2();
		//b.m4();
		//b.m3();
		//a.m2();
		b.start();
	}

}
