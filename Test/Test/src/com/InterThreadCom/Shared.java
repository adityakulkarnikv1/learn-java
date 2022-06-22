package com.InterThreadCom;

class Shared {

	int num=0;
	boolean value = false;
	  
	synchronized int get() {
	  if (value==false) 
	  try {
	  wait();
	  }
	  catch (InterruptedException e) {
	  System.out.println("InterruptedException caught");
	  }
	System.out.println("consume: " + num);
	value=false;
	notify();
	return num;
	}

	synchronized void put(int num) {
	  if (value==true) 
	  try {
	  wait(100000000000l);
	  }
	  catch (InterruptedException e) {
	  System.out.println("InterruptedException caught");
	  }
	  this.num=num;
	  System.out.println("Produce: " + num);
	  value=false;
	  notify();
	  }
	  }

