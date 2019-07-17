package com.Sytu;

public class pgm {
	int x;
	String name;
	{
		x=30;
		System.out.println("run");
	}
	pgm(int x)
	{
		this.x=x;
		System.out.println("con is running");
	}
	{x=20;
	System.out.println("non sta is running");
		
	}
	pgm(String name){
		this.name=name;
	}
	void m1(){
		
		x=10;
		System.out.println("m1 is running"+x);
		
		
	}
}
