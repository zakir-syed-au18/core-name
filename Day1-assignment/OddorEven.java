package com.assignment.hack;


public class OddorEven {

static int Check(int num) {
		
		
		
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
		   num=num/10;
			
		}
		if(sum%2!=0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
}
