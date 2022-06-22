package thread;

class a
{
	public void m1()
	{
		System.out.println("In a--m1-");
	}
}

class b
{
	public void m1()
	{
		System.out.println("In b--m1");
	}
}
public class Multin extends a,b {
	
	public static void main(String arg[])
	{
		Multin m=new Multin();
	}

}
