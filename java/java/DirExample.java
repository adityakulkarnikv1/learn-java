import java.io.*;
public class DirExample {
public static void main(String args[ ]) {
String filename = args[0];
try {
File file = new File(filename);
String names[] = file.list();
for(int i=0;i<names.length;i++) {
	System.out.println("File name : " +names[i]);} 

}
catch(Exception err) {
System.out.println("Exception in accessing file");
} 
}
 }
