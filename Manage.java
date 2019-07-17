package com.Sytu;

public class Manage {
	static Netfilx createAccount1(String name,int num,char type,double balance,int coupan){
		Netfilx ref=null;
		
		if(type=='P'){
			ref=new Primium(name,num,balance);
			System.out.println("prime created");
			
		}
		else if(type=='N'){
			
		
			double trail=30;
		ref = new Nonprim(name,coupan,trail);
			System.out.println("non prime created");
		}
		
		else
		{
			System.out.println("invalid option");
		}
	
	 
	 
		return ref;
	 }
	
}


