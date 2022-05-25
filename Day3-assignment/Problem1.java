package com.Assignment3;

import java.util.Scanner;

public class Problem1 {


public static int Power(int num)

{
	  
	   Scanner sc=new Scanner(System.in);
	   int sum=0;
	 
	   int n=0;
	   
	   
	  
	
		 int a[]=new int[num];
		 
       for( int i=0;i<a.length;i++)
			 
		 {
			 System.out.println("Enter "+(i+1)+" number");
			 
			a[i]=sc.nextInt();
			
		 }
	 
	 
	 for(int j=0;j<a.length;j++)
	 {
		 	
	Math.pow(a[j], n);
		sum=sum+a[j];
		
		n++;
     	 }
	 
	 
	
	
	 return sum;
	 }


	
}


