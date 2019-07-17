package com.Sytu;

public class exe {
public static void main(String[]args)
{
	try
	{
		int x=10;
		int y=5;
		System.out.println(10/0);
		
	}
	catch(Exception e){
		System.out.println("handle code");
		int x=5;
		int y=10;
		System.out.println(x+y);
	}
	finally{
		System.out.println("get lost i dont to handle");
		//'System.out.println(10/0);
		
	}
}
}

