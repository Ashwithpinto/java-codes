package com.Sytu;

public class mii {
	  void m1()throws Exception{
		throw new Exception("usre defined exception");
		
		
	}

	

}
class Excp3
{
	void m2() throws Exception
	{
		mii e=new mii();
		e.m1();
	}
}
