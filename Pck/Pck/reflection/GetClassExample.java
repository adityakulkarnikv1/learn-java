package reflection;

import java.lang.reflect.Modifier;

public class GetClassExample
{
   public static void main(String[] args)
   {
 
      Employee employee = new Employee();
      
      Class klass = employee.getClass();
      
     
      
      System.out.println( "Class name: " + klass.getName());
      System.out.println( "Class super class: " + klass.getSuperclass());
      
      
      int mods = klass.getModifiers();
      System.out.println( "Class is public: " + Modifier.isPublic(mods));
      System.out.println( "Class is final: " +  Modifier.isFinal(mods));
      System.out.println( "Class is abstract: " + Modifier.isAbstract(mods)); 
      
      System.out.println( " getCanonicalName ="+klass.getCanonicalName());
      System.out.println("getSimpleName="+klass.getSimpleName());
      System.out.println("isInterface="+klass.isInterface());
      System.out.println("isLocalClass="+klass.isLocalClass());
      System.out.println("getClassLoader="+klass.getClassLoader());
      System.out.println("getComponentType="+klass.getComponentType());
      System.out.println("getDeclaredMethods="+klass.getDeclaredMethods());
      System.out.println("getDeclaringClass="+klass.getDeclaringClass());
      System.out.println("getEnclosingMethod="+klass.getEnclosingMethod());

   }

}