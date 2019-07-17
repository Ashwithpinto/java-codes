package com.Sytu;

public class reverse {
	public static void main(String []args){
		String s="indian"; 
		
		
		String r="";
		
		
		int l=s.length(); 
		 
		for(int i=l-1;i>=0;i--)
		{
		
				r=r+s.charAt(i);
			
		} 
		
		System.out.println(r);
	}

}
