package mulcls;
import java.util.*;


class D
{
	public D()
	{
		System.out.println("in D Constructor");
	}
}

class X
{
	public X()
	{
		System.out.println("in X Constructor");
	}
	
	public void m1()
	{
		System.out.println("in Class- X - m1");
	}
	
	public int getX()
	{
		return 1;
	}
	
}

class Y extends X
{
	public Y()
	{
		System.out.println("in Y Constructor");
	}
	public void m1()
	{
		System.out.println("in Class- Y - m1");
	}
	
	public int getY()
	{
		return 2;
	}
}

class Z extends X 
{
	public Z()
	{
		System.out.println("in Z Constructor");
	}
	public void m1()
	{
		System.out.println("in Class- Z - m1");
	}
	
	public int getZ()
	{
		return 2;
	}
}
public class C extends A {
	public C()
	{
		System.out.println("In C Constructor");
		
	}
	
	public static void main(String arg[]){
		
		//A a=new A();
		C c=new C();
		//D d=new D();
		X x=new X();
		Y y=new Y();
		Z z=new Z();
		 x.m1();
		 y.m1();
		 z.m1();
		 
		System.out.println(" =================END 1============");
		X x1=new X();
		X y1=new Y();
		X z1=new Z();
		
	//	Z x2=new X();
		
		 x1.m1();
		 y1.m1();
		 z1.m1();

		 System.out.println(" =================END 2============");
		// X x2=new X();
		// Y y2=new X();
		// Z z2=new X();
			
			// x2.m1();
			// y2.m1();
			// z2.m1();		 
		 
	 ArrayList al=new ArrayList();
	 al.add(x); al.add(y);al.add(z);
	 
	 
	 
	 System.out.println("al.size="+al.size());
	 System.out.println("al.get="+al.get(0));
	 System.out.println("al.get="+al.get(1));
	 System.out.println("al.get="+al.get(2));
	 
	 for(int i=0;i<al.size();i++)
	 {
		
		 System.out.println("al.get="+i+"\t in for="+al.get(i));
	 }
	 
	 ArrayList tm=c.aorder(al);
	 
	 for(int i=0;i<tm.size();i++)
	 {
		
		 System.out.println("in Array list.get="+i+"\t in for="+tm.get(i));
	 }
	 
    LinkedList l=c.llorder(al);
	 
	 for(int i=0;i<l.size();i++)
	 {
		
		 System.out.println("in Linked list.get="+i+"\t in for="+l.get(i));
	 }
	 
    HashSet h=c.hsorder(al);
	  Iterator it=h.iterator();
	  while (it.hasNext())
	  {
		  System.out.println("in Hash set .get=\t in for="+it.next());  
	  }
	 //for(int i=0;i<h.size();i++)
	// {
	//	
		// System.out.println("in Hash set .get="+i+"\t in for="+h.get(i));
	// }
	 
   TreeSet ts=c.tsorder(al);
	 
   Iterator it1=ts.iterator();
	  while (it1.hasNext())
	  {
		  System.out.println("in Hash set .get=\t in for="+it1.next());  
	  }
	// for(int i=0;i<ts.size();i++)
	// {
		//System.out.println("in Linked list.get="+i+"\t in for="+ts.get(i));
	// }
	 	 	 	 
	}
	
	 public ArrayList aorder(ArrayList a)
	 {
		 ArrayList t=new ArrayList(a);
		 t.add("one");
		 t.add("two");
		 return t;
	 }
	 
	 public LinkedList llorder(ArrayList a)
	 {
		 LinkedList t=new LinkedList(a);
		 t.add("one");
		 t.add("two");
		 return t;
	 }
	 
	 public HashSet hsorder(ArrayList a)
	 {
		 HashSet t=new HashSet(a);
		 t.add("one");
		 t.add("two");
		 return t;
	 }
	 
	 public TreeSet tsorder(ArrayList a)
	 {
		 TreeSet t=new TreeSet(a);
		 t.add("one");
		 t.add("two");
		 return t;
	 }

}
