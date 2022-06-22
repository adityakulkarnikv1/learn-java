package pack;

public class Hashcdtest
	{
	private int num;
		private String data;

		public boolean equals(Object obj)
		{
			System.out.println("this="+this);
			if(this == obj)
				return true;
			System.out.println("obj.getClass()=="+obj.getClass());
			System.out.println("this.getClass()=="+this.getClass());
			
			if((obj == null) || (obj.getClass() != this.getClass()))
					return false;
			// object must be Test at this point
			Hashcdtest test = (Hashcdtest)obj;
			return num == test.num &&
			(data == test.data || (data != null && data.equals(test.data)));
		}

		public int hashCode()
		{System.out.println("in hashcd");
		System.out.println("num="+num);
		System.out.println("data="+data);
		//System.out.println("data.hashCode="+data.hashCode());
		int hash = 7;
			hash = 31 * hash + num;
			hash = 31 * hash + (null == data ? 0 : data.hashCode());
			//return hash;
			return 1;
		}
		
		public static void main(String arg[])
		{
			Hashcdtest hd=new Hashcdtest();
			Hashcdtest hd1=new Hashcdtest();
			Hashcdtest hd2=new Hashcdtest();
			Hashcdtest hd3=new Hashcdtest();
			Hashcdtest hd4=new Hashcdtest();
			Hashcdtest hd5=new Hashcdtest();
			Hashcdtest hd6=new Hashcdtest();
			Hashcdtest hd7=new Hashcdtest();
			Hashcdtest hd8=new Hashcdtest();
			
			System.out.println("hd="+hd.hashCode());
			System.out.println("hd1="+hd1.hashCode());
			System.out.println("hd2="+hd2.hashCode());
			System.out.println("hd3="+hd3.hashCode());
			System.out.println("hd4="+hd4.hashCode());
			System.out.println("hd5="+hd5.hashCode());
			System.out.println("hd6="+hd6.hashCode());
			System.out.println("hd7="+hd7.hashCode());
			System.out.println("hd8="+hd8.hashCode());
			
			if (hd.equals(hd1))
			{System.out.println("2 object are equals");
			}
			else
			{System.out.println("2 object are not equals");
				
			}
			//System.out.println("from hashcode method="+hd8.hashcode());
			
			
			
		}

		// other methods
	}
