package com.Sytu;

public class Main1 {
	public static void main(String[]args){
	New n=new New(11,"dss",50.5);
	New n1=new New(21,"ash",55.5);
	System.out.println(n.hashCode());
	System.out.println(n1.hashCode());
	System.out.println(n.equals(n1));
	
	}

}
