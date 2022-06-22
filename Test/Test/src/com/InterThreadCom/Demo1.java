package com.InterThreadCom;

class Demo1 extends Thread{
	  DemoWait d;
	  Demo1(DemoWait d)  {
	  this.d=d;
	  start();
	  }
	  public void run(){
	 try{
	  System.out.println("Demo1 value is"+d.val);
	  d.valchange(40);
	  }catch(Exception e){}
	  }
	} 