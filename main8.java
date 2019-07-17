package com.Sytu;

import java.util.HashMap;

public class main8 {
	public static void main(String[]args ){
		HashMap a=new HashMap();
		a.put(1, 12);
		a.put(2,2);
		a.put(3,12);
		a.put(4,23);
		System.out.println(a.get(1));
		System.out.println(a.remove(3));
		System.out.println(a);
		//System.out.println();
		System.out.println(a.hashCode());
		//System.out.println(a.containsKey(3));
	}

}
