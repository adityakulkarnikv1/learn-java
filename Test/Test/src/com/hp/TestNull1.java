package com.hp;

public class TestNull1 {
    void print(StringBuffer sb) {
        System.out.println("void print(StringBuffer sb)");
    }
    void print(String s) {
        System.out.println("void print(String s)");
    }
	
    public static void main(String[] args) {
        new TestNull1().print(null);
    }


}

/*
This example results in a compiler error, as expected. Again, a null reference can be converted to any type of object.
 Therefore, calling print(null) could potentially invoke either print(String s) or print(StringBuffer sb).
  The both of String and StringBuffer are a subtype of Object, a String cannot be converted to a StringBuffer,
   nor can a StringBuffer can be converted to a String (since neither extends the other).
    It's not possible to identify a most-specific method from among the applicable methods, 
    because there are two maximally specific method declarations.  
    So the method invocation is ambiguous, and a compile-time error occurs.
*/