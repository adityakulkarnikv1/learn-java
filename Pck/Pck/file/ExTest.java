package file;

import java.io.*; 

class ExTest { 

   public static void main (String[] args) { 
      ExTest ex = new ExTest();
      ex.readMyFile(); 
   } 

   void readMyFile() { 

      DataInputStream dis = null; 
      String record = null; 
      int recCount = 0; 

      try { 

         File f = new File("fred.txt");  
         FileInputStream fis = new FileInputStream(f);  
         BufferedInputStream bis = new BufferedInputStream(fis);  
         dis = new DataInputStream(bis);  

         while ( (record=dis.readLine()) != null ) { 
         recCount++; 
            System.out.println(recCount + ": " + record); 
         } 

      } catch (IOException e) { 

	 //-----------------------------//
	 // output with e.getMessage()  //
	 //-----------------------------//
	 //
         // System.out.println("Got an IOException: " + 
         //                    e.getMessage()); 

	 //----------------------------------//
	 // output with e.printStackTrace()  //
	 //----------------------------------//

	 e.printStackTrace();

      } // end try/catch statement

   } // end readFile()

} 
