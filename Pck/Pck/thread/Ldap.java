package thread;

//import javax.ejb.*;
import javax.rmi.*;

import java.rmi.RemoteException;

//import weblogic.jndi.Environment;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Hashtable;
import java.sql.*;
//import java.lang.*;
import java.net.*;
import java.sql.Types.*;
import java.sql.SQLException;

import javax.naming.*;
import javax.naming.directory.*;

//import com.qwest.app.mcar.util.*;

//import com.qwest.app.frw.util.FRWDateObject;
//import com.qwest.app.frw.util.FRWStringUtility;

//import com.qwest.app.frw.request.*;
//import com.qwest.app.frw.process.ProcessInitiator;

//import com.qwest.app.qt.ejb.session.quotamanager.*;

//import com.qwest.app.hm.util.*;
//import com.qwest.app.hm.common.DataBean;

//import com.qwest.app.hm.exception.*;
//import com.qwest.app.hm.common.*;

//import com.qwest.app.hm.ejb.session.hmmanager.*;

// FileAppender and Logger
//import org.apache.log4j.*;


public class Ldap
{

   /* Ldap Info: 

      givenname                = First Name
      sn                       = Last Name
      st                       = State Code
      l                        = City Name
      postalcode               = Zip Code
      rc                       = Responsibility code
   */

   String[] str = {"givenname", "sn", "st", "l","postalcode", "telephonenumber", "rc" }; 


   public void call_ldap()
   {
      System.out.println("==call_ldap"); 

      // Ldap Environments

      System.out.println("---Ldap Environments"); 

      Hashtable env = new Hashtable();

      env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");

      env.put(Context.PROVIDER_URL, "ldaps://ldap.qintra.com:1636" );

      env.put(Context.SECURITY_PROTOCOL, "ssl");

      env.put("java.naming.ldap.factory.socket", "weblogic.security.SSL.SSLSocketFactory");


      /* LDAP variables -- See ccshm web.xml

         String appCuid       = (String) pm.getPropertyValue("LDAP_CUID");
         String appPassword   = (String) pm.getPropertyValue("LDAP_PWD");
         String ldapSSLServer = (String) pm.getPropertyValue("LDAP_SERVER");
         String appUserProvider  = (String) pm.getPropertyVal
      */

      System.out.println("---Ldap variables"); 

      String appCuid = "Hierop";
      String appPassword = "Sulwp129";
      String ldapSSLServer = "ldaps://ldap.qintra.com:1636";
      String appUserProvider = "ou=people,dc=mnet,dc=qintra,dc=com";

      String appDN = "uid="+appCuid+","+appUserProvider;

      System.out.println("---appDN: "+appDN); 

      DirContext ctx = null;
      SearchControls searchControls = new SearchControls();

      try
      {

         ctx = new InitialDirContext(env);
         System.out.println("---1 try"); 

         ctx.addToEnvironment(Context.SECURITY_AUTHENTICATION, "simple") ;
         System.out.println("---2 try"); 

         ctx.addToEnvironment(Context.SECURITY_PRINCIPAL, appDN);
         System.out.println("---3 try"); 

         ctx.addToEnvironment(Context.SECURITY_CREDENTIALS, appPassword) ;

         // Search Ldap

         searchControls.setReturningAttributes(str);
         searchControls.setSearchScope(searchControls.SUBTREE_SCOPE);

         String cuId = "NGUYENG";
         //String cuId = "JROCONN";
         String userFilter = "uid="+cuId;

         System.out.println("---userFilter: "+userFilter); 

         NamingEnumeration results = ctx.search(appUserProvider, userFilter, searchControls);

         String attributeId = null;
         String attributeValue = null;
         int employeeId = 0;


         if (!results.hasMore())
         {
            System.out.println("---CUID not found: "+userFilter); 
            // Throwing an exception as when the entry is not found, the search method doesn't throw Naming exception
            throw new NamingException("CUID Not Found In LDAP");
         }
         else
         {
            System.out.println("---CUID found: "+userFilter); 


            SearchResult sr = (SearchResult) results.next();
            Attributes answer = sr.getAttributes();

            for (NamingEnumeration ae = answer.getAll(); ae.hasMore();)
            {
                Attribute attribute = (Attribute) ae.next();
                attributeId = attribute.getID();

                //System.out.println("----Info: " + attributeId);

                for (NamingEnumeration e=attribute.getAll(); e.hasMore();)
                {
                    attributeValue = (String) e.next();

                    System.out.println("---- "+attributeId+": "+attributeValue);
                }

            }
         }
      }
      catch (NamingException ne)
      {
         System.err.println("-NamingException: " + ne.toString());
      }

      System.out.println("---End-call_ldap"); 

   } // call_ldap


   //-------------------------------------------------
   public static void main(String args[])
   {
      System.out.println("==ldap-main=="); 

      try
      {
         Ldap ldap = new Ldap();
         ldap.call_ldap();
      }
      catch (Throwable t)
      {
         System.err.println("==Throwable-EX: "+t.toString()); 
      }

   }

} // End Main 
