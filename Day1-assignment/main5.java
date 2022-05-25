package com.assignment.hack;

import java.util.Scanner;

public class main5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		
		Unquie.addNum(num);
		
		sc.close();
		
		
		
		
	}
}
