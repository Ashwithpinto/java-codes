package com.Sytu;

public class Loan implements Account{
	int accounm;
	String accName;
	double balance;
	
	
	Loan(String accName,int acconum,double balance){
		this.accounm=acconum;
		this.balance=balance;
		this.accName=accName;
	}
	public void withdraw(double amt){
		if(amt<=balance){
			balance=balance-amt;
			System.out.println("withdraw Rs"+amt);
		}
		else{System.out.println("withdraw not done"+amt);
			
		}
	}
	
	
	public void checkbal() {
		System.out.println("balance rs="+balance);
		
	}
	public void deposite(double amt) {
		balance=balance+amt;
		System.out.println("depositing Rs"+amt);
		
	}

}

