package com.Assignment3;

import java.util.Scanner;

import com.te.payslip.ArrayPower;

public class Main1 {
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter a number how any values u want to store");
		 
		 int num= sc.nextInt();
		
		 
		 int a[]=new int[num];
		 
		int sum=ArrayPower.Power(num);
		
		 System.out.println("Power of array:"+sum);
	}


}
