package serealiz;
import java.io.*;

public class MyInternalObject implements Serializable {
  private int i;
  private String s;

  MyInternalObject() {
    i = 128;
    s = new String( "Instance of MyInternalObject..." );
  }
  public int getI() {
    return i;
  }

  public String getS() {
    return s;
  }
}
