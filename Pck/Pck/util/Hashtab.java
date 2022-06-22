package util;

import java.util.*;
public class Hashtab {
	public static void main(String srg[])
	{
		Hashtable ht=new Hashtable();
		ht.put("b",new Integer(3));
		ht.put("d",new Integer(2));
		ht.put("a",new Integer(5));
		ht.put("x",new Integer(2));
		ht.put("p",new Integer(3));
		//ht.put(null,new Integer(3));
		
		Vector v=new Vector(ht.keySet());
		Collections.sort(v);
		Enumeration e=v.elements();
		System.out.println("key"+"\t\t"+"val"+"\t\t"+"key.hashCode()"+"\t\t"+"val.hashCode()");
		HashMap tm=new HashMap();
		while(e.hasMoreElements())
		{
			String key=e.nextElement().toString();
			String val=ht.get(key).toString();
			System.out.println(key+"\t\t"+val+"\t\t"+key.hashCode()+"\t\t"+val.hashCode());
			tm.put(key,val);
		}
			//tm.put(null,null);
		
		Vector v1=new Vector(tm.keySet());
		Collections.sort(v1);
		/*for (int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i).hashCode());
		}
		Collections.sort(v1);
		for (int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i).hashCode());
		}*/
		Enumeration e1=v1.elements();
		System.out.println("key"+"\t\t"+"val"+"\t\t"+"key.hashCode()"+"\t\t"+"val.hashCode()");
		while(e1.hasMoreElements())
		{
			String val=e1.nextElement().toString();
			//String val=tm.get(key).toString();
			System.out.println("val-"+val);
			//System.out.println(val+"\t\t"+key+"\t\t"+key.hashCode()+"\t\t"+val.hashCode());
			
		}
		
		HashMap hm=new HashMap();
		hm.put("b",new Integer(3));
		hm.put("d",new Integer(2));
		hm.put("a",new Integer(5));
		hm.put("x",new Integer(2));
		hm.put("p",new Integer(3));
		hm.put(null,new Integer(9));
		hm.put(null,new Integer(8));
		hm.put(null,null);
		hm.put("j",null);
		
		Vector hmv=new Vector(hm.keySet());
		Enumeration en=hmv.elements();
		/*while(en.hasMoreElements())
		{
			String key=en.nextElement().toString();
			String val=hm.get(key).toString();
			System.out.println(key+"\t\t"+val+"\t\t"+key.hashCode()+"\t\t"+val.hashCode());
			tm.put(key,val);
		}*/
		
		TreeMap trm=new TreeMap();
		trm.put("b",new Integer(3));
		trm.put("d",new Integer(2));
		trm.put("a",new Integer(5));
		trm.put("x",new Integer(2));
		trm.put("p",new Integer(3));
		//trm.put(null,new Integer(9));
		trm.put("s",null);
		System.out.println("trm="+trm);
		System.out.println("hm="+hm);
		Vector trmv=new Vector(hm.keySet());
		Enumeration ten=trmv.elements();
		/*while(ten.hasMoreElements())
		{
			String key=ten.nextElement().toString();
			String val=trm.get(key).toString();
			System.out.println(key+"\t\t"+val+"\t\t"+key.hashCode()+"\t\t"+val.hashCode());
			tm.put(key,val);
		}*/
		
	}

}
