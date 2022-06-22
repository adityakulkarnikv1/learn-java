class FirstThread extends Thread {
public void run() {
 for(int i=0;i<1000;i++) {
System.out.println("In First Thread"+i); }
}
}
class SecondThread extends Thread {

public void run() {
 for(int i=10;i<20;i++) {
System.out.println("In Second Thread "+i); }
}
}



public class ThreadExample {
public static void main(String arg[]) {
FirstThread ft=new FirstThread();
SecondThread st=new SecondThread();
ft.setPriority(10);
st.setPriority(10);
st.start();
ft.start();
} } 

