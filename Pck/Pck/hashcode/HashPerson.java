package hashcode;
/**
* This class overrides the hashCode() method. It also overrides equals().
*/    
class HashPerson {

   private static final int HASH_PRIME = 1000003;

   public HashPerson(String name) {
       this.name = name;
   }

   public String toString() {
       return name;
   }

   /**
    * This overrides equals() from java.lang.Object
    */
   public boolean equals(Object rhs) {
       // first determine if they are the same object reference
       if (this == rhs)
           return true;

       // make sure they are the same class
       if (rhs == null || rhs.getClass() != getClass())
           return false;

       // ok, they are the same class. Cast rhs to HashPerson
       HashPerson other = (HashPerson)rhs;

       // our test for equality simply checks the name field
       if (!name.equals(other.name)) {
           return false;
       }

       // if we get this far, they are equal
       return true;
   }


   /**
    * Simple hashCode() implementation
    */
   public int hashCode() {

       int result = 0;
       result = HASH_PRIME * result + name.hashCode();
       return result;

   }

   private String name;

}