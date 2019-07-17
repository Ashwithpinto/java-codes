package com.Sytu;

public class New {
	int id;
	String name;
	double mark;
	public New(int id,String name,double mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
		
	}
	public String toString()
	{
		return name+"withid"+id+"has marks"+mark;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(New n){
		if(this.hashCode()==n.hashCode())
			return true;
		else
			return false;
	}

}
