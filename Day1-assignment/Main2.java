package com.assignment.hack;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		SumofDigits.Sumofsq(num);
		
		sc.close();
		
	}

}
