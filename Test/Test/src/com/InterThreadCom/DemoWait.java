package com.InterThreadCom;
public class DemoWait extends Thread{
	  int val=20;
	  public static void main(String args[])  {
	  DemoWait d=new DemoWait();
	  d.start();
	  new Demo1(d);
	  }
	  public void run(){
	  try  {
	  synchronized(this){
	  wait();
	  System.out.println("value is  :"+val);  
	  }
	  }catch(Exception e){}
	 }

	  public void valchange(int val){  
	  this.val=val;  
	  try  {
	  synchronized(this)  {
	  notifyAll(); 
	  }
	  }catch(Exception e){}

	  }
	}

