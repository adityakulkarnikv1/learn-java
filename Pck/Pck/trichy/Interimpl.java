package trichy;

public class Interimpl implements I1,I2
{
	public void m1()
	{
	System.out.println("in m1");	
	}
	
	public void m2()
	{
		System.out.println("in m2");	
	}
	public void m3()
	{
		System.out.println("in m3");
	}
	
	public static void test(String s)
	{
		System.out.println(" in s");
	}
	public static void test(int i)
	{
		System.out.println(" in i");
	}
	public static void main(String arg[])
	{
		System.out.println("a="+a);
		
		//System.out.println("b="+b);
		System.out.println("b="+I1.b);
		System.out.println("b="+I2.b);
		
		System.out.println("c="+c);
		
		Interimpl i=new Interimpl();
		i=null;
		i.m1();
		i.m2();
		i.m3();
		
System.out.println("a="+a);
		
		//System.out.println("b="+b);
		System.out.println("b="+I1.b);
		System.out.println("b="+I2.b);
		
		System.out.println("c="+c);
		
	}
	

}
