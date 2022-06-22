package compare;
import java.util.Comparator;
public class BeanPropertyComparator implements Comparator {
  private String property;
  private Comparator comparator;
  public BeanPropertyComparator(String property, Comparator comparator) {
    this.property = property;
    this.comparator = comparator;
  }
  public int compare(Object bean1, Object bean2) {
    // Get the value of the properties
    Object value1 = BeanPropertyUtil.getProperty(property,bean1);
    Object value2 = BeanPropertyUtil.getProperty(property,bean2);
    return comparator.compare(value1,value2);
  }
}
