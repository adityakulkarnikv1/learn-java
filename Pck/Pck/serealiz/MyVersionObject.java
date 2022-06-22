package serealiz;

import java.io.*;

public class MyVersionObject implements Serializable {
  static final long serialVersionUID = 1L;
  private int i;
  private String s;

  //  Uncomment the next two lines to verify that default values will be substituted if
  //  the value is not present in the stream at deserialization time.
  //  private int i2 = -1; private String s2 = "This is the new String field";

  MyVersionObject() {
    i = 512;
    s = new String( "Instance of MyVersionObject..." );
  }

  public int getI() {
    return i;
  }

  public String getS() {
    return s;
  }
}
