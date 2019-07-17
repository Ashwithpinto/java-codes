package com.sytu;

public class main2 {
public static void main(String[]args){
	person p=new person("xyz",40);
	System.out.println(p.name);
	System.out.println(p.age);
	
	Student s=new Student("xyz",40,101,80);
	System.out.println("parents name:-" +s.name);
	System.out.println("age:-"+s.age);
	System.out.println("usn:-"+s.usn);
	System.out.println("marks:-"+s.marks);
	
	
}
}
