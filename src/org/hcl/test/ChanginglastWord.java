package org.hcl.test;

public class ChanginglastWord {
public static void main(String[] args) {
	String s1="";
	String s="Rithanya is my daughter";
	String[] split = s.split(" ");
	for(int i=0;i<split.length;i++)
	{
		System.out.println(split[i]);
	}
	int length = split.length;
	System.out.println(length);
	for(int i=split[length-1].length()-1;i>=0;i--)
	{
		char c = split[length-1].charAt(i);
		System.out.println(c);
		s1=s1+c;
	}
	System.out.println(s1);
	System.out.println(s);
	String replace = s.replace("daughter", s1);
	System.out.println(replace);
}
}