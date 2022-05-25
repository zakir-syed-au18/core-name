package com.assignment.hack;

import java.util.Scanner;

public class main4 {

     public static void main(String[] args) {
		
    	 System.out.println("Enter any number");
    	 Scanner sc=new Scanner(System.in);
    	 int num=sc.nextInt();
    	 Unquie.addNum(num);
    	 System.out.println("******************");
    	 sc.close();
	}
}
