package pack;

import java.util.*;

public class Hashmap
{
    static final int ITER = 2;
 
    static void doHash (Map t)throws NullPointerException
        {
        for (int i=0; i<ITER; ++i)
            {
            Integer in = new Integer(i);
             t.put(in,in);
             System.out.println("after putting="+i);
            }
        for (int i=0; i<ITER; ++i)
            {
            Integer in = new Integer(i);
            Object o = t.get(in);
            System.out.println("while getting="+i+"=="+o.toString());
            if (!(o instanceof Integer)) // Do something with the result
                 System.out.println(i+" wasn't an Integer");
            }
        }
 
 
    public static void main (String[] argv)
        {
        // Warm up hotspot
       // for (int i=0; i<1; ++i)
           // {
          //  doHash(new Hashtable());
           // doHash(new HashMap());
            //}
 
        // Time the calls
        for (int i=0; i<3; ++i)
            {System.out.println("in main loop="+i);
            Map t = new Hashtable();
            long start = System.currentTimeMillis();
            try{
            doHash(t);
            System.out.println("Hashtable "+(System.currentTimeMillis()-start));
            }catch(Exception e)
            {
            	System.out.println("Exception-Hashtable="+e.getMessage());
            }
            t = new HashMap();
            start = System.currentTimeMillis();
            try{doHash(t);
            System.out.println("HashMap "+(System.currentTimeMillis()-start));
            }catch(Exception e)
            {
            	System.out.println("Exception-HashMap="+e.getMessage());
            }
            start = System.currentTimeMillis();
            try{           	
            
            //doHash(null);
            System.out.println("null "+(System.currentTimeMillis()-start));
            }
            catch(NullPointerException e)
            {
            	System.out.println("in NullPointerException-null="+e.getMessage());
            }catch(Exception e)
            {
            	System.out.println("Exception-null="+e.getMessage());
            }
            }
        }
    }

