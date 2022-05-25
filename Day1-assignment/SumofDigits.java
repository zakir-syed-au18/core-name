package com.assignment.hack;

public class SumofDigits {
	
	public static int Sumofsq(int num)
	{
		int eq=0;
		while(num>0)
		{
			int rem=num%10;
			if(num%2==0)
			{
				eq=eq+rem*rem;
			}
			num=num/10;
		}
		System.out.println("The sum of squares of Evendigits :"+eq);
		return eq;
	}

}
