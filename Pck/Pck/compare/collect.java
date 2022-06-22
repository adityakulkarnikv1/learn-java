package compare;
import java.util.*;

class Comparer implements Comparator {
        public int compare(Object obj1, Object obj2)
        {
                int i1 = ((Integer)obj1).intValue();
                int i2 = ((Integer)obj2).intValue();
 System.out.println("i1="+i1+"=i2="+i2+"=="+(Math.abs(i1) - Math.abs(i2)));
                return Math.abs(i1) - Math.abs(i2);
        }
}

public class collect {
        public static void main(String args[])
        {
                Vector vec = new Vector();

                vec.addElement(new Integer(-200));
                vec.addElement(new Integer(100));
                vec.addElement(new Integer(400));
                vec.addElement(new Integer(-300));
/*
                Collections.sort(vec);
                for (int i = 0; i < vec.size(); i++) {
                        int e=((Integer)vec.elementAt(i)).intValue();
                        System.out.println(e);
                }
*/
                Collections.sort(vec, new Comparer());
                for (int i = 0; i < vec.size(); i++) {
                        int e=((Integer)vec.elementAt(i)).intValue();
                        System.out.println(e);
                }
        }
}
