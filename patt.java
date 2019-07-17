package com.Sytu;
import java.util.Scanner;
public class patt {

public static void main(String[] args) 
{
System.out.println("How many rows you want in this pattern");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();

        for (int i = 1; i <= noOfRows; i++) 
        {
           for (int j = 1; j <= i; j++)
          {
             System.out.print(i+" ");
          }
               
          System.out.println();
         }
    }
} 


