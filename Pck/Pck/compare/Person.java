package compare;

public class Person {
	  private String first;
	  private String last;
	  public Person(String first, String last) {
	    this.first = first;
	    this.last = last;
	  }
	  public String getFirst() {
	    return first;
	  }
	  public String getLast() {
	    return last;
	  }
	  public String toString() {
	    return last + ", " + first;
	  }
	}
