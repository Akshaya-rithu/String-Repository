package org.hcl.test;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	String string = s.nextLine();
	String s1="";
	s.close();
	int length = string.length();
	System.out.println(length);
	while(length>0) {
		char c=string.charAt(length-1);
		length--;
		System.out.println(c);
		s1=s1+c;
	
	}
	System.out.println(s1);
	
	if(s1.equals(string))
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
}
}
