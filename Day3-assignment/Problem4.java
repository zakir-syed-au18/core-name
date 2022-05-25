package com.Assignment3;


	import java.util.Arrays;
	import java.util.Scanner;

public class Problem4 
{ 
	
		static int larandSma(int a) 
		
		{
			int[] z= new int[a];
			
			System.out.println("Enter x number of Array elements: ");
			
			Scanner sc= new Scanner(System.in);
			int i=0;
			for(; i<z.length; i++)
			{
				z[i]=sc.nextInt();
			}
			sc.close();
			i--;
			System.out.println(i);
			int d=0;
			if(i==0)
				return z[i];
			else if(i>0) {
				Arrays.sort(z);
				d= z[i]-z[0];
			}
			return d;		
		
	}


}
