package com.Sytu1;

public class bike
{
	Engine e=new Engine("abc","afff");
	String color;
	double model;
	bike(String color,double model){
		this.color=color;
		this.model=model; 
	}
	void started()
	{
		System.out.println("engine strarted");
		
	}
}
