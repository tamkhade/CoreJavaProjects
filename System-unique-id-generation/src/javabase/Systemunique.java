package javabase;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Systemunique {


	
	public String combine(){
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String no="1-2018";
		
		
		if(no==null)
		{
			String x="1";
			String y=String.valueOf(year);
			String z="-";
			String n1=x+z+y;
			return n1;

		}else{
			String i[]=no.split("-");
			String part1=i[0];
			String part2=i[1];
			int p1=Integer.valueOf(part1);
			int p2=Integer.valueOf(part2);
			int x1=p1+1;
		    System.out.println("value of x1"+x1);	
			
		    if(year!=p2)
			{
		    	String x="1";
				String y=String.valueOf(year);
				String z="-";
				String n1=x+z+y;
				return n1;

				
				/*String x=String.valueOf(x1);
				String y=String.valueOf(p2);
				String z="-";
				String n1=x+z+y;
				
				return n1;*/
			}
			else{
			
			String s1=String.valueOf(x1);
			String s2=String.valueOf(p2);
			String s3="-";		
			String s4=s1+s3+s2;
			return s4;
			
			
			
			}
		}
	
	}		
	


public static void main(String []args){

	Systemunique s=new Systemunique();
	System.out.println(s.combine());
}
}