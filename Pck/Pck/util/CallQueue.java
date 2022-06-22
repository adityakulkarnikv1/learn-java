package util;

public class CallQueue {
public static void main(String[] args) {
	queue q=new queue(5);
	q.enque("r");
	q.enque("b");
	q.deque();
	q.enque("x");
	q.deque();
	queue1 q1=new queue1();
	q1.enqueue("1");
	q1.enqueue("2");
	q1.enqueue("5");
	q1.dequeue();
	q1.dequeue();

	queue2 q2=new queue2();
	q2.enqueue("s");
	q2.enqueue("h");
	q2.enqueue("a");
	q2.dequeue();
	q2.dequeue();
	
}
}
