package com.hp;
import java.util.*;

public class CountCharBT {
	
	
	
	public static void main(String arg[])
	{ String s="AalkkKLkklla";
		TreeSet ts=new TreeSet();
		HashMap hm=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			ts.add(s.charAt(i));
			hm.put(s.charAt(i),0);
					
		}
		System.out.println();
		System.out.println("Input String="+s);
		System.out.println(ts);
		System.out.println(hm);
		//hm.put(ts,0);
		//System.out.println(hm);
		Vector v=new Vector();
		ArrayList ar=new ArrayList();
		LinkedList l=new LinkedList();
		HashSet hs=new HashSet();
		TreeMap tm=new TreeMap();
		Hashtable ht=new Hashtable();
		//HashTable h=new HashTable();
		
		 String t="take  is my name";
		 String t1="";
		 List al=new ArrayList();
		 
		 for(int z=t.length()-1;z>=0;z--)
		 {
			 char c=t.charAt(z);
			/* if (c!=' '&&z!=0){
				 t1=t1+c;			 
				 
			 } else { if (z==0) { t1=t1+c;}
				 System.out.println("t1="+t1);
			 al.add(t1);
			 t1="";
				 
			 }	*/
			 t1=t1+c;
			 if(c==' '||z==0)
			 {
				 al.add(t1);
				 t1="";
			 }
			 
			// System.out.println("c="+c);
			
		 }
		 System.out.print("al="+al);
		 for(int z=al.size()-1;z>=0;z--)
		 {
			 System.out.println(al.get(z));
		 }
		
		Iterator iterator;
		  iterator = ts.iterator();
		  System.out.print("Tree set data: ");
		  //Displaying the Tree set data
		  while (iterator.hasNext()){
		 // System.out.print(iterator.next() + " ");
			  Object obj=iterator.next();
			 hm.put(obj, 0);
			// hm.put(obj, 8);
		  }

		System.out.println("HM="+hm);
	   for(int i=0;i<s.length();i++)
	   {
		   char c=s.charAt(i);
		
		// System.out.println( hm.containsKey(c));
		 if(hm.containsKey(c))
		 {  System.out.println("Fallowing key is already present in hashmap="+c+"="+hm.containsKey(c));
			Object obj= (hm.get(c));
			//System.out.print(obj);
			int x=Integer.parseInt(obj.toString());
			x++;
			hm.put(c, x);
			
		 } else { System.out.println("Key is not present for first time="+c);
			 hm.put(c, 1); // If key is not present firsttime in map add key with 1 as count values
		 }
		 
	   
	   
	   }

	   
	   System.out.println("Fianl HashMap with Count="+hm);
	   
	   
	   Set set = hm.entrySet();	
	   Set  s1=hm.keySet();
	   System.out.println(s1);
	   v.add("a");
	   v.add("c");
	   v.add("b");
	   System.out.println(v);
	   //sort method of collections class cannot be used with set directly
	   Collections.sort(v);
	   System.out.println(v);
	   // We can't create an instances for interfaces directly like abstract class
	    // But we can provide refference to class like factory method which implement methods
//	   List testl=new List();
	   List test1=new ArrayList();
	//   List test2=new LinkedList();
	   List test3=new Vector();
	 //  List testl=new List();
	   //Collections.sort(s1);
	   Set s2=new TreeSet(s1);
	   System.out.println(s2);
	   
	//   Set s3=new SortedSet(s1);
	 //  System.out.println(s3);
	   Iterator i = set.iterator();	
	   while( i.hasNext() )
{			   Map.Entry me = (Map.Entry) i.next();		
            System.out.println(me.getKey() + " : " + me.getValue());
            
 }
	   
	
	 
	}
	
	
	

}
