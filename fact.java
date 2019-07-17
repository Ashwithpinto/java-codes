package com.Sytu;

import java.util.Scanner;

public class fact {
  
		 public static void main(String args[]){  
			 Scanner s=new Scanner(System.in);
		  int i,fact=1;  
		  
		  System.out.println("enter the number");
		  int n=s.nextInt();
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact);    
		 }  
		
}
