package com.problem2;

import java.util.Scanner;



public class Main2 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :"+ " ");
		String str=sc.nextLine();
		String str1=Problem2.Check(str);
		System.out.println(str1);
		
		sc.close();
	}


}
