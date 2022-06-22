package trichy;

public class A {
	
	public void m1() 
	{
		System.out.println("in A");
	}
	
	static int  i=20;

	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		System.out.println("a.i=before="+i);
		String b=new String("abc");
		String c="abc";
		// c=b;
		String d=new String("abc");
		//d=b;
		
		System.out.println("b.hc="+b.hashCode());
		
		System.out.println("c.hc="+c.hashCode());
		
		System.out.println("d.hc="+d.hashCode());
		if(b==c)System.out.println("b==c");
		
		if(d==c)System.out.println("d==c");
		
		if(b==d)System.out.println("b==d");
		if(b==b)System.out.println("b==b");
		
		//System.out.println(b==c +"="+d==c+"="+d==b);
		//a=null;
		a.m1();
		//System.out.println("a.i=before="+i);
	
		StringBuffer d1=new StringBuffer("abc");
		StringBuffer b1=new StringBuffer("abc");
	
		if(b1==d1)System.out.println("b1==d1");
		if(b1==b1)System.out.println("b1==b1");
		if(b1.equals(d1))System.out.println("b1.eqd1");
		if(b1.equals(b1))System.out.println("b1.eqb1");

	}
}
