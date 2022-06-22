package com.cloneandserealise;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class CloningExample implements Cloneable {

    private LinkedList names = new LinkedList();


    public CloningExample() {
        names.add("Alex");
        names.add("Melody");
        names.add("Jeff");
    }


    public String toString() {
        StringBuffer sb = new StringBuffer();
        Iterator i = names.iterator();
        while (i.hasNext()) {
            sb.append("\n\t" + i.next());
        }
        return sb.toString();
    }


    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error("This should not occur since we implement Cloneable");
        }
    }


    public Object deepClone() {
        try {
            CloningExample copy = (CloningExample)super.clone();
            copy.names = (LinkedList)names.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new Error("This should not occur since we implement Cloneable");
        }
    }

    public boolean equals(Object obj) {

        /* is obj reference this object being compared */
        if (obj == this) {
            return true;
        }

        /* is obj reference null */
        if (obj == null) {
            return false;
        }

        /* Make sure references are of same type */
        if (!(this.getClass() == obj.getClass())) {
            return false;
        } else {
            CloningExample tmp = (CloningExample)obj;
            if (this.names == tmp.names) {
                return true;
            } else {
                return false;
            }
        }
        
    }
    

    public static void main(String[] args) {

        CloningExample ce1 = new CloningExample();
        System.out.println("\nCloningExample[1]\n" + 
                           "-----------------" + ce1);

        CloningExample ce2 = (CloningExample)ce1.clone();
        System.out.println("\nCloningExample[2]\n" +
                           "-----------------" + ce2);

        System.out.println("\nCompare Shallow Copy\n" +
                           "--------------------\n" +
                           "    ce1 == ce2      : " + (ce1 == ce2) + "\n" +
                           "    ce1.equals(ce2) : " + ce1.equals(ce2));

        CloningExample ce3 = (CloningExample)ce1.deepClone();
        System.out.println("\nCompare Deep Copy\n" +
                           "--------------------\n" +
                           "    ce1 == ce3      : " + (ce1 == ce3) + "\n" +
                           "    ce1.equals(ce3) : " + ce1.equals(ce3));

        System.out.println();

    }

}


