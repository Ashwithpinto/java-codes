package com.Sytu;

public class pgmm4 {
	public static void main(String []args){
		pgmm4 p=new pgmm4();
		System.out.println(p);
		String d="java";
		String d1="developer";
		String d2="java"+"developer";
		String d3="java"+d;
		String d4=d+"developer";
		String d5=d+d1;
		String d6="javadeveloper";
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
		System.out.println(d5.hashCode());
		System.out.println(d6.hashCode());
	}

}
