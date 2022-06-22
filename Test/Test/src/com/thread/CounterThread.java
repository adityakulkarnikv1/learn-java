package com.thread;
public class CounterThread extends Thread{

    protected Counter counter = null;

    public CounterThread(Counter counter){
       this.counter = counter;
    }

    public void run() {
	for(int i=0; i<1000; i++){
		//System.out.println(Thread.currentThread().getName());
          counter.add(i);
       }
    }
 }
