package mulcls;

public class B  extends A implements java.lang.Cloneable {
	
	protected int i=20; 
	public B()
	{
		System.out.println("In B Constructor");
		
	}
	
	public static void main(String arg[]){
	
		A a=new A();
		//A A11=a.clone();
		A a1=new A();
		A a2=new A();
		A a3=new A();
		B b=new B();
		try{
			B b1=(B)b.clone();
			System.out.println("b1="+b1);
		}catch(Exception e)
		{
			System.out.println("cnse");
		}
		
		System.out.println("a="+a+"=a.hc="+a.hashCode());
		System.out.println("a="+a1+"=a.hc="+a1.hashCode());
		System.out.println("a="+a2+"=a.hc="+a2.hashCode());
		System.out.println("a="+a3+"=a.hc="+a3.hashCode());
		System.out.println("B="+b+"=b.hc="+b.hashCode());
		try{
			B b1=(B)b.clone();
			B b2=(B)b.clone();
			B b3=(B)b.clone();
			System.out.println("b1="+b1);
			System.out.println("b2="+b2);
			System.out.println("b3="+b3);
			//A a11=(A)a.clne();
		}catch(Exception e)
		{
			System.out.println("cnse");
		}
		
	}
}
