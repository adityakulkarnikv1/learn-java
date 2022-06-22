package mulcls;

public class A implements java.lang.Cloneable {
	
	protected int i=20; 
	public A()
	{
		System.out.println("In A Constructor");
	}
	
	public A(int i)
	{
		System.out.println("In A Constructor with arguments");
	}

}
