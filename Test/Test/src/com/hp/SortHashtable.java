package com.hp;

import java.util.Hashtable;
import java.util.Vector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;


public class SortHashtable {

  public static void main(String[] args) {
    // Create and populate hashtable
	  
	  final  Vector t=new Vector();
	Vector t1=new Vector();
	t.add("a");
	t.add("b");
	//t1.add("c");
	t=t1;
	t1=t;
	System.out.println("t="+t+" t1="+t1);
	  
    Hashtable ht = new Hashtable();
    ht.put("ABC", "abc");
    ht.put("XYZ", "xyz");
    ht.put("MNO", "pqo");
    ht.put("MNO", "");
    ht.put("","asd" );    
    ht.put("","ass" );
   //ht.put(null,"sad" );
  // ht.put("asd",null );
  // ht.put(null,null);
    // Sort hashtable.
    Vector v = new Vector(ht.keySet());
  //  Collections.sort(v);
    
    
    // Display (sorted) hashtable.
    for (Enumeration e = v.elements(); e.hasMoreElements();) {
      String key = (String)e.nextElement();
      String val = (String)ht.get(key);
      System.out.println("Key: " + key + "     Val: " + val);
    }
  HashMap hm=new HashMap();
  hm.put("b","1");
  hm.put("","d");
  hm.put("b","2");
  hm.put(null,"a");
  hm.put("c", null);
  hm.put(null,null);
  Vector v1=new Vector(hm.keySet());
//  Enumeration e1=v1.elements();
  System.out.println("in Hash map");
  for (Enumeration e1 = v1.elements(); e1.hasMoreElements();) {
      String key = (String)e1.nextElement();
      String val = (String)hm.get(key);
      System.out.println("Key: " + key + "     Val: " + val);
    }
  
  
  HashSet hs=new HashSet();
  hs.add("1");
  hs.add("");
  
  }
  
}
