package com.serialisation;
import java.io.*;

class SpecialSerial implements Serializable
{
transient int y=7;
static int z =9;
transient String s1="shankar";
static String s2 ="rao";
transient String s3=new String("shankar");
static String s4 =new String("rao");
}


