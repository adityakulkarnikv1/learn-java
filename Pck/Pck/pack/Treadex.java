package pack;

import pack.State;

public class Treadex extends Thread {
	State s;
	public Treadex(State s) { this.s = s; }
	public void run() {
		int y = s.cnt;
		s.cnt = y + 1;
		}
		public void main(String args[]) {
		State s = new State();
		Treadex thread1 = new Treadex(s);
		Treadex thread2 = new Treadex(s);
		thread1.start(); thread2.start();
		}
		

}
