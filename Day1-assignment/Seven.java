package com.assignment.hack;
public class Seven{
	


static int Check(int num)
{
	
		int count=7;
	
		int sum=0;
		
		
		while(num>0)
		{
			int rem=num%10;
			if(count==rem)
			{
			   sum++;
				}
			num=num/10;
			}
		System.out.println("There is "+sum+" Seven number in your input");


return num;
}
		
		
		
		
}	

		
		
		
		
	


