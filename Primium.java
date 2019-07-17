package com.Sytu;

public class Primium implements Netfilx{
	
		int accounm;
		String accName;
		double balance;
		private int acconum;
		
		public Primium(String accName,int acconum,double balance){
			this.acconum=acconum;
			this.balance=balance;
			this.accName=accName;
		}
		
		public void recharge(double amt){
			if(amt<=balance){
				balance=balance+amt;
				System.out.println("recharge Rs"+balance);
			}
			else{System.out.println("not done"+amt);
				
			}
		}

		@Override
		public void check() {
			{System.out.println("remaining amount"+balance);
			
		}

		

		
		
	}

		@Override
		public void days() {
			
			
		}

		
		

}
