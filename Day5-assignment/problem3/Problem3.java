package com.problem3;

public class Problem3 {
	static String formNewWord(String string, int abc) 
	{
		StringBuffer sBuffer=new StringBuffer();
		String s1=string.substring(0,abc);       //excludes abc value
		String s2=string.substring(string.length()-abc);
		sBuffer.append(s1).append(s2);
		string=sBuffer.toString();
		return string;
	}

}
