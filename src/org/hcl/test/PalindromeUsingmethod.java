package org.hcl.test;

public class PalindromeUsingmethod {
	public static void main(String[] args) {
		String s1="kalai";
		StringBuilder s = new StringBuilder(s1);
		s.reverse();
		System.out.println("reverse::"+s);
		
		String revString = s.toString();
		
		if(s1.equals(revString))
			System.out.println(revString+" Palindrome ");
		else
			System.out.println(revString+" Not Palindrome ");
		
		
		
		
		
	/*	StringBuilder s = new StringBuilder("kalai");
		StringBuilder s1 = s;
		System.out.println(s1);
		StringBuilder reverse = s.reverse();
		String string = reverse.toString();
		System.out.println(System.identityHashCode(s));
		if (s1.equals(reverse))
			System.out.println(s1 + " Palindrome");
		else
			System.out.println(s1 + " not palindrome");*/
		
	}
}
