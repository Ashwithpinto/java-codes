package com.Sytu;
import java.util.LinkedHashSet;
public class Random1 implements Comparable<Random1>{
int usn;
String name;
double marks;
public Random1(int usn,String name,double marks)
{
	this.usn=usn;
	this.name=name;
	this.marks=marks;
	
}
	
	public String toString()
	{
		return "Random(usn="+usn+",name="+name+",marks="+marks+")";
		
	}
	
	
		public int compareTo(Random1 s)
		{
			return this .name.compareTo(s.name);
		}
	

}
