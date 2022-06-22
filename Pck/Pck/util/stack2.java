package util;

import java.util.*;

public class stack2{
private Vector v;
		public stack2()
		{
			v=new Vector();
		}
		
	public void push(Object o)
	{
        v.addElement(o);
//		addElement(o);
		System.out.println("Object pushed into stack="+o);
	}
	public Object pop()
	{
		int len=v.size();
		if(len==0){
			throw new EmptyStackException();
			}
		Object obj=v.elementAt(len-1);
		v.removeElementAt(len-1);
		System.out.println("Object removed from stack="+obj);
		return obj;
	}
}
