package serealiz;

public class B extends A{
	public void m2()
	{
		System.out.println("In B-m2");
	}
	public void m1()
	{
		System.out.println("In B-m1");
	}
	public static void main(String sr[])
	{
		A a=new A();
		//a.m2();
		a.m1();
		B b=new B();
		b.m1();
		b.m2();
		
		A a1=new B();
		a1.m1();
		//a1.m2();
		
		//B b1=new A();
		
		a.v.add("sha");
		a.v.add("desh");
		a.v.add("desh");
		a.v.add("desh");
		
		java.util.Vector v1=new java.util.Vector();
		java.util.Vector v2=new java.util.Vector();
		v2.add("qwe");
		v2.add("asd");
		
		v1=a.v;
		//a.v=v2;
		
			
		System.out.println("v.size="+a.v.size());
		System.out.println("v1.size="+v1.size());
		System.out.println("v2.size="+v2.size());
		
		String str="shankar";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=(ch.length-1);i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		long t1=System.currentTimeMillis();
		System.out.println("Begin="+t1);
		String s=reverse(str);
		long t2=System.currentTimeMillis();
		System.out.println("t2="+t2);
		System.out.println("(t2-t1)="+(t2-t1));
	System.out.println("After reversing string="+s);
	
	final int arr[]=new int[5];
	arr[0]=0;
	arr[1]=1;
	arr[3]=3;
	
	int nf[]=new int[5];
	//arr=nf;
	nf=arr;
	
	for (int i=0;i<arr.length;i++)
	{
		System.out.println("arr[i]="+arr[i]);
	}
	for (int i=0;i<nf.length;i++)
	{
		System.out.println("nf[i]="+nf[i]);
	}
	}
	public static String reverse(String str)
	{
		int x=str.length()-1;
		if (x==0){
			 return str;
		     }
		char c=str.charAt(x);
		System.out.println("c="+c);
		String s=str.substring(0,x);
		System.out.println("s="+s);
		
		return c+reverse(s);
		
		/*char ch[]=str.toCharArray();
		String r="";
		
		for(int i=(ch.length-1);i>=0;i--)
		{	//r=ch[i]+r;
			r=r+ch[i];
			System.out.println("r="+r);
		}*/
		
		
		
	//	return r;
		
	}
	

}
