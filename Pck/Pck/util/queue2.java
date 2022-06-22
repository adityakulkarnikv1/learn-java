package util;

import java.util.EmptyStackException;
import java.util.Vector;

public class queue2 {
private Vector v;
          public queue2()
          {
        	  v=new Vector();
          }
	public void enqueue(Object o)
	{
        v.addElement(o);
//		addElement(o);
		System.out.println("Object pushed into Queue="+o);
	}
	public Object dequeue()
	{
		int len=v.size();
		if(len==0){
			throw new EmptyStackException();
			}
		Object obj=v.elementAt(0);
		v.removeElementAt(0);
		System.out.println("Object removed from Queue="+obj);
		return obj;
	}
}