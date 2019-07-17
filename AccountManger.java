package com.Sytu;

public class AccountManger {
	 static Account createAccount(String name,int num,double balance,char type){
		Account ref=null;
		
		if(type=='s'){
			ref=new Savings(name,num,balance);
			System.out.println("saving account created");
			
		}
		else if(type=='l'){
			ref=new Loan(name,num,balance);
			System.out.println("loan created");
		}
		else
		{
			System.out.println("invalid option");
		}
	
	 
	 
		return ref;
	 }
}
