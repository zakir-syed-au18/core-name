package com.Assignment3;

public class Problem2 
{
	public static double averageElements(int a[])
	{
		int b=1;
		double add=a[2];
		for (int i = 2; i < a.length; i++) 
		{
			int count=0;
			for (int j = 2; j <i; j++) 
			{
				if(i%j==0)
				{
					break;
				}
				if(count==0)
				{
					b++;
					add+=a[i];
					break;
				}
			}
			
		}
		double r=add/b;
		
		return r;
		
	}
}

