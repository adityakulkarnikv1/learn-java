package com.thread;
public class Example {

    public static void main(String[] args){
      Counter counter = new Counter();
      Counter counter1 = new Counter();
            
      Thread  threadA = new CounterThread(counter);
      Thread  threadB = new CounterThread(counter);
    //  Thread  threadB = new CounterThread(counter1);
      threadA.setName("THREADA");
      threadB.setName("THREADB");
      //threadA.setPriority(Thread.MIN_PRIORITY);
     // threadB.setPriority(Thread.MAX_PRIORITY);
      threadA.start();
      threadB.start(); 
    }
  }
