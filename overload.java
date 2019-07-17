package com.sytu;

public class overload {
	     void aaa(int a)
	    {
	         System.out.println(a);
	    }
	    void aaa(int a, int b)  
	    {
	         System.out.println(a + " "+b);
	    }
	}
	class Sample
	{
	   public static void main(String[] args)
	   {
	       overload obj = new overload();
	       obj.aaa(40);
	       obj.aaa(20,10);
	   }
	}

