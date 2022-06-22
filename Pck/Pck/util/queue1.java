package util;

import java.util.EmptyStackException;
import java.util.Vector;

public class queue1 extends Vector{
//private Vector v;
	public void enqueue(Object o)
	{
//        v.addElement(o);
		addElement(o);
		System.out.println("Object pushed into Queue="+o);
	}
	public Object dequeue()
	{
		int len=size();
		if(len==0){
			throw new EmptyStackException();
			}
		Object obj=elementAt(0);
		removeElementAt(0);
		System.out.println("Object removed from Queue="+obj);
		return obj;
	}
}