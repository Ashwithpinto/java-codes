package com.Sytu;



public class main6 {
	public static void main(String []args){
		pendrive p=new pendrive();
		harddisk h=new harddisk();
		cd c=new cd();
		simu a=new simu();
		a.store(p);
		a.store(h);
		a.store(c);
	}

}
