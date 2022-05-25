package com.Assignment3;

import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  size of an array : ");
		int a = sc.nextInt();
		int y = Problem4.larandSma(a);
		System.out.println("The Difference between largest and smallest elements in an array is : "+y);
		sc.close();
	}

}



