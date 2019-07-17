package com.Sytu;



public  class Nonprim implements Netfilx{
	
		int coupan;
		String accName;
		double trail;

		
		 public Nonprim (String accName,int coupan,double trail){
			this.accName=accName;
			this.coupan=coupan;
			this.trail=trail;
		}
		public void days(double days){
			if(days<=trail){
				trail=trail-days;
				System.out.println("reamaing days "+days);
			}
			else 
			{
				System.out.println("no days remaining"+days);
			}
				
			}

		public void check() {
			// TODO Auto-generated method stub
			System.out.println("the reamaing days"+trail);
		}
		@Override
		public void days() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void recharge(double amt) {
			// TODO Auto-generated method stub
			
		}
		
}

