package com.Sytu;

public class Savings  implements Account {
	int accounm;
	String accName;
	double balance;
	private int acconum;
	
	public Savings(String accName,int acconum,double balance){
		this.acconum=acconum;
		this.balance=balance;
		this.accName=accName;
	}
	
	public void withdraw(double amt){
		if(amt<=balance){
			balance=balance-amt;
			System.out.println("withdraw Rs"+amt);
		}
		else{System.out.println("not done"+amt);
			
		}
	}
	
	
	@Override
	public void checkbal() {
		System.out.println("balance rs="+balance);
		
	}
	@Override
	public void deposite(double amt) {
		balance=balance+amt;
		System.out.println("depositing Rs"+amt);
		
	}

}
