package com.sytu;

public class Main {
	public static void main(String[]args){
		
	
	Univarsity u=new Univarsity("VTU","AIET");
	System.out.println(u.uniname);
	System.out.println(u.collage);
	u.naa();
	System.out.println(u.c.clgname);
	System.out.println(u.c.branch);
	u.c.run();
	System.out.println(u.c.b.name);
	System.out.println(u.c.b.sub);
	u.c.b.department();
	

}
}