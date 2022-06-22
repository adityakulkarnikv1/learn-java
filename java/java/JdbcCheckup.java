/*
 * This sample can be used to check the JDBC installation.
 * Just run it and provide the connect information.  It will select
 * "Hello World" from the database.
 */

// You need to import the java.sql package to use JDBC
import java.sql.*;
import java.math.*;
// We import java.io to be able to read from the command line
import java.io.*;

class JdbcCheckup
{
  public static void main (String args [])
       throws SQLException, IOException
  {
	  try{
    // Load the Oracle JDBC driver
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		  System.out.println ("driver connecting.");
	//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   //Class.forName("oracle.jdbc.driver.OracleDriver");
   //System.out.println ("driver connected");
		  // Prompt the user for connect information
	 
    System.out.println ("Please enter information to test connection to the database");
    String user;
    String password;
    String database;

    user = readEntry ("user: ");
    int slash_index = user.indexOf ('/');
    if (slash_index != -1)
    {
      password = user.substring (slash_index + 1);
      user = user.substring (0, slash_index);
    }
    else
      password = readEntry ("password: ");
    database = readEntry ("database (a TNSNAME entry): ");

    System.out.print ("Connecting to the database...");
    System.out.flush ();

    System.out.println ("Connecting...");
    Connection conn = 
    DriverManager.getConnection ("jdbc:oracle:oci8:@" + database,
           user, password);
	//DriverManager.getConnection("jdbc:odbc:pp");

    System.out.println ("connected.");

    // Create a statement
	System.out.println ("creating statement.");
    Statement stmt = conn.createStatement ();
	System.out.println ("sql completed.");
    // Do the SQL "Hello World" thing
    ResultSet rset = stmt.executeQuery ("select * from tab");

    while (rset.next ())
      System.out.println (rset.getString (1));

    System.out.println ("Your JDBC installation is correct.");

    // close the resultSet
    rset.close();

    // Close the statement
    stmt.close();

    // Close the connection
    conn.close();
  }catch(Exception e)
	  {}
 }
	  
  // Utility function to read a line from standard input
  static String readEntry (String prompt)
  {
    try
    {
      StringBuffer buffer = new StringBuffer ();
      System.out.print (prompt);
      System.out.flush ();
      int c = System.in.read ();
      while (c != '\n' && c != -1)
      {
        buffer.append ((char)c);
        c = System.in.read ();
      }
      return buffer.toString ().trim ();
    }
    catch (IOException e)
    {
      return "";
    }
  }
}
