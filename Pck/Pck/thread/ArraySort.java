package thread;
import java.util.Arrays;
public class ArraySort {
	public static void main(String args[]) throws Exception {
	    String[] a = new String[] { "A", "C", "B" };
	    Arrays.sort(a);
	    for (int i = 0, n = a.length; i < n; i++) {
	      System.out.println(a[i]);
	    }
	  }

}
