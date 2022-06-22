package com.hp;

public class SyncMethodsExample extends Thread {

	static String[] msg = { "Beginner", "java", "tutorial,", ".,", "com","is", "the", "best" };
	
	//static String[] msg = { "java", "tutorial","best","SHANKAR"," Rao", "Deshpan" };
	//static String[] msg = { "java","java1","java2","java3","java4","java5","java6","java7","java8","java9","java10"};
	public SyncMethodsExample(String id) {
		super(id);
	}
	static{
		System.out.println("in static bolck-Before main thread");
	}
	
	public static void main(String[] args) {
		
		System.out.println("in non static bolck-Before thread");
		
	//	SyncMethodsExample obj=new SyncMethodsExample("shankar");
		SyncMethodsExample thread1 = new SyncMethodsExample("thread1: ");
		SyncMethodsExample thread2 = new SyncMethodsExample("thread2: ");
		SyncMethodsExample thread3 = new SyncMethodsExample("thread3: ");
		SyncMethodsExample thread4 = new SyncMethodsExample("thread4: ");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		boolean t1IsAlive = true;
		boolean t2IsAlive = true;
		boolean t3IsAlive = true;
		boolean t4IsAlive = true;
		do {
			if (t1IsAlive && !thread1.isAlive()) {
				t1IsAlive = false;
				System.out.println("t1 is dead.");
			}
			if (t2IsAlive && !thread2.isAlive()) {
				t2IsAlive = false;
				System.out.println("t2 is dead.");
			}
			
			if (t3IsAlive && !thread3.isAlive()) {
				t3IsAlive = false;
				System.out.println("t3 is dead.");
			}
			if (t4IsAlive && !thread4.isAlive()) {
				t4IsAlive = false;
				System.out.println("t4 is dead.");
			}
		} while (t1IsAlive || t2IsAlive|| t3IsAlive|| t4IsAlive);
	}
	static{
		System.out.println("in static bolck-After thread");
	}
	
	
	//SynchronizedOutput.displayList1(getName(), msg);
	void randomWait() {
		try {
			Thread.currentThread().sleep((long) (3000 * Math.random()));
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
	}
	public synchronized void run() {
		//SynchronizedOutput.displayList(getName(), msg);
		//SynchronizedOutput.displayList(getName());
		SynchronizedOutput.displayList1(getName(), msg);
		
		
		//SynchronizedOutput.displayList2(getName(), msg);
	}
}

class SynchronizedOutput {

	static String s1="shankar";
    static String s="hi";	
    
	/*public static  void displayList(String name) {
	s1=	s1.replace('a','x');
		System.out.println(name+"=s1.hc="+s1.hashCode()+"=s1.chat="+s1.charAt(2)+"=s1+s="+s1+s);
	}*/
	// if the 'synchronized' keyword is removed, the message
	// is displayed in random fashion
	public static synchronized  void displayList(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			SyncMethodsExample t = (SyncMethodsExample) Thread
					.currentThread();
			//t.randomWait();
			System.out.println("static-sync=DL="+name + list[i]);
		}
		
			
	}
	
	static int x=1,y=2;
	public static   void displayList1(String name, String list[]) {
		//synchronized(SynchronizedOutput.class)
	
		//synchronized(obj)
		//synchronized(SyncMethodsExample.class)
		
		{
		for (int i = 0; i < list.length; i++) {
			SyncMethodsExample t = (SyncMethodsExample) Thread
					.currentThread();
		//	t.randomWait();
			System.out.println("static-non sync=DL1="+name + list[i]);
		}
		}
	}
	
	public static synchronized   void displayList2(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			SyncMethodsExample t = (SyncMethodsExample) Thread
					.currentThread();
			t.randomWait();
			System.out.println("Static- sync=DL2="+name + list[i]);
		}
	}
}