package com.InterThreadCom;


public class InterThread{
	  public static void main(String[] args) 
	  {
	  Shared s=new Shared();
	  for(int i=0;i<10;i++)
	  {
	  new Producer(s,i);
	 // new Consumer(s,i);
	  new Consumer(s);
	  }
	  }
	} 