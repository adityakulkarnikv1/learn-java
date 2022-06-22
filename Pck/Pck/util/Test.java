package util;
public class Test
	{
		private int num;
		private String data;

		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			if((obj == null) || (obj.getClass() != this.getClass()))
				return false;
			// object must be Test at this point
			Test test = (Test)obj;
			return num == test.num &&
			(data == test.data || (data != null && data.equals(test.data)));
		}

		public int hashCode()
		{
			int hash = 7;
			hash = 31 * hash + num;
			hash = 31 * hash + (null == data ? 0 : data.hashCode());
			return hash;
		}

	// other methods
		
		public static void main(String[] args) {
			String st1="sbc";
			String st2="123";
			boolean s=st1.equals(st2);
			int i1=st1.hashCode();
			int i2=st2.hashCode();
			System.out.println("b="+s);
			System.out.println("i1="+i1);
			System.out.println("i2="+i2);
			String b=new String("abc");
			String c="abc";
			// c=b;
			String d=new String("abc");
			//d=b;
			
			boolean b1=(b==c);
			boolean b2=(d==c);
			boolean b3=(b==d);
			boolean b4=(c==c);
			boolean b5=(d==d);
			System.out.println(b1+"="+b2+"="+b3+"="+b4+"="+b5);
			
			System.out.println("b.hc="+b.hashCode());
			
			System.out.println("c.hc="+c.hashCode());
			
			System.out.println("d.hc="+d.hashCode());
			if(b==c)System.out.println("b==c");
			
			if(d==c)System.out.println("d==c");
			
			if(b==d)System.out.println("b==d");
			
			//System.out.println(b==c +"="+d==c+"="+d==b);
		}
	}
