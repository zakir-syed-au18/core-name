package com.assignment.hack;

public class Unquie {
	
	static int addNum(int num)
	{
		
	int count=0;
	
	
	int r1,r2,num1,num2;
	num1=num;
	num2=num;
	while(num1>0)
	{
		r1=num1%10;
	
	while(num2>0)
	{
		r2=num2%10;
	
	if(r1==r2) {
		
		count++;
	}
	num2=num2/10;
	}
	num1=num1/10;
}


	if(count==1)
	{
		System.out.println("unquie number");
		return 1;
	}
	else {
		System.out.println("not unqiue number");
		return -1;
	}
	
}
	

	
	}

	


