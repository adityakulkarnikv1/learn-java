package com.InterThreadCom;

class Consumer extends Thread{
	  Shared s;
	  int j;
	 // Consumer(Shared s,int x) {
   Consumer(Shared s) {
	  this.s=s;
	 // this.j=x;
	  this.start();
	  }

	  public void run() {
	 // s.get();
	  }
	}

