package org.hcl.test;

public class Palindrome {

	public static void main(String[] args) {
		String s="kalai123";
		String s1="";
		int length = s.length();
		while(length>0)
		{
			char c = s.charAt(length-1);
			length--;
			System.out.println(c);
			s1=s1+c;
		}
		System.out.println(s1);
		if(s1.equals(s))
		System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}

}
