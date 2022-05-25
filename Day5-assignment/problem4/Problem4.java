package com.problem4;

public class Problem4 {
	
	public static String voWels(String s1)
	
	
	{
		
		String s2="";
	
			
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println("After removing the vowels  " + s2);
		
		return s2;
		
	}

}
