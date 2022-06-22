package compare;
import java.util.ArrayList;
import java.util.Comparator;
public class CompositeComparator implements Comparator {
  private Comparator major;
  private Comparator minor;
  public CompositeComparator(Comparator major, Comparator minor) {
    this.major = major;
    this.minor = minor;
  }
  public int compare(Object o1, Object o2) {
    int result = major.compare(o1,o2);
    if (result != 0) {
      return result;
    } else {
      return minor.compare(o1,o2);
    }
  }
  
  public static void main(String arg[])
  {
	  Person p1=new Person("Shankar","rao");
	  Person p2=new Person("Rajini","deshp");
	  ArrayList ar=new ArrayList();
	  ar.add(p1);
	  ar.add(p2);
	  java.util.Collections.sort(ar, new CompositeComparator(first,last));

  }
}
