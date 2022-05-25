package com.Assignment3;

import java.util.Scanner;

import com.te.payslip.LargestArray;

public class Main3 {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" how many values u want enter ");
		int n=sc.nextInt();
		
		
		
			int[] a=new int[n];
			
			for(int i=0;i<n;i++)
			{
				
			System.out.println("Enter "+(i+1)+" value");
			
				a[i]=sc.nextInt();
					
		}
			System.out.println(" largest Array :"+LargestArray.largestNum(a,n));

	}
		
}
