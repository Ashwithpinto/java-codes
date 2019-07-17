package com.Sytu;

public class cp {
	public static void main(String []args){
		String s=new String("javadeveloper");
		System.out.println("char at 4:"+s.charAt(4));
		System.out.println("first occurance of e:"+s.indexOf('e'));
		System.out.println("second occurance of e:"+s.indexOf('e',9));
		System.out.println("last occurance of e:"+s.lastIndexOf('e'));
		System.out.println("contain of :"+s.contains("ddev"));
		System.out.println("starts with java:"+s.startsWith("java"));
		System.out.println(s.endsWith("per"));
		System.out.println(s.substring(8));
		System.out.println(s.substring(4,7));
		System.out.println(s.toUpperCase());
	}
}
