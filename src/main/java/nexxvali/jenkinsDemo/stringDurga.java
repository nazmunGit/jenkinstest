package nexxvali.jenkinsDemo;

import java.util.Scanner;

public class stringDurga {
	private int i;
	stringDurga(int i)
	{
		this.i = i;
	}
public stringDurga modify(int i)
{
	if (this.i == i)
	{
		return this;
	}
	else
	{
		return new stringDurga(i);
	}
}

	public static void main(String[] args) {
//	 String s= new String("abc");
//	 s.concat("software");
//	 System.out.println(s);
	
		String s1= new String("abc");
		String s2= new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
//
//	 StringBuffer sb= new StringBuffer("xyz");
//	 sb.append(" software");
//	 System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer("xyz");
		StringBuffer sb2= new StringBuffer("xyz");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		/****** trim method *********/
		String s = " ABC   SOFT";
		System.out.println(s.trim().length()); 
		System.out.println(s.length());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Your City Name: ");
		String name=sc.nextLine().toLowerCase().trim();
		if (name.equals("dhaka"))
		{
			System.out.println("Hello Deshi... salam..");
		}
		else if (name.equals("gaibandha"))
		{
			System.out.println("Hello bahe... salam..");
		}
		else if (name.equals("palashbari"))
		{
			System.out.println("Hello dear... salam..");
		}
		else 
		{
			System.out.println("Please enter valid city name.");
		}
		
	
	stringDurga t1 = new stringDurga(10);
	stringDurga t2 = t1.modify(100);
	stringDurga t3 = t1.modify(10);
	
	System.out.println(t1 == t2);
	
	}	

}
