package com.hp;

public class Overload extends Base {
	public int m1(int i,boolean x){
		System.out.println("in Overload int");
		return i;
	}
	public void m1(int i){
		System.out.println("in Overload void");
		//return i;
	}
	
	public int m1(int i,String z){
		System.out.println("in Overload int");
		return i;
	}
	
	
	public String m1(int i,int x){
		System.out.println("in Overload int");
		return "sds";
	}
	
/*	public void m1(int i){
		System.out.println("in Overload void");
	}*/
	public static void main(String args[])
	{
		Base b=new Base();
		b.m1(2);
		Overload o=new Overload();
		o.m1(1);
		Base b1=new Overload();
		b1.m1(3);
		
		//Overload b2=new Base();
		
	}

}
