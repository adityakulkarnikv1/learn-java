package com.cloneandserealise;

import java.util.ArrayList;

/**
 * This class acts like a value object containing the properties
 * of a primitive data type (int), an immutable object (String),
 * and two mutable objects(StringBuffer and ArrayList).
 * @author nasir.ahamed
 */

public class TestValueObject implements Cloneable{

    private int primitiveValue = 10;

    private String stringValue = "Hello";

    private StringBuffer stringBuffer = null;

    private ArrayList list = null;

    public TestValueObject() {
        list = new ArrayList();
        list.add("Hello");
        list.add("Hello1");
        stringBuffer = new StringBuffer("Hello");
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void print() {
        System.out.print("Primitive value is: " + primitiveValue);
        System.out.print("\tString value is: " + stringValue);
        System.out.print("\tStringBuffer value is: " + stringBuffer.toString());
        System.out.println("\tList value is: " + list);
    }

    public void setIntValue(int value) {
        primitiveValue = value;
    }

    public void appendStringValue(String append) {
        // can append normally like stringValue = stringValue + append
        stringValue = stringValue.concat(append);
    }

    public void appendStringBuffer(String append) {
        stringBuffer.append(append);
    }

    public void addValueToList(String value) {
        list.add(value);
    }
}
