package com.assignment.hack;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
        int num=sc.nextInt();
        System.out.println( "After reversing the number :");
        Revesre.reverse(num);
        
		sc.close();
	
	}

}
