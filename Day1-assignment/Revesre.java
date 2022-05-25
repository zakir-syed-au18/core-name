package com.assignment.hack;



public class Revesre {
	
	
	public static int reverse(int num)
	{
		
	while(num>0)
	{
		int rem=num%10;
		System.out.print(rem);
		num=num/10;
		}
	
	return num;
		
		
	}
}

	