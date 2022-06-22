package util;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet  hs=new  HashSet();
		/*s.add("abc");
		s.add("def");
		s.add("abc");
		s.add("def")*/;
		hs.add("a");
		hs.add("d");
		hs.add("b");
		hs.add("e");
		hs.add("b");
		System.out.println("hs.size="+hs.size());
		System.out.println("hs="+hs);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		TreeSet  ts=new  TreeSet();
		/*t.add("abc");
		t.add("def");
		t.add("abc");
		t.add("def")*/;
		
		ts.add("b");
		ts.add("d");
		ts.add("c");
		ts.add("e");
		ts.add("c");
		System.out.println("ts.size="+ts.size());
		System.out.println("ts.size="+ts);
		Iterator tr=ts.iterator();
		while(tr.hasNext())
		{
			System.out.println(tr.next());
		}
		Vector v=new Vector();
		v.add("a");
		v.add("c");
		v.add("b");
		v.add("c");
		System.out.println("v="+v);
		
		ArrayList ar=new ArrayList();
		ar.add("b");
		ar.add("a");
		ar.add("d");
		ar.add("a");
		
		System.out.println("ar="+ar);
		
		LinkedList ll=new LinkedList();
		ll.add("b");
		ll.add("c");
		ll.add("c");
		ll.add("a");
		System.out.println("ll="+ll);
		
		
		
		
	
	}
}
