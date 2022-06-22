package com.serialisation;
import java.io.*;
class X implements Serializable
{
	transient static String transientStaticVar = "transientStaticVar";
	transient final String transientFinalVar = "transientFinalVar"; 
	transient static final String transientStaticFinalVar        = "transientStaticFinalVar"; 
	transient String transientVar = "transientVar";
	}