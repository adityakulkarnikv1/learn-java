package util;

import java.util.*;

public class stack1 extends Vector{
//private Vector v;
	public void push(Object o)
	{
//        v.addElement(o);
		addElement(o);
		System.out.println("Object pushed into stack="+o);
	}
	public Object pop()
	{
		int len=size();
		if(len==0){
			throw new EmptyStackException();
			}
		Object obj=elementAt(len-1);
		removeElementAt(len-1);
		System.out.println("Object removed from stack="+obj);
		return obj;
	}
}
