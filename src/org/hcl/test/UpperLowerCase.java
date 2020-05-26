package org.hcl.test;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		int lcount=0;int Ucount=0;int num=0;int special=0;
		Scanner s=new Scanner(System.in);
		String string = s.nextLine();
		System.out.println(string);
		//char[] array = string.toCharArray();
		s.close();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)>='a'&& string.charAt(i)<='z')
				 lcount=lcount+1;
			else if(string.charAt(i)>='A'&& string.charAt(i)<='Z')
				Ucount=Ucount+1;
			else if(string.charAt(i)>='1'&& string.charAt(i)<='9')
				num++;
			else
				special++;
			
		}
		System.out.println(lcount+" Lower count");
		System.out.println(Ucount+" Upper count");
		System.out.println(num+"  Number count");
		System.out.println(special+"  special character count");
	}

}
