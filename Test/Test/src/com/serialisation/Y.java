package com.serialisation;
import java.io.*;
import java.lang.String; 
import java.io.Serializable;

class Y implements Serializable 
{  
	transient static String transientStaticVar;
    transient final String transientFinalVar; 
    transient static final String transientStaticFinalVar; 
    transient String transientVar = "transientVar";  
    static 
    {    transientStaticVar = "transientStaticVar";   
    	transientStaticFinalVar = "transientStaticFinalVar"; 
    }  
    {    transientFinalVar = "transientFinalVar"; 
    }
    }

