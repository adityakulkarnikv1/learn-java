package com.thread;

public class Counter{
    
    long count = 0;
   
    public synchronized void add(long value){
    	System.out.println(Thread.currentThread().getName()+"==PRIORITY="+Thread.currentThread().getPriority()+"==add="+value);
      this.count += value;
    }
 }
