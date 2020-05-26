package org.hcl.test;

public class Reversethestring {

	public static void main(String[] args) {
		String s="Hai am Akshaya";
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		System.out.println(".............After reversing............");
		for(int i=split.length-1;i>=0;i--)
		{
			
			System.out.println(split[i]);
		}
		
	}

}
