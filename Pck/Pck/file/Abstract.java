package file;

public class Abstract extends Abst implements Inter{
	
	public void m2()
	{
		System.out.println("in m2");
	}
	public static void main(String main[])
	{
		Abstract a=new Abstract();
		a.m1();
		a.m2();
	}

}
