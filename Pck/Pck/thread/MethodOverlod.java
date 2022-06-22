package thread;

class a {
	public int m3(int i,int j)
	{
		return (i+j);
	}
	
	
	
	
}

public class MethodOverlod extends a {
	
	
	public int m1(int i,int j)
	{
		return (i+j);
	}

	public float m1(float i,float j)
	{
		return (i+j);
	}

	 
	public int m2(int i,int j)
	{
		return (i+j);
	}
	public float m2(float i,int j)
	{
		return (float)(i+j);
	}
	
	public int m3(int i,int j)
	{
		return (i+j);
	}
  public static void main(String arg[])
  {
	  MethodOverlod o=new MethodOverlod();
	  
	  int x=5,y=6;
	  float p=12.35f,q=13.45f;
	  
	  System.out.println(o.m1(x, y));
	  System.out.println(o.m1(p,q));
	  System.out.println(o.m2(x, y));
	  System.out.println(o.m1(p, q));
  }
	
}
