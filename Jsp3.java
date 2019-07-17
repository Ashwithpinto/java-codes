package com.Sytu;

public class Jsp3 {
public static void main(String args[])
{
	Thread t=new Thread();
	Thread t1=new Thread();
	System.out.println(t1.getId());
	System.out.println("thread id :"+t.getId());
	System.out.println(t.getName());
	System.out.println(t.getPriority());
	System.out.println("seting thread name");
	t.setName("ashwith");
	System.out.println("setting thread priority");
	t.setPriority(1);
	//System.out.println(t.getName());
	System.out.println(t.getName());
	System.out.println("setting thread priority"+t.getPriority());
}
}
