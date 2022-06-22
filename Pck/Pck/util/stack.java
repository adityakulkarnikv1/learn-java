package util;

public class stack {
	   private int maxStack;
	   private int emptyStack;
	   private int top;
	   private Object[] items;
	   public stack(int size) {
	      maxStack= size;
	      emptyStack = -1;
	      top = emptyStack;
	      items = new Object[maxStack];
	   }

	   

	   public void push(Object c) {
	      items[++top] = c;
	      System.out.println("Pushing element into stack="+c);
	   }

	   public Object pop() {
		   Object obj=items[top--];
		   System.out.println("Removing element from stack="+obj);
	      return obj;
	   }

	   public boolean full()  {
	      return top + 1 == maxStack;
	   }

	   public boolean empty()  {
	      return top == emptyStack;
	   }
	}
