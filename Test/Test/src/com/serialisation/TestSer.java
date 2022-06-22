package com.serialisation;

import java.io.*;


public class TestSer
{
    public static void main (String[] args)
    {
      SpecialSerial s=new SpecialSerial();
      try
        {
        ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream("c:\\serialiseobject.text"));
        os.writeObject(s);
        os.close();
        System.out.println(s.y + " " +s.z+" "+s.s1+" "+s.s2+" "+s.s3+" "+s.s4);
        s.z=10; // imp scenario
        //Q1: Why is the transient variable zero after deserialization?
        //To serialize an object, the marker interface "Serializable" is implemented. One consequence is, that the constructor of your class "SpecialSerial" will not run in the deserialization process. And so there will be no seven assignet to 
        s.y=5;
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("c:\\serialiseobject.text"));
        SpecialSerial s2= (SpecialSerial)is.readObject();
        is.close();
        System.out.println(s2.y + " " +s2.z+" "+s2.s1+" "+s2.s2+" "+s2.s3+" "+s2.s4);
         }catch(Exception x)
         { 
        	 System.out.println("exc");
        }
     }
}

