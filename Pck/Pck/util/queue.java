package util;

public class queue{
	   private int maxQueue;
	   private int emptyQueue;
	   private int top;
	   private Object[] items;
	   public queue(int size) {
	      maxQueue= size;
	      emptyQueue = -1;
	      top = emptyQueue;
	      items = new Object[maxQueue];
	   }

	   

	   public void enque(Object c) {
	      items[++top] = c;
	      System.out.println("Pushing element into Queue="+c);
	   }

	   public Object deque() {
		   Object obj=items[0];
		   Object[] newarr=new Object[items.length-1];
		   int length=items.length-1;
		   System.arraycopy(items, 1, newarr, 0, length);
		  /* for (int i = 0; i < newarr.length; i++) {
			System.out.println("newarr="+newarr[i]);
		}*/
		   System.arraycopy(newarr, 0, items, 0, length);
		   System.out.println("Removing element from Queue="+obj);
	      return obj;
	   }

	   public boolean full()  {
	      return top + 1 == maxQueue;
	   }

	   public boolean empty()  {
	      return top == emptyQueue;
	   }
	}
