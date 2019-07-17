package com.Sytu;

public class acc {
        String name;
        double accbal;
        acc(String name,double accbal)
        {
        this.name=name;
        this.accbal=accbal;
        }
        void deposite(double amt){
        	System.out.println("depositing rs"+amt);
        	accbal=accbal+amt;
        }
        void withdraw(double amt)
        {
        	System.out.println("withdraw rs"+amt);
        	if(amt>accbal){
        		throw new IsuffBalExcep("current balance");
        			
        		}
        	
        	}
        }
}
