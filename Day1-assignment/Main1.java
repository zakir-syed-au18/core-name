package com.assignment.hack;

import java.util.Scanner;

public class Main1
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number to find no is odd or even:");
		int num=sc.nextInt();
		
		int n=OddorEven.Check(num);
		if(n==1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
		sc.close();

				
				
		
		
		
		
	}

}
