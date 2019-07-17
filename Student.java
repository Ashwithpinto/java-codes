package com.sytu;

public class Student extends person  {

int usn;
double marks;
Student(String name,int age,int usn,double marks){
	super (name,age);
	this.usn=usn;
	this.marks=marks;
	
}

}
