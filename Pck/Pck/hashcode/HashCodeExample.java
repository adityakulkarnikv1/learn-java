package hashcode;
import java.util.*;

public class HashCodeExample {


    public static void hashMapExample() {

        System.out.println("\nHashMap Example Method");
        System.out.println("======================\n");
        
        //construct a HashMap with default size and load factor
        HashMap table = new HashMap();

        String name;
        String key;

        // We want to map people with their social security numbers the 
        // key/value pair is ssn[i]/people[i]. Note that the value "Tom" appears
        // twice, but has different keys.
        String[] ssn = new String[5];
        ssn[0] = "00000";
        ssn[1] = "11111";
        ssn[2] = "22222";
        ssn[3] = "33333";
        ssn[4] = "44444";

        String[] people = new String[5];
        people[0] = "Tom";
        people[1] = "Jay";
        people[2] = "Pat";
        people[3] = "Meghan";
        people[4] = "Tom";


        // put() maps key/value pairs
        for (int i = 0; i < people.length; i++) {
            table.put(ssn[i],people[i]);
        }


        // Now return the name for social security number 11111 ...
        key = "11111";
        if (table.containsKey(key)) { 
            name = (String) table.get(key);
            System.out.println(key + " is mapped to " + name);
        } else {
            System.out.println(key + " not mapped.");
        }
    
        // What if the key didn't map in the table???
        key = "55555";
        if (table.containsKey(key)) { 
            name = (String) table.get(key);
            System.out.println(key + " is mapped to " + name);
        } else {
            System.out.println(key + " not mapped.");
        }

    }


    public static void testHashCodeOverride () {

        System.out.println("\nTesting Override hashCode() Method");
        System.out.println("==================================\n");

    
        HashPerson william = new HashPerson("Willy");
        HashPerson bill    = new HashPerson("Willy");


        // What hashCode() returns
        System.out.println("Hash code for william  = " + william.hashCode());
        System.out.println("Hash code for bill     = " + bill.hashCode());


        // map key william to "Silly"
        HashMap table = new HashMap();
        table.put(william,"Silly");

        if (table.containsKey(william )) {
            System.out.println(table.get(william));
        } else {
            System.out.println("Key " + william + " not found");
        }


        // Now look for the same key
        if (table.containsKey(bill)) {
            System.out.println(table.get(bill)); 
        } else {
            System.out.println("Key " + bill + " not found");
        }
    }


    public static void testHashCodeEqualsOverride() {

        System.out.println("\nRunning hashCode() and equals() Override");
        System.out.println("========================================\n");
        
        Team a = new Team("Eagles",6,2);
        Team b = new Team("Eagles",6,2);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if (a.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }




    public static void main(String[] args) {

        System.out.println("\nRunning several hashCode() implementations");
        System.out.println("==========================================\n");

        // Default hashCode() implementation
        Object someObject = new Object();
        System.out.println("Default hashCode() method        [Object]                 : " + someObject.hashCode());

        // Default hashCode() implementation
        HashCodeExample hce1 = new HashCodeExample();
        System.out.println("Default hashCode() method        [HashCodeExample]        : " + hce1.hashCode());

        // Default hashCode() implementation
        java.util.NoSuchElementException jay = new java.util.NoSuchElementException();
        System.out.println("Default hashCode() method        [NoSuchElementException] : " + jay.hashCode());

        // some objects choose to override hashCode()
        Integer one = new Integer(1);
        System.out.println("Classes that Override hashCode() [Integer]                : " + one.hashCode());

        // some overrides may even be negative
        java.awt.Color red = new java.awt.Color(0x44, 0x88, 0xcc);
        System.out.println("Negative Hash Codes              [Color]                  : " + red.hashCode());

        // Override the hashCode() method
        HashCodeExample2 hce2 = new HashCodeExample2();
        System.out.println("Override hashCode() method       [HashCodeExample2]       : " + hce2.hashCode());

        // Even if the default hashCode() method has been overridden in a class,
        // you can get the integer value to be returned by the default 
        // hashCode() by using:   System.identityHashCode(hce2)
        System.out.println("Call default hashCode() method   [HashCodeExample2]       : " + System.identityHashCode(hce2));

        // A HashMap Example
        hashMapExample();

        // Testing Overriding the hashCode() method
        testHashCodeOverride();

        // Testing Overriding the hashCode() and equals() method
        testHashCodeEqualsOverride();

        System.out.println();
        
    }

}
