package java;

import java.util.Vector;
import java.io.*;

public class ReadItems {
	
	Vector Itemv=new Vector();
	String str;
	
	public Vector Read() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do{
			SalesTaxBean stb=new SalesTaxBean();
			
			System.out.println("Enter the Item name");
			
			String itmnm=br.readLine();
			
			System.out.println("Enter price of "+itmnm);
			
			String pr=br.readLine();
			
			double price=Double.parseDouble(pr);
			
			System.out.println("Enter the quantity of "+itmnm+" Purchased");			
			String qt=br.readLine();
			
			int qty=Integer.parseInt(qt);
			
			System.out.println("Wheather"+itmnm+"is imported ?");
			
			String imptd=br.readLine();
			
			System.out.println("Wheather"+itmnm+"is food product?");
			
			String fodprd=br.readLine();
			 
			stb.setItem(itmnm);
			stb.setPrice(price);
			stb.setQuantity(qty);
			stb.setImported(imptd);
			stb.setFoodProd(fodprd);
			Itemv.add(stb);
			stb=null;
			System.out.println("Enter quit to exit or Any other to continue");
			
			 str=br.readLine();
			
		  }while(!str.equalsIgnoreCase("quit"));
			
		return Itemv;	
		
	}
	
	
	
	
	public static void main(String  arg[])
	{
		ReadItems ri=new ReadItems();
		Vector v=null;
		try {
		v=ri.Read();
		}catch(IOException ie)
		{}
		if(v.size()>0 &&v!=null)
		{ 
		    for(int i=0;i<v.size();i++)
		    {
			SalesTaxBean sb=(SalesTaxBean)v.get(i);
			System.out.println("items entered are");
			System.out.println(sb.getItem()+"\t"+sb.getPrice()+"\t"+sb.getQuantity()+"\t"+sb.getImported()+"\t"+sb.getFoodProd());
			
		    }
		}
		
	}

}
