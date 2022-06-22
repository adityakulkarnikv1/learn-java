package com.InterThreadCom;


class Producer extends Thread {
	  Shared s;
	  int j;
	  Producer(Shared s,int x) {
	  this.s=s;
	  this.j=x;
	  this.start();
	  
	  }

	  public void run() {
	 // int i=0;
	 // s.put(++j);
	  
	 // s.put(++i);
	  }
	}

