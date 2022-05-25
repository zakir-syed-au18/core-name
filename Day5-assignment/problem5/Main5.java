package com.problem5;

import java.util.Scanner;



public class Main5 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("Enter the element to Find");
		String str=sc.next();
		sc.close();
		int h=Problem5.getElementPosition(arr,str);
		System.out.println(h);
	}

}
