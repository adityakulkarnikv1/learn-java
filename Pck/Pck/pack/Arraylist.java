package pack;
import java.util.*;
public class Arraylist {
	private int id;
	private String str;
	public Arraylist(int i,String s){
		this.id=i;
		this.str=s;		
	}

	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(new Arraylist(1,"shankar"));
		al.add(new Arraylist(2,"shankar1"));
		al.add(new Arraylist(3,"shankar2"));
		al.add(new Arraylist(4,"shankar3"));
		
		for (int i=0;i<al.size();i++){
			Arraylist o=(Arraylist)al.get(i);
			System.out.print("id="+o.id);
			System.out.println("Str="+o.str);
		}
		
		LinkedList ll=new LinkedList();
		ll.add(new Arraylist(1,"shankar"));
		ll.add(new Arraylist(2,"shankar1"));
		ll.add(new Arraylist(3,"shankar2"));
		ll.add(new Arraylist(4,"shankar3"));
		
		System.out.println(ll);
		for (int i=0;i<al.size();i++){
			//Arraylist o=(Arraylist)al.get(i);
			System.out.print("id="+al.get(i));
			//System.out.println("Str="+o.str);
		}
		
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			Object elm=it.next();
			System.out.println("Element="+elm);
		}
		
		
	}
	
}
