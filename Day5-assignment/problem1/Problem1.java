package com.problem1;

public class Problem1 {
	public static String middle(String str)
	{
		
		
		String str1="";
		
	
	
		for(int i=str.length()/2-1;i<=str.length()/2;i++)
		{
		str1=str1+str.charAt(i);
			
		}
			
		
		
		System.out.println(str1);
		return str1;
		
	}

}
