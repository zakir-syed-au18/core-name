package com.Assignment3;

import java.util.Scanner;

public class Main5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the elements in 1st array");
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in 2nd array");
		int b[]=new int [size];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=sc.nextInt();
		}
		System.out.println(" Common elements sum are "+Problem5.commonEle(a, b));
				
	}
}


