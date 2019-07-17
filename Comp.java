package com.Sytu;
import java.util.*;

public class Comp {
	public static void main(String[]args){
	TreeSet<Integer> s=new TreeSet<Integer>();
	s.add(10);
	s.add(20);
	s.add(25);
	s.add(45);
	Iterator l= s.iterator();
	while(l.hasNext())
	{
		System.out.println(l.next());
		for(Integer i:s)
			System.out.println(i);
	}
	}
}