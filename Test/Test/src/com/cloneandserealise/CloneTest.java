package com.cloneandserealise;

/**
 * This class demonstrates the clone (shallow copy)
 * by using the Value object.
 * @author nasir.ahamed
 */
public class CloneTest {

    public CloneTest() {

    }

    public void cloneTest() {
        TestValueObject originalObject = new TestValueObject();
        // print the original Object
        System.out.println("Original Object");
        originalObject.print();
        System.out.println("\n");

        // get a cloned object by using clone method.
        TestValueObject clonedObject = (TestValueObject) originalObject.clone();
        System.out.println("Cloned Object");
        clonedObject.print();
        System.out.println("\n");

        // changing the primitive value of original object
        // which will not reflect on cloned object
        // the same is for vice-versa
        System.out.println("After changing Original Objects int value");
        originalObject.setIntValue(20);
       System.out.println("Original Object");
        originalObject.print();
        System.out.println("Cloned Object");
        clonedObject.print();
        System.out.println("\n");

        // changing the String(as it is immutable object, the
        // same concept for Wrapper classes even) value in original object
        //will not reflect in the cloned object and vice-versa
        System.out.println("After changing Original Objects String value");
        originalObject.appendStringValue("World");
        System.out.println("Original Object");
        originalObject.print();
        System.out.println("Cloned Object");
        clonedObject.print();
        System.out.println("\n");

        // changing the StringBuffer value for original object
        // will definitely reflect on the cloned Object and vice-versa
        System.out.println("After changing Original Objects StringBuffer value");
        originalObject.appendStringBuffer("World");
        System.out.println("Original Object");
        originalObject.print();
        System.out.println("Cloned Object");
        clonedObject.print();
        System.out.println("\n");

        // the same with Arraylist. Just for a change
        // changing the cloned object.
        System.out.println("After changing Cloned Objects ArrayList value");
        clonedObject.addValueToList("Hello2");
        System.out.println("Original Object");
        originalObject.print();
        System.out.println("Cloned Object");
        clonedObject.print();
        System.out.println("\n");
    }

    public static void main(String arg[]) {
        CloneTest instance = new CloneTest();
        instance.cloneTest();
    }
}
