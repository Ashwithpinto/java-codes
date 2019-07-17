package com.Sytu;

import java.util.Scanner;

public class Main3 {
	public static void main(String arg[]){
		System.out.println("Started");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name\n");
		String name=s.next();
		System.out.println("enter the account number");
		int acno=s.nextInt();
		System.out.println("enter P for Prime account and N for Nonprime ");
		char c=s.next().charAt(0);
		System.out.println("enter the recharge(if non prime enter 0)");
	    double dep=s.nextInt();
	    System.out.println("enter the coupan(if prime enter 0)");
		int co=s.nextInt();
		
		
		Netfilx ref=Manage.createAccount1(name,acno,c,dep,co);
		ref.days();
		ref.check();
		ref.recharge(00);	}
	}




	


