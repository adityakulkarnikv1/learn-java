package mulcls;
public class Nest {
    
    private  static String var = "foo";
    
    private static class Nested {
        public Nested() {
        	Nest n=new Nest();
        var = "bar";
        
            System.out.println("VAR="+var);
        }
    } 
    
    public static void main(String agr[])
    {
    	Nested ns=new Nested();
    	
    //	Nest n2=new Nested(); //Compilation err
    	
    	//Nested n3=new Nest();
    	
    	Nest n1=new Nest();
    	//Nested n2=n1.new Nested();
    	
    }
} 
